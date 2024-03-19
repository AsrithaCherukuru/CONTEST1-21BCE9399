class Sol {
    int isPossible(String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int oddcount = 0;
        for (int count : map.values()) {
            if (count % 2 != 0) {
                oddcount++;
            }
        }
        return oddcount <= 1 ? 1 : 0;
    }
}