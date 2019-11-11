package Songs;
import Properties.Language;
import Properties.SexOfSinger;

import java.util.Objects;
public class PopSong extends Song{
    private SexOfSinger sexOfSinger;

    public PopSong(String name, String liricsAuthor, String musicAuthor, int duration, Language language, SexOfSinger sexOfSinger) {
        super(name, liricsAuthor, musicAuthor, duration, language);
        this.sexOfSinger = sexOfSinger;
    }

    public SexOfSinger getSexOfSinger() {
        return sexOfSinger;
    }

    public void setSexOfSinger(SexOfSinger sexOfSinger) {
        this.sexOfSinger = sexOfSinger;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", Sex of singer=" + sexOfSinger+'}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PopSong popSong = (PopSong) o;
        return sexOfSinger == popSong.sexOfSinger;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sexOfSinger);
    }
}
