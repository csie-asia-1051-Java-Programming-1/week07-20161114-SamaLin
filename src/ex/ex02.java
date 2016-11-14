package ex;
/*承上題，除了var() 函數之外，再用建立一個 std() 函數，程式在接收完使用者輸入
 * 的一維整數陣列之後，呼叫std()函式可得到陣列的標準差，特別注意，不要只用 std() 函數算結果，必須由std()去呼叫 var() 函數之後回到 std() 函式處理完再傳回給主程式，主程式再把結果印出。

 * 
 * Date: 2016/11/14
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int data[]=new int[n];
		for(int i=0;i<n;i++){
			data[i]=scn.nextInt();
		}
//		System.out.println(var(data,n));
		System.out.println(std(data,n));
	}
	public static double var(int data[],int n){
		// TODO Auto-generated method stub
		double u=0;
		double sum=0;
		for(int i=0;i<n;i++){
			u=u+data[i];
		}
		u=u/n;
		
		for(int i=0;i<n;i++){
			sum=sum+(double)Math.pow(data[i]-u, 2);
		}
		sum=sum/n;
		
		return sum;
		
	}
	public static double std(int data[],int n){
	// TODO Auto-generated method stub
		double a=var(data,n);

		return (double)Math.sqrt(a);
	
	}

}