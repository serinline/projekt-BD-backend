package models;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private Integer pesel;
    private String obywatelstwo;
    private String stanowisko;

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