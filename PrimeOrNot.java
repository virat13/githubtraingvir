class PrimeOrNot{
public static void main(String args[]){
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter the no.");
int n=sc.nextInt();
int c=0;
for(int i=2;i<=n;i++){

if(n%i==0){
c+=1;
}
}
if(c<=2)
System.out.println(n+" is a prime no.");
else
System.out.println(n+" is not a prime no.");
}}