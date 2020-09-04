import java.util.ArrayList;
import java.util.Arrays;

class Empdata{
	
	private String name;
	private int[] numbers;
	private ArrayList elist;
	
	Empdata(){
		this.name = "아무개";
		this.numbers = new int[10];
		elist = new ArrayList();
		
	}
	
	@Override
	public String toString() {
		return "Empdata [name=" + name + ", numbers=" + Arrays.toString(numbers) + ", elist=" + elist + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public ArrayList getElist() {
		return elist;
	}

	public void setElist(ArrayList elist) {
		this.elist = elist;
	}
	
}





public class Ex04_Empdata {
	public static void main(String[] args) {
		
		Empdata empdata = new Empdata();
		
		System.out.println(empdata.toString());
		System.out.println(empdata.getElist().toString());
		
		ArrayList li = new ArrayList();
		li.add(100);
		li.add(200);
		
		empdata.setElist(li);
		
		System.out.println(empdata.getElist().toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
