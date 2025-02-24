package sortingHw;

import java.time.LocalDateTime;

public class Player {
	private String name;
	private String lastName;
	private int score;
	private LocalDateTime lastPlayedTime;
	
	public Player(String name, String lastName) {
		setName(name);
		setLastName(lastName);
		this.score = 0;
		this.lastPlayedTime = LocalDateTime.now();
	}
	
	
	//getters and setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name.substring(0,1).toUpperCase() + name.substring(1);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public LocalDateTime getLastPlayedTime() {
		return lastPlayedTime;
	}

	public void setLastPlayedTime(LocalDateTime lastPlayedTime) {
		this.lastPlayedTime = lastPlayedTime;
	}
	// GETTERS AND SETTERS FINISH ZONE
	
	 
	public String toString() {
		String card = "";
		String border = "-------------------------------";
		card +=  border + "\n";
		card += "|\t\tPlayer Card\n";
		card += getName() + " " + getLastName() +  "\n";
		card += "Last played at:" + getLastPlayedTime() + "\n";
		card += "Score: " + getScore() + "\n";
		card += border;
		return card;
	}
}
