package Quiz;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question {

	public static void main(String[] args) {
		
		Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
		System.out.println(path.subpath(1, 3).getName(1));
		
		
		//String ch = "ali";
		//ch.equals(ch);
		
		//ch="ali";
		/*String ch2 = new String("ali");
		System.out.println(ch.hashCode());
		System.out.println(ch2.hashCode());*/
	}

}
