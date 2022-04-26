package daytwo;
		
class Prime {
			private int no;
			private int count = 0;



			public Prime(int no, int count) {
			this.no = no;
			this.count = count;
			}



			void prime1() {



			for (int i = 1; i <= no; i++) {
			if (no % i == 0)
			count++;



			}
			if (count == 2)
			System.out.println("number is prime");
			else
			System.out.println("number is not prime");
			}

            public static void main(String[] args)
			{
			Prime p1=new Prime(9,0);
			p1.prime1();
			}
}