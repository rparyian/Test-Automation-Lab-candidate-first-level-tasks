package Songs;
import Properties.Bpm;
import Properties.Language;
import Properties.SexOfSinger;

import java.util.Objects;
public class RapSong extends Song{
    private SexOfSinger sexOfSinger;
    private Bpm bpm;

    public RapSong(String name, String liricsAuthor, String musicAuthor, int duration, Language language, SexOfSinger sexOfSinger, Bpm bpm) {
        super(name, liricsAuthor, musicAuthor, duration, language);
        this.sexOfSinger = sexOfSinger;
        this.bpm = bpm;
    }

    public SexOfSinger getSexOfSinger() {
        return sexOfSinger;
    }

    public void setSexOfSinger(SexOfSinger sexOfSinger) {
        this.sexOfSinger = sexOfSinger;
    }

    public Bpm getBpm() {
        return bpm;
    }

    public void setBpm(Bpm bpm) {
        this.bpm = bpm;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", Sex of singer=" + sexOfSinger+", Bpm="+bpm+'}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RapSong rapSong = (RapSong) o;
        return sexOfSinger == rapSong.sexOfSinger &&
                bpm == rapSong.bpm;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sexOfSinger, bpm);
    }
}
