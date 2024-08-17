package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class StreamInitilization {

	public static void main(String[] args) {
		//----In how many approach we can create a stream object.------------------------------------------------------------------------------------------------------
	
		// 1. From collection object, collection.stream()
		List<String> l = List.of("One", "Two", "Three");
		Stream<String> stream1 = l.stream();
		System.out.println(stream1);
		
		// 2. From Arrays class, Arrays.stream()
		String[] arr = {"One", "Two", "Three"};
		Stream<String> stream2 = Arrays.stream(arr);
		System.out.println(stream2);
		
		// 3. From Stream class, Stream.of() 
		Stream<String> stream3 = Stream.of("One", "Two", "Three");
		System.out.println(stream3);
		
		// 4. From Stream class, Stream.generate()
		Stream<String> stream4 = Stream.generate(()->"One");
		System.out.println(stream4);
		
		// 5. Stream class provided  builder design pattern implementation, builder()
		Stream.Builder<Object> streamBuilder = Stream.builder();
		Builder<Object> stream5 = streamBuilder.add("One").add("Two").add("Three");
		System.out.println(stream5);
		
		// 6. We can create a empty stream, Stream.empty()
		Stream<Object> stream6 = Stream.empty();
		System.out.println(stream6);
	}
}






















