package horef_pack_jv;
import java.lang.Math;

public class F {

	public static int prime_by_id(int i) {
		int c = 0;
		int cnum = 1;
		while (c != i) {
			if (prime(cnum)) c++;
			cnum++;
		}
		return cnum-1;
	}

	public static int square_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum*sum;
	}

	public static int sum_squares(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i*i;
		}
		return sum;
	}

	public static String reverse_string(String s) {
		char[] ret = new char[s.length()];
		for (int i = s.length()-1; i >= 0; i--) {
			ret[ret.length-i-1] = s.toCharArray()[i];
		}
		return String.valueOf(ret);
	}

	public static boolean palindrome(int n) {
		String sn = String.valueOf(n);
		if (sn.substring(0, sn.length()/2).equals(reverse_string(sn.substring((int)Math.ceil(sn.length()/2.0))))) return true;
		return false;
	}
	
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