class PrimeNo{
public static void main(String args[]){
int sum=0;
String pn="";
for(int i=2;i<10;i++){
int c=0;
for(int j=i;j>=1;j--){
if(i%j==0){
c=c+1;

}
}
if(c==2){
pn=pn+" "+i;
sum=sum+i;
}}
System.out.println(pn);
System.out.println(sum);
}}
