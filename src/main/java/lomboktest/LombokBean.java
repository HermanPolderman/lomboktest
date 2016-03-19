package lomboktest;

import lombok.Data;
import lombok.FieldNameConstants;

@FieldNameConstants
@Data
public class LombokBean {

	private String name;
	
	public void init() {
		this.setName(NAME);
	}
	
}
