package bd.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

    @Repository
    public class RezerwacjaRepositoryImpl implements RezerwacjaRepository {

        @Autowired
        private JdbcTemplate jdbcTemplate;

        @Override
        public int updateMiejsca(String miejsce, Integer id){
            return jdbcTemplate.update(
                    "update miejsca set zajete = true where miejsce = ? and id_samolot =?;",
                    miejsce, id);
        }
}
