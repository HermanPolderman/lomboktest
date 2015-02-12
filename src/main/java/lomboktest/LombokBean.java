package lomboktest;

import lombok.Data;
import lombok.FieldConstants;

@FieldConstants
@Data
public class LombokBean {

	private String name;
	
	public void init() {
		this.setName(NAME);
	}
	
}
