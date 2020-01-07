package bd.repositories;

import java.util.List;

import bd.models.*;

public interface PasazerRepository {

    int dodajPasazera(Pasazer pasazer);

    int usun(Integer id);

    List<Pasazer> wypiszWszystkich();

    List<Pasazer> zanajdzId(Integer pesel);

}
