package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	//face man or human
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//the associate
	public Department department; 
	List <HourContract> contracts = new ArrayList<>();//method constructor
	//overload
	public Worker() {		
	}
	//constructor
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<HourContract> getContracts() {
		return contracts;
	}
	/*							recebe uma nova lista
	 * public void setContracts(List<HourContract> contracts) {
		this.contracts = contracts;
	}	essa lista é modificada com o add e remove
	*/
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	//aqui é uma lógica que abre a mente
	//precisa pegar o ano&&mes digitado pelo usuario e comparar com as datas da lista, sendo vdd, somar e mostrar ganho
	public double income(int month, int year) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();		
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			// 1 plus because calendar start zero
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (c_year == year && c_month == month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}