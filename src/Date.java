//��ĿҪ����������ʱ���ʽ����2012/12/12��ת��Ϊ��2012-12-12����������ж������ʱ���ʽ�Ƿ���ȷ�����쳣�����׳��쳣�����ʱ���ʽ����ȷ��
//�쳣��⿼���˲��֣��·�1����12������С��31�졣
//���ݣ�Java �쳣�����ַ����Ĵ���
//Iv.0
//2017��11��15��


import java.util.Scanner;
class TxfException extends Exception
{
	
	public void ErrorAnswer()
	{
		System.out.println("ʱ���ʽ���벻��ȷ��");
	}
}

public class Date 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	    System.out.println("�밴�����ŵ�������ʽ���������գ�yyyy/mm/dd����");
	    String str=in.next();
	    String x1=str.substring(5,7); //���ַ����б�ʾ�·ݵ��ַ���ȡ��x1
	    int x=Integer.parseInt(x1);  //����ȡ����ַ�ת��Ϊint��
	    String x2=str.substring(8);  //��ȡ�ַ����б�ʾ�յ��ַ�
	    int y=Integer.parseInt(x2);  //����ȡ����ַ�ת��Ϊint��
	    char [] a= new char[10];     //�����ַ�������
	   //try-catch��׽�쳣
	    try
	    {
	    	 if(x<0||x>12||y>31||(str.length()!=10)||(str.charAt(4)!='/')||(str.charAt(7)!='/'))
	 	    {
	 	    	throw new TxfException();
	 	    }
	    	 //ʵ��ʱ�������ʽת��
	    	 else
	    	 {
	    		 System.out.println("ת��Ϊ(yyyy-mm-dd)��ʱ���ʽΪ��");
	    		 for(int i=0;i<a.length;i++)
	    			{
	    			 if(i==4||i==7)
	    			  {
	    				 a[i]='-';
	    			  }
	    			 else
	    			  {
	    				 a[i]=str.charAt(i);//���ַ�����ֵ������
	    			  }
	    			  System.out.print(a[i]);//���ת�����ʱ��
	    			}
	    	 }
	    }  
	    catch(TxfException e)
	    {
	    	e.ErrorAnswer();//�쳣����
	    }
	   
	}

}
