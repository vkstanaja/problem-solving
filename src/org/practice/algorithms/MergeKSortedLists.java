package org.practice.algorithms;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeKSortedLists {
    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        });

        // Initialize first element to the priority queue
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null)
                pq.add(lists[i]);
        }

        ListNode head = null;
        ListNode temp = head;
        while(!pq.isEmpty()) {
            if (head == null) {
                head = pq.remove();
                temp = head;
                if (temp.next != null) {
                    pq.add(temp.next);
                    temp.next = null;
                }
            } else {
                temp.next = pq.remove();
                temp = temp.next;
                if (temp.next != null) {
                    pq.add(temp.next);
                    temp.next = null;
                }
            }
        }

        return head;
    }
}
