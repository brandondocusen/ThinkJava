

//Find the accumulative product of the elements of an array containing 5 integer values. 


public class accumulativeProduct {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int accumunlation = 1;

        for (int i = 0; i < numbers.length; i++) {
            accumunlation *= numbers[i];
        }

        System.out.println("accumunlation of the array: " + accumunlation);
    }
}