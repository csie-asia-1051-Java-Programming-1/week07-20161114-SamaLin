package ex;
/*�ӤW�D�A���Fvar() ��Ƥ��~�A�A�Ϋإߤ@�� std() ��ơA�{���b�������ϥΪ̿�J
 * ���@����ư}�C����A�I�sstd()�禡�i�o��}�C���зǮt�A�S�O�`�N�A���n�u�� std() ��ƺ⵲�G�A������std()�h�I�s var() ��Ƥ���^�� std() �禡�B�z���A�Ǧ^���D�{���A�D�{���A�⵲�G�L�X�C

 * 
 * Date: 2016/11/14
 * Author: 105021058 �����M
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