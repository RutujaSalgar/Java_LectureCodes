class code2{
      public static void main(String[]args){
            int arr[] = { 10, 20 , 30, 40};
	    code2 obj = new code2();
	    obj.fun(arr);
	    for(int x : arr){
	            System.out.println(x);
	    }

      }
      void fun(int [] arr){
         arr[1]=70;
	 arr[2]=80;
      }
}
