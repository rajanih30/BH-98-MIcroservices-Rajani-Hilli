package daytwo;

	class Pattern {
		private int n=5;

		public Pattern(int n) {
		this.n=n;
		}
		void patt() {
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n;j++)
		{
		if(i+j<=6)
		System.out.print("*");

		}
		System.out.println();
		}
		}
		public static void main(String[] args) {
		Pattern p=new Pattern(5);
		p.patt();

		}



		}

