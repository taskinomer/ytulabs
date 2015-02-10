package tr.edu.yildiz.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/tr/edu/yildiz/resources/spring/applicationContext.xml")
public class GenericTest {

    @Test
    public void initTest() {

    }
}
