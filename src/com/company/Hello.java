package com.company;
import java.util.HashMap;
import java.util.Scanner;
class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Hello{
    public static void main(String[] args) {
        Node head=null;
        for (int i = 1; i <=5 ; i++) {
            head=add(head,i);
        }
        displayList(head);
        insertAfter(head,8,3);
        displayList(head);
        head =ReverseLinkedList(head);
        displayList(head);
    }
    public static Node add(Node head,int data){
        Node node=new Node(data);
        if(head==null){
            return node;
        }
        Node current=head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=node;
        return head;
    }
    public static void displayList(Node head){
        System.out.println();
        while(head!=null){
            System.out.print(head.data+" -> ");
            head=head.next;
        }
    }
    public static void insertAfter(Node head,int data,int pos){
        if(pos>findLength(head)){
            System.out.println("insertion is not possible");
            return;
        }
        Node current=head;
        Node next=head.next;
        while(pos!=0){
            pos--;
            current=next;
            next=next.next;
        }
        current.next=new Node(data);
        current=current.next;
        current.next=next;
    }
    public static int findLength(Node head){
        if(head==null){
            return 0;
        }
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
    public static Node ReverseLinkedList(Node head){
        Node current=head;
        Node next=current.next;
        Node prev=null;
        while(next!=null){
            current.next=prev;
            prev=current;
            current =next;
            next=current.next;
        }
        current.next=prev;
        return current;
    }
}
