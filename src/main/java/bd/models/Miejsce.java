package bd.models;


public class Miejsce {
    private Integer id_samolot;
    private String miejsce;
    private Boolean zajete;

    public Miejsce(String miejsce) {
        setMiejsce(miejsce);
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setId_samolot(Integer id_samolot) {
        this.id_samolot = id_samolot;
    }

    public Boolean getZajete() {
        return zajete;
    }

    public Integer getId_samolot() {
        return id_samolot;
    }

    public void setZajete(Boolean zajete) {
        this.zajete = zajete;
    }
}
