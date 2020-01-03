package repositories;

import java.util.List;

import models.*;

public interface SamolotRepository {

    List<Samolot> znajdzPoId(Integer id);
}
