package bdproject;

import java.util.List;
import java.util.Optional;
import Samoloty.*;

public interface PasazerRepository {

    int dodajPasazera(Pasazer pasazer);

    int usun(Integer id);

    List<Pasazer> wypiszWszystkich();

}
