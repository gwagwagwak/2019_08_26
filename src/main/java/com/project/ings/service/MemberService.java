package com.project.ings.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.ings.dao.MemberDao;
import com.project.ings.model.MemberVO;

@Service
public interface MemberService {
	/*public ArrayList<MemberVO> getMemberList();*/

	
	
	public List<MemberVO> getMemberList();
	public ArrayList<MemberVO> getNoramlMemberList();
	public ArrayList<MemberVO> getBusinessMemberList();
	
	public int getMemberCount();
	public void insertMember(MemberVO member);
	public MemberVO getMember(MemberVO member);
	public void updateMember(MemberVO member);
	public void deleteMember(MemberVO member);




}
