import java.util.*;
class LinkedList
{
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d);
		{
			data = d;
			next = null;
		}	
	}
	
	void addNode(int data){
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
		}else{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

Node reverse(Node node)
{
	Node prev = null;
	Node current = node;
	Node next = null;
	
	while(current != null)
	{
		next = current.next;
		current.next = prev;
		prev = current;
		current = next;
		
	}
	node = prev;
	return node;
	
}
void PrintList(Node node)
{
	while(node!= null)
	{
		System.out.println(node.data+" ");
		node = node.next;
	
	}
	System.out.println();
	
}
public static void main(String args[]){
	LinkedList list = new LinkedList();
	Scanner sc = new Scanner(System.in);
	int c = sc.nextInt();
	for(int i=0;i<c;i++){
		int n = sc.nextInt();
		for(int j=0;j<n;j++){
			int x = sc.nextInt();
			list.addNode(x);
		}
		head = list.reverse(head);
		list.PrintList(head);
	}
	
}	
}