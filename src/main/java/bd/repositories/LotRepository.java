package bd.repositories;

import java.util.List;

import bd.models.*;

public interface LotRepository {

    List<Lot> wypiszWszystkie();

    List<Lot> znajdzPoWylocie(String miasto);

    List<Lot> znajdzPoPrzylocie(String miasto);

    List<Lot> znajdzPoPrzylocieWylocie(String miasto_wylot, String miasto_przylot);
}
