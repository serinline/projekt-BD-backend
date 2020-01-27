package bd.repositories;

import bd.models.Bagaz;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BagazRepositoryImpl implements BagazRepository {

    private final JdbcTemplate jdbcTemplate;

    public BagazRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int dodajBagaz(Bagaz bagaz){
        try {
            return jdbcTemplate.update(
                    "insert into bagaz (id_rezerwacja, waga) values (?, ?)",
                    bagaz.getId_rezerwacja(),
                    bagaz.getWaga()
            );
        }
        catch (RuntimeException e) {
            return 0;
        }
        }

    @Override
    public int usun(Integer id){
        return jdbcTemplate.update(
                "delete from bagaz where id_bagaz = ?", id);
    }

    @Override
    public List<Bagaz> wyswietl(){
        return jdbcTemplate.query("select * from bagaz",
                (rs, rowNum) ->
                    new Bagaz(
                            rs.getInt("id_bagaz"),
                            rs.getInt("waga"),
                            rs.getInt("id_rezerwacja")
                    )
        );
    }
}