package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ServicingOrderBase
 */
public class ServicingOrderBase   {
  private String customerReference = null;

  private String employeeBusinessUnitReference = null;

  private String servicingOrderType = null;

  private Object servicingOrderRecord = null;

  private String dateType = null;

  private String date = null;

  private String servicingOrderStatus = null;

  private String servicingOrderResult = null;


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
   * general-info: Employee Business Unit Reference `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * general-info: Servicing Order Type `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return servicingOrderType
  **/

  public String getServicingOrderType() {
    return servicingOrderType;
  }

  public void setServicingOrderType(String servicingOrderType) {
    this.servicingOrderType = servicingOrderType;
  }


  /**
   * general-info: Servicing Order Record `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return servicingOrderRecord
  **/

  public Object getServicingOrderRecord() {
    return servicingOrderRecord;
  }

  public void setServicingOrderRecord(Object servicingOrderRecord) {
    this.servicingOrderRecord = servicingOrderRecord;
  }


  /**
   * general-info: Date Type `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return dateType
  **/

  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }


  /**
   * Get date
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  /**
   * general-info: Servicing Order Status `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return servicingOrderStatus
  **/

  public String getServicingOrderStatus() {
    return servicingOrderStatus;
  }

  public void setServicingOrderStatus(String servicingOrderStatus) {
    this.servicingOrderStatus = servicingOrderStatus;
  }


  /**
   * general-info: Servicing Order Result `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return servicingOrderResult
  **/

  public String getServicingOrderResult() {
    return servicingOrderResult;
  }

  public void setServicingOrderResult(String servicingOrderResult) {
    this.servicingOrderResult = servicingOrderResult;
  }


}

