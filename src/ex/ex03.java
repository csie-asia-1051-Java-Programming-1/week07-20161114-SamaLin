package ex;
/*請寫一個程式，讓使用者輸入一個整數二維陣列，建立 var2()函式 及std2()可以分別計
 * 算二維陣列的變異數與標準差，並把結果回傳到主程式印出。

 * 
 * Date: 2016/11/14
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		int y=scn.nextInt();
		int n=x*y;
		int data[][]=new int[x][y];
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
			data[i][j]=scn.nextInt();
			}
		}
		System.out.println(var(data,n,x,y));
		System.out.println(std(data,n,x,y));
	}
	public static double var(int data[][],int n,int x, int y){
		// TODO Auto-generated method stub
		double u=0;
		double sum=0;
		for(int i=0;i<x;i++){
				for(int j=0;j<y;j++){
					u=u+data[i][j];
			}
		}
		u=u/n;
		
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				sum=sum+(double)Math.pow(data[i][j]-u, 2);
			}
		}
		sum=sum/n;
		
		return sum;
		
	}
	public static double std(int data[][],int n,int x,int y){
	// TODO Auto-generated method stub
		double a=var(data,n,x,y);

		return (double)Math.sqrt(a);
	
	}

}