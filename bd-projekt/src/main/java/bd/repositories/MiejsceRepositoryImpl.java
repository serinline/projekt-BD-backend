package bd.repositories;

import bd.models.Miejsce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public class MiejsceRepositoryImpl implements MiejsceRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Miejsce> znajdzWolne(Integer id_lot){
        return jdbcTemplate.query(
                "select * from miejsca join lot on miejsca.id_samolot = lot.id_samolot where miejsca.zajete is null and lot.id_lot = ?",
                new Object[]{id_lot},
                (rs, rowNum) ->
                        new Miejsce(
                                rs.getString("miejsce")
                        )
        );
    }
}
