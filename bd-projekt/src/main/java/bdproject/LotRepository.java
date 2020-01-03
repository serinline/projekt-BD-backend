package bdproject;

import java.util.List;
import java.util.Optional;
import Samoloty.*;

public interface LotRepository {

    List<Lot> wypiszWszystkie();

    List<Lot> znajdzPoWylocie(String miasto);

    List<Lot> znajdzPoPrzylocie(String miasto);

}
