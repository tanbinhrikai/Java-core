package bai19;

import java.util.*;

public class Main {

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEnd = false;
    }

    static class Trie {
        private final TrieNode root = new TrieNode();

        public void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                node.children.putIfAbsent(c, new TrieNode());
                node = node.children.get(c);
            }
            node.isEnd = true;
        }

        public boolean search(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                node = node.children.get(c);
                if (node == null) return false;
            }
            return node.isEnd;
        }

        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for (char c : prefix.toCharArray()) {
                node = node.children.get(c);
                if (node == null) return false;
            }
            return true;
        }

        public List<String> getAllWords() {
            List<String> result = new ArrayList<>();
            dfs(root, new StringBuilder(), result);
            return result;
        }

        private void dfs(TrieNode node, StringBuilder path, List<String> result) {
            if (node.isEnd) {
                result.add(path.toString());
            }

            for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
                path.append(entry.getKey());
                dfs(entry.getValue(), path, result);
                path.deleteCharAt(path.length() - 1);
            }
        }

        public boolean delete(String word) {
            return delete(root, word, 0);
        }

        private boolean delete(TrieNode node, String word, int index) {
            if (index == word.length()) {
                if (!node.isEnd) return false;
                node.isEnd = false;
                return node.children.isEmpty();
            }

            char c = word.charAt(index);
            TrieNode child = node.children.get(c);
            if (child == null) return false;

            boolean shouldDeleteChild = delete(child, word, index + 1);

            if (shouldDeleteChild) {
                node.children.remove(c);
                return node.children.isEmpty() && !node.isEnd;
            }

            return false;
        }
    }

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("java");
        trie.insert("javascript");
        trie.insert("jar");
        trie.insert("python");

        System.out.println(trie.search("java"));
        System.out.println(trie.search("jav"));
        System.out.println(trie.startsWith("ja"));

        System.out.println(trie.getAllWords());

        trie.delete("java");

        System.out.println(trie.search("java"));
        System.out.println(trie.getAllWords());
    }
}