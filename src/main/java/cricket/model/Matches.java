package cricket.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Matches {

		
	public long unique_id;
	public String date;
	
	@JsonProperty("team-2")
	public String team2;
	
	@JsonProperty("team-1")
	public String team1;
	public boolean matchStarted;
	public boolean squad;
	public long getUnique_id() {
		return unique_id;
	}
	public void setUnique_id(long unique_id) {
		this.unique_id = unique_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public boolean isMatchStarted() {
		return matchStarted;
	}
	public void setMatchStarted(boolean matchStarted) {
		this.matchStarted = matchStarted;
	}
	public boolean isSquad() {
		return squad;
	}
	public void setSquad(boolean squad) {
		this.squad = squad;
	}
	@Override
	public String toString() {
		return "Matches [unique_id=" + unique_id + ", date=" + date + ", team2=" + team2 + ", team1=" + team1
				+ ", matchStarted=" + matchStarted + ", squad=" + squad + "]";
	}
	
	
	
	
}
