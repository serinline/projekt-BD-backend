package Samoloty;

public class Lot {
    private String lotnisko_wylot;
    private String lotnisko_przylot;
    private String wylot;
    private String przylot;

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