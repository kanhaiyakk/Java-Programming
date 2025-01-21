package Recurtion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        // Base case: if there's only one disk, move it directly from source to destination
        if (n==1){
            System.out.println("transfer disk "+n +" from "+ src + " to "+ dest);
            return;
        }
        // Recursive step 1: Move (n-1) disks from source to helper using destination as a helper
        towerOfHanoi(n-1,src,dest,helper);

        // Move the nth disk from source to destination
        System.out.println("transfer disk "+n +" from "+ src + " to "+ dest);

        // Recursive step 2: Move (n-1) disks from helper to destination using source as a helper
        towerOfHanoi(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n,"S","H","D");
    }
}
