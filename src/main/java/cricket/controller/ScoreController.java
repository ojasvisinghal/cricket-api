package cricket.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cricket.model.Key;
import cricket.model.Matches;
import cricket.model.Response;
import cricket.model.ScoreResponse;

@RestController
@RequestMapping("/api")
@Configuration
@PropertySource("classpath:score.properties")
public class ScoreController {
	


	
	@Autowired
	private Environment env;
	
	@GetMapping("/cricketScore/{match-id}")
	public String Hellow(@PathVariable("match-id") long matchID ) {
		
		RestTemplate restTemplate = new RestTemplate();
		Response response = restTemplate.postForObject("https://cricapi.com/api/matches/",new Key("WmPJrX2s3KMyZVPFwlm1vxXLXKw1",0),Response.class);
		
		
		
		System.out.println(response);
	
		
		List<Matches> matches = response.getMatches();
		String team1Name = null ;
		String team2Name = null ;
		int  score = 0;
		
		for(int i=0; i< matches.size();i++) {
			
			if(matches.get(i).getUnique_id() == matchID) {
				ScoreResponse response1 = restTemplate.postForObject("https://cricapi.com/api/cricketScore/",new Key("WmPJrX2s3KMyZVPFwlm1vxXLXKw1",matchID),ScoreResponse.class);
				System.out.println(response1);
				team1Name = matches.get(i).getTeam1();
				team2Name = matches.get(i).getTeam2();
				score = response1.getScore();
				break;
			}
		}

			return "<H1>Team-1 : " + team1Name + " </H1> " + "<H1> Team-2  : "+ team2Name  + " </H1> " + "<H1> Score  : "+ score  + " </H1> "  ;


	}

}
