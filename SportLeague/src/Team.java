import java.util.ArrayList;

public class Team <T extends Player> implements Comparable{
	private String teamName;
    private int numPlayed;
    private int numWon;
    private int numTied;
    private int numLost;
	private ArrayList<T> players; 

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player) {
        if (!players.contains(player)) {
            players.add(player);
            System.out.println(player.getName() + " was added to the team.");
            return true;
        }
        return false;
    }
	public int numPlayers() {
		return players.size();
	}
	
	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            numWon++;
            opponent.numLost++;
        } else if (ourScore == theirScore) {
            numTied++;
            opponent.numTied++;
        } else {
            numLost++;
            opponent.numWon++;
        }
        numPlayed++;
        opponent.numPlayed++;
    }
	
	public int ranking(){
		return numWon*2 + numTied; 
	}
	
	
	public int compareTo(Object otherTeam) {
		
		if( (numWon*2 + numTied)  > ((Team)otherTeam).ranking()  ) {
			return 1; 
		}
		else if( (numWon*2 + numTied)  == ((Team)otherTeam).ranking()  ) {
			return 0; 
		}
		else { 
			return -1; 
		}
			
	}
	

	
	
	
	
	

}
