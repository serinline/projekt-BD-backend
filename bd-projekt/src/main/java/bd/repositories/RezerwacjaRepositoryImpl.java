package bd.repositories;

import bd.models.Pracownik;
import bd.models.Rezerwacja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RezerwacjaRepositoryImpl implements RezerwacjaRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int updateMiejsca(String miejsce, Integer id_samolot){
        return jdbcTemplate.update(
                "update miejsca set zajete = true where miejsce = ? and id_samolot =?;",
                miejsce, id_samolot);
    }

//    @Override
//    public int stworzRezerwacje(Integer id_pasazer, Integer id_lot, Integer id_bagaz, String miejsce){
//        return jdbcTemplate.update("insert into rezerwacja (id_pasazer, id_lot, id_bagaz, miejsce) values (?, ?, ?, ?),",
//                "id_pasazer, id_lot, id_bagaz, miejsce");
//    }

    @Override
    public int rezerwuj(Rezerwacja rezerwacja){
        return jdbcTemplate.update("insert into rezerwacja (id_pasazer, id_lot, id_bagaz, miejsce) values (?, ?, ?, ?)",
                rezerwacja.getId_pasazer(),
                rezerwacja.getId_lot(),
                rezerwacja.getId_bagaz(),
                rezerwacja.getMiejsce()
        );
    }

    @Override
    public List<Pracownik> wypiszZaloge (Integer id_lot){
        return jdbcTemplate.query(
                "select * from pracownik where id_pracownik = " +
                        "(select id_pracownik from zaloga inner join lot on " +
                        "zaloga.id_zaloga =(select id_zaloga from lot where id_lot=?))",
                new Object[]{"%" + id_lot},
                (rs, rowNum) ->
                        new Pracownik(
                                rs.getString("imie"),
                                rs.getString("nazwisko"),
                                rs.getString("stanowisko"),
                                //rs.getInt("pesel"),
                                rs.getString("obywatelstwo")
                        )
        );
    }
}
