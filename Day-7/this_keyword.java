package oops;
public class this_keyword {
   int a = 10,b = 30,c= 30;
   this_keyword(int a,int b,int c){
    this.a = a;
    this.b = b;
    this.c = c;
   }
   void sum (){
    int sum = a+b+c;
    System.out.println("Sum : "+sum);
   }
   public static void main(String[] args) {
       this_keyword ob = new this_keyword(1,2,3);
       ob.sum();
   }
}