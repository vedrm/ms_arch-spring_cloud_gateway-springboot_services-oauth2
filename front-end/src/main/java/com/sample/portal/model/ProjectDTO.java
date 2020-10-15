package com.sample.portal.model;

import java.util.Date;

public class ProjectDTO {

	private String projectId;
	private String projectName;
	private String accountId;
	private Date startDate;
	private Date endDate;
	private String createdByUser;
	private String status;
	
	public ProjectDTO() {
	}

	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getCreatedByUser() {
		return createdByUser;
	}
	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProjectDTO [projectId=");
		builder.append(projectId);
		builder.append(", projectName=");
		builder.append(projectName);
		builder.append(", accountId=");
		builder.append(accountId);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", endDate=");
		builder.append(endDate);
		builder.append(", createdByUser=");
		builder.append(createdByUser);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
}
