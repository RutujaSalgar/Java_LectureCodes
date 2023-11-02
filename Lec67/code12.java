class Demo{
     static void fun(){
        System.out.println("In fun");
     }
}
class Demochild extends Demo{

}
class code12{
        public static void main(String[]args){
	    Demochild obj = new Demochild();
	    obj.fun();
	}
}
