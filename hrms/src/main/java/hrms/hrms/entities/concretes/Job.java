package hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="jobs")
public class Job {
	
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id ;
	@Column(name = "job_name")
	private String jobName;
	
	public Job() {
		super();
	}

	public Job(int id, String jobName) {
		super();
		this.id = id;
		this.jobName = jobName;
	}
	

	
	

}
