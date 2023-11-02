class code8{
         static void fun(int arr[]){
	        for(int x : arr){
		       System.out.println(x);
		}
		for(int i=0;i<arr.length;i++){
		      arr[i] = arr[i] + 50;
		}
		
	 }
	 public static void main(String[]arfs){
	       int arr [] = { 50 , 100 ,150};
	       
	       fun(arr);
	       for(int x : arr){
	           System.out.println(x);
	       }
	 }
}
