package hot100;

class Trie {
    private boolean isEnd;

    private final Trie[] next = new Trie[26];

    public Trie() {

    }

    public void insert(String word) {
        Trie root = this;
        char[] charArray = word.toCharArray();
        for (char c : charArray) {
            if (root.next[c - 'a'] == null) {
                root.next[c - 'a'] = new Trie();
            }
            root = root.next[c - 'a'];
        }
        root.isEnd = true;
    }

    public boolean search(String word) {
        char[] charArray = word.toCharArray();
        return search(this, charArray, 0);
    }

    private boolean search(Trie trie, char[] charArray, int index) {
        if (index == charArray.length) {
            return trie.isEnd;
        }

        return trie.next[charArray[index] - 'a'] != null && search(trie.next[charArray[index] - 'a'], charArray, index + 1);
    }

    public boolean startsWith(String prefix) {
        char[] charArray = prefix.toCharArray();
        return startsWith(this, charArray, 0);
    }

    private boolean startsWith(Trie trie, char[] charArray, int index) {
        if (index == charArray.length) {
            return true;
        }

        return trie.next[charArray[index] - 'a'] != null && startsWith(trie.next[charArray[index] - 'a'], charArray, index + 1);
    }
}

public class Hot208 {
    private final Trie trie;

    public Hot208() {
        trie = new Trie();
    }

    public void insert(String word) {
        trie.insert(word);
    }

    public boolean search(String word) {
        return trie.search(word);
    }

    public boolean startsWith(String prefix) {
        return trie.startsWith(prefix);
    }
}
