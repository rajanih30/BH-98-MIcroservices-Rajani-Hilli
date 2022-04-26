package dayfour;

import java.util.Objects;

class CreditCard implements Comparable<CreditCard> {
	private String cname;
	private int expiredate;
	private int csc;
	
	public CreditCard(String cname,int expiredate,int csc) {
		this.cname=cname;
		this.expiredate=expiredate;
		this.csc=csc;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getExpiredate() {
		return expiredate;
	}

	public void setExpiredate(int expiredate) {
		this.expiredate = expiredate;
	}

	public int getCsc() {
		return csc;
	}

	public void setCsc(int csc) {
		this.csc = csc;
	}

	@Override
	public String toString() {
		return "CreditCard [cname=" + cname + ", expiredate=" + expiredate + ", csc=" + csc + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cname, csc, expiredate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		return Objects.equals(cname, other.cname) && csc == other.csc && expiredate == other.expiredate;
	}
	@Override
	public int compareTo(CreditCard c) {
		int compare=c.getExpiredate();
		return this.getExpiredate() - compare;
	}

}
