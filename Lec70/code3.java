class Demo{
            Demo(){
	          System.out.println("In constructor Demo");
	    }

}
class Demochild extends Demo{
             Demochild(){
	             System.out.println("In constructor Demochild");
	     }
}
class Parent{
             Parent(){ //(3) ithe aalyavr  parent madhil sop print houn parat return child chya constructor madhe jail(2) kade
	          System.out.println("In parent constructor");
	     }
	     Demo m1(){
	          System.out.println("In m1-parent"); //he print nhi honar karan parent cha reference aani child cha object banvla ahe
		  return new Demo() ;
	     }
}
class child extends Parent {
	             child(){   //(2) ithe allyavr super invoke houn parent constructor la call jato child chya .child cha parent class Parent ahe 
		          System.out.println("In constructor child");
		     }
		     Demochild m1(){
		              System.out.println("In m1-child");
			      return  new Demochild();
		     }
	    }
class client{
         public static void main(String[]args){
	      Parent p=new child();  //ithun child chya constructor la jump (1)
	      p.m1();
	}
}
