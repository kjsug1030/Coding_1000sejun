package ch14_2;

import java.util.*;

public class StackTest {
	public static void main(String[] args) {
		/*
		 	  Stack : LIFO(Last In First Out)
		*/
		/* Generic : 클래스 내부에서 사용할 데이터 타입이 정해진 것이
		 * 아니고 그 클래스의 객체를 생성할 때 결정할 수 있도록 ,
		 * 사용할 데이터 타입을 파라미터로 받아서 객체를 생성하는 것.
		 * 타입 파라미터 (Type Parameter)
		*/
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < 10; i++) {
			stack.push(i + 1);
		}
		System.out.println(stack);
		
		while(stack.isEmpty() == false) {
			Integer val = stack.pop();
			System.out.print(val + " ");
		}
	}
}
