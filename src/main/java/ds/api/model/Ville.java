package ds.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ville implements Serializable {
	private static long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ville_id")
	private int id ;
	private String name ;
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		Ville.serialVersionUID = serialVersionUID;
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
	public Ville(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
