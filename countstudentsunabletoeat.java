class Solution {
    public static int countStudentsUnableToEat(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int student : students) {
            queue.add(student);
        }

        int i = 0;
        while (!queue.isEmpty() && i < sandwiches.length) {
            if (queue.peek() == sandwiches[i]) {
                queue.poll();
                i++;
            } else {
                queue.add(queue.poll());
            }
        }

        return queue.size();
    }
}