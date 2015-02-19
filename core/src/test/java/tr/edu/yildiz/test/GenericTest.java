package tr.edu.yildiz.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tr.edu.yildiz.dao.MemberDao;
import tr.edu.yildiz.domain.Member;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/tr/edu/yildiz/resources/spring/applicationContext.xml")
@Transactional
public class GenericTest {


    @Test
    public void initTest() {

    }
}
