package com.streams.creation;

import java.util.stream.Stream;

import com.Streams.WrokingWithStreams.Movie;

public class CreatingStreams {
	
	private void testCollectionStreams() {
		
	}
	
	private void testEmptyStreams() {
		Stream<Movie> movieEmptyStream = Stream.empty();
		//System.out.println("Empty stream :" movieEmptyStream.count());
	}
	
	private void testStreamsFromValues() {
		Stream<String> movieName = Stream.of("Gods Must Be Crazy", "Fiddler On The Roof");
		System.out.println(movieNames.count());
	}
	
	private void testFileStreams() {
		
	}
	
	private void testGenerateIterateStreams() {
		
	}
	
	public static void main(String[] args) {
		new CreatingStreams().testEmptyStreams();
		new CreatingStreams().testStreamsFromValues();
		new CreatingStreams().testCollectionStreams();
		new CreatingStreams().testFileStreams();
		new CreatingStreams().testGenerateIterateStreams();
		
		
	}

}
