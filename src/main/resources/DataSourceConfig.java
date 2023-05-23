	import org.springframework.context.annotation.Bean;
	import org.springframework.jdbc.datasource.DriverManagerDataSource;
	import javax.sql.DataSource;

	@Configuration
	public class DataSourceConfig {

	    @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        // Configure the data source properties (e.g., URL, username, password)
	        dataSource.setUrl("jdbc:mysql://localhost:3306/freshvotes");
	        dataSource.setUsername("root");
	        dataSource.setPassword("59512981");
	        return dataSource;
	    
	}

}
