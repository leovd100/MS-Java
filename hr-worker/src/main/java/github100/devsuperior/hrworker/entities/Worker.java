package github100.devsuperior.hrworker.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_worker")
public class Worker implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double daily_Income;
	
	public Worker() {
		
	}
	
	public Worker(Long id, String name, Double daily_Income) {
		super();
		this.id = id;
		this.name = name;
		this.daily_Income = daily_Income;
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
	public Double getDay1() {
		return daily_Income;
	}
	public void setDay1(Double daily_Income) {
		this.daily_Income = daily_Income;
	}
	@Override
	public int hashCode() {
		return Objects.hash(daily_Income, id);
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
		return Objects.equals(daily_Income, other.daily_Income) && Objects.equals(id, other.id);
	}
	
	
}
