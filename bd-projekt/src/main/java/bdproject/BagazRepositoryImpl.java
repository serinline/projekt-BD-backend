package bdproject;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

@Repository
public class BagazRepositoryImpl implements BagazRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    public void setDataSource(DataSource dataSource) {
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
//    }
//
//    public void setValues(Integer id, Integer id2, Integer waga) {
//        this.jdbcTemplate.update(
//                "insert into bagaz (id_bagaz, id_rezerwacja, waga) values (?, ?, ?)",
//                id, id2, waga);
//    }

    @Override
    int dodajBagaz(Bagaz bagaz){
        return jdbcTemplate.update(
                    "insert into bagaz (id_bagaz, id_rezerwacja, waga) values (?, ?, ?)",
                    bagaz.getId_bagaz(),
                    bagaz.getId_rezerwacja(),
                    bagaz.getWaga()
             );
        }
    }

    @Override
    int usun(Integer id){
        return jdbcTemplate.update(
                "delete bagaz where id_bagaz = ?", id);
    }
}