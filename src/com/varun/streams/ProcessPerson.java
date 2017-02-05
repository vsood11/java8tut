package com.varun.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by Varun_Sudan on 1/26/2017.
 */
public class ProcessPerson {


	private List<Person> getListOfPerson() {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("sudan", "prisha", 3));
		personList.add(new Person("sudan", "varun", 30));
		personList.add(new Person("krishna", "pallavi", 30));
		personList.add(new Person("doe", "jhon", 21));
		personList.add(new Person("daniel", "jack", 15));
		personList.add(new Person("ma", "jack", 50));
		personList.add(new Person("spacey", "kevin", 45));
		personList.add(new Person("reeves", "keanu", 42));
		personList.add(new Person("waste", "guy", 18));
		
		return personList;
	}

	public void useOfForEach() {
		getListOfPerson().stream().forEach((p) -> System.out.println(p));
		getListOfPerson().stream().forEach(System.out::println);
	}

	public void useOfFilter(){
		getListOfPerson().stream().filter((p) -> p.getAge() > 18)
				.forEach(System.out::println);
		System.out.println();
		getListOfPerson().stream().filter((p) -> p.getAge() <= 18)
				.forEach(System.out::println);
	}

	public void useOfMap() {

		getListOfPerson().stream()
				.map((p) -> new PersonName(p.getfName(), p.getlName()))
				.forEach(System.out::println);
	}

	public void useOfParallelStream() {
		getListOfPerson().parallelStream().forEach(System.out::println);
	}

	public void createStreamOfObj() {
		Stream.of(
				new Person("sudan", "prisha", 3),
				new Person("sudan", "varun", 3),
				new Person("krishna", "pallavi", 3)
		).forEach(System.out::println);
	}

	public void useOfRange() {
		IntStream.range(1,5).forEach(System.out::println);
		//DoubleStream.;
		LongStream.range(6,10).forEach(System.out::println);
	}

	public void useOfSum(){
		int sum = IntStream.range(1, 10000).sum();
		System.out.println("sum = " + sum);
	}

	public void useOfAverage() {
		OptionalDouble avg = IntStream.range(1, 10000).average();
		System.out.println("avg = " + avg);
	}

	public static void main(String[] args) {
		ProcessPerson pp = new ProcessPerson();
		//pp.useOfForEach();
		//pp.useOfFilter();
		//pp.useOfMap();
		//pp.useOfParallelStream();
		//pp.createStreamOfObj();
		// pp.useOfRange();
		//pp.useOfSum();
		//pp.useOfAverage();
	}

}
