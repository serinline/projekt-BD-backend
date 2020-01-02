import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;


public class DodajBagaz {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void setValues(Integer id, Integer Id2, Integer waga) {
        this.jdbcTemplate.update(
                "insert into bagaz (id_bagaz, id_rezerwacja, waga) values (?, ?, ?)",
                id, id2, waga);
    }
}