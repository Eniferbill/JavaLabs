package lab;

import java.util.ArrayList;
import java.util.LinkedList;

/** 
 * �������� ������������������ ArrayList � LinkedList
 * https://github.com/Eniferbill/JavaLabs
 * @autor ��������� ������ ������������� 3 ���� 7 ������
*/
public class Compare {
	
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
			 
		/** 
		 * ����� add - ���������� �������
		 */ 		
		long start = System.nanoTime();
		for (int i = 0; i < 1000; i++)  arraylist.add(i); 
		long end = System.nanoTime();			 
		long duration = end - start;			 
		System.out.println("arraylist add:  " + duration + " ns");
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++) linkedlist.add(i);
		end = System.nanoTime();
		duration = end - start;
		System.out.println("linkedlist add: " + duration + " ns");
		
		/** 
		 * ����� get - ��������� ��������
		*/ 				 
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
		
		/** 
		 * ����� remove - �������� ��������
		*/ 	
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
			 
		ArrayList<Integer> newarraylist = new ArrayList<Integer>();
		LinkedList<Integer> newlinkedlist = new LinkedList<Integer>();
		
		/** 
		 * ����� add(i, value)  - ���������� ������� �� �������
		*/ 	
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
		
		/** 
		 * ����� set(i, value) - ������ �������� 
		*/ 	
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

}
