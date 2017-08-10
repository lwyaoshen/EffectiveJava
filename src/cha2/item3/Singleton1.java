package cha2.item3;
/**
 * 
 * @ClassName:       Singleton1
 * @Description:    懒汉式单例类.在第一次调用的时候实例化自己  
 * @author:         yangsheng
 */
public class Singleton1 {
	 private Singleton1() {}  
	    private static Singleton1 single=null;  
	    //静态工厂方法   
	    public static Singleton1 getInstance() {  
	         if (single == null) {    
	             single = new Singleton1();  
	         }    
	        return single;  
	    }  
}
