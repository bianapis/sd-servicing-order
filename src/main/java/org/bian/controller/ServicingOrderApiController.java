/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class ServicingOrderApiController {

	@Autowired
	ServicingOrderApiService service;
	
	@Process.ExecutePost
	public BianResponse<ServicingOrderBaseWithId> executePost(@RequestBody BianRequest<ServicingOrderBase> bianRequest) {
		return BianResponse.forSuccess(service.executePost(bianRequest.getData()));
	}
	
	@Process.ExecutePut
	public BianResponse<ServicingOrderBaseWithId> executePut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ServicingOrderBase> bianRequest) {
		return BianResponse.forSuccess(service.executePut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<ServicingOrderRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ServicingOrderRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RequestPost
	public BianResponse<ServicingOrderBaseWithId> requestPost(@RequestBody BianRequest<ServicingOrderBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Process.RequestPut
	public BianResponse<ServicingOrderBaseWithId> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ServicingOrderBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<ServicingOrderBaseWithId> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("approvals")
	@Process.Retrieve
	public BianResponse<ServicingOrderApprovalBaseWithIdAndRoot> retrieveApprovals(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveApprovals(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("records")
	@Process.Retrieve
	public BianResponse<ServicingOrderRecordBaseWithIdAndRoot> retrieveRecords(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRecords(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("tasks")
	@Process.Retrieve
	public BianResponse<ServicingOrderTaskBaseWithIdAndRoot> retrieveTasks(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTasks(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<ServicingOrderBaseWithId> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ServicingOrderBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
