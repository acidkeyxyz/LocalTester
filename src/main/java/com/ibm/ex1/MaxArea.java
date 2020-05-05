package com.ibm.ex1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class MaxArea {

	/*
	 * Complete the 'largestArea' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY samples as parameter.
	 */

	private static BufferedReader br;

	public static int largestArea(List<List<Integer>> samples) {
		int max = 0;
		for (int i = 0; i < samples.size(); i++) {
			for (int j = 0; j < samples.get(i).size(); j++) {
				for (int currentSize = 1; currentSize < samples.size(); currentSize++) {
					if (isSquare(samples, i, j, currentSize)) {
						max = currentSize > max ? currentSize : max;
					} else {
						j += currentSize - 1;
						break;
					}
				}

			}
		}
		return max;
	}

	public static boolean isSquare(List<List<Integer>> samples, int initX, int initY, int size) {
		if (size == 1) {
			return (samples.get(initX).get(initY) == 1);
		}
		if ((initX + size) > samples.size() || (initY + size) > samples.get(initX).size()) {
			return false;
		}
		for (int i = initX; i <= size; i++) {

			for (int j = initY; j <= size; j++) {
				int currentItem = samples.get(i).get(j);
				if (currentItem != 1) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		List<List<Integer>> samples = FileLoader("C:\\Users\\luissalm\\Downloads\\input006.txt");
		int result = largestArea(samples);
		System.err.println(result);
	}

	private static List<List<Integer>> FileLoader(String filePath) throws IOException {
		System.out.println("loading data");
		File file = new File(filePath);
		List<List<Integer>> samples = new ArrayList<>();
		br = new BufferedReader(new FileReader(file));
		String st;
		int lineNumber =1;
		while ((st = br.readLine()) != null) {
			if(!(lineNumber == 1 ||lineNumber==2)){
				String[] lineSplitted = st.split(" ");
				List<Integer> line = new ArrayList<Integer>();
				for(String number:lineSplitted) {
					line.add(Integer.valueOf(number));
				}
				samples.add(line);
			}
			lineNumber++;
		}
		System.out.println("loaded data");
		return samples;
	}

}
