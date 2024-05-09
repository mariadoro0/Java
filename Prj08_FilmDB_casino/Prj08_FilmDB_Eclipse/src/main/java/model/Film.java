package model;

public class Film {
    private int id;
    private String titolo;
    private int anno;
    private int rating;
    private String regista;

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Film {");
        sb.append(" anno=").append(getAnno());
        sb.append(", id=").append(getId());
        sb.append(", titolo='").append(getTitolo()).append('\'');
        sb.append(", rating=").append(getRating());
        sb.append(", regista='").append(getRegista()).append('\'');
        sb.append('}');
        return sb.toString();
    }


    public Film() {
    }
}