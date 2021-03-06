/** Generated by the default template from graphql-java-generator */
package org.wso2.carbon.apimgt.graphql.api.devportal.gql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.graphql_java_generator.GraphqlUtils;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@SpringBootApplication(scanBasePackages = { "org.wso2.carbon.apimgt.graphql.api.devportal.gql", "com.graphql_java_generator" ,"org.wso2.carbon.apimgt.graphql.api.devportal.gql" })
@EnableJpaRepositories(basePackages = { "org.wso2.carbon.apimgt.graphql.api.devportal.gql", "com.graphql_java_generator" ,"org.wso2.carbon.apimgt.graphql.api.devportal.gql" })
@EntityScan(basePackages = { "org.wso2.carbon.apimgt.graphql.api.devportal.gql", "com.graphql_java_generator" ,"org.wso2.carbon.apimgt.graphql.api.devportal.gql" })
@EnableConfigurationProperties
public class GraphQLServerMain extends SpringBootServletInitializer {


	public static void main(String[] args) {
		SpringApplication.run(GraphQLServerMain.class, args);
	}

}
