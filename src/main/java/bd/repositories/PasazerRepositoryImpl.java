package bd.repositories;

import bd.models.Pasazer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PasazerRepositoryImpl implements PasazerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int dodajPasazera(Pasazer pasazer){
        return jdbcTemplate.update(
                "insert into pasazer (imie, nazwisko, pesel, obywatelstwo) values (?, ?, ?, ?)",
                //pasazer.getId_pasazer(),
                pasazer.getImie(),
                pasazer.getNazwisko(),
                pasazer.getPesel(),
                pasazer.getObywatelstwo());
    }

    @Override
    public int usun(Integer id){
        return jdbcTemplate.update(
                "delete from pasazer where id_pasazer = ?", id);
    }


    @Override
    public List<Pasazer> wypiszWszystkich(){
        return jdbcTemplate.query(
                "select * from pasazer",
                (rs, rowNum) ->
                        new Pasazer(
                                rs.getInt("id_pasazer"),
                                rs.getString("imie"),
                                rs.getString("nazwisko"),
                                rs.getLong("pesel"),
                                rs.getString("obywatelstwo"))
        );
    }

    @Override
    public Integer znajdzId(){
        return jdbcTemplate.queryForObject(
                "select max(id_pasazer) from pasazer", Integer.class
        );
    }

}