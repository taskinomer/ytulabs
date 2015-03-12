package tr.edu.yildiz.dao.impl;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.edu.yildiz.dao.MemberDao;
import tr.edu.yildiz.domain.Member;

import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class MemberDaoImpl extends BaseDaoImpl<Member> implements MemberDao {

    @Override
    public List<Member> getMembersByRegistrationDate(Date startDate, Date endDate) {
        List<Member> members = getSessionFactory().
                getCurrentSession().
                createCriteria(Member.class).
                add(Restrictions.between("registerDate", startDate, endDate)).list();

        return members;
    }

    @Override
    public List<Member> getMembersByProductCategoryId(Integer categoryId) {
        List<Member> members = getSessionFactory()
                .getCurrentSession()
                .getNamedQuery("Member.findByProductCategory")
                .setParameter("categoryId", categoryId).list();

        return members;
    }
}
