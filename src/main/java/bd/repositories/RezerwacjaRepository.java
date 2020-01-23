package bd.repositories;

import bd.models.Pracownik;
import bd.models.Rezerwacja;

import java.util.List;

public interface RezerwacjaRepository {

    int updateMiejsca(String miejsce, Integer id_samolot);

    List<Pracownik> wypiszZaloge (Integer id_lot);

    int rezerwuj(Rezerwacja rezerwacja);

    int dodajBagazDoRezerwacji(Integer id_rezerwacja);

    Integer znajdzIdRez();

    List<Pracownik> wypiszCalaZaloge ();

    List<Rezerwacja> wypiszRezerwacje();

}