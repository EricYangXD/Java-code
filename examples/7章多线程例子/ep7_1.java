public class ep7_1 
{  public  static void main(String args[])
   {  Lefthand left;
      Righthand right;  
      left=new Lefthand() ;  //�����߳�
      right=new Righthand();
      left.start();  
      right.start();
      for(int i=1;i<=3;i++)
      {  System.out.println("�������߳�");
      }  
   }
}
class Lefthand extends Thread
{  public void run()
   {  for(int i=1;i<=4;i++)
       {  
          System.out.println("���������߳�");
       }
   } 
}
class Righthand extends Thread
{  public void run()
   {  for(int i=1;i<=4;i++)
         {  System.out.println("���������߳�");
         }
   } 
}
