import java.util.*;

public class ArgumentsDemo{
	public static void main(String[] agrs){
		strArr(3,"中国","你好","!");
	}

	public static void strArr(int len,String... str){
		for (int i = 0; i < len; i++) {
			System.out.println(str[i]);
		}
	}
}
