package repositories;

import java.util.List;

import models.*;

public interface PasazerRepository {

    int dodajPasazera(Pasazer pasazer);

    int usun(Integer id);

    List<Pasazer> wypiszWszystkich();

}
