package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ServicingOrderApprovalBaseWithIdAndRoot
 */
public class ServicingOrderApprovalBaseWithIdAndRoot   {
  private String servicingOrderReference = null;

  private String servicingOrderApprovalsReference = null;

  private String customerReference = null;

  private Object customerProductServiceEntitlement = null;

  private String thirdPartyReference = null;

  private String thirdPartyServicingMandateReference = null;

  private Object thirdPartyServicingMandate = null;

  private Object servicingOrderApprovalsRecord = null;


  /**
   * general-info: Servicing Order Reference `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingOrderReference
  **/

  public String getServicingOrderReference() {
    return servicingOrderReference;
  }

  public void setServicingOrderReference(String servicingOrderReference) {
    this.servicingOrderReference = servicingOrderReference;
  }


  /**
   * general-info: Servicing Order Approvals Reference `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return servicingOrderApprovalsReference
  **/

  public String getServicingOrderApprovalsReference() {
    return servicingOrderApprovalsReference;
  }

  public void setServicingOrderApprovalsReference(String servicingOrderApprovalsReference) {
    this.servicingOrderApprovalsReference = servicingOrderApprovalsReference;
  }


  /**
   * general-info: Customer Reference `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * general-info: Customer Product Service Entitlement `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerProductServiceEntitlement
  **/

  public Object getCustomerProductServiceEntitlement() {
    return customerProductServiceEntitlement;
  }

  public void setCustomerProductServiceEntitlement(Object customerProductServiceEntitlement) {
    this.customerProductServiceEntitlement = customerProductServiceEntitlement;
  }


  /**
   * general-info: Third Party Reference `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return thirdPartyReference
  **/

  public String getThirdPartyReference() {
    return thirdPartyReference;
  }

  public void setThirdPartyReference(String thirdPartyReference) {
    this.thirdPartyReference = thirdPartyReference;
  }


  /**
   * general-info: Third Party Servicing Mandate Reference `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return thirdPartyServicingMandateReference
  **/

  public String getThirdPartyServicingMandateReference() {
    return thirdPartyServicingMandateReference;
  }

  public void setThirdPartyServicingMandateReference(String thirdPartyServicingMandateReference) {
    this.thirdPartyServicingMandateReference = thirdPartyServicingMandateReference;
  }


  /**
   * general-info: Third Party Servicing Mandate `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return thirdPartyServicingMandate
  **/

  public Object getThirdPartyServicingMandate() {
    return thirdPartyServicingMandate;
  }

  public void setThirdPartyServicingMandate(Object thirdPartyServicingMandate) {
    this.thirdPartyServicingMandate = thirdPartyServicingMandate;
  }


  /**
   * general-info: Servicing Order Approvals Record `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return servicingOrderApprovalsRecord
  **/

  public Object getServicingOrderApprovalsRecord() {
    return servicingOrderApprovalsRecord;
  }

  public void setServicingOrderApprovalsRecord(Object servicingOrderApprovalsRecord) {
    this.servicingOrderApprovalsRecord = servicingOrderApprovalsRecord;
  }


}

