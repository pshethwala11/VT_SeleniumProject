package pages;

public class Repository {

	private String name;
	private String description;
	
	public Repository(){
	}
	public Repository(String name, String description){
			
			this.name = name;
			this.description = description;
			}
	
			public String getName()
			{
			return name;
			}
			
			public String getDescription()
			{
			return description;
			}
			
			
}
