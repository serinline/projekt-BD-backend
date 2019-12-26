package Samoloty;

public class Pasazer {
    private String imie;
    private String nazwisko;
    private Integer pesel;
    private String obywatelstwo;

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
}