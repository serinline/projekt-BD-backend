package bd.repositories;

import bd.models.*;

import java.util.List;

public interface BagazRepository {

    int dodajBagaz(Bagaz bagaz);

    int usun(Integer id);

    List<Bagaz> wyswietl();
}
