class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (allUnique(s, i, j)) {
                    length = Math.max(length, j - i);
                }
            }
        }
        return length;

    }

    public static boolean allUnique(String s, int start, int end) {
        HashSet<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            char ch = s.charAt(i);

            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));

    }
}