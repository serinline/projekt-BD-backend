package repositories;

import models.*;

public interface BagazRepository {

    int dodajBagaz(Bagaz bagaz);

    int usun(Integer id);
}
