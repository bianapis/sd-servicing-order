/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ServicingOrderApiServiceImpl implements ServicingOrderApiService {

	public ServicingOrderBaseWithId executePost(ServicingOrderBase request){
		return JsonReader.read("executePost-ServicingOrderBaseWithId.json",new TypeReference<ServicingOrderBaseWithId>(){});
	}
	
	public ServicingOrderBaseWithId executePut(String crReferenceId, ServicingOrderBase request){
		return JsonReader.read("executePut-ServicingOrderBaseWithId.json",new TypeReference<ServicingOrderBaseWithId>(){});
	}
	
	public ServicingOrderRecordResponse record(String crReferenceId, ServicingOrderRecordRequest request){
		return JsonReader.read("record-ServicingOrderRecordResponse.json",new TypeReference<ServicingOrderRecordResponse>(){});
	}
	
	public ServicingOrderBaseWithId requestPost(ServicingOrderBase request){
		return JsonReader.read("requestPost-ServicingOrderBaseWithId.json",new TypeReference<ServicingOrderBaseWithId>(){});
	}
	
	public ServicingOrderBaseWithId requestPut(String crReferenceId, ServicingOrderBase request){
		return JsonReader.read("requestPut-ServicingOrderBaseWithId.json",new TypeReference<ServicingOrderBaseWithId>(){});
	}
	
	public ServicingOrderBaseWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-ServicingOrderBaseWithId.json",new TypeReference<ServicingOrderBaseWithId>(){});
	}
	
	public ServicingOrderApprovalBaseWithIdAndRoot retrieveApprovals(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ServicingOrderApprovalBaseWithIdAndRoot.json",new TypeReference<ServicingOrderApprovalBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public ServicingOrderRecordBaseWithIdAndRoot retrieveRecords(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ServicingOrderRecordBaseWithIdAndRoot.json",new TypeReference<ServicingOrderRecordBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ServicingOrderTaskBaseWithIdAndRoot retrieveTasks(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ServicingOrderTaskBaseWithIdAndRoot.json",new TypeReference<ServicingOrderTaskBaseWithIdAndRoot>(){});
	}
	
	public ServicingOrderBaseWithId update(String crReferenceId, ServicingOrderBase request){
		return JsonReader.read("update-ServicingOrderBaseWithId.json",new TypeReference<ServicingOrderBaseWithId>(){});
	}
	
}
