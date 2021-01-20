class Main {
    /*alt+ 1458= ▓
'	alt+1457=▒
	alt+1456=░
	alt+24=↑
	alt+25=↓
	alt+26=◙*/

    // these will be printed if max <= 3
    static String d = "▓"; //3
    static String m = "▒"; //2
    static String l = "░"; //1
    // dividers
    static String divider = "[]";
    // use divider when boxes are present?
    static boolean forcedivider = false;

    // total printed
    static int total = 6000;
    // horizontal limit
    static boolean enablehorsplit = true;
    static int horlimit = 80;
    // max integer for each var
    static int max = 100;
    // sort integers?
    static boolean sort = false;

    public static void main(String[] args) {
        vals = shuffle(vals);
        printScreen();
    }

    static int vals[] = new int[total];

    public static int generate(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static int[] sort(int[] list) {
        if (sort) {
            long start = System.currentTimeMillis();
            // Bubble sort
            boolean swap = true;
            while (swap) {
                swap = false;
                for (int i = 0; i < list.length - 1; i++) {
                    if (list[i] > list[i + 1]) {
                        int temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                        swap = true;
                    }
                }
            }
            long end = System.currentTimeMillis();
        }
        return list;
    }

    public static int[] shuffle(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = generate(1, max);
        }
        list = sort(list);
        return list;
    }

    public static void printScreen() {
        int mode = 1;
        if (max <= 3) mode = 2;
        int hor = 0;
        for (int i = 0; i < vals.length; i++) {
            hor++;
            sendPixel(vals[i], mode);
            if (hor >= horlimit && enablehorsplit) {
                System.out.println();
                hor = 0;
            }
        }
    }


    public static void sendPixel(int darkness, int mode) {
        if (mode == 2) {
            if (forcedivider) System.out.print(divider.substring(0, 1));
            if (darkness == 3) {
                System.out.print(d);
            } else if (darkness == 2) {
                System.out.print(m);
            } else {
                System.out.print(l);
            }
            if (forcedivider) System.out.print(divider.substring(1));
        } else {
            System.out.print(divider.substring(0, 1) + darkness + divider.substring(1));
        }

    }
}
