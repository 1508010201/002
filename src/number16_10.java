//题目：从键盘输入十六进制字符串，转换为十进制输出，并且检查十六进制输入是否正确，若错误，则抛出异常。
//主要内容：Java，自定义异常。
//2017年11月14日
//Iv.0
import java.util.Scanner;
// Exchange 类
class Exchange 
{
	String s;
	private int y;
	//构造函数
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
	//十六进制转换为十进制函数
	void exchange()
	{
		int y=0;
		int i,k,m;
		for(i=0;i<s.length();i++)
		{
			k=check(s.charAt(i));
			y+=k*Math.pow(16, s.length()-(i+1));
		}
		
		System.out.println("十六进制转换为十进制结果为："+y);
	}
	//检查从键盘输入的十六进制是否规范
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
			throw new MyException();//输入的字符串中存在字符不属于0~9或a~f(A~F),则抛出自定义异常。
		}
		return x;//便于进制转化计算。
	}
}
//定义异常类
class MyException extends RuntimeException
{
	public MyException(){}
	public MyException(String msg)
	{
		super(msg);
	}
	public void printcount()
	{
		System.out.println("十六进制输入不正确！");
	}
	
}
public class number16_10 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
	    System.out.print("请输入十六进制数：");
	    String s=in.next();//从键盘输入一个16进制的字符串
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
