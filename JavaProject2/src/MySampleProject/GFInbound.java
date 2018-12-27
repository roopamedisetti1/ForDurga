package MySampleProject;

import javax.xml.bind.annotation.*;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlAccessType;


@XmlRootElement(name="GFInbound")

public class GFInbound {
	
	
	
	private KeyData keyData;
	

	ContractData contractData;
	
	@XmlElement(name="ContractData")
	 public ContractData getContractData() {
		return contractData;
	}




	public void setContractData(ContractData contractData) {
		this.contractData = contractData;
	}




	@XmlElement(name="KeyData")
	  public KeyData getKeyData() {
		return keyData;
	}




	public void setKeyData(KeyData keyData) {
		this.keyData =  keyData;
	}


		




}
