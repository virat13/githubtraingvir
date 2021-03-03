public class reverseString{
public static void main(String args[]){

java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter the string to reverse");
String st=sc.nextLine();
String revS="";
String sp[]=st.split(" ");
for(int i=sp.length()-1;i>=0;i--){
revS=revS+sp.charAt(i);
}
System.out.println(revS);

if(revS.equalsIgnoreCase("tariv hgnis"))
System.out.println("great");
else
System.out.println("chal oye");
}}