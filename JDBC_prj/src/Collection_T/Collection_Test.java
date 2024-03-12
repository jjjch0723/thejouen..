package Collection_T;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import lombok.Getter;

public class Collection_Test {
	static List<String> list1 = new ArrayList<String>();
	static List<String> list2 = new LinkedList<String>();
	public static void main(String[] args) {
		list1.add("dog");list1.add("cat");list1.add("lion");
		list2.add("dog");list2.add("cat");list2.add("lion");

		System.out.println("=ArrayList");
		System.out.println(list1);
		System.out.println("=LinkedList");
		System.out.println(list2);
		System.out.println("------------------");
		
		System.out.println("--insert");
		list1.add(2, "tiger");
		list2.add(2, "tiger");
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println("--remove");
		list1.remove(2);
		list2.remove(2);
		
		System.out.println(list1);
		System.out.println(list2);
	}
	
	//반복처리하는 메서드(함수)
	public static void toString(String title) {
		System.out.printf(" == %s == /n", title);
		System.out.println("ArrayList: " + list1);
		System.out.println("LinkedList: " + list2);

		
	}

}
