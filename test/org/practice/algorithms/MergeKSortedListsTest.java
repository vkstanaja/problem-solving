package org.practice.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {


    @BeforeEach
    void setUp() {
    }

    @Test
    void mergeKLists() {
        ListNode [] lists = new ListNode[3];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);

        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);

        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        ListNode result = MergeKSortedLists.mergeKLists(lists);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(2);

        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(4);

        expected.next.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next.next = new ListNode(5);
        expected.next.next.next.next.next.next.next = new ListNode(6);

        ListNode act = result;
        ListNode exp = expected;
        while (act != null && exp != null) {
            assertEquals(exp.val, act.val);
            act = act.next;
            exp = exp.next;
        }

        assertNull(act);
        assertNull(exp);
    }
}