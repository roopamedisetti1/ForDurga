package MySampleProject;

public class JavaMain {

	public static void main(String[] args) {
		
		
		MyParser parser = new MyParser();
		
		
		GFInbound gfInbound = parser.parseXML("C:\\\\Users\\\\saipr\\\\Downloads\\\\JavaProject2\\\\resources\\\\employeedurga.xml");
		
		
		//KeyData
		KeyData keyData = gfInbound.getKeyData();
		
		System.out.println("GF_Number : " + keyData.getGF_Number());
		System.out.println("ACF_Application : " + keyData.getACF_Application());
		System.out.println("ACF_CUST_Fname : " + keyData.getACF_Fname());
		System.out.println("ACF_CUST_Lname : " + keyData.getACF_Lname());
		System.out.println("ACF_CUST_SSN : " + keyData.getACF_Ssn());
		System.out.println("ACF_CUST_BirthDate : " + keyData.getACF_CUST_BirthDate());
		System.out.println("Contract_Type : " + keyData.getContract_Type());
		
		
		
		//ContractData
		
		ContractData contractData = gfInbound.getContractData();
		
		System.out.println("base_value : " + contractData.getbase_value());
		System.out.println("rate_adj : " + contractData.getRate_adj());
		System.out.println("tot_rate_val : " + contractData.getTot_rate_val());
		System.out.println("test_column : " + contractData.getTest_column());
		
	}

}
