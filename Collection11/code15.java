import java.util.*;
class code15{
        public static void main(String[]args){
	                ArrayList al=new ArrayList();
			al.add(10);
			al.add(30);
			al.add(20);
			al.add(40);

			System.out.println(al);

			al.forEach (
					(data) -> System.out.println(data)
				   );
	}
}
