package d10x.task.applier.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Applier {
	
	private Integer taskId;
	private String soeidAppkier;
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getSoeidAppkier() {
		return soeidAppkier;
	}
	public void setSoeidAppkier(String soeidAppkier) {
		this.soeidAppkier = soeidAppkier;
	}
	
	
	}
