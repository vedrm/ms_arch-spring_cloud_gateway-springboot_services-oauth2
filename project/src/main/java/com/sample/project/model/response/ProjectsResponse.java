package com.sample.project.model.response;

import java.util.ArrayList;
import java.util.List;

public class ProjectsResponse {
	
	List<ProjectDTO> projectsList;

	public ProjectsResponse() {
		projectsList = new ArrayList<>();
	}

	public List<ProjectDTO> getProjectsList() {
		return projectsList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProjectsResponse [projectsList=");
		builder.append(projectsList);
		builder.append("]");
		return builder.toString();
	}
}
