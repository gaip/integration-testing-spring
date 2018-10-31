package atd.spring.testing.integrationtests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import atd.spring.testing.configuration.MinimalConfiguration;
import atd.spring.testing.persistence.RateRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes= {MinimalConfiguration.class})
public class EmptyTest {

	@Autowired JdbcTemplate jdbcTemplate;
	@Autowired RateRepository rates;
	
	
	@Test
	public void canRunIntegrationTests() {
		assertNotNull(rates);
		assertNotNull(jdbcTemplate);
	}

}