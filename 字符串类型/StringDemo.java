

class StringDemo{
	public static void main(String[] args) {
		//define String s 
		String s = "HelloWorld!";
		// output s
		System.out.println(s);
		// 获取长度
		System.out.println(s.length());  //  11
		// 判断内容是否相同
		String s2 = "HelloWorld";
		System.out.println(s.equals(s2)); 
		 //false
		// 比较字符串大小关系
		System.out.println(s.compareTo(s2));  //1 代表s大于s2
		// 判断内容与地址是否相同
		String s3 = "HelloWorld";
		System.out.println(s2 == s3);   // true 
		// 因为所有的String都是保存在常量池里面的  其实s2和s3是同一个对象
		String s4 = new String("HelloWorld");
		System.out.println(s2 == s4);   //  false
		// 新建了一个String 由于地址不同  s2与s4虽然内容相同，但是地址不同。
		// 一般情况使用equals方法  因为比较的不是地址 而是内容

		// 查找字符串在第5位置的是哪个字符
		System.out.println(s2.charAt(5)); // W
		System.out.println(s2.indexOf("W",0)); // 5

		// 还可以截取  subString(int beginIndex)
		// 字符串替换  replace(char oldChar,char newChar)
		// 大小写转换
		System.out.println(s2.toUpperCase()); //HELLOWORLD

	}
}