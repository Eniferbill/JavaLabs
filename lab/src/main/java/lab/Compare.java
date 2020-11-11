package lab;

import java.util.ArrayList;
import java.util.LinkedList;

/** 
 * Сравнить производительность ArrayList и LinkedList
 * https://github.com/Eniferbill/JavaLabs
 * @autor Поздняков Даниил Александрович 3 курс 7 группа
 * @version 2.0
*/
public class Compare {
	
	/** Начало отсчета времени */
	public static long start;
	
	/** Конец отсчета времени */
	public static long end;
	
	/** Длительность выполнения метода */
	public static long duration;
	
	/** 
	 * Метод add - добавление элемнта
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
	 * Метод get - получение элемента
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
	 * Метод remove - удаление элемента
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
	 * Метод add(i, value)  - добавление элемнта по индексу
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
	 * Метод set(i, value) - замена элемента 
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
	 * Проверка длительности выполнения методов заданных колекций
	 * Количество операций всегда K = 1000
	 * Время засекается в наносекундах
	 * Таблица вывода: коллекция -> метод -> время выполнения в наносекудах 
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
