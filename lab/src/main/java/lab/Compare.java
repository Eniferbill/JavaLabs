package lab;

import java.util.ArrayList;
import java.util.LinkedList;

/** 
 * Сравнить производительность ArrayList и LinkedList
 * https://github.com/Eniferbill/JavaLabs
 * @autor Поздняков Даниил Александрович 3 курс 7 группа
*/
public class Compare {
	
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
			 
		/** 
		 * Метод add - добавление элемнта
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
		 * Метод get - получение элемента
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
		 * Метод remove - удаление элемента
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
		 * Метод add(i, value)  - добавление элемнта по индексу
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
		 * Метод set(i, value) - замена элемента 
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
