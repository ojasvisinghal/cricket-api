package cricket.model;

public class Key {

	public String apikey;
	public long unique_id ;
	
	public Key(String k,long id){
		this.apikey = k;
		this.unique_id = id;
	}
	
	

	public String getApikey() {
		return apikey;
	}



	public void setApikey(String apikey) {
		this.apikey = apikey;
	}



	public long getUnique_id() {
		return unique_id;
	}



	public void setUnique_id(long unique_id) {
		this.unique_id = unique_id;
	}

}
