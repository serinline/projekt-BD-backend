package bd.repositories;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;


import bd.models.Pasazer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class PasazerRepositoryImpl implements PasazerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    @Override
//    public int dodajPasazera(Pasazer pasazer){
//        return jdbcTemplate.update(
//                "insert into pasazer (imie, nazwisko, pesel, obywatelstwo) values (?, ?, ?, ?)",
//                //pasazer.getId_pasazer(),
//                pasazer.getImie(),
//                pasazer.getNazwisko(),
//                pasazer.getPesel(),
//                pasazer.getObywatelstwo());
//    }

    @Override
    public long dodajPasazera(Pasazer pasazer){
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String query = "insert into pasazer (imie, nazwisko, pesel, obywatelstwo) values (?, ?, ?, ?)";
        try {

            jdbcTemplate.update(
                    connection -> {
                        PreparedStatement ps = connection.prepareStatement(query, new String[]{"id_pasazer"});
                        ps.setString(1, pasazer.getImie());
                        ps.setString(2, pasazer.getNazwisko());
                        ps.setLong(3, pasazer.getPesel());
                        ps.setString(4, pasazer.getObywatelstwo());
                        return ps;
                    }, keyHolder);

            return (long) keyHolder.getKey();
        }
        catch (RuntimeException e) {
            return 0;
        }
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