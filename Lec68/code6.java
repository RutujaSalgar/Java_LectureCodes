interface demo{
       int x =10;
       void fun();
}
class demochild implements demo{
       public void fun(){
            System.out.println(x);
       }
}
