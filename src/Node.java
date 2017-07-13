public class Node {
   
	private String name;
	private String description;
	private String date;
	private int duration;
	private int priority;
	
	public Node() {
	}
	
	public Node(String name, String des, String date, int duration, int priority) {
		this.name = name;
		this.description = des;
		this.date = date;
		this.duration = duration;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
}
