import java.util.Properties;

/**
 * Created with IntelliJ IDEA .
 * User：uboxolnew
 * Date: 2016/4/8
 * Time: 16:07
 * To change this template use File | Settings | File Templates.
 */
public class CopyOfFactory {
    public static void main1(String args[]) {

        Fruit f= Factory.getInstance("Apple");//需要添加完整的类名称
        f.eat();

    }
    public static void main(String args[]) {
        Properties pro=new PropertiesOperate().getProperties();
        Fruit f= Factory.getInstance(pro.getProperty("apple"));
        f.eat();
    }

}
