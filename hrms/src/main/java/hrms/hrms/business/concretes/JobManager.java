package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.JobService;
import hrms.hrms.dataAccess.abstracts.JobDao;
import hrms.hrms.entities.concretes.Job;
@Service

public class JobManager implements JobService {
	
	
	private JobDao jobDao;
	
	
	
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}



	@Override
	public List<Job> getAll() {
		// TODO Auto-generated method stub
		return jobDao.findAll();
	}

}
