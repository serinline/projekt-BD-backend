package bd.models;

public class Pasazer {
    private Integer id_pasazer;
    private String imie;
    private String nazwisko;
    private Integer pesel;
    private String obywatelstwo;

    public Pasazer(int id_pasazer, String imie, String nazwisko, int pesel, String obywatelstwo) {
        setId_pasazer(id_pasazer);
        setImie(imie);
        setNazwisko(nazwisko);
        setPesel(pesel);
        setObywatelstwo(obywatelstwo);
    }

    public Pasazer() {}

    public Integer getId_pasazer() {
        return id_pasazer;
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

    public void setId_pasazer(Integer id_pasazer) {
        this.id_pasazer = id_pasazer;
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