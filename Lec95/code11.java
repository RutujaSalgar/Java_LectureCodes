import java.io.*;
class Player implements Serializable{
             int jerNo=0;
	     String name=null;
          Player (int jerNo ,String name){
	           this.jerNo=jerNo;
		   this.name=name;
	  }
}
class code11{
          public static void main(String[]args)throws IOException{
	        Player obj=new Player( 1,"KLRahul");
		Player obj1=new Player(45,"Rohit");

		FileOutputStream fos=new FileOutputStream("Player.txt");

                ObjectOutputStream oos =new ObjectOutputStream(fos);

                oos.writeObject(obj);
                oos.writeObject(obj1);

                oos.close();
                oos.close();		
	  }
}
