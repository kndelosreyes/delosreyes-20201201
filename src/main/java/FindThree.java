

public class FindThree {
    String findThreeNumbers(int A[], int arraySize, int sum) {

        for (int i = 0; i < arraySize - 2; i++) {
            for (int j = i + 1; j < arraySize - 1; j++) {
                for (int k = j + 1; k < arraySize; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        return "[" + A[i] + ", " + A[j] + ", " + A[k] + "]";
                    }
                }
            }
        }
        return "[]";
    }
}
