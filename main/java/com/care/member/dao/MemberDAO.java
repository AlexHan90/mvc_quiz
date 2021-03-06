package com.care.member.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.care.member.dto.MemberDTO;


@Repository
public class MemberDAO {
	private ArrayList<MemberDTO> list;
	
	public MemberDAO() {
		list = new ArrayList<MemberDTO>();
	}
	
	public void register(MemberDTO dto) {
		list.add(dto);   //저장하는 모습
	}
	
	public ArrayList<MemberDTO> getM() {
		return list;
	}
}
