package ex;
/*�мg�@�ӵ{���A���ϥΪ̿�J�@�Ӿ�ƤG���}�C�A�إ� var2()�禡 ��std2()�i�H���O�p
 * ��G���}�C���ܲ��ƻP�зǮt�A�ç⵲�G�^�Ǩ�D�{���L�X�C

 * 
 * Date: 2016/11/14
 * Author: 105021058 �����M
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