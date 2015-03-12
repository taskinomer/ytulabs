package tr.edu.yildiz.test.dao;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tr.edu.yildiz.dao.MemberDao;
import tr.edu.yildiz.domain.Member;
import tr.edu.yildiz.test.GenericTest;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MemberDaoTest extends GenericTest {

    @Autowired
    private MemberDao memberDao;

    @Test
    public void shouldFindAll() {

        List<Member> members = memberDao.findAll();

        Assert.assertNotNull(members);
    }

    @Test
    public void shouldSaveMember() {
        Member member = new Member();
        member.setFirstName("dummy");
        member.setLastName("user");

        memberDao.saveOrUpdate(member);

        Assert.assertTrue(memberDao.findAll().size() > 0);

    }

    @Test
    public void shouldFindMembersByRegistrationDate()
    {
        Date startDate = populateDate(2015, 1, 1);
        Date endDate = populateDate(2015, 3, 13);

        List<Member> members = memberDao.getMembersByRegistrationDate(startDate, endDate);
        System.out.println(members.size());
    }

    @Test
    public void shouldFindMembersWhichHasProductWithGivenCategoryId() {
        List<Member> members = memberDao.getMembersByProductCategoryId(2);
        System.out.print(members.size());
    }

    private Date populateDate(Integer year, Integer month, Integer day)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);

        return calendar.getTime();
    }
}
