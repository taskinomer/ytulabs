package tr.edu.yildiz.dao;

import tr.edu.yildiz.domain.Member;

import java.util.Date;
import java.util.List;

public interface MemberDao extends BaseDao<Member> {

    List<Member> getMembersByRegistrationDate(Date startDate, Date endDate);

    List<Member> getMembersByProductCategoryId(Integer categoryId);
}
