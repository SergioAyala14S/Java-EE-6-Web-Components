
package sl314.model;

public class Team {
    
    private String name;
    private int fundation;
    private String location;
    private String status;
    private League league;
    private Tournament tournament;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFundation() {
        return fundation;
    }

    public void setFundation(int fundation) {
        this.fundation = fundation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }
    
    
    
}
