class ControlStatements {
    public static void main(String[] args) {

        // if, else if, else
        int num = 10;
        if (num < 0) {
            System.out.println("* Negative number");
        } else if (num == 0) {
            System.out.println("* Zero");
        } else {
            System.out.println("* Positive number");
        }

        // switch
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("* Monday");
                break;
            case 2:
                System.out.println("* Tuesday");
                break;
            default:
                System.out.println("* Other Day");
        }

        // while loop
        int i = 1;
        while (i <= 3) {
            System.out.println("* while loop: " + i);
            i++;
        }

        // do-while loop
        int j = 1;
        do {
            System.out.println("* do-while loop: " + j);
            j++;
        } while (j <= 3);

        // for loop with continue and break
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                System.out.println("* Skipping 3");
                continue;
            }
            if (k == 5) {
                System.out.println("* Breaking at 5");
                break;
            }
            System.out.println("* for loop: " + k);
        }

        // nested loop
        for (int m = 1; m <= 2; m++) {
            for (int n = 1; n <= 2; n++) {
                System.out.println("* Nested loop m=" + m + " n=" + n);
            }
        }

        // jump using return
        System.out.println("* Before return");
        if (true) return;
        // this line will never be printed
        // System.out.println("* After return");
    }
}