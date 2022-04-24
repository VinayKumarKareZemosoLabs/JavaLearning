package com.streams.iterationstrategy;

import java.util.ArrayList;
import java.util.List;

import com.Streams.WrokingWithStreams.Movie;
import com.Streams.WrokingWithStreams.MovieUtil;

public class InternalAndExternalIterationStrategy {

	List<Movie> movies = MovieUtil.createMovies();
	List<Movie> top2Classics = new ArrayList<Movie>(10);
	
	private void testExternalIteration1() {
		for(Movie m : movies) {
			if(m.isClassic()) {
				top2Classics.add(m);
			}
		}
		System.out.println("top 2 Classics (Ext iteration): "+top2Classics);
	}
	
	private void testInternalIteration() {
		movies.stream().filter(Movie::isClassic)
	//	.map(Movie::getName)
		.forEach(System.out::println);
	}
}
