package hw;
/*�H���j�]�p��ơA��J�@�ӥ���ƭ�(���t 0)�A�Ǧ^�ӼƭȬO�X���(# ofdigits)�C

 * 
 * Date: 2016/11/14
 * Author: 105021058 �����M
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