package com.hk.answerboard.daos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hk.answerboard.dtos.AnswerDto;

@Repository
public class AnswerDao implements IAnswerDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String namespace="com.hk.ansboard.";
	
	@Override
	public List<AnswerDto> getAllList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean insertBoard(AnswerDto dto) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean readCount(int seq) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public AnswerDto getBoard(int seq) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean updateBoard(AnswerDto dto) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean mulDelBoard(String[] seq) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean replyBoard(AnswerDto dto) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int replyBoardUpdate(int seq) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int replyBoardInsert(AnswerDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public AnswerDto getBoardAjax(int seq) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
