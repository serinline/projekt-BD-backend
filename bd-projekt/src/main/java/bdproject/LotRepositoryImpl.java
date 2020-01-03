package bdproject;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

import Samoloty.*;

@Repository
public class LotRepositoryImpl implements LotRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    List<Lot> wypiszWszystkie(){
        return jdbcTemplate.query(
                "select * from lot",
                (rs, rowNum) ->
                        new Lot(
                                rs.getString("lotnisko_wylot");
                                rs.getString("lotnisko_przylot");
                                rs.getString("wylot");
                                rs.getString("przylot");
                        )
            );
        }
    }

    @Override
    List<Lot> znajdzPoWylocie(String miasto){
        return jdbcTemplate.query(
                "select * from lot where lotnisko_wylot like ?",
                new Object[]{"%" + miasto},
                (rs, rowNum) ->
                        new Lot(
                                rs.getString("lotnisko_wylot");
                                rs.getString("lotnisko_przylot");
                                rs.getString("wylot");
                                rs.getString("przylot");
                        )
        );
    }

    @Override
    List<Lot> znajdzPoPrzylocie(String miasto){
        return jdbcTemplate.query(
                "select * from lot where lotnisko_przylot like ?",
                new Object[]{"%" + miasto},
                (rs, rowNum) ->
                        new Lot(
                                rs.getString("lotnisko_wylot");
                                rs.getString("lotnisko_przylot");
                                rs.getString("wylot");
                                rs.getString("przylot");
                        )
        );
    }
}