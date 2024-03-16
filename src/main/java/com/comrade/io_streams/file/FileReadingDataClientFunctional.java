package com.pool.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadingDataClientFunctional {
	public static void main(String[] args) {
		try {
			
			String searchword = "CHAPTER";
			String path = "/home/shiva/shiva/mywork/zero_to_hero_java/src/main/java/resources/war_and_peace.txt";
			Long count=Files.lines(Paths.get(path)).filter(line->line.contains(searchword)).count();//better way
			Files.lines(Paths.get(path)).parallel().filter(line->line.contains(searchword)).count();
			Files.lines(Paths.get(path)).filter(line->line.contains(searchword)).map(line->1).reduce(0,(total,value)->total+value);
			System.out.println("Search word repeated count:"+count);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
