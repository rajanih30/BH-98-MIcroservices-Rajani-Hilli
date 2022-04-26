package daythree;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



class Student1 implements Comparable<Student1>{
private int rollNo;
private String name;
private int marks;
Student1(int rollNo , String name , int marks){
this.rollNo = rollNo;
this.name = name;
this.marks = marks;
}
public int getRollNo() {
return rollNo;
}
public void setRollNo(int rollNo) {
this.rollNo = rollNo;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getMarks() {
return marks;
}
public void setMarks(int marks) {
this.marks = marks;
}

public String toString() {
return "[ RollNo: "+this.getRollNo()+" , "+"Name: "+this.getName()+" , "+"Marks: "+this.getMarks()+" ]";
}

@Override public int compareTo(Student1 cst)
{
int compareRollNo = cst.getRollNo();
return this.getRollNo() - compareRollNo;
}

}
public class Sort {



public static void main(String[] args){
Student1 st1 = new Student1(103, "Rajani" , 98);
Student1 st2 = new Student1(102, "Ashwini" , 97);
Student1 st3 = new Student1(104, "Trilochan" , 99);
Student1 st4 = new Student1(101, "Abhishek" , 100);

List<Student1> std = new ArrayList<Student1>();

std.add(st1);
std.add(st2);
std.add(st3);
std.add(st4);

Iterator itr = std.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
}

System.out.println("\n\n");
Collections.sort(std);

for(Student1 x : std) {
System.out.println(x);
}

}

}