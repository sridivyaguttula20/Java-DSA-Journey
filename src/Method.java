public class Method {
    //declaration/defination
   static void print2Table(){
        for(int i=1;i<=10;i++){
            int ans = 2*i;
            System.out.println("->"+ans);
        }
    }
    static void printSum(int x,int y){
        System.out.println("SUM: "+(x+y));
    }
    static void printMultiplication(int a, int b){
        System.out.println("MULTIPLICATION: "+(a*b));
    }
    static int add(int p,  int q) {
        int sum = p+q;
        return sum;
    }
   static void solve(int n){
       System.out.println("inside solve :"+ n);
       n=n*10;
       System.out.println("inside solve :"+ n);
   }
    static void main() {
        int n =5;
        System.out.println("inside solve :"+ n);
        solve(n);
        System.out.println("inside solve :"+ n);
//        int result = add(12, 13);
//        System.out.println("Result: " + result);
//        printMultiplication(5,10);
//       printSum(5,10 );
//        System.out.println("hi");
//        //method call
//        print2Table();
//        System.out.println("Bye");

    }
}
