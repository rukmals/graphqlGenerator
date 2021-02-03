/** Generated by the default template from graphql-java-generator */
package org.wso2.carbon.apimgt.graphql.api.devportal.gql;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Transient;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@Entity
@GraphQLObjectType("IngressUrl")
public class IngressUrl  {

	public IngressUrl(){
		// No action
	}

	@GraphQLScalar(fieldName = "deploymentEnvironmentName", graphQLTypeSimpleName = "String", javaClass = String.class)
	String deploymentEnvironmentName;


	@Transient
	@GraphQLNonScalar(fieldName = "clusterDetails", graphQLTypeSimpleName = "DeploymentClusterInformation", javaClass = DeploymentClusterInformation.class)
	List<DeploymentClusterInformation> clusterDetails;



	public void setDeploymentEnvironmentName(String deploymentEnvironmentName) {
		this.deploymentEnvironmentName = deploymentEnvironmentName;
	}

	public String getDeploymentEnvironmentName() {
		return deploymentEnvironmentName;
	}

	public void setClusterDetails(List<DeploymentClusterInformation> clusterDetails) {
		this.clusterDetails = clusterDetails;
	}

	public List<DeploymentClusterInformation> getClusterDetails() {
		return clusterDetails;
	}

    public String toString() {
        return "IngressUrl {"
				+ "deploymentEnvironmentName: " + deploymentEnvironmentName
				+ ", "
				+ "clusterDetails: " + clusterDetails
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		DeploymentEnvironmentName("deploymentEnvironmentName"),
		ClusterDetails("clusterDetails");

		private String fieldName;

		Field(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getFieldName() {
			return fieldName;
		}

		public Class<?> getGraphQLType() {
			return this.getClass().getDeclaringClass();
		}

	}

	public static Builder builder() {
			return new Builder();
		}



	/**
	 * Builder
	 */
	public static class Builder {
		private String deploymentEnvironmentName;
		private List<DeploymentClusterInformation> clusterDetails;


		public Builder withDeploymentEnvironmentName(String deploymentEnvironmentName) {
			this.deploymentEnvironmentName = deploymentEnvironmentName;
			return this;
		}
		public Builder withClusterDetails(List<DeploymentClusterInformation> clusterDetails) {
			this.clusterDetails = clusterDetails;
			return this;
		}

		public IngressUrl build() {
			IngressUrl _object = new IngressUrl();
			_object.setDeploymentEnvironmentName(deploymentEnvironmentName);
			_object.setClusterDetails(clusterDetails);
			return _object;
		}
	}
}
