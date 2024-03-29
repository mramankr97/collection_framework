package Day2Practise;

import java.util.Comparator;
import java.util.Objects;

public class studentTree11 {

	private int roll;
	private String name ;
	private int marks;
	
	
	
	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
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



	public studentTree11(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}






	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(roll);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		studentTree other = (studentTree) obj;
		return roll == other.getRoll();
	}




}

class Chill implements Comparator<studentTree>{

	@Override
	public int compare(studentTree o1, studentTree o2) {
		// TODO Auto-generated method stub
		return o1.getMarks()<o2.getMarks()?+1:-1;
	}
	
}
