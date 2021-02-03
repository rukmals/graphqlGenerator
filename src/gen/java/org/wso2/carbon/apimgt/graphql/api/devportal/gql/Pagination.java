/** Generated by the default template from graphql-java-generator */
package org.wso2.carbon.apimgt.graphql.api.devportal.gql;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import javax.persistence.Entity;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@Entity
@GraphQLObjectType("Pagination")
public class Pagination  {

	public Pagination(){
		// No action
	}

	@GraphQLScalar(fieldName = "offset", graphQLTypeSimpleName = "Int", javaClass = Integer.class)
	Integer offset;


	@GraphQLScalar(fieldName = "limit", graphQLTypeSimpleName = "Int", javaClass = Integer.class)
	Integer limit;


	@GraphQLScalar(fieldName = "total", graphQLTypeSimpleName = "Int", javaClass = Integer.class)
	Integer total;


	@GraphQLScalar(fieldName = "next", graphQLTypeSimpleName = "String", javaClass = String.class)
	String next;


	@GraphQLScalar(fieldName = "previous", graphQLTypeSimpleName = "String", javaClass = String.class)
	String previous;



	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getTotal() {
		return total;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getNext() {
		return next;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public String getPrevious() {
		return previous;
	}

    public String toString() {
        return "Pagination {"
				+ "offset: " + offset
				+ ", "
				+ "limit: " + limit
				+ ", "
				+ "total: " + total
				+ ", "
				+ "next: " + next
				+ ", "
				+ "previous: " + previous
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Offset("offset"),
		Limit("limit"),
		Total("total"),
		Next("next"),
		Previous("previous");

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
		private Integer offset;
		private Integer limit;
		private Integer total;
		private String next;
		private String previous;


		public Builder withOffset(Integer offset) {
			this.offset = offset;
			return this;
		}
		public Builder withLimit(Integer limit) {
			this.limit = limit;
			return this;
		}
		public Builder withTotal(Integer total) {
			this.total = total;
			return this;
		}
		public Builder withNext(String next) {
			this.next = next;
			return this;
		}
		public Builder withPrevious(String previous) {
			this.previous = previous;
			return this;
		}

		public Pagination build() {
			Pagination _object = new Pagination();
			_object.setOffset(offset);
			_object.setLimit(limit);
			_object.setTotal(total);
			_object.setNext(next);
			_object.setPrevious(previous);
			return _object;
		}
	}
}
