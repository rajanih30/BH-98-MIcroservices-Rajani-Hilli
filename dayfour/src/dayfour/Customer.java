package dayfour;

import java.util.Objects;

class Customer {
  private String name;
  private int cno;
  
  public Customer(String name,int cno){
	this.name=name;
	this.cno=cno;
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getCno() {
	return cno;
}

public void setCno(int cno) {
	this.cno = cno;
}

@Override
public String toString() {
	return "Customer [name=" + name + ", cno=" + cno + "]";
}

@Override
public int hashCode() {
	return Objects.hash(cno, name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	return cno == other.cno && Objects.equals(name, other.name);
}
}
