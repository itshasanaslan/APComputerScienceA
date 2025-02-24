package sortingHw;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import unit7.SimpleFileReader;

public class Player {
    public static ArrayList<Player> players = new ArrayList<Player>();

	private String name;
	private String lastName;
	private int score;
	private LocalDateTime lastPlayedTime;
	
	public Player(String name, String lastName) {
		setName(name);
		setLastName(lastName);
		this.score = 0;
		this.lastPlayedTime = LocalDateTime.now();
		
		Player.players.add(0, this);
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
	
    private String getLastPlayedTimeAsString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        String formattedDateTime = this.lastPlayedTime.format(formatter);
        return formattedDateTime;
    }

	
	
	// GETTERS AND SETTERS FINISH ZONE
	
	
	public String toString() {
        String card = "";
        String lines = "-----------------------------------------";
        String blanks = "\t\t";
        //top frame
        card += lines;

        //body
        card += "\n|" + blanks + "Player Card" +blanks + "|\n"; // print it and shift to the next line using \n
        card +="|" + blanks + getName() + " " + getLastName() + blanks + "|\n"; 
        card += "|"  + "\tLast Played at: " + getLastPlayedTimeAsString()  + "|\n";
        card += "|" + blanks + "Score: " + getScore() + blanks + "|\n";

        // bottom frame
        card += lines;
        return card;
	}
	
	  public static void loadRandomPlayers() {
	        ArrayList<String> names = SimpleFileReader.getMockData("", false);
	        int arrLength = names.size();
	        int counter = 0;
	        while (counter < 100) {
	            String name = names.get((int) (Math.random() * arrLength));
	            String lastName = names.get((int) (Math.random() * arrLength));
	            int score = (int) (Math.random() * 100000);

	            // generate random Date
	              LocalDateTime today = LocalDateTime.now().toLocalDate().atStartOfDay(); // Midnight today

	        // Generate a random hour between 0 and 23
	            int randomHour = ThreadLocalRandom.current().nextInt(0, 24); // 0 to 23
	            int randomMinute = ThreadLocalRandom.current().nextInt(0, 60); // 0 to 59

	            // Create the random LocalDateTime for today
	            LocalDateTime randomDateTime = today.plusHours(randomHour).plusMinutes(randomMinute);
	            // finish generating date
	            Player temp = new Player(name,lastName);
	            temp.setScore(score);
	            temp.setLastPlayedTime(randomDateTime);
	            Player.players.add(temp);
	            counter++;
	        }
	       
	    }


	    public static void sortByScoreHighestToLowest() { 
	        for (int i = 1; i < players.size(); i++) {
	            Player key = players.get(i); // The player to be inserted
	            int j = i - 1;

	            // Move players with lower scores one position ahead
	            while (j >= 0 && players.get(j).score < key.score) { 
	                players.set(j + 1, players.get(j));
	                j--;
	            }
	            players.set(j + 1, key); // Insert key into its correct position
	        }
	    }
	
}
