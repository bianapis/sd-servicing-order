package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ServicingOrderTaskBaseWithIdAndRoot
 */
public class ServicingOrderTaskBaseWithIdAndRoot   {
  private String servicingOrderReference = null;

  private String servicingOrderType = null;

  private Object servicingOrderDescription = null;

  private String workTaskReference = null;

  private String workTaskType = null;

  private String workTaskDescription = null;

  private Object workTaskRecord = null;

  private Object servicingOrderRecord = null;


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
   * general-info: Servicing Order Description `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return servicingOrderDescription
  **/

  public Object getServicingOrderDescription() {
    return servicingOrderDescription;
  }

  public void setServicingOrderDescription(Object servicingOrderDescription) {
    this.servicingOrderDescription = servicingOrderDescription;
  }


  /**
   * general-info: Work Task Reference `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return workTaskReference
  **/

  public String getWorkTaskReference() {
    return workTaskReference;
  }

  public void setWorkTaskReference(String workTaskReference) {
    this.workTaskReference = workTaskReference;
  }


  /**
   * general-info: Work Task Type `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return workTaskType
  **/

  public String getWorkTaskType() {
    return workTaskType;
  }

  public void setWorkTaskType(String workTaskType) {
    this.workTaskType = workTaskType;
  }


  /**
   * general-info: Work Task Description `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return workTaskDescription
  **/

  public String getWorkTaskDescription() {
    return workTaskDescription;
  }

  public void setWorkTaskDescription(String workTaskDescription) {
    this.workTaskDescription = workTaskDescription;
  }


  /**
   * general-info: Work Task Record `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return workTaskRecord
  **/

  public Object getWorkTaskRecord() {
    return workTaskRecord;
  }

  public void setWorkTaskRecord(Object workTaskRecord) {
    this.workTaskRecord = workTaskRecord;
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


}

