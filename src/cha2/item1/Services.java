package cha2.item1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 
 * @ClassName:       Services
 * @Description:    考虑用静态方法代替构造器
 * 优点：1）它们有名称。客户端调用的时候见名知意，而且易于阅读。比如getInstance方法，用户调用的时候见名知意，就知道调用该方法可以获得其所在类的一个实例。当一个类有多个相同签名的构造器的时候，就用静态工厂方法代替构造器，避免了用户不知道该调用哪个构造器的问题。
 *		2）不必每次调用它们的时候都创建一个新对象。尤其是在单实例类中使用非常广泛，比如上面列举的Watchdog.java中的getIns（）方法，sWatchdog对象实际上只创建了一次，其他需要用Watchdog类的实例的地方，只需要调用getInstance()方法一次，就可以获取该对象，简单方便。
 *	    3）可以返回原返回类型的任何子类型对象。这个主要根据传入工厂静态方法的参数来实现，只要是已声名的返回类型的子类型，都是可以的。这为我们选择返回对象的类型提供了灵活性。
 *      4）创建参数化类型实例的时候，使得代码更加简洁。
 *
 *常用名称：
 *valueOf 该方法返回的实例与参数具有相同的值，实际是类型转换方法。
 *	of  valueOf的一种替代，EnumSet。
 *	getInstance Singleton单例模式，返回唯一的实例。
 *	newInstance 返回的实例是一个新的实例，与之前返回的都不相同。
 *	getType 与getInstance一样，但是在工厂方法处于不同的类时候使用。
 *	newType 与getInstance一样，但是在工厂方法处于不同的类时候使用。
 * @author:         yangsheng
 */
public class Services {
    private Services() {
    } // Prevents instantiation (Item 4)

    // Maps service names to services
    //服务的注册和访问
    //用一个Map来存放提供这的名字和提供者的对象
    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();
    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    // Provider registration API
    //注册默认的提供者
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }
    //所谓注册就是在加入Map
    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    // Service access API
    //使用这个方法创建实例
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    //创建的时候看缓存里有没有provider
    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null)
            throw new IllegalArgumentException(
                    "No provider registered with name: " + name);
        return p.newService();
    }
}