package cricket.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Response {

	public boolean cache;
	public List<Matches> matches;
	public boolean isCache() {
		return cache;
	}
	public void setCache(boolean cache) {
		this.cache = cache;
	}
	public List<Matches> getMatches() {
		return matches;
	}
	public void setMatches(List<Matches> matches) {
		this.matches = matches;
	}
	@Override
	public String toString() {
		return "Response [cache=" + cache + ", matches=" + matches + ", isCache()=" + isCache() + ", getMatches()="
				+ getMatches() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
