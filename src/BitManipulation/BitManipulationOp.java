package BitManipulation;

public class BitManipulationOp {
    static void bitManipulation(int num, int i) {
        // Get the i-th bit (1-based index)
        int getIthBit = (num & (1 << (i - 1))) != 0 ? 1 : 0;

        // Set the i-th bit
        int setIthBit = num | (1 << (i - 1));

        // Clear the i-th bit
        int clearIthBit = num & ~(1 << (i - 1));

        // Print the results as space-separated values
        System.out.print(getIthBit + " " + setIthBit + " " + clearIthBit);
    }

    public static void main(String[] args) {
        // Example usage
        bitManipulation(70, 3); // Example input: num = 70, i = 3
    }
}
