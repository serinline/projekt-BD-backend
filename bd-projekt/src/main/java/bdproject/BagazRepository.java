package bdproject;

import java.util.List;
import java.util.Optional;
import Samoloty.*;

public interface BagazRepository {

    int dodajBagaz(Bagaz bagaz);

    int usun(Integer id);
}
