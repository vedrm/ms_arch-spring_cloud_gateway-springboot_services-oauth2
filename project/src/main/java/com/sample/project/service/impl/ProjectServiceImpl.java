package com.sample.project.service.impl;

import java.util.Calendar;

import org.springframework.stereotype.Component;

import com.sample.project.model.response.ProjectDTO;
import com.sample.project.model.response.ProjectsResponse;
import com.sample.project.service.ProjectService;

@Component
public class ProjectServiceImpl implements ProjectService {

	@Override
	public ProjectsResponse fetchProjects() throws Exception {
		
		ProjectsResponse response = new ProjectsResponse();
		createProjectsList( response );
		return response;
	}

	private void createProjectsList(ProjectsResponse response) {
		
		ProjectDTO proj1 = new ProjectDTO();
		proj1.setProjectId( "proj1" );
		proj1.setProjectName( "proj1Name" );

		Calendar calendar = Calendar.getInstance();
		calendar.set( 2019, 10, 20 );
		proj1.setStartDate( calendar.getTime() );
		
		calendar.set( 2020, 10, 19 );
		proj1.setEndDate( calendar.getTime() );
		
		proj1.setStatus( "Ongoing-OnTrack" );
		proj1.setAccountId( "account1" );
		proj1.setCreatedByUser( "user1" );

		ProjectDTO proj2 = new ProjectDTO();
		proj2.setProjectId( "proj2" );
		proj2.setProjectName( "proj2Name" );

		calendar.set( 2018, 1, 1 );
		proj2.setStartDate( calendar.getTime() );
		
		calendar.set( 2020, 12, 31 );
		proj2.setEndDate( calendar.getTime() );
		
		proj2.setStatus( "Ongoing-Delayed" );
		proj2.setAccountId( "account2" );
		proj1.setCreatedByUser( "user2" );
		
		response.getProjectsList().add( proj1 );
		response.getProjectsList().add( proj2 );
	}
	
}
