package hw;
/*輸入兩個整數，使用遞迴函數呼叫輸出 C(m,n)。

 * 
 * Date: 2016/11/14
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long x=scn.nextInt();
		String a="";
//		System.out.println(C(m));
		System.out.println(fun(x,a));
	}
	public static String fun(long x,String a){
		// TODO Auto-generated method stub
		if(x==0){
			return "";
		}else{
			a=Long.toString(x%10);
//			x=x/10;
			return a+fun(x/10,a);
		}
//		if(m==1){
//			return 1;
//		}
//		else{
		
//		return gcd();
//		}
	}

}