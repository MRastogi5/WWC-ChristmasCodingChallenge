package com.wwc.xmas;

// Day 3 of WWD- Christmas Coding Challenge
//https://leetcode.com/problems/linked-list-cycle/

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {


        if(null == head || head.next == null){
            return false;
        }
        boolean flag = false;
        Set<ListNode> set = new HashSet<>();
        set.add(head);
        head = head.next;
        while (head.next != null){
            if (set.contains(head)) return true;
            else set.add(head);
            head = head.next;
            flag = false;
        }
        return flag;
    }

    public static void main(String[] s ){

        ListNode headlist = new ListNode(1);
        headlist.next = new ListNode(2);
        //headlist.next.next = new ListNode(3);
        System.out.println(new LinkedListCycle().hasCycle(headlist));

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}