interface Demo{
       default void fun(){
            System.out.println("In fun");
       }
}
class Demochild implements Demo{

}
class code10{
        public static void main(String[]args){
	    Demochild obj = new Demochild();
	    obj.fun();
	}
}
