//��Ŀ���Ӽ�������ʮ�������ַ�����ת��Ϊʮ������������Ҽ��ʮ�����������Ƿ���ȷ�����������׳��쳣��
//��Ҫ���ݣ�Java���Զ����쳣��
//2017��11��14��
//Iv.0
import java.util.Scanner;
// Exchange ��
class Exchange 
{
	String s;
	private int y;
	//���캯��
	Exchange(String s)
	{
		this.s=s;
	}
	int getY()
	{
		return y;
	}
	void setY(int y)
	{
		this.y=y;
	}
	//ʮ������ת��Ϊʮ���ƺ���
	void exchange()
	{
		int y=0;
		int i,k,m;
		for(i=0;i<s.length();i++)
		{
			k=check(s.charAt(i));
			y+=k*Math.pow(16, s.length()-(i+1));
		}
		
		System.out.println("ʮ������ת��Ϊʮ���ƽ��Ϊ��"+y);
	}
	//���Ӽ��������ʮ�������Ƿ�淶
	int check(char h)
	{
		int x;
		switch(h)
		{
		case '0':x=0;break;
		case '1':x=1;break;
		case '2':x=2;break;
		case '3':x=3;break;
		case '4':x=4;break;
		case '5':x=5;break;
		case '6':x=6;break;
		case '7':x=7;break;
		case '8':x=8;break;
		case '9':x=9;break;
		case 'a':
		case'A':
			x=10;break;
		case 'b':
		case 'B':
			x=11;break;
		case 'c':
		case 'C':
			x=12;break;
		case 'd':
		case 'D':
			x=13;break;
		case 'e':
		case 'E':
			x=14;break;
		case 'f':
		case 'F':
			x=15;break;
		default:
			throw new MyException();//������ַ����д����ַ�������0~9��a~f(A~F),���׳��Զ����쳣��
		}
		return x;//���ڽ���ת�����㡣
	}
}
//�����쳣��
class MyException extends RuntimeException
{
	public MyException(){}
	public MyException(String msg)
	{
		super(msg);
	}
	public void printcount()
	{
		System.out.println("ʮ���������벻��ȷ��");
	}
	
}
public class number16_10 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
	    System.out.print("������ʮ����������");
	    String s=in.next();//�Ӽ�������һ��16���Ƶ��ַ���
	    Exchange E=new Exchange(s);
	    try
	    {
	    	E.exchange();
	    }
	    catch(MyException e)
	    {
	    	e.printcount();
	    }

	}

}
