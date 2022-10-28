package school.mjc.stage0.loops.task5;

public class Triangle {
    public static void printTriangle(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength; j++) {
                if (j <= i || j ==0 || i == cathetusLength - 1) {
                    System.out.print("8");
                    continue;
                }
                System.out.print(" ");

            }
            System.out.println("");

        }

    }

    public static void main(String[] args) {
        printTriangle(8);
    }
}
