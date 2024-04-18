// import Recursion.recursion_fibonacci; // Uncomment this if you have a class named recursion_fibonacci in a package named Recursion

// No package declaration needed

public class Main {
    public static void main(String[] args) {
        Main mainInstance = new Main();
        int myFinal;

        myFinal = mainInstance.xpow(5,4);
        System.out.println(myFinal);
    }        

    public static int sum (int n){
        // Base case
        if (n==1){
            return 1;
        }
        else{
            return (n * sum(n-1));
        }
    }

    public static int xpow(int x, int n){
        // Base Case
        if (n == 0){
            return 1;
        }
        else{
            return (x * xpow(x, n-1));
        }
    }
}