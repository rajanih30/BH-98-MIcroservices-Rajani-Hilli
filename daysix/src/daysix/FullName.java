package daysix;

	
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;



	public class FullName
	{
	public static void main(String[] args)
	{
	List<String> mylist1 = Arrays.asList("Rajani ","Trilochan ","Shivdarshan ");
	List<String> mylist2 = Arrays.asList("Hilli", "Prasad", "RH");



	List<String> result = new ArrayList<>();



	result.add(mylist1.get(0)+mylist2.get(0));
	result.add(mylist1.get(1)+mylist2.get(1));
	result.add(mylist1.get(2)+mylist2.get(2));
	System.out.println(result);

	}

}
