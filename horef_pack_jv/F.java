package horef_pack_jv;

import javax.xml.namespace.*;

public class F {
	
	
	public static void print_matrix(Object[][] matrix) {
		print("[");
		for (int r = 0; r < matrix.length; r++) {
			print_arr(matrix[r], false);
			if (r != matrix.length-1) {
				print(",\n");
			}
		} 
		print("]");
	}
	
	
	public static void print_matrix(Object[][] matrix, boolean endl) {
		print("[");
		for (int r = 0; r < matrix.length; r++) {
			print_arr(matrix[r], false);
			if (r != matrix.length-1) {
				print(",\n");
			}
		} 
		if (endl)
			println("]");
		else 
			print("]");
	}
	
	
	public static void print_arr(Object[] arr) {
		print("[");
		for (int i = 0; i < arr.length; i++) {
			print(arr[i]);
			if (i != arr.length-1) {
				print(", ");
			}	
		}
		println("]");
	}
	
	
	public static void print_arr(Object[] arr, boolean endl) {
		print("[");
		for (int i = 0; i < arr.length; i++) {
			print(arr[i]);
			if (i != arr.length-1) {
				print(", ");
			}	
		}
		if (endl) 
			println("]");
		else
			print("]");
	}
	
	
	public static boolean prime(int num) {
		if (num <= 1) return false;
		for (int i = 2; i < num; i++) {
			if (num%i == 0) return false;
		}
		return true;
	}
	
	
	public static String[] to_parts(String text, String sep) {
		return text.split(sep);
	}
	
	
	public static String[] to_parts(String text, String sep, String clear) {
		return text.replaceAll(clear, "").split(sep);
	}
	
	
	public static void println(Object o) {
		System.out.println(o);
	}
	
	
	public static void print(Object o) {
		System.out.print(o);
	}
}