import Songs.PopSong;
import Songs.RapSong;
import Songs.RockSong;
import Songs.Song;

import java.util.*;
public class Selection {
    private List<? extends Song> songs;
    public List<RockSong> getRockSongsList (){
        List <RockSong> rockSongsList = new ArrayList<>();
        for (Song song:
             songs) {
            if (song instanceof RockSong) {
                rockSongsList.add((RockSong)song);
            }
        }
        return rockSongsList;
    }
    public List<PopSong> getPopSongsList(){
        List<PopSong> popSongsList = new ArrayList<>();
        for (Song song:
             songs) {
            if (song instanceof PopSong){
                popSongsList.add((PopSong)song);
            }
        }
        return popSongsList;
    }
    public int getDurationOfSelection()
    {
        int summ=0;
        for (Song song:
             this.getSongs()) {
            summ+=song.getDuration();
        }
        return summ;
    }
    public List<RapSong> getRapSongsList(){
        List<RapSong> rapSongsList = new ArrayList<>();
        for (Song song:
             songs) {
            if (song instanceof RapSong){
                rapSongsList.add((RapSong)song);
            }
        }
        return rapSongsList;
    }
    public Selection(List<? extends Song> songs){this.songs=songs;}
    @Override
    public String toString() {
        return "Selection{" +
                "Songs=" + songs.toString() +
                '}';
    }

    public List<? extends Song> getSongs() {
        return songs;
    }
}
