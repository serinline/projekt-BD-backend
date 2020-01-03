package bdproject;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

@Repository
public class PasazerRepositoryImpl implements PasazerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    public void setDataSource(DataSource dataSource) {
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
//    }
//
//    public void setValues(Integer id, String imie, String nazwisko, Integer pesel, String obywatelstwo) {
//        this.jdbcTemplate.update(
//                "insert into pasazer (id_pasazer, imie, nazwisko, pesel, obywatelstwo) values (?, ?, ?, ?, ?)",
//                id, imie, nazwisko, pesel, obywatelstwo);
//    }

    @Override
    public int dodajPasazera(Pasazer pasazer){
        return jdbcTemplate.update(
                "insert into pasazer (id_pasazer, imie, nazwisko, pesel, obywatelstwo) values (?, ?, ?, ?, ?)",
                pasazer.getId_pasazer(),
                pasazer.getImie(),
                pasazer.getNazwisko(),
                pasazer.getPesel(),
                pasazer.getObywatelstwo());
    }

    @Override
    public int usun(Integer id){
        return jdbcTemplate.update(
                "delete pasazer where id_pasazer = ?", id);
    }


    @Override
    public List<Pasazer> wypiszWszystkich(){
        return jdbcTemplate.query(
                "select * from pasazer",
                (rs, rowNum) ->
                        new Pasazer(
                                rs.getInt("id_pasazer");
                                rs.getString("imie");
                                rs.getString("nazwisko");
                                rs.getInt("pesel");
                                rs.getString("obywatelstwo");
                        )
        );
    }

}