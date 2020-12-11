package ds.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Arret implements Serializable {
	private static long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "arret_id")
	private int id ;
	private String heurearrive;
	private String heuredept;
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		Arret.serialVersionUID = serialVersionUID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeurearrive() {
		return heurearrive;
	}
	public void setHeurearrive(String heurearrive) {
		this.heurearrive = heurearrive;
	}
	public String getHeuredept() {
		return heuredept;
	}
	public void setHeuredept(String heuredept) {
		this.heuredept = heuredept;
	}
	public Arret(int id, String heurearrive, String heuredept) {
		super();
		this.id = id;
		this.heurearrive = heurearrive;
		this.heuredept = heuredept;
	}
	public Arret() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
