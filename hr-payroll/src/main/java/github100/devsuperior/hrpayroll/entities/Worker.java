package github100.devsuperior.hrpayroll.entities;

import java.io.Serializable;
import java.util.Objects;



public class Worker implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double dailyIncome;
	
	public Worker() {
		
	}
	
	public Worker(Long id, String name, Double daily_Income) {
		super();
		this.id = id;
		this.name = name;
		this.dailyIncome = daily_Income;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getDailyIncome() {
		return dailyIncome;
	}
	public void setDay1(Double daily_Income) {
		this.dailyIncome = daily_Income;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dailyIncome, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return Objects.equals(dailyIncome, other.dailyIncome) && Objects.equals(id, other.id);
	}
	
	
}
