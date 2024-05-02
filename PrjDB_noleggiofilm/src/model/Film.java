package model;

public class Film {
    private int id;
    private String title;
    private String description;
    private int releaseYear;
    private int languageId;
    private int genreId;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.Film{");
        sb.append("id=").append(getId());
        sb.append(", title='").append(getTitle()).append('\'');
        sb.append(", description='").append(getDescription()).append('\'');
        sb.append(", releaseYear=").append(getReleaseYear()).append('\'');
        sb.append(", languageId=").append(getLanguageId());
        sb.append(", genreId=").append(getGenreId());
        sb.append('}');
        return sb.toString();
    }
}
