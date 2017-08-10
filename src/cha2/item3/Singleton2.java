package cha2.item3;
/**
 * 
 * @ClassName:       Singleton2
 * @Description:    以下是一个单例类使用的例子，以懒汉式为例，这里为了保证线程安全，使用了双重检查锁定的方式
 * @author:         yangsheng
 */
public class Singleton2 {  
    String name = null;  
        private Singleton2() {  
    }  
    private static volatile Singleton2 instance = null;  
  
    public static Singleton2 getInstance() {  
           if (instance == null) {    
             synchronized (Singleton2.class) {    
                if (instance == null) {    
                   instance = new Singleton2();   
                }    
             }    
           }   
           return instance;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public void printInfo() {  
        System.out.println("the name is " + name);  
    }  
  
}  
