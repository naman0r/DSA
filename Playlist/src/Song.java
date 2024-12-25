public class Song implements Comparable<Song>{
    private String title;
    private double duration;

    public Song(String t, double d){
        title = t;
        duration  = d;
    }

    public String getTitle(){return title;}
    public double getDuration(){return duration;}
    public void setTitle(String s){title = s;}
    public void setDuration(double d){duration = d;}

    public int compareTo(Song s){
        if(duration>s.getDuration()){
            return 1;
        } else if(duration<s.getDuration()){
            return -1;
        } else {
            return 0;
        }
    }

    public String toString(){
        return title +" : "+duration;
    }
}