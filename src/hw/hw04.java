package hw;
/*��J��Ӿ�ơA�ϥλ��j��ƩI�s��X C(m,n)�C

 * 
 * Date: 2016/11/14
 * Author: 105021058 �����M
 */
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
//		System.out.println(C(m));
		if(m<n){
			int a=m; 
			m=n;
			n=a;
			
		}
		System.out.println(gcd(m,n));
	}
	public static int gcd(int m,int n){
		// TODO Auto-generated method stub
		if(n==0){
			return m;
		}else{
			return gcd(n,m%n);
		}
//		if(m==1){
//			return 1;
//		}
//		else{
		
//		return gcd();
//		}
	}

}