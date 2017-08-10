package cha2.item3;
/**
 * 
 * @ClassName:       Singleton4
 * @Description:    获取资源的方式很简单，只要 SomeThing.INSTANCE.getInstance() 即可获得所要实例。下面我们来看看单例是如何被保证的： 
 *					首先，在枚举中我们明确了构造方法限制为私有，在我们访问枚举实例时会执行构造方法，同时每个枚举实例都是static final类型的，也就表明只能被实例化一次。在调用构造方法时，我们的单例被实例化。 
 * 					也就是说，因为enum中的实例被保证只会被实例化一次，所以我们的INSTANCE也被保证实例化一次。 
 * @author:         yangsheng
 */
public class Singleton4 {
public static void main(String[] args) {
	SomeThing.INSTANCE.getInstance();
}
}
 enum SomeThing {  
    INSTANCE;  
    private Singleton4 instance;  
    SomeThing() {  
        instance = new Singleton4();  
    }  
    public Singleton4 getInstance() {  
        return instance;  
    }  
}
