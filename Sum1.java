import java.util.Scanner;
class Sum1{
public static void main(String args[]) 
{
    Scanner sc=new Scanner(System.in);
    int c=sc.nextInt();
int b=0;
for(int a=1;a<=c;a++)
{
    b=b+a;
}
System.out.println(b);
}
}