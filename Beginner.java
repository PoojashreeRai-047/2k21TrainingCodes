package athtutorial;
class Optrs
{
	int BasicArith() 
	{
		System.out.println("   BAsicMethod");
		float a=19, b=3;
		int a1=19,b1=3;
		System.out.println("FloatArithmetics     IntArithmetics ");
//		                    19.0/3.0= 6.3333335  
		float s=a+b;
		int s1=a1+b1;
		System.out.println(a+"+"+b+"= "+ s+"        "+a1+"+"+b1+"= "+ s1);
		s=a-b; s1=a1-b1;
		System.out.println(a+"-"+b+"= "+ s+"        "+a1+"-"+b1+"= "+ s1);
		s=a/b; s1=a1/b1;
		System.out.println(a+"/"+b+"= "+ s+"   "+a1+"/"+b1+"= "+ s1);
		s=a%b; s1=a1%b1;
		System.out.println(a+"%"+b+"= "+ s+"         "+a1+"%"+b1+"= "+ s1);
		s=a*b; s1=a1*b1;
		System.out.println(a+"*"+b+"= "+ s+"        "+a1+"*"+b1+"= "+ s1);
//		19.0/3.0= 6.3333335  
		return 0;
	}
	int PrifixOpts() 
	{
		System.out.println("   PrifixOptsMethod");
		int a=89,b=59;
		System.out.println("a="+a+"\nprefixing \na="+ ++a);
		System.out.println("\nb="+b+"\npostfixing \nb="+ b++ +"\n b="+b);
		
		return 0;
	}
	int CompoundAssign() 
	{
		System.out.println("   CompoundAssign Method");
		
		int a=5,b=90;
		a -=1;  //a=4
		b /=10; //b=9
		b *=2;  //b=18
		int c=220;
		c/=b+a; //by22 =10
		System.out.println("a="+a +"\nb="+b+"\nc="+c);
		
		return 0;	
	}
	int OpPrecedence() 
	{
		System.out.println("   OpPrecedence Method");
		int h=2,q=9,e=14,r=5,n,m;
		n=e*r/q-h;
		m=(e*r)/(q-h);
		System.out.println("n="+n+"\nm="+m);
		
		return 0;	
	}
}
class Letsget
{
	int variables(int q)
	{
		System.out.println("   variables ParaMethod ");
		int i=543443689;
		byte b=90;
		short s2=23000;
		long l=5423234765433456789l;
		
		char gogo='U';
		char ugo='\u00DA'; // a unicode char
		System.out.println(gogo +"\n"+ ugo);
		
		boolean t=true;
		boolean f=false;
		
		int s=i+b,v=s+q;
		return q;	
	}
	int values() 
	{
		System.out.println("   values Method ");
		int fv,sv;
		fv=100;
		sv=fv;
		fv=20;
		System.out.println("sv="+sv +"\nfv="+ fv);
		
//		same example for switching numbers
		int a,b,temp;
		a=3;b=40;
		System.out.println("B4... Switching a="+a +"  b="+b);
		temp=a; // storing a value in TEMP
		a=b;    // storing B value in A
		b=temp; // TAKING BACK  a value FROM TEMP ,storing a.TEMP value in B
		System.out.println("After Switching a="+a +"  b="+b);
		return 0;
	}	
}
public class Beginner 
{
	static int q=6;
	public static void FirstJavaApp() 
	{
		System.out.println("   FJA Method ");
		System.out.println("heha hahahaha"+ q++);
		//sysout ctrl+space
				System.out.println(  "First line from my App"  );
				System.out.println("  Second line from my App  -  ");
				System.out.println("Third line from my App ")   ;
		//commenting
				//single line comment
				/*
				 multi 
				 line 
				 comment 
				 //Nesting comments
				 */
				System.out.println(/*"Third line from my App"*/ "its different"+ q++ +q);
				System.out.println(q);
	}
	
	public Beginner()
	{
		System.out.println("Static Method from same class");
		FirstJavaApp();
		
		System.out.println("\n\nMethods from Letsget class");
		Letsget l= new Letsget();
		l.variables(4);
		l.values();
		
		System.out.println("\n\nMethods from Optrs class");
		Optrs o=new Optrs();
		o.BasicArith();
		o.PrifixOpts();
		o.CompoundAssign();
		o.OpPrecedence();
		
		System.out.println("\n\nMethods from TypCst class");
		TypCst t= new TypCst();
		t.impli();
		t.expli();
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Static Method from same class");
		FirstJavaApp();
		
		System.out.println("\n\nMethods from Letsget class");
		Letsget l= new Letsget();
		l.variables(4);
		l.values();
		
		System.out.println("\n\nMethods from Optrs class");
		Optrs o=new Optrs();
		o.BasicArith();
		o.PrifixOpts();
		o.CompoundAssign();
		o.OpPrecedence();
		
		System.out.println("\n\nMethods from TypCst class");
		TypCst t= new TypCst();
		t.impli();
		t.expli();
		
	}
}
class TypCst
{
	TypCst(){System.out.println("  DEfault Constructor");}
	
	int impli() 
	{
		System.out.println("   Implicit Conversion");
		int i=7;
		float f=i;
		System.out.println("int i="+i+"\nfloat f="+f);
		return 0;		
	}
	int expli() 
	{
		System.out.println("   Explicit Conversion");
		long l= 44;
		int i=(int) l;
		System.out.println("long l="+l+"\nint i="+i);
		return 0;	
	}
}