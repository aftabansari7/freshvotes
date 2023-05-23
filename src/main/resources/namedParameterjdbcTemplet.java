

@Bean
public NamedParameterJdbcTemplate namedParameterJdbcTemplate(){
	NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource());
	return namedParameterJdbcTemplate;
}

