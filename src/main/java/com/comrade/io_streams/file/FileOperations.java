package com.pool.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileOperations {
	public static void main(String[] args) throws IOException {
		showAllFiles();
		fileFilter();
		filterSre();
		Files.newDirectoryStream(Paths.get("./src"), path -> path.toString().endsWith(".java")).forEach(System.out::println);
		final File[] files = new File(".").listFiles(file -> file.isHidden());
	}

	private static void filterSre() {
		String[] files = new File("fpij").list(new java.io.FilenameFilter() {
			public boolean accept(final File dir, final String name) {
				return name.endsWith(".ser");
			}
		});
	}

	private static void fileFilter() throws IOException {
		Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);
	}

	private static void showAllFiles() throws IOException {
		Files.list(Paths.get(".")).forEach(System.out::println);
	}
}
