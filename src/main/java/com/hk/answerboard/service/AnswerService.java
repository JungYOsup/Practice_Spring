package com.hk.answerboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hk.answerboard.daos.IAnswerDao;
import com.hk.answerboard.dtos.AnswerDto;

@Service
public class AnswerService implements IAnsService{

	@Autowired
	private IAnswerDao answerDao;

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
	public AnswerDto getBoardAjax(int seq) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
