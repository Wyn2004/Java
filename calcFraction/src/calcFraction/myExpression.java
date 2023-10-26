package calcFraction;

public class myExpression{
	
	private myFraction f1;
	private String operator;
	private myFraction f2;

	public myExpression(myFraction f1, String ope, myFraction f2) {
		this.f1 = f1;
		this.operator = ope;
		this.f2 = f2;
	}
	
	public int GCD(int a, int b)	{
		while (a!=b)	{
			if (a>b)	a-=b; else b-=a;
		}
		return a;
	}
	
	public String sum()	{
		int a = f1.getNummerator()*f2.getDenominator()+f2.getNummerator()*f1.getDenominator();
		int b = f1.getDenominator()*f2.getDenominator();
		myFraction result = new myFraction((a/GCD(a,b)), (b/GCD(a,b)));
		return this.f1.toStringFraction() + this.operator + this.f2.toStringFraction()+"="+result.toStringFraction(); 

	}
//	
//	public String tostringExpression() {
//		
//		return this.f1.toStringFraction() + this.operator + this.f2.toStringFraction()+"="+; 
//	}
}