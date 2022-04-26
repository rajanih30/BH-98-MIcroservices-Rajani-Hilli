package daytwo;
class OddEVen {
private int number;
public OddEVen(int number) {

this.number = number;
}
public int getNumber() {
return number;
}
public void setNumber(int number) {
this.number = number;
}
static void check(int number) {
if (number % 2 == 0)
System.out.println(number + " is even");
else
System.out.println(number + " is odd");
}
public static void main(String[] args) {
int number = new java.util.Scanner(System.in).nextInt();
OddEVen ev = new OddEVen(number);
check(ev.getNumber());

}
}
