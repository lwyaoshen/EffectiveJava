package cha3.item9;
/**
 * 
 * @ClassName:       Citizen
 * @Description:    改写equals一定改写hashCode
 * 					hashCode改写规则
 * 					1）int result = 17;
    				2）对每个关键域（我觉得就是那些影响equals的域）如下处理：
      				2.1）int c; 并根据该域的类型：
       				2.1.1）如果该域f是boolean型，c = (f ? 0 : 1);
       				2.1.2）如果该域f是byte、char、short、int型，c = (int)f;
       				2.1.3）如果该域f是long型，c = (f ^ (f >>> 32));
       				2.1.4）如果该域f是float型，c = Float.floatToIntBits(f);
       				2.1.5）如果该域f是double型，c = (int)Double.doubleToLongBits(f);
       				2.1.6）如果该域f是一个对象，c = f.hashCode();
       				2.1.7）如果该域f是一个数组，遍历数组的每个元素，并按2.2）中的做法吧这些散列值组合起来;
      				2.2）result = 37 * result + c
    				3）return result
    				equal改写原则
    				1、自反性：对于任何非空引用x，x.equals(x)应该返回true。
					2、对称性：对于任何引用x和y，如果x.equals(y)返回true，那么y.equals(x)也应该返回true。
					3、传递性：对于任何引用x、y和z，如果x.equals(y)返回true，y.equals(z)返回true，那么x.equals(z)也应该返回true。
					4、一致性：如果x和y引用的对象没有发生变化，那么反复调用x.equals(y)应该返回同样的结果。
					5、非空性：对于任意非空引用x，x.equals(null)应该返回false。
 * @author:         yangsheng
 */
public class Citizen {

	String id; // 身份证号
	String name; // 名字
	int age; // 年龄
	String sex; // 性别

	// 用构造方法对成员变量进行初始化
	public Citizen(String theId, String theName, int theAge, String theSex) {
		this.id = theId;
		this.name = theName;
		this.age = theAge;
		this.sex = theSex;
	}

	// 重写equals()方法
	@Override
	public boolean equals(Object obj) {
		// 首先需要判断obj是否为null， 如果为null，返回false
		if (obj == null) {
			return false;
		}
		// 判断测试的是否为同一个对象，
		// 如果是同一个对象，无庸置疑，它应该返回true
		if (this == obj) {
			return true;
		}
		// 判断它们的类型是否相等，
		// 如果不相等，则肯定返回false
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		// 将参数中传入的对象造型为Citizen类型
		Citizen c = (Citizen) obj;
		// 比较两个对象的所有属性是否一样，就可以得出这两个对象是否相等
		if ((this.id) == (c.id) && (this.name).equals(c.name)
				&& (this.age) == (c.age) && (this.sex).equals(c.sex)) {
			return true;
		}else {
			return false;
		}

	}
	@Override
	public int hashCode(){  
		  int result = 17;  
		  result = 37 * result + Float.floatToIntBits(this.id.hashCode());  
		  result = 37 * result + Float.floatToIntBits(this.name.hashCode());  
		  result = 37 * result + Float.floatToIntBits(age); 
		  result = 37 * result + Float.floatToIntBits(this.sex.hashCode());  
		  return result;  
		}  
}
