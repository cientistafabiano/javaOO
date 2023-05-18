package entities;

import java.util.Date;
	
public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	//overload 
	public HourContract() {		
	}
	//constructor
	public HourContract(Date date, Double valeuPerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valeuPerHour;
		this.hours = hours;
	}
	// getters and setters
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValeuPerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePerHour * hours;
	}	
}