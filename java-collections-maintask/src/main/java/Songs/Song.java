package Songs;
import Properties.Language;
import java.util.Objects;

abstract public class Song {
  private   String name;
  private   String liricsAuthor;
  private   String musicAuthor;
  private   int duration;
  private   Language language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLiricsAuthor() {
        return liricsAuthor;
    }

    public void setLiricsAuthor(String liricsAuthor) {
        this.liricsAuthor = liricsAuthor;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(String musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Song(String name, String liricsAuthor, String musicAuthor, int duration, Language language) {
        this.name = name;
        this.liricsAuthor = liricsAuthor;
        this.musicAuthor = musicAuthor;
        this.duration = duration;
        this.language = language;
    }

    @Override
    public String toString() {
        return ""+name+"{" +
                "name='" + name + '\'' +
                ", liricsAuthor='" + liricsAuthor + '\'' +
                ", musicAuthor='" + musicAuthor + '\'' +
                ", duration=" + duration +
                ", language=" + language +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return duration == song.duration &&
                name.equals(song.name) &&
                liricsAuthor.equals(song.liricsAuthor) &&
                musicAuthor.equals(song.musicAuthor) &&
               Objects.equals(language,song.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, liricsAuthor, musicAuthor, duration, language);
    }
}
