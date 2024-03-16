package com.pool.file.filehidden;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class HiddenClient {
	public static void main(String[] args) {
		File[] hiddenFiles = new File(".").listFiles(File::isHidden);
		for (int i = 0; i < Objects.requireNonNull(hiddenFiles).length; i++) {
			System.out.println(Arrays.toString(hiddenFiles));
		}
	}
}
