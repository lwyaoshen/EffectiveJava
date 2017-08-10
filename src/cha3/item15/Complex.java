package cha3.item15;
/**
 * 
 * @ClassName:       Complex
 * @Description:    设计一个不可变类
 * 					1.不提供任何会修改对象状态的方法
 * 					2.保证类不会被拓展
 * 					3.所有的域都是final的
 * 					4.所有的域都是私有的
 * 					5.确保对于任何可变组件的互斥操作（使用保护性copy）
 * @author:         yangsheng
 */
public final class Complex {
	private final double re;
	private final double im;
	
	public Complex(double re,double im){
		this.re = re;
		this.im = im;
	}
	
	public double realPart(){
		return this.re;
	}
	public double imaginaryPart(){
		return this.im;
	}
	public Complex add(Complex c){
		return new Complex(re+c.re,im+c.im);
	}
	public Complex subtract(Complex c){
		return new Complex(re-c.re,im-c.im);
	}
	public Complex multiply(Complex c){
		return new Complex(re*c.re -im*c.im,re*c.im + im*c.re);
	}
	public Complex divide(Complex c){
		double temp = c.re*c.re+c.im*c.im;
		return new Complex((re*c.re+im+c.im)/temp,
				(im*c.re-re*c.im)/temp);
	}
	@Override
	public boolean equals(Object o){
		if(o==this){
			return true;
		}
		if(!(o instanceof Complex)){
			return false;
		}
		Complex c = (Complex)o;
		return Double.compare(re, c.re)==0&&Double.compare(im, c.im)==0;
	}
	@Override
	public int hashCode(){
		int result = 37;
		result = 31 * result + hashDouble(re);
		return result;
	}
	private int hashDouble(double val){
		long longBits = Double.doubleToLongBits((val));
		return (int)(longBits^(longBits>>>32));
	}
	@Override
	public String toString(){
		return "(re:" + re + "," + ",im:" + im + ")" ;
	}
}
