package ex;
/*
 * 請寫一個程式，用陣列儲存使用者輸入的 n 個整數，透過函式 var() 可以回傳計算
 * 該陣列裡的數字的變異數後再列印出結果。

 * Date: 2016/11/14
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int data[]=new int[n];
		for(int i=0;i<n;i++){
			data[i]=scn.nextInt();
		}
		System.out.println(var(data,n));
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
//	public static double fun2(double n){
//		// TODO Auto-generated method stub
//		if(n==1){
//			return 1;
//		}else{
//			return n*fun2(n-1);
//		}
//		
//	}

}
