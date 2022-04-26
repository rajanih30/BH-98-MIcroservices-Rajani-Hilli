package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Output {

	public static void main(String[] args) {
		
		Dept dpt1=new Dept("CSE",111);
		Dept dpt2=new Dept("EEE",222);
		Dept dpt3=new Dept("ME",333);



		Student s1 = new Student("Rajani",111,92,dpt1);
		Student s2 = new Student("ramya",222,96,dpt3);
		Student s3 = new Student("Suraj",333,86,dpt2);
		Student s4 = new Student("Perry",222,79,dpt1);


		List<Student> students = Arrays.asList(s1,s2,s3,s4);
		Map<Dept,List<Student>> studentsDepartment= students.stream().collect(Collectors.groupingBy(Student::getDept_id));

		System.out.println(studentsDepartment);

	}

}
