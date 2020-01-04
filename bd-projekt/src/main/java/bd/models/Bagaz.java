package bd.models;

public class Bagaz {
    private Integer id_bagaz;
    private Integer id_rezerwacja;
    private Integer waga;

    public Integer getId_bagaz() {
        return id_bagaz;
    }

    public Integer getId_rezerwacja() {
        return id_rezerwacja;
    }

    public Integer getWaga(){
        return waga;
    }

    public void setWaga(Integer waga){
        this.waga = waga;
    }

    public void setId_bagaz(Integer id_bagaz) {
        this.id_bagaz = id_bagaz;
    }

    public void setId_rezerwacja(Integer id_rezerwacja) {
        this.id_rezerwacja = id_rezerwacja;
    }
}