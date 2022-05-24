package org.study.sample.serivce;

import java.util.List;

import org.study.sample.model.ReplyDTO;

public interface ReplyService {

	void replyInsert(ReplyDTO dto);

	List<ReplyDTO> replyShow(String r_boardNum);

	void replyDelete(String r_no);
	
}
