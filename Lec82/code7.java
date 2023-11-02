import java.util.Scanner;
import arithFun.code6;
class code7{
        public static void main(String[]args){
	        Scanner sc=new Scanner(System.in);

		int x=sc.nextInt();
		int y=sc.nextInt();

		code6 obj=new code6(x ,y);
		

		System.out.println(obj.add());
	}
}
