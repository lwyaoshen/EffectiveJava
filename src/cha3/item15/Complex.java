package cha3.item15;
/**
 * 
 * @ClassName:       Complex
 * @Description:    ���һ�����ɱ���
 * 					1.���ṩ�κλ��޸Ķ���״̬�ķ���
 * 					2.��֤�಻�ᱻ��չ
 * 					3.���е�����final��
 * 					4.���е�����˽�е�
 * 					5.ȷ�������κοɱ�����Ļ��������ʹ�ñ�����copy��
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
