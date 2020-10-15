package com.sample.project.service;

import org.springframework.stereotype.Service;

import com.sample.project.model.response.ProjectsResponse;

@Service
public interface ProjectService {

	public ProjectsResponse fetchProjects() throws Exception;
}
