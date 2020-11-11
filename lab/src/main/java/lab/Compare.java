package lab;

import java.util.ArrayList;
import java.util.LinkedList;

/** 
 * �������� ������������������ ArrayList � LinkedList
 * https://github.com/Eniferbill/JavaLabs
 * @autor ��������� ������ ������������� 3 ���� 7 ������
 * @version 2.0
*/
public class Compare {
	
	/** ������ ������� ������� */
	public static long start;
	
	/** ����� ������� ������� */
	public static long end;
	
	/** ������������ ���������� ������ */
	public static long duration;
	
	/** 
	 * ����� add - ���������� �������
	 */ 
	public static void Add(ArrayList<Integer> arraylist, LinkedList<Integer> linkedlist)
    {
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++)  arraylist.add(i); 
		end = System.nanoTime();			 
		duration = end - start;			 
		System.out.println("arraylist add:  " + duration + " ns");
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++) linkedlist.add(i);
		end = System.nanoTime();
		duration = end - start;
		System.out.println("linkedlist add: " + duration + " ns");
    }
	
	/** 
	 * ����� get - ��������� ��������
	*/ 
	public static void Get(ArrayList<Integer> arraylist, LinkedList<Integer> linkedlist)
    {
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++) 
		arraylist.get(i);
		end = System.nanoTime();
		duration = end - start;
		System.out.println("arraylist get:  " + duration + " ns");
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++) 
		linkedlist.get(i);
		end = System.nanoTime();
		duration = end - start;
		System.out.println("linkedlist get: " + duration + " ns");
    }
	
	/** 
	 * ����� remove - �������� ��������
	*/ 	
	public static void Remove(ArrayList<Integer> arraylist, LinkedList<Integer> linkedlist)
    {
		start = System.nanoTime();
		for (int i = 999; i > 0; i--) 
		arraylist.remove(i);
		end = System.nanoTime();
		duration = end - start;
		System.out.println("arraylist remove:  " + duration + " ns");
		start = System.nanoTime();
		for (int i = 999; i > 0; i--) 
		linkedlist.remove(i);
		end = System.nanoTime();
		duration = end - start;
		System.out.println("linkedlist remove: " + duration + " ns");
    }	
	
	/** 
	 * ����� add(i, value)  - ���������� ������� �� �������
	*/ 	
	public static void AddIndex(ArrayList<Integer> newarraylist, LinkedList<Integer> newlinkedlist)
    {
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++)  newarraylist.add(i,i); 
		end = System.nanoTime();			 
		duration = end - start;			 
		System.out.println("arraylist add(i, value):  " + duration + " ns");
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++)  newlinkedlist.add(i,i); 
		end = System.nanoTime();
		duration = end - start;
		System.out.println("linkedlist add(i, value): " + duration + " ns");
    }	
	
	/** 
	 * ����� set(i, value) - ������ �������� 
	*/	
	public static void Set(ArrayList<Integer> newarraylist, LinkedList<Integer> newlinkedlist)
    {
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++)  newarraylist.set(i, 2*i); 
		end = System.nanoTime();			 
		duration = end - start;			 
		System.out.println("arraylist set:  " + duration + " ns");
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++) newlinkedlist.set(i, 2*i);
		end = System.nanoTime();
		duration = end - start;
		System.out.println("linkedlist set: " + duration + " ns");
    }
	
	/** 
	 * �������� ������������ ���������� ������� �������� ��������
	 * ���������� �������� ������ K = 1000
	 * ����� ���������� � ������������
	 * ������� ������: ��������� -> ����� -> ����� ���������� � ����������� 
	*/
	public static void main(String[] args)
	{
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		LinkedList<Integer> linkedlist = new LinkedList<Integer>(); 
		System.out.println("Operations count = 1000 ");
		ArrayList<Integer> newarraylist = new ArrayList<Integer>();
		LinkedList<Integer> newlinkedlist = new LinkedList<Integer>();
		Compare.Add(arraylist,linkedlist);
		Compare.Get(arraylist,linkedlist);
		Compare.Remove(arraylist,linkedlist);
		Compare.AddIndex(newarraylist,newlinkedlist);
		Compare.Set(newarraylist,newlinkedlist);		
	}

}
