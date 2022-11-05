changesl by sj
package ModuleEnd;

import java.util.Arrays;

public class QueueLL 
{
	private Node head;
	int nodeCount;

	public void insert(Employee data)
	{

		Node temp = new Node(data);
//special case:: if no employee in it
		if(head == null) 
		{
			head = temp;
		}
		else
		{
			Node it = head;
			while(it.next != null)
			{
				it=it.next;
			}
			it.next=temp;
		}
	}

	public void remove()
	{
		if(head == null)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			Node it = head;

			head = it.next;
			it.next=null;
			it=null;
		}
	}

	public void reverse(Employee data)
	{
		Node it = head;
		Node itp = null;
		Node itn = head;

		while(it != null)
		{
			itn = it.next;
			it.next = itp;
			itp =it;
			it = itn;
		}
		head = itp;
	}
	public void empty()
	{
		while(head!=null)
		{
			remove();
		}
	}
	
	public String toString() 
	{
		Node x = head;
		String str = " ";

		while(x != null)
		{
			str += "" + x +" --> ";
			x = x.next;
		}
		return str;
	}

}




