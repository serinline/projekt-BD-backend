package bd.repositories;

import java.util.List;

import bd.models.*;

public interface MiejsceRepository {

    List<Miejsce> znajdzWolne(Integer id_samolot);

}
