package step;
/*
 * 자연수 x를 받아 x보다 작거나 같은 한수의 개수를 리턴하는 함수.
 * 한수: 자리수가 등차수열을 이루는 수.
 */
import java.util.Scanner;

public class BOJ1065 {

	static int k=0;	//개수
	public static void d(int n)
	{
		int a=0, b=0, c=0;	//n=100a+10b+c
		
		//a, b, c 구하기 =>각 자리수 구하기
		if(n==1000) {
			
		}
		else if(n>=100) {
			a = n/100;
				n -= a*100;
			b = n/10;
			c = n- b*10;
			if((a-b)==(b-c))
				{
					k++;
				
				}
			
		}
		else 
			k++;
		//차이 구하기
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		int x=scanner.nextInt();	//x<=1000

		for(int i=1;i<=x;i++)
		{
			d(i);
		}
		System.out.println(k);
	}

}
