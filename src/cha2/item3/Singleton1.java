package cha2.item3;
/**
 * 
 * @ClassName:       Singleton1
 * @Description:    ����ʽ������.�ڵ�һ�ε��õ�ʱ��ʵ�����Լ�  
 * @author:         yangsheng
 */
public class Singleton1 {
	 private Singleton1() {}  
	    private static Singleton1 single=null;  
	    //��̬��������   
	    public static Singleton1 getInstance() {  
	         if (single == null) {    
	             single = new Singleton1();  
	         }    
	        return single;  
	    }  
}
