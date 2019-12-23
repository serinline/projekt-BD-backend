@Repository
public class SamolotyRepo{
    @Autowired
    private JdbcTemplate template;

    @PostConstruct
    public void stworzTabele() {
        template.execute("CREATE TABLE ");
    }
}