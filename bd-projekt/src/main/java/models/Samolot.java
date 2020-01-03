package models;

public class Samolot{
    private Integer id_samolot;
    private String marka;
    private String model;

    public Samolot(int id_samolot, String marka, String model) {
        setMarka(marka);
        setModel(model);
        setId_samolot(id_samolot);
    }

    public Integer getId_samolot(Integer id){ return id_samolot; }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public void setId_samolot(Integer id_samolot) {
        this.id_samolot = id_samolot;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }
}