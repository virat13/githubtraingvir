public class Person{
int count=0;
public void increment()
{
count++;
System.out.println(count);
}
public static void main(String args[])
{
Person obj1=new Person();
Person obj2=new Person();
obj1.increment();
obj2.increment();

}
}
