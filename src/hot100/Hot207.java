package hot100;

import java.util.*;

public class Hot207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 各门课程的前置课程数量
        int[] preCourseNumbers = new int[numCourses];

        // 各门课程的后置课程
        List<List<Integer>> postCourses = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            postCourses.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            // 后置课程的前置课程数量+1
            preCourseNumbers[prerequisite[1]]++;
            // 保存前置课程的后置课程
            postCourses.get(prerequisite[0]).add(prerequisite[1]);
        }

        // 将没有前置课程的课程加入队列
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (preCourseNumbers[i] == 0) {
                queue.offer(i);
            }
        }

        // 记录出队的课程数目
        int count = 0;

        while (!queue.isEmpty()) {
            Integer currentCourse = queue.poll();
            count++;
            List<Integer> postCoursesOfCurrentCourse = postCourses.get(currentCourse);

            postCoursesOfCurrentCourse.forEach(currentPostCourse -> {
                // 将当前课程看到所有后置课程的前置课程数量-1
                preCourseNumbers[currentPostCourse]--;

                // 如果后置课程已经没有前置课程，则将该后置课程加入队列中
                if (preCourseNumbers[currentPostCourse] == 0) {
                    queue.offer(currentPostCourse);
                }
            });
        }

        return count == numCourses;
    }
}
