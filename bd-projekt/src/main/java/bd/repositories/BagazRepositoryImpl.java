package bd.repositories;

import bd.models.Bagaz;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BagazRepositoryImpl implements BagazRepository {

    private final JdbcTemplate jdbcTemplate;

    public BagazRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int dodajBagaz(Bagaz bagaz){
        return jdbcTemplate.update(
                    "insert into bagaz (id_rezerwacja, waga) values (?, ?)",
                    bagaz.getId_rezerwacja(),
                    bagaz.getWaga()
             );
        }

    @Override
    public int usun(Integer id){
        return jdbcTemplate.update(
                "delete bagaz where id_bagaz = ?", id);
    }
}