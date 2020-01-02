import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;


public class DodajPasazera {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void setValues(Integer id, String imie, String nazwisko, Integer pesel, String obywatelstwo) {
        this.jdbcTemplate.update(
                "insert into pasazer (id_pasazer, imie, nazwisko, pesel, obywatelstwo) values (?, ?, ?, ?, ?)",
                id, imie, nazwisko, pesel, obywatelstwo);
    }
}