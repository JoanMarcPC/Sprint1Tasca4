package tasca4n1ex1;

import java.util.ArrayList;


public class Junit  {
	private ArrayList<String> months = new ArrayList<String>();
	
	
	public void addMonths (){
	this.months.add("Gener");
	this.months.add("Febrer");
	this.months.add("Març");
	this.months.add("Abril");
	this.months.add("Maig");
	this.months.add("Juny");
	this.months.add("Juliol");
	this.months.add("Agost");
	this.months.add("Setembre");
	this.months.add("Octubre");
	this.months.add("Novembre");
	this.months.add("Desembre");
	
	}


	public ArrayList<String> getMonths() {
		return months;
	}


	public void setMonths(ArrayList<String> months) {
		this.months = months;
	}
	
	
}
