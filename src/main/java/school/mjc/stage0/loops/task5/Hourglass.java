package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (i == 1 || i == height || j == i || i == height - j + 1) {
                    System.out.print("8");
                    continue;
                }
                if (height % 2 == 0) {
                    if (j == height / 2 || j == height / 2 + 1) {
                        System.out.print("8");
                        continue;
                    }

                } else {
                    if (j == height / 2 + 1 ) {
                        System.out.print("8");
                        continue;
                    }
                }

                System.out.print(" ");

            }
            System.out.println("");

        }


    }

    public static void main(String[] args) {
        printHourglassOfGivenSize(3);
    }
}

