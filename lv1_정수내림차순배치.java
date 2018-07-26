import java.util.Arrays;
import java.util.Collections;

public class test {
	  public static long solution(long n) {
	      long answer = 0;
	      String str ="";

	      String arr [] = String.valueOf(n).split("");

	       Arrays.sort(arr,Collections.reverseOrder());

	      for(String s : arr) {
	          str += s; 
	      }
	      return Long.parseLong(str);
	  }

	  public static void main(String[] args) {
		long a =solution(1348);

		System.out.println(a);
	}
}
