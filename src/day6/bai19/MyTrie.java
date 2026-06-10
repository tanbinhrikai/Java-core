package day6.bai19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTrie {
    public MyTrie() {
        this.root = new TrieNode();
    }

    private static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEnd = false;
    }

    private final TrieNode root;

    public void insert(String word) {
        TrieNode current = root;
        for(char ch : word.toCharArray()) {
            current = current.children.computeIfAbsent(ch, c -> new TrieNode());
        }
        current.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for(char ch: word.toCharArray()) {
            current = current.children.get(ch);
            if(current == null) {
                return false;
            }
        }
        return current.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for(char ch: prefix.toCharArray()) {
            current = current.children.get(ch);
            if(current == null) {
                return false;
            }
        }
        return true;
    }

    private void dfsGetAll(TrieNode current, StringBuilder currentWord, List<String> result) {
        // Nếu node hiện tại là kết thúc của 1 từ, thêm vào danh sách kết quả
        if (current.isEnd) {
            result.add(currentWord.toString());
        }

        // Duyệt qua tất cả các node con theo thứ tự alphabet của key (Dùng TreeMap nếu muốn sắp xếp tự động)
        // Ở đây dùng HashMap nên thứ tự output phụ thuộc vào hash, muốn sắp xếp có thể sort result sau cùng
        for (Map.Entry<Character, TrieNode> entry : current.children.entrySet()) {
            currentWord.append(entry.getKey()); // Thêm ký tự vào chuỗi tạm
            dfsGetAll(entry.getValue(), currentWord, result); // Đi sâu xuống con
            currentWord.deleteCharAt(currentWord.length() - 1); // Backtrack: Xóa ký tự vừa thêm để thử nhánh khác
        }
    }

    public List<String> getAllWords() {
        List<String> result = new ArrayList<>();
        // Dùng thuật toán DFS (Đệ quy) duyệt từ node root với chuỗi rỗng ban đầu
        dfsGetAll(root, new StringBuilder(), result);
        return result;
    }

    public boolean delete(String word) {
        return delete(root, word, 0);
    }

    private boolean delete(TrieNode current, String word, int index) {
        if (current == null) return false;

        // Điểm dừng: Khi đã duyệt hết các ký tự của từ cần xóa
        if (index == word.length()) {
            if (!current.isEnd) return false; // Từ này vốn không tồn tại

            current.isEnd = false; // Bỏ đánh dấu kết thúc từ

            // Nếu node này không có con nào khác, trả về true để node cha xóa hẳn nó đi
            return current.children.isEmpty();
        }

        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        if (node == null) return false; // Không tìm thấy từ

        // Đệ quy đi sâu xuống để xóa các node phía sau trước
        boolean shouldDeleteCurrentChild = delete(node, word, index + 1);

        // Nếu phía sau báo về là node con đã cô lập (không có con khác và không là điểm kết thúc từ nào)
        if (shouldDeleteCurrentChild) {
            current.children.remove(ch); // Xóa hẳn nhánh ký tự này khỏi map con

            // Tiếp tục báo về cho node cha phía trên: nếu node hiện tại cũng rỗng và không phải là điểm kết thúc từ khác
            return current.children.isEmpty() && !current.isEnd;
        }

        return false;
    }
}
