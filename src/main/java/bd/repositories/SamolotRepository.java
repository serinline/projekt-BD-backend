package bd.repositories;

import java.util.List;

import bd.models.*;

public interface SamolotRepository {

    List<Samolot> znajdzPoId(Integer id);
}
