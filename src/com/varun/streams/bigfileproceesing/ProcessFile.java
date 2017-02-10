package com.varun.streams.bigfileproceesing;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Varun_Sudan on 2/5/2017.
 */
public class ProcessFile {

	private String filePath = null;

	public ProcessFile(String filePath) {
		this.filePath = filePath;
	}

	public ProcessFile() {
	}

	public static void main(String[] args) {
		String filePath = "big.txt";

		ProcessFile proc = new ProcessFile();
		proc.numOfLines(filePath);
/*
		proc.numOfWords(filePath);
		proc.getWordsInAFile(filePath);
		proc.getDistinctListOfWords(filePath);
*/
	}



	public long numOfLines(String filePath) {
		long count = 0;
		count  = getLinesOfAFile(filePath).stream().count();
		System.out.println("Number of lines in a file = " + count);
		return count;
	}

	public long numOfWords(String filePath) {
		long count = 0;
		List<String> lines = getLinesOfAFile(filePath);
		long numOfWords =
				lines.stream()
						.map((s) -> getWords(s))
						.map((wordArray) -> wordArray.length)
						.reduce(0, (a, b) -> a + b);
		System.out.println("1> Number of words in a file = " + numOfWords);
		return numOfWords;
	}

	public List<String> getWordsInAFile(String filePath) {
		List<String> linesOfAFile = getLinesOfAFile(filePath);
		List<List<String>> wordsPerLine =  linesOfAFile.stream()
				.map((line) -> getWordList(line))
				.collect(Collectors.toList());
		List<String> words = wordsPerLine.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
		System.out.println("2> Number of words in a file = " + words.size());
		return words;
	}

	public List<String> getDistinctListOfWords(String filePath) {
		List<String> words = getWordsInAFile(filePath).stream()
				.distinct()
				//.peek(System.out::println)
				.collect(Collectors.toList());
		System.out.println("Number of distinct words in a file = "+ words.size());

		return words;
	}

	public Map<String,Long> wordCountMap(String filePath) {
		List<String> lines = new ArrayList<>();

		Path path = Paths.get(filePath);
		try (Stream<String> lineStream = Files.lines(path)) {
			lines = lineStream.collect(Collectors.toList());
		} catch (IOException ex) {
			System.out.println("ex = " + ex);
		}

		Map<String, Long> words =
				lines.stream()
						.map(line -> {
									return Arrays.asList(line.split(" "));
								}
						)
						.collect(Collectors.toList()) // List  of words in the list of lines
						.stream()
						.flatMap(s -> s.stream())
						.collect(Collectors.toList()) // list of words
						.stream()
						.collect(groupingBy(Function.identity(), counting()));

		//words.forEach(System.out::println);
		return words;

	}

	private List<String> getLinesOfAFile(String filePath) {
		List<String> lineStream = new ArrayList<>();
		Path path = Paths.get(filePath);
		try(Stream<String> lines = Files.lines(path)) {
			lineStream = lines.collect(Collectors.toList());
		} catch (IOException ex) {
			System.out.println(ex.toString());
		} finally {
			return lineStream;
		}

	}

	private String[] getWords(String s) {
		String[] words = s.split(" ");
		return words;
	}

	private List<String> getWordList(String s) {
		String[] words = s.split(" ");
		return Arrays.asList(words);
	}
}
