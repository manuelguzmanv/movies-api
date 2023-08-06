package movies.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "award")
public class Award {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer awardId;
	
	@Column(name = "award_name")
	private String awardName;
	
	public Integer getAwardId() {
		return awardId;
	}
	public void setAwardId(Integer awardId) {
		this.awardId = awardId;
	}
	public String getAwardName() {
		return awardName;
	}
	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}	

}
