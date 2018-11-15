package tutorial;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.couchbase.core.mapping.Document;


@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	private Long id;

	@Field
	private String name;

	@Field
	private int age;

	@Field
	private int years;
}
