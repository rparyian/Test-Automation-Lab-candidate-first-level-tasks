package Songs;
import java.util.Objects;

import Properties.Language;
import Properties.RockType;
public class RockSong extends Song{
    private RockType rockType;

    public RockSong(String name, String liricsAuthor, String musicAuthor, int duration, Language language, RockType rockType) {
        super(name, liricsAuthor, musicAuthor, duration, language);
        this.rockType = rockType;
    }

    public RockType getRockType() {
        return rockType;
    }

    public void setRockType(RockType rockType) {
        this.rockType = rockType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", RockType=" + rockType+'}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RockSong rockSong = (RockSong) o;
        return rockType == rockSong.rockType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rockType);
    }
}
