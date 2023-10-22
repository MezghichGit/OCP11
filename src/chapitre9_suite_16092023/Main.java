package chapitre9_suite_16092023;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		Path path = Paths.get("D:\\sagem\\OCP11_SIP_Academy");
		try {
			Files.walk(path).filter(p -> p.toString().endsWith(".java")).forEach(System.out::println);
		} catch (IOException e) {
			// Handle file I/O exception...
		}
	}

}
