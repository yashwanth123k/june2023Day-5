 import java.util.Scanner;
class if_example{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
if(a==b);{
System.out.println("max=min="+a);
}
if(a>b){
System.out.println("max is :"+ a +"Main is :"+ b);
}else
{
System.out.println("max is :"+b+"Main is :"+a);
}
}
}
