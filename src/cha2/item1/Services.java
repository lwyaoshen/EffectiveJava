package cha2.item1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 
 * @ClassName:       Services
 * @Description:    �����þ�̬�������湹����
 * �ŵ㣺1�����������ơ��ͻ��˵��õ�ʱ�����֪�⣬���������Ķ�������getInstance�������û����õ�ʱ�����֪�⣬��֪�����ø÷������Ի�����������һ��ʵ������һ�����ж����ͬǩ���Ĺ�������ʱ�򣬾��þ�̬�����������湹�������������û���֪���õ����ĸ������������⡣
 *		2������ÿ�ε������ǵ�ʱ�򶼴���һ���¶����������ڵ�ʵ������ʹ�÷ǳ��㷺�����������оٵ�Watchdog.java�е�getIns����������sWatchdog����ʵ����ֻ������һ�Σ�������Ҫ��Watchdog���ʵ���ĵط���ֻ��Ҫ����getInstance()����һ�Σ��Ϳ��Ի�ȡ�ö��󣬼򵥷��㡣
 *	    3�����Է���ԭ�������͵��κ������Ͷ��������Ҫ���ݴ��빤����̬�����Ĳ�����ʵ�֣�ֻҪ���������ķ������͵������ͣ����ǿ��Եġ���Ϊ����ѡ�񷵻ض���������ṩ������ԡ�
 *      4����������������ʵ����ʱ��ʹ�ô�����Ӽ�ࡣ
 *
 *�������ƣ�
 *valueOf �÷������ص�ʵ�������������ͬ��ֵ��ʵ��������ת��������
 *	of  valueOf��һ�������EnumSet��
 *	getInstance Singleton����ģʽ������Ψһ��ʵ����
 *	newInstance ���ص�ʵ����һ���µ�ʵ������֮ǰ���صĶ�����ͬ��
 *	getType ��getInstanceһ���������ڹ����������ڲ�ͬ����ʱ��ʹ�á�
 *	newType ��getInstanceһ���������ڹ����������ڲ�ͬ����ʱ��ʹ�á�
 * @author:         yangsheng
 */
public class Services {
    private Services() {
    } // Prevents instantiation (Item 4)

    // Maps service names to services
    //�����ע��ͷ���
    //��һ��Map������ṩ������ֺ��ṩ�ߵĶ���
    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();
    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    // Provider registration API
    //ע��Ĭ�ϵ��ṩ��
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }
    //��νע������ڼ���Map
    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    // Service access API
    //ʹ�������������ʵ��
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    //������ʱ�򿴻�������û��provider
    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null)
            throw new IllegalArgumentException(
                    "No provider registered with name: " + name);
        return p.newService();
    }
}