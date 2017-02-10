package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class JavaInputOutput {

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入資料：");
		System.out.flush();
		String str1 = input.readLine();
		input.close();
		String str2 = "輸入的資料是：" + str1;
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		output.write(str2);
		output.close();
	}

}
