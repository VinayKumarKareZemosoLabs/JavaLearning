package com.OwnExercise.Files;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPractice {
	
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,3,4,66,20,50,5);
//		
//		List<Integer> square = number.stream().map(x->x*x)
//				.collect(Collectors.toList());
//		
//		
//		System.out.println(square);
		
		//...............................
		
		List<String> name = Arrays.asList("Reflection", "Collection", "Stream");
//		List<String> result = name.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
//		
//		System.out.println(result);
		
		//.................................
		
//		List<String> show = name.stream().sorted().collect(Collectors.toList());
//		System.out.println(show);
		
		//..............................
		
//		List<Integer> sortedNum = number.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedNum);
		
		//...............................
//		Set<Integer> squareSet = number.stream().map(x->x*x).collect(Collectors.toSet());
//		System.out.println(squareSet);
//		
		//...............................
		
//		number.stream().map(x->x*x).forEach(y->System.out.println(y));
		
		
		//...........................
		int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);
	

	}
}
