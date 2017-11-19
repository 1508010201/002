//题目要求：完成输入的时间格式（如2012/12/12）转换为（2012-12-12）输出，并判断输入的时间格式是否正确，若异常，则抛出异常，输出时间格式不正确。
//异常检测考虑了部分，月份1——12，天数小于31天。
//内容：Java 异常捕获，字符串的处理。
//Iv.0
//2017年11月15日


import java.util.Scanner;
class TxfException extends Exception
{
	
	public void ErrorAnswer()
	{
		System.out.println("时间格式输入不正确！");
	}
}

public class Date 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	    System.out.println("请按照括号的日期形式输入年月日（yyyy/mm/dd）：");
	    String str=in.next();
	    String x1=str.substring(5,7); //将字符串中表示月份的字符提取给x1
	    int x=Integer.parseInt(x1);  //将提取后的字符转化为int型
	    String x2=str.substring(8);  //提取字符串中表示日的字符
	    int y=Integer.parseInt(x2);  //将提取后的字符转化为int型
	    char [] a= new char[10];     //定义字符型数组
	   //try-catch捕捉异常
	    try
	    {
	    	 if(x<0||x>12||y>31||(str.length()!=10)||(str.charAt(4)!='/')||(str.charAt(7)!='/'))
	 	    {
	 	    	throw new TxfException();
	 	    }
	    	 //实现时间输出格式转换
	    	 else
	    	 {
	    		 System.out.println("转换为(yyyy-mm-dd)的时间格式为：");
	    		 for(int i=0;i<a.length;i++)
	    			{
	    			 if(i==4||i==7)
	    			  {
	    				 a[i]='-';
	    			  }
	    			 else
	    			  {
	    				 a[i]=str.charAt(i);//将字符串赋值给数组
	    			  }
	    			  System.out.print(a[i]);//输出转换后的时间
	    			}
	    	 }
	    }  
	    catch(TxfException e)
	    {
	    	e.ErrorAnswer();//异常处理
	    }
	   
	}

}
