



@Configuration
@ComponentScan("com.baeldung.jdbc")
public class SpringJdbcConfig {
    @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("postgres://xczhpocz:agpWVGhTJDWVDjDINL4z8ZzsxU4nWPZl@rajje.db.elephantsql.com:5432/xczhpocz");
        dataSource.setUsername("xczhpocz");
        dataSource.setPassword("agpWVGhTJDWVDjDINL4z8ZzsxU4nWPZl");
 
        return dataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DriverManagerDataSource ds) {
        return new JdbcTemplate(ds);
    }

}