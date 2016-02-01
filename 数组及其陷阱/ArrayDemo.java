public class ArrayDemo{
	public static void main(String[] args){
		// 定义两个数组
		int[] a = {1,3,5,7};
		int[] b = {2,4,6};
		// 获取数组长度
		System.out.println(a.length + "," + b.length);
		// 遍历数组
		for (int arr : a) {
			System.out.println(arr);
		}
		// 数组长度可变错觉
		a = b;
		System.out.println(a.length + "," + b.length);
		// 其实是把a的内存空间指向了b的地址.原来a的长度并没有改变，
		// 数组b失去引用 , 变成了垃圾
		System.out.println("----------------------");
		// 对象数组
		Person p1 = new Person();
		p1.age = 18;
		p1.name = "小明";
		Person p2 = new Person();
		p2.age = 20;
		p2.name = "小红";
		// 创建对象数组
		Person[] pArr = {p1,p2};
		// 通过数组下标访问
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].info();
		}

	}
}

class Person{
	int age;
	String name;
	public void info(){
		System.out.println(this.age + "," + this.name);
	}
}













