class code4{
            public static void main(String[]rags){
	      int arr1[] ={10,200,300};
	      Integer arr2[] ={10,200,300};
              
	      for(int i = 0;i<arr1.length;i++){
	      System.out.println(System.identityHashCode(arr1[i]));
	    }

	    for(int i=0;i<arr2.length;i++){
	     System.out.println(System.identityHashCode(arr2[i]));
	    }


	    for(int i = 0;i<arr2.length;i++){
	         System.out.println(System.identityHashCode(arr2[i]));
	    }
}
}
