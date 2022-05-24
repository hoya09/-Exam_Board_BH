package org.study.sample.serivce;

import java.util.List;

import org.study.sample.model.BoardDTO;

public interface BoardService {
	void boardInsert(BoardDTO dto);
	List<BoardDTO> boardList();
	BoardDTO boardRead(String b_no);
	void boardUpdate(BoardDTO dto);
	void boardDelete(String b_no);
}
