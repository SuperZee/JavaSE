/**
Java是强类型的语言, -> 每个变量和每个表达式都在编译的时期确定了类型 ，必须先声明后使用
*/
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
	}
}