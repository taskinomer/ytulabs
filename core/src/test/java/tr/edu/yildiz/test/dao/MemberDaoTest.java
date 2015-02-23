package tr.edu.yildiz.test.dao;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tr.edu.yildiz.dao.MemberDao;
import tr.edu.yildiz.domain.Member;
import tr.edu.yildiz.test.GenericTest;

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
}
