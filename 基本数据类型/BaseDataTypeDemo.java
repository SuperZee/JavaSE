/**
Java是强类型的语言, -> 每个变量和每个表达式都在编译的时期确定了类型 ，必须先声明后使用
*/
import java.util.*;
public class BaseDataTypeDemo{
	public static void main(String[] args) {
		/*
		Primitive Type :
		boolean short int long char float double 
		Reference :
		class interface Array  special:null 
		*/

		/**
		测试基本类型的最大值，最小值.范围.
		*/
		byte byte_min = (byte)-1 << 7;
		byte byte_max = ((byte)1 << 7) - 1;
		System.out.println("byte " + byte_min + "~" + byte_max);

		short short_min = (short)-1 << 15;
		short short_max = ((short)1 << 15) - 1;
		System.out.println("short " + short_min + "~" + short_max);

		int int_min = -1 << 31;
		int int_max = (1 << 31) - 1;
		System.out.println("int " + int_min + "~" + int_max);

		long long_min = (long)-1 << 63;
		long long_max = ((long)1 << 63) - 1;
		System.out.println("long " + long_min + "~" + long_max);
		// long long_min = (long)-1 << 63;
		// long long_max = ((long)1 << 63) - 1;
		// syso : long -2147483648~2147483647  ????? 按道理long应该是64位  
		// 解决方法　：　
		// 虽然定义的 long_min  long_max是long类型 但是运行的时候 -1 和 1 没有加上 long类型  默认只有32位 其他位数精度丢失
		float f = Float.NEGATIVE_INFINITY;
		double d = Double.NEGATIVE_INFINITY;
		//特殊的浮点数  :  NaN  ,  NaN不与任何数字相等,甚至和自己本身都不相等
		//                 正无穷大 : POSITIVE_INFINITY
		//                 负无穷大 : NEGATIVE_INFINITY
		System.out.println(f == d);  // true
		// Float 与 Double的正负无穷大是相等的

		// 字符+字符串可以拼接
		char c = 97;
		String s = "java";
		System.out.println(c + s);  //  ajava

		// 表达类型自动提升
		short sValue = -5;
		sValue = sValue + 4;  // 企图把一个int类型赋值给short会发生错误
		//BaseDataTypeDemo.java:52: 错误: 不兼容的类型: 从int转换到short可能会有损失

	}
}