package MySampleProject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




public class KeyData {
	
	//Key data
		
		private int GF_Number;
		
		private int ACF_Application;
		
		
		private String ACF_Fname;
		
		
		private String ACF_Lname;
		
		
		private String ACF_Ssn;
		
		
		private String ACF_Birthdate;
		
		
		private String Contract_Type;
		
	
		@XmlElement(name="GF_Number")
		public int getGF_Number() {
			return GF_Number;
		}


		public void setGF_Number(int gF_Number) {
			GF_Number = gF_Number;
		}


		@XmlElement(name="ACF_Application")
		public int getACF_Application() {
			return ACF_Application;
		}


		public void setACF_Application(int aCF_Application) {
			ACF_Application = aCF_Application;
		}

		@XmlElement(name="ACF_Fname")
		public String getACF_Fname() {
			return ACF_Fname;
		}


		public void setACF_Fname(String ACF_Fname) {
			this.ACF_Fname = ACF_Fname;
		}


		@XmlElement(name="ACF_Lname")
		public String getACF_Lname() {
			return ACF_Lname;
		}


		public void setACF_Lname(String ACF_Lname) {
			this.ACF_Lname = ACF_Lname;
		}


		@XmlElement(name="ACF_Ssn")
		public String getACF_Ssn() {
			return ACF_Ssn;
		}

		public void setACF_Ssn(String ACF_Ssn) {
			this.ACF_Ssn = ACF_Ssn;
		}

		@XmlElement(name="ACF_Birthdate")
		public String getACF_CUST_BirthDate() {
			return ACF_Birthdate;
		}


		public void setACF_CUST_BirthDate(String aCF_Birthdate) {
			ACF_Birthdate = aCF_Birthdate;
		}

		@XmlElement(name="Contract_Type")
		public String getContract_Type() {
			return Contract_Type;
		}


		public void setContract_Type(String contract_Type) {
			Contract_Type = contract_Type;
		}




	

	

}
