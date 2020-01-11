package bd.models;

import org.springframework.data.relational.core.sql.In;

public class Pracownik {
    private Integer id_pracownik;
    private String imie;
    private String nazwisko;
    private Integer pesel;
    private String obywatelstwo;
    private String stanowisko;

    public Pracownik(int id_pracownik, String imie, String nazwisko, String stanowisko/*, int pesel*/, String obywatelstwo) {
        setId_pracownik(id_pracownik);
        setImie(imie);
        setNazwisko(nazwisko);
        setStanowisko(stanowisko);
        //setPesel(pesel);
        setObywatelstwo(obywatelstwo);
    }

    public Integer getId_pracownik() {
        return id_pracownik;
    }

    public void setId_pracownik(Integer id_pracownik) {
        this.id_pracownik = id_pracownik;
    }

    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public Integer getPesel() {
        return pesel;
    }

    public String getObywatelstwo() {
        return obywatelstwo;
    }

    public String getStanowisko(){
        return stanowisko;
    }

    public void setImie(String imie){
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    public void setPesel(Integer pesel){
        this.pesel = pesel;
    }

    public void setObywatelstwo(String obywatelstwo){
        this.obywatelstwo = obywatelstwo;
    }

    public void setStanowisko(String stanowisko){
        this.stanowisko = stanowisko;
    }
}