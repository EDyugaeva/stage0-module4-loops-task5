package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printCross(int sideLength) {
        int centre = sideLength / 2;

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (j == centre || i == centre ) {
                    System.out.print("8");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println("");

        }


    }

    public static void main(String[] args) {
        printCross(5);
    }
}
