class Solution {
    public int minInsertions(String s) {

        int open = 0;
        int insertions = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                open++;

            } else {

                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    insertions++;
                }

                open--;

                if (open < 0) {
                    insertions++;
                    open = 0;
                }
            }
        }
        return insertions + open * 2;
    }
}
