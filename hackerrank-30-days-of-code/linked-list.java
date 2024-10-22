import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    static LinkedList<Node> myLinkedList = new LinkedList<>();
    
    public static  Node insert(Node head,int data) {
        //Complete this method
        // Create a new node
        Node newNode = new Node(data);
        
        // Check if the list is empty
        if (head == null) {
            return newNode; // Return the new node as the head
        }
        
        // Traverse to the end of the list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        // Link the new node at the end
        current.next = newNode;
        
        // Return the head of the list
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}