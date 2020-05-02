package cricket.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class ScoreResponse {

	
	@JsonProperty("innings-requirement")
	public String inn;
	@JsonProperty("team-1")
	public String team1;
	@JsonProperty("team-2")
	public String team2;
	@JsonProperty("score")
	public int score;
	public String getInn() {
		return inn;
	}
	public void setInn(String inn) {
		this.inn = inn;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "ScoreResponse [inn=" + inn + ", team1=" + team1 + ", team2=" + team2 + ", score=" + score + "]";
	}
	
	
	
}
