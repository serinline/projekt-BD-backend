package bd.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import bd.models.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SamolotRepositoryImpl implements SamolotRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Samolot> znajdzPoId(Integer id) {
        return jdbcTemplate.query(
                "select * from samolot where id_samolot = ?",
                new Object[]{id},
                (rs, rowNum) ->
                        new Samolot(
                                rs.getInt("id_samolot"),
                                rs.getString("marka"),
                                rs.getString("model")
                        )
        );
    }
}