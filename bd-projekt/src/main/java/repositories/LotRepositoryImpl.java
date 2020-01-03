package repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import models.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LotRepositoryImpl implements LotRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Lot> wypiszWszystkie(){
        return jdbcTemplate.query(
                "select * from lot",
                (rs, rowNum) ->
                        new Lot(
                                rs.getString("lotnisko_wylot"),
                                rs.getString("lotnisko_przylot"),
                                rs.getString("wylot"),
                                rs.getString("przylot")
                        )
            );
        }

    @Override
    public List<Lot> znajdzPoWylocie(String miasto){
        return jdbcTemplate.query(
                "select * from lot where lotnisko_wylot like ?",
                new Object[]{"%" + miasto},
                (rs, rowNum) ->
                        new Lot(
                                rs.getString("lotnisko_wylot"),
                                rs.getString("lotnisko_przylot"),
                                rs.getString("wylot"),
                                rs.getString("przylot")
                        )
        );
    }

    @Override
    public List<Lot> znajdzPoPrzylocie(String miasto){
        return jdbcTemplate.query(
                "select * from lot where lotnisko_przylot like ?",
                new Object[]{"%" + miasto},
                (rs, rowNum) ->
                        new Lot(
                                rs.getString("lotnisko_wylot"),
                                rs.getString("lotnisko_przylot"),
                                rs.getString("wylot"),
                                rs.getString("przylot")
                        )
        );
    }
}