package com.ravi.leetcode;

import java.math.BigInteger;

public class AddNums {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger sum1 = new BigInteger("0");
        BigInteger sum2 = new BigInteger("0");
        int i = 0;
        while (l1 != null) {
            sum1= sum1.add(new BigInteger(String.valueOf(Math.pow(10,i) * l1.val)));
            l1 = l1.next;
            i++;
        }
        i = 0;
        while (l2 != null) {
            sum2= sum2.add(new BigInteger(String.valueOf(Math.pow(10,i) * l2.val)));
            l2 = l2.next;
            i++;
        }
        BigInteger finalSum = sum1.add(sum2);


        String finalString = String.valueOf(finalSum);
        System.out.println(finalSum);
        ListNode finalNode = new ListNode((int)Long.parseLong(String.valueOf(finalString.charAt(finalString.length()-1))));
        ListNode temp = finalNode;
        System.out.println(finalString);
        for(i=finalString.length()-2;i>=0;i--)
        {
            System.out.println(finalString);
            ListNode nextNode = new ListNode(Integer.parseInt(String.valueOf(finalString.charAt(i))));
            temp.next = nextNode;
            temp = temp.next;
        }

        return finalNode;
    }

    public static void main(String[] args) {
        ListNode listNode =new ListNode(9);
        listNode.next=null;
//        listNode.val=2;
//        ListNode listNode1 = new ListNode(4);
//        listNode.next=listNode1;
//        ListNode listNode2 = new ListNode(3);
//        listNode2.next=null;
//        listNode1.next=listNode2;

        ListNode listNodeN =new ListNode(1);
        ListNode listNode12 = new ListNode(9);
        listNodeN.next=listNode12;
        ListNode listNode21 = new ListNode(9);
        listNode12.next=listNode21;
        ListNode listNode22 = new ListNode(9);
        listNode21.next=listNode22;
        ListNode listNode23 = new ListNode(9);
        listNode22.next=listNode23;
        ListNode listNode24 = new ListNode(9);
        listNode23.next=listNode24;
        ListNode listNode25 = new ListNode(9);
        listNode24.next=listNode25;
        ListNode listNode26 = new ListNode(9);
        listNode25.next=listNode26;
        ListNode listNode27 = new ListNode(9);
        listNode26.next=listNode27;
        ListNode listNode28 = new ListNode(9);
        listNode27.next=listNode28;
        listNode28.next=null;

        AddNums addNums = new AddNums();
        ListNode listNode3 = addNums.addTwoNumbers(listNode, listNodeN);
        while (listNode3!=null){
            System.out.println(listNode3.val);
            listNode3=listNode3.next;
        }


    }
}
