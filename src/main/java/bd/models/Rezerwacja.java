package bd.models;

public class Rezerwacja {
    private Integer id_pasazer;
    private Integer id_rezerwacja;
    private Integer id_lot;
    private Integer id_bagaz;

//    public Rezerwacja(Integer id_pasazer, Integer id_lot/*, String miejsce*/){
//        setId_pasazer(id_pasazer);
////        setMiejsce(miejsce);
//        setId_lot(id_lot);
//    }

    public Rezerwacja(Integer id_rezerwacja, Integer id_pasazer, Integer id_lot, Integer id_bagaz ){
        setId_rezerwacja(id_rezerwacja);
        setId_pasazer(id_pasazer);
        setId_lot(id_lot);
        setId_bagaz(id_bagaz);
    }

    public void setId_pasazer(Integer id_pasazer){
        this.id_pasazer = id_pasazer;
    }

    public void setId_rezerwacja(Integer id_rezerwacja) {
        this.id_rezerwacja = id_rezerwacja;
    }

    public void setId_lot(Integer id_lot) {
        this.id_lot = id_lot;
    }

    public void setId_bagaz(Integer id_bagaz) {
        this.id_bagaz = id_bagaz;
    }


    public Integer getId_bagaz() {
        return id_bagaz;
    }

    public Integer getId_lot() {
        return id_lot;
    }

    public Integer getId_pasazer() {
        return id_pasazer;
    }

    public Integer getId_rezerwacja() {
        return id_rezerwacja;
    }


}
