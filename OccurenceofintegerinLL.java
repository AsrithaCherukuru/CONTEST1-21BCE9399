class Solution {
    public static int count(Node head, int key) {
        int count = 0;
        Node slow = head;
        while (slow != null) {
            if (slow.data == key) {
                count++;
                slow = slow.next;
            } else {
                slow = slow.next;
            }
        }
        return count;
    }
}