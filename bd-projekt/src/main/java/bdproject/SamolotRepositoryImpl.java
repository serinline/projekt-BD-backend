package bdproject;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

import Samoloty.*;

@Repository
public class SamolotRepositoryImpl implements SamolotRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    List<Samolot> znajdzPoId(Integer id) {
        return jdbcTemplate.query(
                "select * from samolot where id like ?",
                new Object[]{"%" + id},
                (rs, rowNum) ->
                        new Samolot(
                                rs.getInt("id_samolot");
                                rs.getString("marka");
                                rs.getString("model");
                        )
        );
    }
}