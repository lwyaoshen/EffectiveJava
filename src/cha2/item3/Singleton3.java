package cha2.item3;
/**
 * 
 * @ClassName:       Singleton3
 * @Description:    ����ʽ�����ص㣺�̰߳�ȫ��������ʱ���أ�Ч�ʽϸߡ�����ʽ���ഴ����ͬʱ��ʵ����һ����̬�������������֮��᲻��ʹ���������������ռ��һ�����ڴ棬������Ӧ�ģ��ڵ�һ�ε���ʱ�ٶ�Ҳ����죬��Ϊ����Դ�Ѿ���ʼ����ɣ�
 *					������ʽ����˼�壬���ӳټ��أ��ڵ�һ��ʹ�øõ�����ʱ��Ż�ʵ���������������һ�ε���ʱҪ����ʼ�������Ҫ���Ĺ����Ƚ϶࣬�����ϻ���Щ�ӳ٣�֮��ͺͶ���ʽһ���ˡ�
 * @author:         yangsheng
 */
public class Singleton3 {
	      //�ڲ�����Ψһʵ��
	private static Singleton3 instance = new Singleton3();
	      //˽�л�������
	 private Singleton3(){
	 }    
	 //������̬������ȡΨһʵ��������
	  public static Singleton3 getInstance(){
	      return instance;
	  }
}
