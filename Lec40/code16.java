class code16{
   public static void main(String[]args){
       int arr[][]=new int[3][3];
       int arr2[][]={{1,2,3},{ 4,5,6 },{7,8,9,}};

       int x =0;
       for(int i= 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
	          arr[i][j]=10+x;
		  x++;
	    }
       }
   }
}
