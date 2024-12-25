import java.util.*;

public class Album{
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String n, String a){
        name = n;
        artist = a;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String t, double d){
        songs.add(new Song(t,d));
        return true;
    }

    public Song findSong(String t){
        for (Song s:songs){
            if(s.getTitle().equals(t)){
                return s;
            }
        }
        return null;
    }

    public boolean addToPlayList(int i, LinkedList<Song> list){
        if(i<0 || i>=songs.size())
            return false;
        list.add(songs.get(i));
        return true;
    }

    public boolean addToPlayList(String n, LinkedList<Song> list){
        Song s = findSong(n);
        if(s==null)
            return false;
        list.add(s);
        return true;
    }

    public void sortSongs(){
        Collections.sort(songs);
    }

   
}