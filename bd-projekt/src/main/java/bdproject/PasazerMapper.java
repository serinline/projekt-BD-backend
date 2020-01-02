package bdproject;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import Samoloty.*;

public class PasazerMapper implements RowMapper<Pasazer> {
    public Pasazer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Pasazer pasazer = new Pasazer();
        pasazer.setId_pasazer(rs.getInt("id_pasazer"));
        pasazer.setImie(rs.getString("imie"));
        pasazer.setNazwisko(rs.getString("nazwisko"));
        pasazer.setPesel(rs.getInt("pesel"));
        pasazer.setObywatelstwo(rs.getString("obywatelstwo"));
        return pasazer;
    }
}