package step;
/*
 * �ڿ��� x�� �޾� x���� �۰ų� ���� �Ѽ��� ������ �����ϴ� �Լ�.
 * �Ѽ�: �ڸ����� ���������� �̷�� ��.
 */
import java.util.Scanner;

public class BOJ1065 {

	static int k=0;	//����
	public static void d(int n)
	{
		int a=0, b=0, c=0;	//n=100a+10b+c
		
		//a, b, c ���ϱ� =>�� �ڸ��� ���ϱ�
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
		//���� ���ϱ�
		
		
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
