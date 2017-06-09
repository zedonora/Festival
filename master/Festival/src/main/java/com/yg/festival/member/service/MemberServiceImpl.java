package com.yg.festival.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yg.festival.member.bean.MemberBean;
import com.yg.festival.member.dao.MemberDao;


@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDao memberDao;

	@Override
	public int insertMember(MemberBean bean) throws Exception {
		return memberDao.insertMember(bean);
	}

	/**로그인**/
	@Override
	public int login(MemberBean memberBean) throws Exception {
		return memberDao.login(memberBean);
	}
	
	/**회원 정보 가져오기**/
	@Override
	public MemberBean selectLoginMember(MemberBean bean) throws Exception {
		return memberDao.selectLoginMember(bean);
	}
	
	/**회원 정보 가져오기**/
	@Override
	public MemberBean selectJoinMember(MemberBean bean) throws Exception {
		return memberDao.selectJoinMember(bean);
	}

	/**여러명 회원 정보 가져오기**/
	@Override
	public List<MemberBean> selectMemberList(MemberBean bean) throws Exception  {
		return memberDao.selectMemberList(bean);
	}

	/**회원 정보 수정**/
	@Override
	public int updateMember(MemberBean bean) throws Exception {
		return memberDao.updateMember(bean);
	}
	
	/**회원 삭제**/
	@Override
	public void deleteMember(MemberBean bean) throws Exception {
		memberDao.deleteMember(bean);
	}

	/**회원 아이디 중복 체크**/
	@Override
	public int chkId(MemberBean memberBean) throws Exception {
		return memberDao.chkId(memberBean);
	}
	
	/**회원 아이디 찾기**/
	@Override
	public MemberBean selectMemberId(MemberBean memberBean) throws Exception {
		return memberDao.selectMemberId(memberBean);
	}
}
