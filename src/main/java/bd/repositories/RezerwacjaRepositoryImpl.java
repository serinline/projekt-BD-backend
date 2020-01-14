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
    public int updateMiejsca(String miejsce, Integer id_lot){
        return jdbcTemplate.update(
                "update miejsca set zajete = true where miejsce like ? and id_samolot = (select id_samolot from lot where id_lot = ?)",
                miejsce, id_lot);
    }

    @Override
    public int rezerwuj(Rezerwacja rezerwacja){
        return jdbcTemplate.update("insert into rezerwacja (id_pasazer, id_lot, miejsce) values (?, ?, ?)",
                rezerwacja.getId_pasazer(),
                rezerwacja.getId_lot(),
                rezerwacja.getMiejsce()
        );
    }

    @Override
    public List<Pracownik> wypiszZaloge (Integer id_lot){
        return jdbcTemplate.query(
                "select * from pracownik join zaloga on pracownik.id_pracownik = zaloga.id_pracownik where zaloga.id_zaloga = (select id_zaloga from lot where id_lot=?);",
                new Object[]{id_lot},
                (rs, rowNum) ->
                        new Pracownik(
                                rs.getInt("id_pracownik"),
                                rs.getString("imie"),
                                rs.getString("nazwisko"),
                                rs.getString("stanowisko"),
                                //rs.getInt("pesel"),
                                rs.getString("obywatelstwo")
                        )
        );
    }

    @Override
    public int dodajBagazDoRezerwacji(Integer id_rezerwacja){
        return jdbcTemplate.update(
                "update rezerwacja set id_bagaz = (select id_bagaz from bagaz where id_rezerwacja = ?) where id_rezerwacja = ?",
                id_rezerwacja, id_rezerwacja);
    }

    @Override
    public Integer znajdzIdRez(){
        return jdbcTemplate.queryForObject(
                "select max(id_rezerwacja) from rezerwacja", Integer.class
        );
    }

    @Override
    public List<Pracownik> wypiszCalaZaloge (){
        return jdbcTemplate.query(
                "select * from pracownik ",
                (rs, rowNum) ->
                        new Pracownik(
                                rs.getInt("id_pracownik"),
                                rs.getString("imie"),
                                rs.getString("nazwisko"),
                                rs.getString("stanowisko"),
                                //rs.getInt("pesel"),
                                rs.getString("obywatelstwo")
                        )
        );
    }

}
