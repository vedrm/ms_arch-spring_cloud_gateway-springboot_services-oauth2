package com.sample.portal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavController 
{
//	@Autowired
//	WebClient webClient;
	
//	@Autowired
//	RestTemplate restTemplate;

	@GetMapping("/")
	public String showHome()
	{
		return "index";
	}
	
	@GetMapping("/p/{pid}/tcs")
	public String showTestCases(@PathVariable("pid") int pid)
	{
		return "test-cases";
	}
	
	@GetMapping("/p/{pid}/tcycles")
	public String showTestCycles(@PathVariable("pid") int pid)
	{
		return "test-cycles";
	}	
	
	@GetMapping("/p/{pid}/defects")
	public String showDefects(@PathVariable("pid") int pid)
	{
		return "defects";
	}		
	
	@GetMapping("/p/{pid}/tcs/add-new-testcase")
	public String showAddNewTestCaseForm(@PathVariable("pid") int pid)
	{
		return "add-new-testcase-view";
	}	
	
	@GetMapping("/p/{pid}/tcs/{tcid}/edit")
	public String editExistingTestCase(@PathVariable("pid") int pid,@PathVariable("tcid") int tcid)
	{
		return "add-new-testcase-view";
	}
	
	// Metrics related Navigations
	
	@GetMapping("/p/{pid}/te/test-results")
	public String showTestResults(@PathVariable("pid") int pid)
	{
		return "metrics-test-results";
	}	
	
	@GetMapping("/p/{pid}/te/test-results/{trid}")
	public String showSingleTestResults(@PathVariable("pid") int pid,@PathVariable("trid") int trid)
	{
		return "metrics-single-test-results";
	}		
	@GetMapping("/p/{pid}/te/test-results/{trid}/details")
	public String showSingleTestResultsDetails(@PathVariable("pid") int pid,@PathVariable("trid") int trid)
	{
		return "metrics-single-test-results-details";
	}		
	@GetMapping("/p/{pid}/te/test-results/{trid}/test/{tcid}")
	public String showSingleTestResultOnline(@PathVariable("pid") int pid,@PathVariable("trid") int trid,@PathVariable("tcid") int tcid)
	{
		return "metrics-single-test-results";
	}
	
//	@GetMapping( "/api/ast/projects" )
//	public String callProjectSvcViaGateway(Model model,
//			@RegisteredOAuth2AuthorizedClient( "client-actplt-project" ) OAuth2AuthorizedClient authorizedClient,
//			@AuthenticationPrincipal OAuth2User oauth2User,
//			OAuth2AuthenticationToken oauth2Authentication) {
//		
//		model.addAttribute("userName", oauth2User.getName());
//		model.addAttribute("clientName", authorizedClient.getClientRegistration().getClientName());
//		
//		
//		ProjectsResponse pr = this.webClient
//				.get()
//				.uri( UriComponentsBuilder.fromUriString( "http://localhost:8080/api/ast/projects" ).build().toUri() )
//				.attributes( ServletOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient( authorizedClient ) )
//				.retrieve()
//				.bodyToMono(ProjectsResponse.class)
//				.block();
//		
//		
//		/*
//		Mono<ProjectsResponse> result = this.webClient
//				.get()
//				.uri( "http://localhost:8080/api/ast/projects" )//.accept(MediaType.APPLICATION_JSON)
//				.retrieve()
//				.bodyToMono(ProjectsResponse.class);
//		*/
//		
//		ProjectsResponse x = restTemplate.getForObject( "http://localhost:8080/api/ast/projects", ProjectsResponse.class );
//		
//		return "projectSvcCallViaGateway";
//	}
}
