package com.stackroute.matchzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableNeo4jRepositories
@EnableAutoConfiguration (exclude={DataSourceAutoConfiguration.class})
@EnableTransactionManagement

public class Neo4jDataModellingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Neo4jDataModellingServiceApplication.class, args);
	}
}
