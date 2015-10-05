    package vmwoct5;

public class TriangleArray {
    public static void main(String [] args) {
        int [][] iaa = new int[4][];
        for (int i = 0; i < iaa.length; i++) {
            iaa[i] = new int[i+1];
            for (int j = 0; j < iaa[i].length; j++) {
                iaa[i][j] = j + 1;
            }
            for (int j = 0; j < iaa[i].length; j++) {
                System.out.print(iaa[i][j] + " ");
            }
            System.out.println();       
        }
    }
}
