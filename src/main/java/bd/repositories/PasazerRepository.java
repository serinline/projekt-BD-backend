package bd.repositories;

import java.util.List;

import bd.models.*;

public interface PasazerRepository {

    long dodajPasazera(Pasazer pasazer);

    int usun(Integer id);

    List<Pasazer> wypiszWszystkich();

    Integer znajdzId();

}
