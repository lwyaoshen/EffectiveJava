package cha2.item2;
/**
 * 
 * @ClassName:       Person
 * @Description:    ����������캯������ʱҪ����ʹ�ù�����
 *	ʹ��buildģʽ��NutritionFacts cocaCola = new NutritionFacts.Build(240,8).calories(100).solium(35).carbohydrate(27).build();
 * @author:         yangsheng
 */
public class Person {  
    private int mAge;  
    private String mName;  
    private int mSex;  
    private Person(Builder builder) {  
        mAge = builder.mAge;  
        mName = builder.mName;  
        mSex = builder.mSex;  
    }  
    public static class Builder {  
        private int mAge;  
        private String mName;  
        private int mSex;  
        public Builder name(String name) {  
            mName = name;  
            return this;  
        }  
        public Builder age(int age) {  
            mAge = age;  
            return this;  
        }  
        public Builder sex(int sex) {  
            mSex = sex;  
            return this;  
        }  
        public Person build() {  
            return new Person(this);  
        }  
    }
    @Override
    public String toString() {
    	return "name:" + this.mName +";\n" + "age:" + this.mAge + ";\n" + "sex:" + (this.mSex==1?"��":"Ů"); 
    }
    public static void main(String[] args) {
		Person bob = new Builder().name("bob").age(12).sex(1).build();
		System.out.println(bob.toString());
	}
} 
