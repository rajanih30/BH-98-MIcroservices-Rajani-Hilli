package daysix;

	import java.util.Arrays;
	import java.util.List;
	public class FName
	{
	public static void main(String[] args)
	{
	List<String> mylist1 = Arrays.asList("Rajani ","Trilochan ","Shivdarshan ");
	List<String> mylist2 = Arrays.asList("Hilli","Prasad","RH");
	mylist1.stream().map(x -> x + mylist2.get(mylist1.indexOf(x))).forEach(x -> System.out.println(x));
	}
	}

