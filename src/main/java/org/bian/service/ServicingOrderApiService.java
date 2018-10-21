/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ServicingOrderApiService {

	ServicingOrderBaseWithId executePost(ServicingOrderBase request);
	
	ServicingOrderBaseWithId executePut(String crReferenceId, ServicingOrderBase request);
	
	ServicingOrderRecordResponse record(String crReferenceId, ServicingOrderRecordRequest request);
	
	ServicingOrderBaseWithId requestPost(ServicingOrderBase request);
	
	ServicingOrderBaseWithId requestPut(String crReferenceId, ServicingOrderBase request);
	
	ServicingOrderBaseWithId retrieve(String crReferenceId);
	
	ServicingOrderApprovalBaseWithIdAndRoot retrieveApprovals(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	ServicingOrderRecordBaseWithIdAndRoot retrieveRecords(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	ServicingOrderTaskBaseWithIdAndRoot retrieveTasks(String crReferenceId, String bqReferenceId);
	
	ServicingOrderBaseWithId update(String crReferenceId, ServicingOrderBase request);
	
}
