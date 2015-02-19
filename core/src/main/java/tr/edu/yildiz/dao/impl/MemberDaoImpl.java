package tr.edu.yildiz.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.edu.yildiz.dao.MemberDao;
import tr.edu.yildiz.domain.Member;

@Repository
@Transactional
public class MemberDaoImpl extends BaseDaoImpl<Member> implements MemberDao {
}
