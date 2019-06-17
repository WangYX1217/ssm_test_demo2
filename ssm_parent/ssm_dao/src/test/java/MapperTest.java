import com.itheima.dao.ItemsMapper;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapperTest {

    @Test
    public void test01() {

        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext_dao.xml");
        ItemsMapper i = app.getBean(ItemsMapper.class);

        Items byId = i.findById(1);
        System.out.println(byId);
    }
}
