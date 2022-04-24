package com.streams.lazyeager;

import java.util.List;
import java.util.stream.Stream;

import com.Streams.WrokingWithStreams.MovieUtil;

public class LazyAndEagerStreams {

	List<com.Streams.WrokingWithStreams.Movie> movies = MovieUtil.createMovies();
	
	private void testLazy() {
		movies.stream()
		.filter(m->{
			System.out.println("Inside lazy operation");
			return m.isClassic()?true:false;
		}).count();
	}
	private void testEager() {
		Stream<Movie> movieStream = movies.stream().filter(m->{
			System.out.println("Filtering");
			return m.isClassic()?true:false;
		}).map(s->{
			System.out.println("Mapping");
		});
		
		Stream<com.Streams.WrokingWithStreams.Movie> moviesStream;
		System.out.println(""+ moviesStream.count());
	}
	
	
}
