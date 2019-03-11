package com.bridgeit.datastructure;


import java.util.EmptyStackException;

public class CommercialStackLLMethods 
{
	int length ;
	com.bridgeit.oops.Node top;
	public CommercialStackLLMethods()
	{
		length = 0;
		top = null;
	}
	
	public void show() 
	{
		com.bridgeit.oops.Node node = top;
		while(node.next!=null)
		{
			System.out.print(node.data+ " --> ");
			node = node.next;
		}
		System.out.println(node.data);
	}
	public String push(String data) 
	{
		com.bridgeit.oops.Node node = new com.bridgeit.oops.Node(data, null);
		node.next = top;
		top = node;
		length++;
		return node.data;
	}

	public String peek()
	{
		if(isEmpty())
			throw new EmptyStackException();
		return top.data;
	}
	public boolean isEmpty() 
	{
		if(length == 0)
		{
			return true;
		}
		return false;
	}

	public String pop() 
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		String result = top.data;
		top = top.next;
		length--;
		return result;
	}
}
