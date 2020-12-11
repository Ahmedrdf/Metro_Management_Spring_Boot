package ds.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employe implements Serializable {
	private static long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employe_id")
	private int id;
	private String name ;
	private String prenom ;
	private String profession ;
	private String addresse ;
	private String tel ;
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		Employe.serialVersionUID = serialVersionUID;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Employe(int id, String name, String prenom, String profession, String addresse, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.prenom = prenom;
		this.profession = profession;
		this.addresse = addresse;
		this.tel = tel;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	
	
}
