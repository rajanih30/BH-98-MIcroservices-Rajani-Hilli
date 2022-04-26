package daytwo;

class Squares {
private int n=20;

public Squares(int n) {
this.n=n;
}
void square() {
for(int i=1;i<=n;i++)
System.out.println(i*i);
}
public static void main(String[] args) {
Squares s = new Squares(20);
s.square();

}



}

	