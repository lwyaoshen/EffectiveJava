package cha2.item3;
/**
 * 
 * @ClassName:       Singleton4
 * @Description:    ��ȡ��Դ�ķ�ʽ�ܼ򵥣�ֻҪ SomeThing.INSTANCE.getInstance() ���ɻ����Ҫʵ��������������������������α���֤�ģ� 
 *					���ȣ���ö����������ȷ�˹��췽������Ϊ˽�У������Ƿ���ö��ʵ��ʱ��ִ�й��췽����ͬʱÿ��ö��ʵ������static final���͵ģ�Ҳ�ͱ���ֻ�ܱ�ʵ����һ�Ρ��ڵ��ù��췽��ʱ�����ǵĵ�����ʵ������ 
 * 					Ҳ����˵����Ϊenum�е�ʵ������ֻ֤�ᱻʵ����һ�Σ��������ǵ�INSTANCEҲ����֤ʵ����һ�Ρ� 
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
