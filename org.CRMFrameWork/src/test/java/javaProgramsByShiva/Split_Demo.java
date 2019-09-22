/**
 * 
 */
package javaProgramsByShiva;

import java.time.LocalDate;

/**
 * @author Lenovo
 *
 */
public class Split_Demo {

	/*
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "016-78967-0000";
		// String str1 = "This is my java program, 143 - [0-1233333]";
		System.out.println(str);
		String[] splitArr = str.split("-");
		System.out.println(splitArr[0]);
		System.out.println(splitArr[1]);
		System.out.println(splitArr[2]);

		String str1 = "This is my java program, 143 - [0-1233333]";
		System.out.println(str1);
		String[] test = str1.split(",");

		System.out.println(test[0] + "-----------------" + test[1]);

		String[] arr = test[1].split("-");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		String s = String.valueOf(date);
		String ss [] = s.split("-");
		System.out.println(ss[2]);
		System.out.println(ss[1]);
		System.out.println(ss[0]);
	}

}
