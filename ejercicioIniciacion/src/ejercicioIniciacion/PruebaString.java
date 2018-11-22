package ejercicioIniciacion;

public class PruebaString {
	public static String extraEnd(String str) {
		  int f =str.length()-2;
		  return str.substring(f)+str.substring(f)+str.substring(f);
		}

	public static void main(String[] args) {
		System.out.println(extraEnd("aa"));
		
		

	}

}
