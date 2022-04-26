package dayfour;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Ccard {

	public static void main(String[] args) {
    Map<CreditCard,Customer> mymap=new LinkedHashMap<CreditCard,Customer>();
    mymap.put(new CreditCard("AB",2016,123),new Customer("ram",2343));
    mymap.put(new CreditCard("AC",2000,125),new Customer("raj",2344));
    mymap.put(new CreditCard("AD",2018,124),new Customer("ramya",2353));
    
    System.out.println(mymap);
    
    Map<CreditCard,Customer> resmap=mapSort(mymap);
    System.out.println(resmap);
    
	}
	static Map<CreditCard,Customer> mapSort(Map<CreditCard,Customer> map){
		 List<CreditCard> list=new LinkedList<>();
		 list.addAll(map.keySet());
		 Collections.sort(list);
		 Map<CreditCard,Customer> result=new LinkedHashMap<CreditCard,Customer>();
		 for(CreditCard cc:list)
			 result.put(cc, map.get(cc));
		     return result;
}
}
