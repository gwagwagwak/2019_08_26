package com.project.ings.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.ings.model.MemberVO;

@Repository
public interface MemberDao {
	
	public List<MemberVO> getMemberList();

	public ArrayList<MemberVO> getNoramlMemberList();

	public ArrayList<MemberVO> getBusinessMemberList();

	public int getMemberCount();

	public void insertMember(MemberVO member);

	public MemberVO getMember(MemberVO member);

	public void updateMember(MemberVO member);

	public void deleteMember(MemberVO member);

}
