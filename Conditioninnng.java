package athtutorial;

public class Conditioninnng 
{
  /*	
	public Conditioninnng()
	{
		System.out.println("Conditioning");
	}
  */	
	
	
	
//   /*	
	public static void main(String[] args) 
	{
		System.out.println("Conditioninnng - Main ()");
		
		Relation r= new Relation(); System.out.println("\nRelation -");
		r.oprts();
		r.CondAssign();
		
		IfElse i=new IfElse();System.out.println("\nIfElse -");
		i.ife();
		i.chainIf();
		
		Logical l=new Logical(); System.out.println("\nLogic -");
		l.optrs();
		l.conditionalOptrs();
		l.sSwitchstmntss();
	}	
//   */	
}

class Logical 
{
	int a=9,b=90,c=69;
	boolean done=false;
	
	int optrs() 
	{
		System.out.println("--Optrs--");
		if(a<b & c<b) {System.out.println("And optr B ");}
		if(a<b | c>b) {System.out.println("OR optr B C ");}
		if(a<b ^ c>b) {System.out.println("EX-OR optr 01 10");}
		if(!done) {System.out.println("Not optr  FALSE");}		
		else System.out.println("NOT OPTR");
		
		return 0;		
	}
	int conditionalOptrs()
	{
		boolean a=true,b=false,c=true,d=false;
		System.out.println("--conditionalOptrs--");
		if(a && b) {System.out.println("if left is true >> executes right side\n if both are true then excutes");}
		else {System.out.println("Left wasn't true stops execution");}
		
		if(a||b) {System.out.println("if left is false >> executes right side");}
		else {}
		
		return 0;
	}
	
	int sSwitchstmntss() 
	{
		System.out.println("--sSwitchstmntss--\nonly Primitive types supportes\n Byte,short,int,long,char");
		
		return a;
	}
}

class IfElse
{
	int a=89;
	int b=2;
	int ife() 
	{
		System.out.println("--ife--");
		
		if(a%b==0)
		   {System.out.println("Even");}
		else
		   {System.out.println("odd");}
		
		return 0;
	}
	
	int chainIf() 
	{
		System.out.println("--chainif--\na="+a+"\nb="+b);
		
		if(a<b) 
		  {System.out.println(b+" is greater");}
		else if(a>b) 
			{
				b=b+a;
				System.out.println(b+" is b");
			}
		else {System.out.println("false Stmnt"); }
		return 0;	
	}
}

class Relation
{
	int oprts() 
	{
		System.out.println("--oprts--\n>,>=,\n<,<=,\n==,!=");
		
		return 0;
		
	}
	int CondAssign() 
	{
		System.out.println("--CondAssign--");
		int val1=4;
		int val2=5;
		int v3= val1>val2 ?  val1:val2;
//		   res= condi     ?   tru:false;
		System.out.println("ConditionAssignment\nres= "+v3);
		return 0;
	}
}
