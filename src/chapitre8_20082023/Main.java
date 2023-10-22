package chapitre8_20082023;

import java.io.File;

public class Main extends Object{

	public static void main(String[] args) {
		//var a = 2, c=3;
		var a ="ocp";
		var b = 3;
		a = null;
		var c = (String)null;
		System.out.println(Byte.MAX_VALUE); //127
		System.out.println(Byte.MIN_VALUE); //-128
		byte x = (byte)1_000_100;
		System.out.println(x);
		//var silly
		//= 1;

		/*var x= 10;
		
		var apples = (short)10;  //type = short
		apples = (byte)5;
		apples = (short)1_000_100;
		System.out.println(apples);*/

		//
		/*
		System.out.println(System.getProperty("file.separator"));
		System.out.println(java.io.File.separator); */
		
		//File file = new File("/home/smith/data/zoo.txt");
		//File file = new File("C:\\Users\\amine\\Desktop\\Lab_MongoDB_Express\\ingress.yaml"); // chemin absolu
		
		File file = new File(System.getProperty("user.dir"));
		System.out.println(file);
		System.out.println(file.exists());
		
		File file2 = new File("src\\chapitre8_20082023\\Main.java");//chemin relatif
		System.out.println(file2.exists());

	}

}
