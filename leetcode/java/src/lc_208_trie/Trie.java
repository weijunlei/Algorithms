package lc_208_trie;

class Trie {
    private final int alphaSize = 26;
    private Trie[] children = new Trie[alphaSize];
    private boolean isEnd = false;

    /** Initialize your data structure here. */
    public Trie() {

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie temp = this;
        for(var ch: word.toCharArray()){
            if (temp.children[ch - 'a'] == null){
                temp.children[ch - 'a'] = new Trie();
            }
            temp = temp.children[ch - 'a'];
        }
        temp.isEnd=true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie temp = this;
        for(var ch: word.toCharArray()){
            if (temp.children[ch - 'a'] == null){
                return false;
            }
            temp = temp.children[ch - 'a'];
        }
        return temp.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie temp = this;
        for(var ch: prefix.toCharArray()){
            if (temp.children[ch - 'a'] == null){
                return false;
            }
            temp = temp.children[ch - 'a'];
        }
        return true;
    }
}

