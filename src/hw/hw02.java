package hw;
/*以遞迴設計函數，輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。

 * 
 * Date: 2016/11/14
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		System.out.println(ofdigits(x));
	}
	public static int ofdigits(int x){
		// TODO Auto-generated method stub
		if(x==0){
		return 0;
		}
		else{
		 x=x/10;
		}
		
		return ofdigits(x)+1;
	}

}