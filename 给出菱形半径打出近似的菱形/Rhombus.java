import java.lang.Math;
import java.util.Scanner;

class Rhombus{
	public static final int MIN_RHOMBUS = 1;
	public static final int MAX_RHOMBUS = 10;
	public static void main(String[] args) {
		// 定义菱形半径
		int rhombus;
		// 输入菱形半径
		System.out.println("请输入菱的半径(1~10)之间 : ");
		Scanner sc = new Scanner(System.in);
		while (true) {
			rhombus = sc.nextInt();
			if (rhombus > 10 ) {
				System.out.println("你输入的半径大了");
			}else if(rhombus < 1){
				System.out.println("你输入的半径小了");
			}else{
				break;
			}
			
		}
		
		System.out.println("你输入的菱的半径是 :" + rhombus);
		// 定义保存菱形的二位数组
		char cRhombus[][] =new char[rhombus * 2][rhombus * 4];
		for (int i = 0; i <= 2 * rhombus - 1 ; i++ ) {
			for (int j = 0; j < 2 ;j++ ) {
				if (i == 0 || i == 2 * rhombus - 1) {
					cRhombus[i][rhombus - 1] = '*';
					cRhombus[i][rhombus + 1] = '*';
				}else if (i > 0 && i < rhombus) {
					cRhombus[i][rhombus - i - 1] = '*';
					cRhombus[i][rhombus + i + 1] = '*';
				}else if (i >= rhombus && i < 2 * rhombus - 1) {
					cRhombus[i][i - rhombus] = '*';
					cRhombus[i][3 * rhombus - i] = '*';
				}

			}
		}
		// 输出菱
		for (char[] c : cRhombus) {
			System.out.println(c);
		}

	}
}