package bd.models;

public class Lot {
    private Integer id_lot;
    private String lotnisko_wylot;
    private String lotnisko_przylot;
    private String wylot;
    private String przylot;

    public Lot(Integer id, String lotnisko_wylot, String lotnisko_przylot, String wylot, String przylot) {
        setId_lot(id);
        setLotnisko_przylot(lotnisko_przylot);
        setLotnisko_wylot(lotnisko_wylot);
        setPrzylot(przylot);
        setWylot(wylot);
    }

    public Integer getId_lot(){ return id_lot; }

    public String getLotnisko_wylot(){
        return lotnisko_wylot;
    }

    public String getLotnisko_przylot() {
        return lotnisko_przylot;
    }

    public String getPrzylot() {
        return przylot;
    }

    public String getWylot() {
        return wylot;
    }

    public void setId_lot(Integer id_lot) {
        this.id_lot = id_lot;
    }

    public void setLotnisko_przylot(String lotnisko_przylot) {
        this.lotnisko_przylot = lotnisko_przylot;
    }

    public void setLotnisko_wylot(String lotnisko_wylot) {
        this.lotnisko_wylot = lotnisko_wylot;
    }

    public void setPrzylot(String przylot) {
        this.przylot = przylot;
    }

    public void setWylot(String wylot) {
        this.wylot = wylot;
    }

}