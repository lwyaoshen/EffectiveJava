package cha2.item3;
/**
 * 
 * @ClassName:       Singleton2
 * @Description:    ������һ��������ʹ�õ����ӣ�������ʽΪ��������Ϊ�˱�֤�̰߳�ȫ��ʹ����˫�ؼ�������ķ�ʽ
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
