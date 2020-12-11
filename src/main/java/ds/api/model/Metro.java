package ds.api.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Metro implements Serializable {

	/**
	 * 
	 */
	private static long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "metro_id")
	private int id;
	private String name ;
	private String heuredept ;
	private String datedepart ;
	private String heurearrive ;
	private String  datearrive ;
	private String  etat ;
	private String  capacite ;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeuredept() {
		return heuredept;
	}
	public void setHeuredept(String heuredept) {
		this.heuredept = heuredept;
	}
	public String getDatedepart() {
		return datedepart;
	}
	public void setDatedepart(String datedepart) {
		this.datedepart = datedepart;
	}
	public String getHeurearrive() {
		return heurearrive;
	}
	public void setHeurearrive(String heurearrive) {
		this.heurearrive = heurearrive;
	}
	public String getDatearrive() {
		return datearrive;
	}
	public void setDatearrive(String datearrive) {
		this.datearrive = datearrive;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getCapacite() {
		return capacite;
	}
	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}
	public Metro(int id, String name, String heuredept, String datedepart, String heurearrive, String datearrive,
			String etat, String capacite) {
		super();
		this.id = id;
		this.name = name;
		this.heuredept = heuredept;
		this.datedepart = datedepart;
		this.heurearrive = heurearrive;
		this.datearrive = datearrive;
		this.etat = etat;
		this.capacite = capacite;
	}
	public Metro() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
  
  
   

	
	
}



