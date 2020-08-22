package horef_pack_jv;

public class Functions {
	
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