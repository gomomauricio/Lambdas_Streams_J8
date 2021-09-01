package com.lamdas.comparetor;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		
		List<Integer> ls1 = Arrays.asList(50,10,20,30,80,90,40,60,70,100);
		System.out.println("lista " + ls1);

		Collections.sort(ls1);
		
		System.out.println("lista ordenado " + ls1);
		
		
		
	}
}
