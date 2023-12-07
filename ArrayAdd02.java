import java.util.Scanner;
public class ArrayAdd02{
//int[]arr={1,2,3}扩容成{1,2,3,4}
//用户可以决定是否继续添加，y/n
//s1.一定会有键盘输入和循环结构 先扩容一次 do-while结构
// while（true）; 直接继续执行 
	public static void main(String[]args){

		Scanner myScanner = new Scanner(System.in); 
		int[] arr = {1,2,3};

		do{
			//扩容数组要放在循环内，才能不断扩容
			int[] arrNew = new int[arr.length + 1];
			for(int i = 0; i < arr.length; i++){
				arrNew[i] = arr[i];//一个变量i就够了
			}//至少增加一次
			System.out.println("请输入你要添加的元素");
			int addNum = myScanner.nextInt();  
			arrNew[arrNew.length - 1] = addNum;
			arr = arrNew;
			System.out.println("==arr扩容后元素情况==");
			for (int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + "\t"); 
			}
			System.out.println("是否继续添  加 y/n");   
			char key = myScanner.next().charAt(0);
			if(key == 'n'){
				break;
			}

		}while(true);
		System.out.println("结束");
	}
}
 