package sl314.model;

public class League {

    private int year;
    private String season;

    public League() {
    }

    public League(int year, String name) {
        this.year=year;
        this.name=name;
    }

  
    
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
    

   


}
