package hw;
/*請寫一函數 lcm(x,y,z)，求三數 x、y、z 之最小公倍數

 * 
 * Date: 2016/11/14
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		int y=scn.nextInt();
		int z=scn.nextInt();
		int max=gcd(gcd(x,y),z);
		int min=lcm(lcm(x,y),z);
//		System.out.println(min);
	}
//	public static int lcm(int x,int y){
//		// TODO Auto-generated method stub
//		
//		
//	}
	public static int gcd(int x,int y){
		// TODO Auto-generated method stub
		if(x%y==0){
			return y;
		}else{
			return gcd(y,x%y);
		}
	}
	public static int lcm(int x,int y){
		// TODO Auto-generated method stub
		if(x%y==0){
			return y;
		}else{
			return gcd(y,x%y);
		}
	}

}