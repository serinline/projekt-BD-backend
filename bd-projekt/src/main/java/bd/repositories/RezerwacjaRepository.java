package bd.repositories;

import bd.models.Pracownik;

import java.util.List;

public interface RezerwacjaRepository {

    int updateMiejsca(String miejsce, Integer id_samolot);

    int stworzRezerwacje(Integer id_pasazer, Integer id_lot, Integer id_bagaz, String miejsce);

    List<Pracownik> wypiszZaloge (Integer id_lot);

}