package bd.repositories;

import bd.models.Miejsce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class MiejsceRepositoryImpl implements MiejsceRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Miejsce> znajdzWolne(@PathVariable Integer id_samolot){
        return jdbcTemplate.query(
                "select * from miejsca where zajete = null and id_samolot = ?",
                new Object[]{id_samolot},
                (rs, rowNum) ->
                        new Miejsce(
                                rs.getString("miejsce")
                        )
        );
    }
}
