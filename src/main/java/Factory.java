/**
 * Created with IntelliJ IDEA .
 * User£ºuboxolnew
 * Date: 2016/4/8
 * Time: 16:03
 * To change this template use File | Settings | File Templates.
 */
public class Factory {
    public static Fruit getInstance(String className){
        Fruit f=null;
        try{
            f=(Fruit)Class.forName(className).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }
}
