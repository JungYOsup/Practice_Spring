package com.hk.answerboard.daos;

<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.HashMap;
>>>>>>> 57f35aef3106ea06f60a4e9f57dd2d0070bc8f0b
import java.util.List;

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
		
		return sqlSession.selectList(namespace+"boardlist");
		
	}
	
	@Override
	public boolean insertBoard(AnswerDto dto) {
		int count=0;
		count=sqlSession.insert(namespace+"insertboard",dto);
		return count>0?true:false;
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
