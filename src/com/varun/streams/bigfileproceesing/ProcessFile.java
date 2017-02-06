package com.varun.streams.bigfileproceesing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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
		ProcessFile proc = new ProcessFile();
		proc.numOfLines("big.txt");
		proc.numOfWords("big.txt");
	}

	private List<String> linesStream(String filePath) {
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

	public long numOfLines(String filePath) {
		long count = 0;
		count  = linesStream(filePath).stream().count();
		System.out.println("Number of lines in a file = " + count);
		return count;
	}

	public long numOfWords(String filePath) {
		long count = 0;
		List<String> lines = linesStream(filePath);
		long numOfWords =
				lines.stream()
						.map((s) -> getWords(s))
						.map((wordArray) -> wordArray.length)
						.reduce(0, (a, b) -> a + b);
		System.out.println("Number of words in a file = " + numOfWords);
		return numOfWords;
	}

	private String[] getWords(String s) {
		String[] words = s.split(" ");
		return words;
	}
}
