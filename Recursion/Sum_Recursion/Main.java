// import Recursion.recursion_fibonacci; // Uncomment this if you have a class named recursion_fibonacci in a package named Recursion

// No package declaration needed

public class Main {
    public static void main(String[] args) {
        Main mainInstance = new Main();
        int myFinal;
        myFinal = mainInstance.sum(5);
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
}