package cha2.item1;
//服务提供者接口，用来提供服务
//这个接口时可选的，如果没有，下面的Map集合就可以直接存放Service对象
public interface Provider {
	Service newService();
}
