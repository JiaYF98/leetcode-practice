package offer;

public class Offer11 {
    public int minArray1(int[] numbers) {
        int len = numbers.length;

        for (int i = 0; i < len - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return numbers[i + 1];
            }
        }

        return numbers[0];
    }

    public int minArray2(int[] numbers) {
        int len = numbers.length;

        int low = 0;
        int high = len - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (numbers[mid] > numbers[high]) {
                low = mid + 1;
            } else if (numbers[mid] < numbers[high]){
                high = mid;
            } else {
                high--;
            }
        }
        return numbers[low];
    }

    public static void main(String[] args) {
        Offer11 offer11 = new Offer11();
        int[] numbers = new int[]{3, 4, 5, 1, 2};
        System.out.println(offer11.minArray2(numbers));
        System.out.println(offer11.minArray2(new int[]{2, 2, 2, 2}));
        System.out.println(offer11.minArray2(new int[]{0}));
        System.out.println(offer11.minArray2(new int[]{3, 1, 1}));
    }
}
