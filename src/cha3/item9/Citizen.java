package cha3.item9;
/**
 * 
 * @ClassName:       Citizen
 * @Description:    ��дequalsһ����дhashCode
 * 					hashCode��д����
 * 					1��int result = 17;
    				2����ÿ���ؼ����Ҿ��þ�����ЩӰ��equals�������´���
      				2.1��int c; �����ݸ�������ͣ�
       				2.1.1���������f��boolean�ͣ�c = (f ? 0 : 1);
       				2.1.2���������f��byte��char��short��int�ͣ�c = (int)f;
       				2.1.3���������f��long�ͣ�c = (f ^ (f >>> 32));
       				2.1.4���������f��float�ͣ�c = Float.floatToIntBits(f);
       				2.1.5���������f��double�ͣ�c = (int)Double.doubleToLongBits(f);
       				2.1.6���������f��һ������c = f.hashCode();
       				2.1.7���������f��һ�����飬���������ÿ��Ԫ�أ�����2.2���е���������Щɢ��ֵ�������;
      				2.2��result = 37 * result + c
    				3��return result
    				equal��дԭ��
    				1���Է��ԣ������κηǿ�����x��x.equals(x)Ӧ�÷���true��
					2���Գ��ԣ������κ�����x��y�����x.equals(y)����true����ôy.equals(x)ҲӦ�÷���true��
					3�������ԣ������κ�����x��y��z�����x.equals(y)����true��y.equals(z)����true����ôx.equals(z)ҲӦ�÷���true��
					4��һ���ԣ����x��y���õĶ���û�з����仯����ô��������x.equals(y)Ӧ�÷���ͬ���Ľ����
					5���ǿ��ԣ���������ǿ�����x��x.equals(null)Ӧ�÷���false��
 * @author:         yangsheng
 */
public class Citizen {

	String id; // ���֤��
	String name; // ����
	int age; // ����
	String sex; // �Ա�

	// �ù��췽���Գ�Ա�������г�ʼ��
	public Citizen(String theId, String theName, int theAge, String theSex) {
		this.id = theId;
		this.name = theName;
		this.age = theAge;
		this.sex = theSex;
	}

	// ��дequals()����
	@Override
	public boolean equals(Object obj) {
		// ������Ҫ�ж�obj�Ƿ�Ϊnull�� ���Ϊnull������false
		if (obj == null) {
			return false;
		}
		// �жϲ��Ե��Ƿ�Ϊͬһ������
		// �����ͬһ��������ӹ���ɣ���Ӧ�÷���true
		if (this == obj) {
			return true;
		}
		// �ж����ǵ������Ƿ���ȣ�
		// �������ȣ���϶�����false
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		// �������д���Ķ�������ΪCitizen����
		Citizen c = (Citizen) obj;
		// �Ƚ�������������������Ƿ�һ�����Ϳ��Եó������������Ƿ����
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
