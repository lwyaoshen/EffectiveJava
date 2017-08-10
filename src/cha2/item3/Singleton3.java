package cha2.item3;
/**
 * 
 * @ClassName:       Singleton3
 * @Description:    饿汉式单例特点：线程安全，不能延时加载，效率较高。饿汉式在类创建的同时就实例化一个静态对象出来，不管之后会不会使用这个单例，都会占据一定的内存，但是相应的，在第一次调用时速度也会更快，因为其资源已经初始化完成，
 *					而懒汉式顾名思义，会延迟加载，在第一次使用该单例的时候才会实例化对象出来，第一次调用时要做初始化，如果要做的工作比较多，性能上会有些延迟，之后就和饿汉式一样了。
 * @author:         yangsheng
 */
public class Singleton3 {
	      //内部构建唯一实例
	private static Singleton3 instance = new Singleton3();
	      //私有化构造器
	 private Singleton3(){
	 }    
	 //公共静态方法获取唯一实例化对象
	  public static Singleton3 getInstance(){
	      return instance;
	  }
}
