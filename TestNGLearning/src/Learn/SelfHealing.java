package Learn;

import org.testng.annotations.Test;

import com.ey.connectionutil.*;
import com.ey.comparison.*;
import com.ey.self_healing.*;
public class SelfHealing {
	
	@Test
	public void testing() {
		CompareProperties.calculateWeightage();
		ExtractData();
		extractContentfromHtml("abc","123");
	}

}
