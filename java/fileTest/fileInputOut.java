package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class fileInputOut{

	public static void main(String[] args) throws Exception{
		String file = "D://InputOutputTest.txt";
		String str1 = "���տ�J��r1";
		String str2 = "���տ�J��r2";
		BufferedWriter output = new BufferedWriter(new FileWriter(file));
		output.write(str1);
		output.write(str2);
		output.close();
		System.out.println("�g�J����");
		BufferedReader input = new BufferedReader(new FileReader(file));
		System.out.println("�ɮסG" + file);
		while((str1 = input.readLine()) != null)
			System.out.println(str1);
		input.close();
	}

}
 