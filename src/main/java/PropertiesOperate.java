import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA .
 * User£ºuboxolnew
 * Date: 2016/4/8
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
public class PropertiesOperate {
    private Properties pro=null;
    private File file=new File("d:"+File.separator+"fruit.properties");

    public PropertiesOperate(){
        this.pro=new Properties();
        if(file.exists()){
            try {
                pro.loadFromXML(new FileInputStream(file));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            this.save();
        }
    }
    private void save(){
        this.pro.setProperty("apple","Apple");
        this.pro.setProperty("orange", "Orange");
        try {
            this.pro.storeToXML(new FileOutputStream(this.file),"Fruit");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Properties getProperties(){
        return this.pro;
    }
}
