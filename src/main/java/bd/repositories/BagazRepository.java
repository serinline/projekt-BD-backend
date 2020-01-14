package bd.repositories;

import bd.models.*;

public interface BagazRepository {

    int dodajBagaz(Bagaz bagaz);

    int usun(Integer id);
}
