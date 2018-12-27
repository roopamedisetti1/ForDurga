package MySampleProject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



public class ContractData {
	
	//Contract Data
	
			
			private double base_value;
			
	
			
			private double rate_adj;
			
			
			private double tot_rate_val;
			
			
			private double test_column;
			
			
			@XmlElement(name="base_value")
			public double getbase_value() {
				return base_value;
			}

			public void setbase_value(double base_value) {
				this.base_value = base_value;
			}

			@XmlElement(name="rate_adj")
			public double getRate_adj() {
				return rate_adj;
			}

			public void setRate_adj(double rate_adj) {
				this.rate_adj = rate_adj;
			}

			@XmlElement(name="tot_rate_val")
			public double getTot_rate_val() {
				return tot_rate_val;
			}

			public void setTot_rate_val(double tot_rate_val) {
				this.tot_rate_val = tot_rate_val;
			}

			@XmlElement(name="test_column")
			public double getTest_column() {
				return test_column;
			}

			public void setTest_column(double test_column) {
				this.test_column = test_column;
			}
			
}
