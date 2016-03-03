import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * Unit test basic class
 * Created by yi on 16-3-3.
 */
public class UnitTestBase {

    private ClassPathXmlApplicationContext context;
    private String springXmlPath;

    public UnitTestBase () {}

    public UnitTestBase(String springXmlPath) {

        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before() {

        if (StringUtils.isEmpty(springXmlPath)) {
            springXmlPath = "classpath*:application.xml";
        }
        try {
            context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
            context.start();
        } catch (BeansException exception) {
            exception.printStackTrace();
        }
    }

    @After
    public void after() {
        context.destroy();
    }

    public Object getContext() {

        return context;
    }
    @SuppressWarnings("unchecked")
    protected <T> T getBean(String beanId) {
        return (T)context.getBean(beanId);
    }

    protected <T> T getBean(Class<T> tClass){
        return context.getBean(tClass);
    }
}
///~End of File