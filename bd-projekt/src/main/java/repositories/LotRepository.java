package repositories;

import java.util.List;

import models.*;

public interface LotRepository {

    List<Lot> wypiszWszystkie();

    List<Lot> znajdzPoWylocie(String miasto);

    List<Lot> znajdzPoPrzylocie(String miasto);

}
