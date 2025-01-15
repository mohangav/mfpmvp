package com.mng.mfpmvp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MfpmvpApplicationTests {
	@Autowired
	private DataSource dataSource;

	@Test
	void contextLoads() {
	}

	@Test
	void testDatabaseConnection() throws SQLException {
		try (Connection connection = dataSource.getConnection()) {
			assertThat(connection).isNotNull();
		}
	}

}
