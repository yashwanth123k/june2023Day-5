import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n;
String rs="";
System.out.println("Enter a String:");
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--){
rs=rs+n.charAt(i);
}
if(n.equals(rs))
{
System.out.println("Palindrome");}
else
{
System.out.println("Not Palindrome");}
}
}


