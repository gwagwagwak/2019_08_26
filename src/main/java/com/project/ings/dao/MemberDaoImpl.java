package com.project.ings.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.ings.model.MemberVO;



@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Inject
	private SqlSession sqlSession;
	
	/* public void setSqlSession(SqlSession sqlSession){
	        this.sqlSession = sqlSession;
	    }*/

	private static final String Namespace = "com.project.ings.memberMapper";

	
	
	@Override
	public List<MemberVO> getMemberList() {
		// TODO Auto-generated method stub
		
		 return sqlSession.selectList(Namespace+".getMemberList");

		
		/*return null;*/
	}

	@Override
	public ArrayList<MemberVO> getNoramlMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberVO> getBusinessMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMemberCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertMember(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberVO getMember(MemberVO member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMember(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

}
