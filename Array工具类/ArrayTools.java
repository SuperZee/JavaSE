/**
	导入工具包
*/
import java.util.Arrays;
import java.util.List;
public class ArrayTools{
	public static void main(String[] args) {
		int a[] = {-6,1,4,9,11,-3,-4,0,-8,8};
		// 数组排序
		Arrays.sort(a);
		// 遍历数组
		for (int e : a) {
			System.out.print(e + ",");
		}
		// -8,-6,-4,-3,0,1,4,8,9,11,
		// 遍历数组方法2
		System.out.println();
		System.out.println(Arrays.toString(a));
		// [-8, -6, -4, -3, 0, 1, 4, 8, 9, 11]

		// 数组复制 复制n个长度
		int b[] = Arrays.copyOf(a,10);
		// 比较数组
		boolean isEqual = Arrays.equals(a,b);
		System.out.println(Arrays.toString(b));
		System.out.println(isEqual); // true

		// 填充数组
		int[] c = new int[5];
		Arrays.fill(c,-1);
		System.out.println(Arrays.toString(c));
		// [-1, -1, -1, -1, -1]
		
	}
}