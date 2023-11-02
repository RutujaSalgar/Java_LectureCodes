interface Demo {
        static void fun(){
	     System.out.println("Fun");
	}
	default void gun(){
	   System.out.println("In fun Demo");
	}
}
