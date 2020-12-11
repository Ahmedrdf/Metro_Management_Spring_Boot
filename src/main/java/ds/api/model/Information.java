package ds.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Information  implements Serializable {

	/**
	 * 
	 */
	private static long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "information_id")
	private int id;
	private String  statActuel;
	private int dstRest ;
	private int statRest ; 
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		Information.serialVersionUID = serialVersionUID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatActuel() {
		return statActuel;
	}
	public void setStatActuel(String statActuel) {
		this.statActuel = statActuel;
	}
	public int getDstRest() {
		return dstRest;
	}
	public void setDstRest(int dstRest) {
		this.dstRest = dstRest;
	}
	public int getStatRest() {
		return statRest;
	}
	public void setStatRest(int statRest) {
		this.statRest = statRest;
	}
	public Information(int id, String statActuel, int dstRest, int statRest) {
		super();
		this.id = id;
		this.statActuel = statActuel;
		this.dstRest = dstRest;
		this.statRest = statRest;
	}
	public Information() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}

