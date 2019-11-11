import Properties.Bpm;
import Properties.Language;
import Properties.RockType;
import Properties.SexOfSinger;
import Songs.PopSong;
import Songs.RapSong;
import Songs.RockSong;
import Songs.Song;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    static List<Song> songs = new ArrayList<>();
    public static void main(String[] args) {
        List<String> lines = inicializeData();
        Selection selection = createSelection(lines);
        int durationOfSelection= selection.getDurationOfSelection();
        Selection resultSelection = sortSelection(selection);
        List<Song> songByDurationList=new ArrayList<>();
       songByDurationList= findSongByDuration(songByDurationList,selection,200,300);
    }
    public static List<String> inicializeData() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(
                    "C:\\Users\\User\\tasksForDeploy\\first-level-tasks\\data\\java-collections-task-data.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<>();
        try {
            String line = bufferedReader.readLine();

            while (line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
    public static Selection createSelection(List<String> lines) {
        String[] splittedLine;
        List<SexOfSinger> listOfSexOfSinger = Arrays.asList(SexOfSinger.values());
        List<RockType> listOfRockType = Arrays.asList(RockType.values());
        for (String line :
                lines) {
            splittedLine = line.split(" ");
            if (splittedLine.length == 8) {
                songs.add(new RapSong(splittedLine[1], splittedLine[2], splittedLine[3], Integer.parseInt(splittedLine[4]),
                        Language.valueOf(splittedLine[5]), SexOfSinger.valueOf(splittedLine[6]), Bpm.valueOf(splittedLine[7])));
            }
            else {
                if (isPopSong(splittedLine[6])){
                    songs.add(new PopSong(splittedLine[1], splittedLine[2], splittedLine[3], Integer.parseInt(splittedLine[4]),
                            Language.valueOf(splittedLine[5]), SexOfSinger.valueOf(splittedLine[6])));
                }
                if (isRockSong(splittedLine[6])){
                    songs.add(new RockSong(splittedLine[1], splittedLine[2], splittedLine[3], Integer.parseInt(splittedLine[4]),
                            Language.valueOf(splittedLine[5]), RockType.valueOf(splittedLine[6])));
                }
            }
        }
        return new Selection(songs);
    }
    public static boolean isRockSong(String parameter){
        for (RockType rockType:
                RockType.values()) {
            if (rockType.name().equals(parameter))
                return true;
        }
        return false;
    }
    public static boolean isPopSong(String parameter){
        for (SexOfSinger sexOfSinger:
                SexOfSinger.values()) {
            if (sexOfSinger.name().equals(parameter))
                return true;
        }
        return false;
    }
    public static Selection sortSelection(Selection selection){
        Selection resultSelection;
        List<? extends Song> list = selection.getSongs();
        List<Song> resultList = new ArrayList<>();
        for (Song song:
                list) {
            if (song instanceof PopSong)
                resultList.add(song);
        }
        for (Song song:
                list) {
            if (song instanceof RapSong)
                resultList.add(song);
        }
        for (Song song:
                list) {
            if (song instanceof RockSong)
                resultList.add(song);
        }
        return new Selection(resultList);
    }
    public static List<Song> findSongByDuration(List<Song> songByDurationList, Selection selection, int min, int max){
        for (Song song:
             selection.getSongs()) {
            if ((song.getDuration()>=min)&&(song.getDuration()<=max))
                songByDurationList.add(song);
        }
        return songByDurationList;
    }
}