import java.util.*;
import java.text.SimpleDateFormat;

class all {
    public static final String reset = "\033[0m"; // Text Reset

    // Regular Colors
    public static final String black = "\033[0;30m"; // BLACK
    public static final String red = "\033[0;31m"; // RED
    public static final String green = "\033[0;32m"; // GREEN
    public static final String yellow = "\033[0;33m"; // YELLOW
    public static final String blue = "\033[0;34m"; // BLUE
    public static final String purple = "\033[0;35m"; // PURPLE
    public static final String cyan = "\033[0;36m"; // CYAN
    public static final String white = "\033[0;37m"; // WHITE
    public static final String magent = "\u001B[95m";
    public static final String violet = "\u001B[35m";
    public static final String skyblue = "\u001B[36m";

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m"; // BLACK
    public static final String RED_BOLD = "\033[1;31m"; // RED
    public static final String GREEN_BOLD = "\033[1;32m"; // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m"; // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m"; // CYAN
    public static final String WHITE_BOLD = "\033[1;37m"; // WHITE
    public static final String BOLD = "\u001B[1m";

    // bold reset
    public static final String BOLD_RESET = "\u001B[0m";

    // Underline
    public static final String black_ul = "\033[4;30m"; // BLACK
    public static final String red_ul = "\033[4;31m"; // RED
    public static final String green_ul = "\033[4;32m"; // GREEN
    public static final String yellow_ul = "\033[4;33m"; // YELLOW
    public static final String blue_ul = "\033[4;34m"; // BLUE
    public static final String purple_ul = "\033[4;35m"; // PURPLE
    public static final String cyan_ul = "\033[4;36m"; // CYAN
    public static final String white_ul = "\033[4;37m"; // WHITE

    // _background colors
    public static final String black_bg = "\033[40m"; // BLACK
    public static final String red_bg = "\033[41m"; // RED
    public static final String green_bg = "\033[42m"; // GREEN
    public static final String yellow_bg = "\033[43m"; // YELLOW
    public static final String blue_bg = "\033[44m"; // BLUE
    public static final String purple_bg = "\033[45m"; // PURPLE
    public static final String cyan_bg = "\033[46m"; // CYAN
    public static final String white_bg = "\033[47m"; // WHITE

    public static final String change = "\u001B[7m";
    public static final String thick = "\u001B[1m";

    // _background color reset
    public static final String bgreset = "\u001B[49m";

    // High Intensity
    public static final String black_bt = "\033[0;90m"; // BLACK
    public static final String red_bt = "\033[0;91m"; // RED
    public static final String green_bt = "\033[0;92m"; // GREEN
    public static final String yellow_bt = "\033[0;93m"; // YELLOW
    public static final String blue_bt = "\033[0;94m"; // BLUE
    public static final String purple_bt = "\033[0;95m"; // PURPLE
    public static final String cyan_bt = "\033[0;96m"; // CYAN
    public static final String white_bt = "\033[0;97m"; // WHITE

    // Bold High Intensity
    public static final String black_bd_bt = "\033[1;90m"; // BLACK
    public static final String red_bd_bt = "\033[1;91m"; // RED
    public static final String green_bd_bt = "\033[1;92m"; // GREEN
    public static final String yellow_bd_bt = "\033[1;93m";// YELLOW
    public static final String blue_bd_bt = "\033[1;94m"; // BLUE
    public static final String purple_bd_bt = "\033[1;95m";// PURPLE
    public static final String cyan_bd_bt = "\033[1;96m"; // CYAN
    public static final String white_bd_bt = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String black_bg_bt = "\033[0;100m";// BLACK
    public static final String red_bg_bt = "\033[0;101m";// RED
    public static final String green_bg_bt = "\033[0;102m";// GREEN
    public static final String yellow_bg_bt = "\033[0;103m";// YELLOW
    public static final String blue_bg_bt = "\033[0;104m";// BLUE
    public static final String purple_bg_bt = "\033[0;105m"; // PURPLE
    public static final String cyan_bg_bt = "\033[0;106m"; // CYAN
    public static final String white_bg_bt = "\033[0;107m"; // WHITE

    public static Scanner sc = new Scanner(System.in);

    // //underline reset
    static String rstul = "\u001B[24m";

    // //blinking
    static String blink = "\u001B[5m";

    // //reset blinking
    static String rstblink = "\u001B[0m";

    // //italic
    static String ital = "\u001B[3m";

    static void sleep(int a) {
        try {
            Thread.sleep(a);
        } catch (InterruptedException e) {
        }
    }
}

class CurrentDate {
    static String time() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String a = formatter.format(date);
        return a;
    }
}
// display class

class billing {
    static double trainbillcalc(double amount, double gst, int totalseats) {
        amount = amount * totalseats;
        System.out.println("\t\t\t\t\t\t\t\tYour total amount will be: " + amount);
        gst = amount * gst;
        System.out.println("\t\t\t\t\t\t\tYour gst will be: " + gst);
        double totalamount = amount + gst;
        System.out.println("\t\t\t\t\t\t\t\tYour total amount will be:" + totalamount);
        return totalamount;
    }

    static void trainbill(int totalseats, String categ, String fromcity, String tocity, int trainno) {
        if ((categ.equalsIgnoreCase("1A"))) {
            double amount = 2000;
            double gst = 0.08;
            double totalamount = trainbillcalc(amount, gst, totalseats);
            all.sc.nextLine();
            test.selectpaymethod(totalamount);
            tickets.trainticket(totalamount, fromcity, tocity, trainno, totalseats);

        } else if ((categ.equalsIgnoreCase("2A"))) {
            double amount = 1000;
            double gst = 0.05;
            double totalamount = trainbillcalc(amount, gst, totalseats);
            all.sc.nextLine();
            test.selectpaymethod(totalamount);
            tickets.trainticket(totalamount, fromcity, tocity, trainno, totalseats);
        } else if ((categ.equalsIgnoreCase("3A"))) {
            double amount = 800;
            double gst = 0.01;
            double totalamount = trainbillcalc(amount, gst, totalseats);
            all.sc.nextLine();
            test.selectpaymethod(totalamount);
            tickets.trainticket(totalamount, fromcity, tocity, trainno, totalseats);
        } else if ((categ.equalsIgnoreCase("SL"))) {
            double amount = 500;
            double gst = 0.001;
            double totalamount = trainbillcalc(amount, gst, totalseats);
            all.sc.nextLine();
            test.selectpaymethod(totalamount);
            tickets.trainticket(totalamount, fromcity, tocity, trainno, totalseats);
        } else if ((categ.equalsIgnoreCase("CC"))) {
            double amount = 1800;
            double gst = 0.1;
            double totalamount = trainbillcalc(amount, gst, totalseats);
            all.sc.nextLine();
            test.selectpaymethod(totalamount);
            tickets.trainticket(totalamount, fromcity, tocity, trainno, totalseats);
        } else if ((categ.equalsIgnoreCase("EC"))) {
            double amount = 3500;
            double gst = 0.05;
            double totalamount = trainbillcalc(amount, gst, totalseats);
            all.sc.nextLine();
            test.selectpaymethod(totalamount);
            tickets.trainticket(totalamount, fromcity, tocity, trainno, totalseats);
        }
    }

    static void busbill(int[] arr, int count, String categ, int busnum) {
        if ((categ.equalsIgnoreCase("ac"))) {
            double amount = 1500 * count;
            System.out.println("Your total amount will be: " + amount);
            double gst = amount * 0.05;
            System.out.println("Your gst will be: " + gst);
            double totalamount = amount + gst;
            System.out.print("Your total amount will be:" + totalamount);
            all.sc.nextLine();
            test.selectpaymethod(totalamount);
            tickets.busticket(totalamount, categ, busnum, gst, amount, count);

        } else {
            double amount = 1000 * count;
            System.out.println("Your total amount will be: " + amount);
            double gst = amount * 0.05;
            System.out.println("Your gst will be: "+gst);
            double totalamount = amount + gst;
            System.out.print("Your total amount will be:" + totalamount);
            all.sc.nextLine();
            test.selectpaymethod(totalamount);
            tickets.busticket(totalamount, categ, busnum, gst, amount, count);
        }
    }

    static void uberbill(int persons, int stops, int choice, String name) {
        double amount = 0;
        double totalamount = 0;
        if (choice == 1) {
            amount = persons * stops * 10;
            System.out.print(all.skyblue + "\t\t\t\t\t\t\t\tTravel Amount        : " + all.reset);
            System.out.printf("%10s", amount);
            System.out.println();
            System.out.print(all.skyblue + "\t\t\t\t\t\t\t\tGST                  : " + all.reset);
            System.out.printf("%10s", 1.2 * amount);
            System.out.println();
            totalamount = amount + 1.2 * amount;
            System.out.print(all.skyblue + "\t\t\t\t\t\t\t\tTotal Payable Amount : " + all.reset);
            System.out.printf("%10s", amount + 1.2 * amount);
            System.out.println();
            test.selectpaymethod(totalamount);
            tickets.uberticket(amount, name, 0.2 * amount, totalamount);
        } else if (choice == 2) {
            amount = persons * stops * 15;
            System.out.print(all.skyblue + "\t\t\t\t\t\t\t\tTravel Amount        : " + all.reset);
            System.out.printf("%10f", amount);
            System.out.println();
            System.out.print(all.skyblue + "\t\t\t\t\t\t\t\tGST                  : " + all.reset);
            System.out.printf("%10f", 1.2 * amount);
            System.out.println();
            totalamount = amount + 1.2 * amount;
            System.out.print(all.skyblue + "\t\t\t\t\t\t\t\tTotal Payable Amount : " + all.reset);
            System.out.printf("%10f", amount + 1.2 * amount);
            System.out.println();
            test.selectpaymethod(totalamount);
            tickets.uberticket(amount, name, 0.2 * amount, totalamount);
        } else if (choice == 3) {
            amount = persons * stops * 20;
            System.out.print(all.skyblue + "\t\t\t\t\t\t\t\tTravel Amount        : " + all.reset);
            System.out.printf("%10f", amount);
            System.out.println();
            System.out.print(all.skyblue + "\t\t\t\t\t\t\t\tGST                  : " + all.reset);
            System.out.printf("%10f", 1.2 * amount);
            System.out.println();
            totalamount = amount + 1.2 * amount;
            System.out.println(all.skyblue + "\t\t\t\t\t\t\t\tTotal Payable Amount : " + all.reset);
            System.out.printf("%10f", amount + 1.2 * amount);
            System.out.print(amount);
            System.out.println();
            test.selectpaymethod(totalamount);
            tickets.uberticket(amount, name, 0.2 * amount, totalamount);
        }

    }
}

class display {
    public static void image() {
        // Existing pattern code
        // ...
        System.out.print("   \n");
        String pattern = "\r\n" + //
                "     \r\n" + //
                "                                         ,,,\r\n" + //
                "                                   ,\u2584\u2584\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2584\u2584\r\n"
                + //
                "                                 \u2584\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2584\r\n"
                + //
                "                                 \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u258C\r\n"
                + //
                "                                  \u2588\u2588\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2593\u2593\u2588\u2588\u2588\r\n"
                + //
                "                                  \u2588\u2588\u2592\u2592\u2562\u2562\u2592\u2592\u2562\u2562\u256B\u2593\u2593\u2593\u2588\u258C\r\n"
                + //
                "                                 \u2554\u2593\u258C\u2592\u2593\u2588\u2588\u2588\u2584\u2584\u2584\u2588\u2588\u2588\u2588\u2588\r\n"
                + //
                "                                 \u2551\u2593\u258C\u2592\u2592\u2593\u2593\u2580\u2592\u2560\u2588\u2588\u2588\u2588\u2593\u2588\u258C\r\n"
                + //
                "                                  \u2593\u2588\u2592\u2592\u2592@\u2584\u2584\u2551\u2593\u2593\u2592\u2593\u2593\u258C\r\n"
                + //
                "                                   \u2588\u2588\u258C\u2593\u2588\u2593\u2588\u2588\u2588\u2588\u2593\u2588\u2588\r\n"
                + //
                "                                    \u2580\u2588\u2588\u2593\u2593\u2593\u2593\u2593\u2593\u2588\u2588\u2592\u2557\u2556\u2556,\r\n"
                + //
                "                          ,\u00BF\u2565\u2556]\u2591\u2592\u2592\u2592\u2593\u2590\u2593\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2592\u2592\u2592\u2592\u256B\u2592\u2592\u2592\u2592\u2592\u2556\r\n"
                + //
                "                        \u2591\u2591\u2591\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2591\u2591\u2588\u2593\u2593\u2593\u2588\u2588\u2588\u2588\u2588\u2588\u2563\u2592\u2592\u2592\u2592\u2563\u2592\u2592\u2592\u2592\u2592\u2592\u2556\r\n"
                + //
                "                      \u2591\u2591\u2591\u2591\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2591\u2591\u2590\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2592\u2591\u2591\u2592\u2592\u2551\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\r\n"
                + //
                "                   \u2553\u2591\u2591\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2551\u2592\u2592\u2592\u2591\u2584\u2584\u2593\u2588\u2593\u2593\u2593\u2593\u2593\u2592\u2592\u2592\u2562\u258C\u2592\u2592\u2592\u2592\u2592\u2562\u2592\u2592\u255C\u2592\u2592\r\n"
                + //
                "                   ]\u2592\u2592\u2591\u2591\u2592\u2592\u2562\u2563\u2562\u2562\u2562\u2592\u2563\u2592\u2562\u2562\u2562\u2593\u2593\u2593\u2592\u2559\u2593\u2563\u2592\u2591@\u2562\u2563\u2592\u2591\u2592\u2592\u256B\u256B\u2562\u2592\u2592\u2591\u2592\u2591\u2556  \u2553@\u2593\u2588\u2588\u2588\u2584\r\n"
                + //
                "                \u2591\u2591\u2591\u2592\u2592\u2592\u2591\u2592\u2562\u2592\u2592\u2593\u2593\u2562\u2563\u2562\u2592\u2592\u2592\u2592\u2592\u2562\u2592\u2592\u2563\u2592\u2592\u2562\u2563\u2563\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u256B\u2562\u2592\u2592\u2592\u2591\u2591\u2591\u2592\u2592\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u258C\r\n"
                + //
                "            \u2591\u2591\u2591\u2591\u2591\u2591\u2592\u2592\u2592\u2592\u2562\u2562\u2563\u2593\u2593\u2563\u2593\u2593\u2563\u2562\u2592\u2592\u2563\u2592\u2592\u2592\u2563\u2592\u2592\u2592\u2562\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2563\u2560\u2592\u2592\u2592\u2591\u2591\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\r\n"
                + //
                "      *m\u00E7\u2591\u2591\u2591\u2592\u2591\u2592\u2592\u2592\u2592\u2592\u2592\u2562\u2562\u2593\u2593\u2593\u2593\u2593\u2580\u2593\u2593\u2562\u2562\u2563\u2592\u2592\u2562\u2563\u2592\u2592\u2592\u2592\u2562\u2592\u2591\u2591\u2592\u2563\u2592\u2592\u2592\u2592\u2562\u2563\u2562\u2592\u2593\u258C\u2592\u2591\u2591\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2580\r\n"
                + //
                "     ;\u2592\u2592\u2591\u2580\u2584\u2591\u2592\u2592\u2592\u2562\u2592\u256B\u256B\u2593\u2593\"  \"`   \u2593\u2562\u2562\u2562\u2563\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2562\u2592\u2592\u2562\u2592\u2562\u2592\u2562\u2563\u2592\u2592\u2562\u2563\u256B\u255C\u2592\u2556\u2591\u2591\u2591\u2591\u2588\u2588\u2588\u2588\u2580\u2580\r\n"
                + //
                "    \u2592\u2592\u2592\u2592\u2592\u2562\u2562\u2593\u2593\u2593\u2592\u2562\u2593\u2580`          \u255A\u2592\u2562\u2562\u2562\u2592\u2592\u2592\u2592\u2592\u2592\u2563\u2592\u2592\u2592\u2562\u255C\u2592\u2562\u2562\u2562\u2592\u2592\u2562\u2562\u2592\u2562\u2593 ]@\u2593\u2593\u2580\u2580\u2591\u2591\u2591\u2592,\r\n"
                + //
                "    \u2592\u2562\u2593\u2593\u2593\u2593\u2588\u2588\u2593\u2580\u255D               ]\u2592\u2562\u2563\u2563\u2592\u2592\u2592\u2591\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2562\u2592\u255C\u2592\u2592\u2562\u2592\u2592\u2592\u2593\u2593\u258C  \u256B\u2592\u2592\u2591\u2591\u2591\u2591\u2592\u2592\u2510\r\n"
                + //
                "    \u2588\u2588\u2588\u2588\u2580\u2580\u2588\u2580\u255F\u2593\u2593\u2584\u2584\u2584\u2584            \u2592\u2562\u2562\u2562\u2562\u2563\u2592\u2592\u2592\u2591\u2592\u2592\u2563\u2592\u2592\u2562\u2592\u2592\u2591\u2593\u2580\u2593\u2562\u2563\u2562\u2592L   \u2562\u2591@\u00A2\u2592\u2566\u2592\u2592\u2592\r\n"
                + //
                "    \u2584\u2593\u256C\u2592\u2592\u2562\u2562\u2593\u2588\u2588\u2588\u2592\u2592\u2588\u2588\u258C           \u2551\u2562\u2562\u2562\u2562\u2562\u2562\u2592\u2591\u2592\u2592\u2591\u2592\u2592\u2592\u2592\u2592\u2591\u2588\u2592\u2562\u2592\u2592\u2592\u2592\u2592\u00C7   ]\u2592\u2562\u2562\u2562\u2593\u2593\u2593\u2592\u2229\r\n"
                + //
                "    \u2588\u2588\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u258C\u2592\u2592\u2593\u2588\u258C, ,       \u255F\u2563\u2562\u2562\u2562\u2562\u2562\u2562\u2562\u2563@\u2592\u2592\u2592\u2592\u2591\u2591\u2592\u2588\u2588\u2592\u2591\u2591\u2592\u2592\u2592\u2592\u2593m   \u2563\u2562\u2563\u256B\u2593\u2593\u2588\u255C\r\n"
                + //
                "    \u2580\u2588\u2588\u2593\u2593\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2593\u2588\u2588\u2588\u2580\u2559\"       \u2551\u2592\u2591\u2591\u2592\u2592\u255C\u2562\u2562\u2562\u2562\u2562\u2563\u2556\u2592\u2592\u2591\u2590\u2593\u2593\u00E4@@\u2591\u2592\u2592\u2593\u2563\u2563,\u2560\u2592\u2563\u2562\u2562\u2593\u2593\u2580\r\n"
                + //
                "      \u2580\u2580\u2580\u2588\u2593M\u2580\u2593\u2580\u2580\u221E\u2590\u2593\u2588\u2588      ,   \u2593\u00D1\u2562\u2592\u2591\u2592\u2591\u2592\u2591\u2592\u2592\u2593\u2593\u2593\u2588\u2588\u2593\u2593\u2593\u2593\u2593\u2562\u2563\u2593\u2593\u2584\u2592\u2584\u2592\u2591\u2592\u2592\u2591\u2562\u2592@\r\n"
                + //
                "        \"\u2580\u2580\u2580\u2569\u2593\u2557   \u2590\u2593    ,\u2553\u2557\u2562\u2562\u2592\u2562\u2562\u2593\u2588\u2588\u2593\u2593\u2593\u2593\u2592\u2593\u2593\u2593\u2593\u2593\u2584\u2593\u2593\u258C\u2593\u2593\u2593\u2593\u2593\u2593\u2588\u2588\u2588\u2588\u2588\u2591\u2590\u258C\u2592\u2592\u2592\u2592\u2592\r\n"
                + //
                "                   \u2580N\u2565#\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2552\u2592\u2592\u2593\u2593\u2593\u2593\u2593\u2593\u2588\u2588\u2588\u2588\u2593\u2588\u2588\u2588\u258Cp\u2593\u258C\u2592\u2593\u2591\u2593\u2592\r\n"
                + //
                "                  \\,\u2592\u2592]\u2592\u2553\u2593\u2562\u255C\"\u2591\u2591\u2591`\u2559\u2559\u255C\u2580\u2593\u2593\u2593\u2593@\u2562\u2562\u2562\u2562\u2562\u2592\u2592\u2580\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2580\u2593\u2593\u258C\u2593\u2584\u2584\r\n"
                + //
                "                  \u2592\u2592\u2593\u2593\u2593\u2593\u2591` '        \u2559\u2591\u2592\u2592\u2592`\u2562\u2592\u2592\u2592\u2592\u2592\u2592\u2591\u2591\u2591\u2592\u2591\u2591\u2592\u2592\u2592\u2592\u2592\u2591\u2592\u2592\u2593\u2593\u255D '\u2580\r\n"
                + //
                "                \u2553\u2562\u2592\u2592\u2592\u2592\u255C \u2591              \u2592\u2592\u2592\u2592\u2563\u2562\u2562\u2592\u2562\u2592\u2562\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2592\r\n"
                + //
                "           ,\u2556\u2556\u2562\u2562\u2562\u2592\u2592\u2591\u2591\u2592 \u2553 \u2591\u2591             \u2559\u2592\u2592\u2592\u2592\u2592\u2562\u2563\u2563\u2563\u2562\u256B\u2591\u2591\u2591\u2591\u2591\u2553\u2592\u2592\u2592\u2592\u2592\u2592\u2556\r\n"
                + //
                "          \u2562\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2591 \u2591\u2591\u2591\u2591                 \u2551\u2592\u2592\u2592\u2592\u2562\u2562\u2562\u2562\u2562\u2593\u2563\u2593@\u2593\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2557\r\n"
                + //
                "         \u2592\u2592\u2592\u2562\u2563\u2563\u2562\u2592\u2591\u2591 \u2591\u2591\u2591                  ]\u2591\u2592\u2592\u2592\u2562\u2562\u2562\u2562\u2593\u2592\u2563\u2562\u2593\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\r\n"
                + //
                "        ]\u2563\u2592\u2562\u2562\u2562\u2562\u2562\u2592\u2591\u2591\u2591\u2592\u2592\u2591.                 \u2592\u2592\u2592\u2592\u2562\u2562\u2562\u2563\u2593\u2593\u2593\u2563\u2562\u2593\u2593\u2593\u2593\u2563\u2563\u2592\u2592\u2592\u2592\u2592\u2592\u2592\u2592\r\n"
                + //
                "        ]\u2562\u2562\u2562\u2562\u2562\u2563\u2593\u2592\u2591\u2591\u2591\u2592N\u2592\u2591\u2556   \u2591. \u2591.,;\u2592\u2591   \u2592\u2592\u2562\u2563\u2563\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2563\u2562\u2562\u2592\u2592\u2592\u2592\u2592\u2592\u2592\r\n"
                + //
                "        j\u2563\u256B\u2593\u2593\u2593\u2593\u2593\u2592\u2592\u2591\u2591\u2592\u2562\u2563\u2593\u2592\u2592\u2556          ,\u2565\u2562\u2592\u256B\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2588\u2588\u2593\u2593\u2593\u2593\u2593\u2563\u2562\u2563\u2563\u2592\u2592\u2592\u2592\u2592\r\n"
                + //
                "         \u2592\u2592\u2592\u2562\u2562\u2562\u2562\u2592\u2592\u2591\u2591\u2592\u2592\u2562\u2593\u2593\u2593@\u2592\u2592\u2556\u2556.,\u2553\u2556p\u256B\u2593\u2563\u2592\u2592\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2593\u2593\u2593\u2593\u2563\u2562\u2562\u2592\u2592\u2592\u2592\u2592\u2556\r\n"
                + //
                "         \u256B\u2593\u2593\u2593\u2593\u2591 '''\u2591\u2559\u2559\u2580\u2580\u2580\u2580\u2580\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2592\u2592\u2592\u2593\u2593\u2593\u2593\u2588\u2588\u2588\u2588\u2588\u2593\u2563\u255C\u2592\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2593\u2593\u2593\u2562\u2563\u2562\u2592\u2592\u2592\u2592\u2555\r\n"
                + //
                "         \u2590\u2593\u2593\u2593\u258C     \u2591 \u2591\u2591  `\u2591 \u2591   \u2591\u2591  ,\u2592]\u2592\u2591\u2592\u255C\u2580\u2580\u2593\u2593\u2584\u2592\u2562\u2562\u2563\u2562\u2562\u256B\u2593\u2588\u2588\u2588\u2588\u2588\u2588\u2593\u2593\u2593\u2563\u2563\u2562\u2563\u2562\u2592\u2592\r\n"
                + //
                "          \u2593\u2593\u2593\u2588\u2584\u2565g\u2584\u2584\u2584\u2584,,, `    ~ \u2591\u2591  \u2591\u2591'j ^ ,`\u2590\u2588\u2588\u2588\u2593\u2562\u2563\u2592\u2562\u256B\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2593\u2593\u2593\u2593\u2562\u2562\u2562\u2563\u2562\r\n"
                + //
                "          \u2593\u2593\u2593\u2588\u2593\u2593\u2563\u2592\u2592\u2593\u2588\u2588\u2562\u2593\u2593\u2593\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2584\u2584\u2584\u2584\u2565\u2584\u2584\u2584,,\u2588\u2588\u2588\u2593\u2593\u2593\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2593\u2593\u2593\u2593\u2563\u2562\u2562\u2563\u2593\r\n"
                + //
                "          \u255A\u2593\u2580\u2580\u2580\u255D\u255D\u255C\u255C\u2580\u2580\u2580\u2568\u2568\u255C\u2568\u2580\u2580\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2580\u2580\u2580\u255D\u2592\u2580\u2580\u2580\u2580\u2580\u2580\u2580\u2580\u2580\u2580\u2580\u2588\u2588\u2588\u2588\u2588\u2580\u2588\u2588\u2588\u2588\u2588\u255C\u2580\u2580\u2580\u2580\u2580\u2580\u2580\u2593\u2593\u2593\u2580\u2580\r\n"
                + //
                "\r\n" + //
                "\r\n" + // + //
                "";
        System.out.println("\n");
        char[] patternChars = pattern.toCharArray();
        try {
            for (char c : patternChars) {
                System.out.print(all.white_bg + all.yellow + c + all.reset + all.bgreset);
                Thread.sleep(5); // Adjust the sleep delay as needed
            }
        } catch (InterruptedException e) {
        }

        // Print the "Thank You" pattern
        String thankYouPattern = "                                                __     __                         __                                       \r\n"
                + //
                "                                                |  \\   |  \\                       |  \\                                      \r\n"
                + //
                "                                               _| \u2593\u2593_  | \u2593\u2593____   ______  _______ | \u2593\u2593   __      __    __  ______  __    __ \r\n"
                + //
                "                                             |   \u2593\u2593 \\ | \u2593\u2593    \\ |      \\|       \\| \u2593\u2593  /  \\    |  \\  |  \\/      \\|  \\  |  \\\r\n"
                + //
                "                                              \\\u2593\u2593\u2593\u2593\u2593\u2593 | \u2593\u2593\u2593\u2593\u2593\u2593\u2593\\ \\\u2593\u2593\u2593\u2593\u2593\u2593\\ \u2593\u2593\u2593\u2593\u2593\u2593\u2593\\ \u2593\u2593_/  \u2593\u2593    | \u2593\u2593  | \u2593\u2593  \u2593\u2593\u2593\u2593\u2593\u2593\\ \u2593\u2593  | \u2593\u2593\r\n"
                + //
                "                                               | \u2593\u2593 __| \u2593\u2593  | \u2593\u2593/      \u2593\u2593 \u2593\u2593  | \u2593\u2593 \u2593\u2593   \u2593\u2593     | \u2593\u2593  | \u2593\u2593 \u2593\u2593  | \u2593\u2593 \u2593\u2593  | \u2593\u2593\r\n"
                + //
                "                                               | \u2593\u2593|  \\ \u2593\u2593  | \u2593\u2593  \u2593\u2593\u2593\u2593\u2593\u2593\u2593 \u2593\u2593  | \u2593\u2593 \u2593\u2593\u2593\u2593\u2593\u2593\\     | \u2593\u2593__/ \u2593\u2593 \u2593\u2593__/ \u2593\u2593 \u2593\u2593__/ \u2593\u2593\r\n"
                + //
                "                                                \\\u2593\u2593  \u2593\u2593 \u2593\u2593  | \u2593\u2593\\\u2593\u2593    \u2593\u2593 \u2593\u2593  | \u2593\u2593 \u2593\u2593  \\\u2593\u2593\\     \\\u2593\u2593    \u2593\u2593\\\u2593\u2593    \u2593\u2593\\\u2593\u2593    \u2593\u2593\r\n"
                + //
                "                                                 \\\u2593\u2593\u2593\u2593 \\\u2593\u2593   \\\u2593\u2593 \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593\\\u2593\u2593   \\\u2593\u2593\\\u2593\u2593   \\\u2593\u2593     _\\\u2593\u2593\u2593\u2593\u2593\u2593\u2593 \\\u2593\u2593\u2593\u2593\u2593\u2593  \\\u2593\u2593\u2593\u2593\u2593\u2593 \r\n"
                + //
                "                                                                                               |  \\__| \u2593\u2593                  \r\n"
                + //
                "                                                                                                \\\u2593\u2593    \u2593\u2593                  \r\n"
                + //
                "                                                                                                   \\\u2593\u2593\u2593\u2593\u2593\u2593                   \r\n"
                + //
                "";

        char[] thankYouChars = thankYouPattern.toCharArray();
        try {
            for (char c : thankYouChars) {
                System.out.print(all.white_bg + all.green + c + all.reset + all.bgreset);
                Thread.sleep(5); // Adjust the sleep delay as needed
            }
        } catch (InterruptedException e) {
        }
    
}

    static void ubertitle() {
        System.out.println(all.CYAN_BOLD + all.cyan_bd_bt
                + " __       __  ________  __        ______    ______   __       __  ________        ________   ______         __    __  _______   ________  _______  ");
        all.sleep(100);
        System.out.println(
                "|  \\  _  |  \\|        \\|  \\      /      \\  /      \\ |  \\     /  \\|        \\      |        \\ /      \\       |  \\  |  \\|       \\ |        \\|       \\ ");
        all.sleep(200);
        System.out.println(
                "| $$ / \\ | $$| $$$$$$$$| $$     |  $$$$$$\\|  $$$$$$\\| $$\\   /  $$| $$$$$$$$       \\$$$$$$$$|  $$$$$$\\      | $$  | $$| $$$$$$$\\| $$$$$$$$| $$$$$$$\\");
        all.sleep(200);
        System.out.println(
                "| $$/  $\\| $$| $$__    | $$     | $$   \\$$| $$  | $$| $$$\\ /  $$$| $$__             | $$   | $$  | $$      | $$  | $$| $$__/ $$| $$__    | $$__| $$");
        all.sleep(200);
        System.out.println(
                "| $$  $$$\\ $$| $$  \\   | $$     | $$      | $$  | $$| $$$\\$  $$$$| $$  \\            | $$   | $$  | $$      | $$  | $$| $$    $$| $$  \\   | $$    $$");
        all.sleep(200);
        System.out.println(
                "| $$ $$\\$$\\$$| $$$$$   | $$     | $$   __ | $$  | $$| $$\\$$ $$ $$| $$$$$            | $$   | $$  | $$      | $$  | $$| $$$$$$$\\| $$$$$   | $$$$$$$\\");
        all.sleep(200);
        System.out.println(
                "| $$$$  \\$$$$| $$_____ | $$_____| $$__/  \\| $$__/ $$| $$ \\$$$| $$| $$_____          | $$   | $$__/ $$      | $$__/ $$| $$__/ $$| $$_____ | $$  | $$");
        all.sleep(200);
        System.out.println(
                "| $$$    \\$$$| $$     \\| $$     \\\\$$    $$ \\$$    $$| $$  \\$ | $$| $$     \\         | $$    \\$$    $$       \\$$    $$| $$    $$| $$     \\| $$  | $$");
        all.sleep(200);
        System.out.println(
                " \\$$      \\$$ \\$$$$$$$$ \\$$$$$$$$ \\$$$$$$   \\$$$$$$  \\$$      \\$$ \\$$$$$$$$          \\$$     \\$$$$$$         \\$$$$$$  \\$$$$$$$  \\$$$$$$$$ \\$$   \\$$"
                        + all.reset + all.reset);
    }

    static void hoteltitle() {
        System.out.println();
        System.out.println();
        System.out.println(all.yellow_bg + all.red_bd_bt + all.blink +
                "                                                                                                                                                                                                                  \u2584\u2584\u2584      \u2584\u2584\u2584\u2588\u2588\u2580\u2580 \u2584\u2584\u2584     \u2593\u2588\u2588   \u2588\u2588\u2593      \u2588\u2588\u2591 \u2588\u2588  \u2592\u2588\u2588\u2588\u2588\u2588  \u2584\u2584\u2584\u2588\u2588\u2588\u2588\u2588\u2593\u2593\u2588\u2588\u2588\u2588\u2588 \u2588\u2588\u2593     \u2588\u2588\u2588\u2588\u2588\u2588                                            \r\n"
                + //
                "                                       \u2592\u2588\u2588\u2588\u2588\u2584      \u2592\u2588\u2588  \u2592\u2588\u2588\u2588\u2588\u2584    \u2592\u2588\u2588  \u2588\u2588\u2592    \u2592\u2593\u2588\u2588\u2591 \u2588\u2588 \u2592\u2588\u2588\u2592  \u2588\u2588\u2592\u2593  \u2588\u2588\u2592 \u2593\u2592\u2593\u2588   \u2580\u2593\u2588\u2588\u2592   \u2592\u2588\u2588    \u2592                                            \r\n"
                + //
                "                                       \u2592\u2588\u2588  \u2580\u2588\u2584    \u2591\u2588\u2588  \u2592\u2588\u2588  \u2580\u2588\u2584   \u2592\u2588\u2588 \u2588\u2588\u2591    \u2591\u2592\u2588\u2588\u2580\u2580\u2588\u2588 \u2592\u2588\u2588\u2591  \u2588\u2588\u2592\u2592 \u2593\u2588\u2588\u2591 \u2592\u2591\u2592\u2588\u2588\u2588  \u2592\u2588\u2588\u2591   \u2591 \u2593\u2588\u2588\u2584                                              \r\n"
                + //
                "                                       \u2591\u2588\u2588\u2584\u2584\u2584\u2584\u2588\u2588\u2593\u2588\u2588\u2584\u2588\u2588\u2593 \u2591\u2588\u2588\u2584\u2584\u2584\u2584\u2588\u2588  \u2591 \u2590\u2588\u2588\u2593\u2591     \u2591\u2593\u2588 \u2591\u2588\u2588 \u2592\u2588\u2588   \u2588\u2588\u2591\u2591 \u2593\u2588\u2588\u2593 \u2591 \u2592\u2593\u2588  \u2584\u2592\u2588\u2588\u2591     \u2592   \u2588\u2588\u2592                                           \r\n"
                + //
                "                                        \u2593\u2588   \u2593\u2588\u2588 \u2593\u2588\u2588\u2588\u2592   \u2593\u2588   \u2593\u2588\u2588  \u2591 \u2588\u2588\u2592\u2593\u2591     \u2591\u2593\u2588\u2592\u2591\u2588\u2588\u2593\u2591 \u2588\u2588\u2588\u2588\u2593\u2592\u2591  \u2592\u2588\u2588\u2592 \u2591 \u2591\u2592\u2588\u2588\u2588\u2588\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2592\u2588\u2588\u2588\u2588\u2588\u2588\u2592\u2592                                           \r\n"
                + //
                "                                        \u2592\u2592   \u2593\u2592\u2588 \u2592\u2593\u2592\u2592\u2591   \u2592\u2592   \u2593\u2592\u2588   \u2588\u2588\u2592\u2592\u2592       \u2592 \u2591\u2591\u2592\u2591\u2592\u2591 \u2592\u2591\u2592\u2591\u2592\u2591   \u2592 \u2591\u2591   \u2591\u2591 \u2592\u2591 \u2591 \u2592\u2591\u2593  \u2592 \u2592\u2593\u2592 \u2592 \u2591                                           \r\n"
                + //
                "                                         \u2591   \u2592\u2592  \u2592 \u2591\u2592\u2591    \u2591   \u2592\u2592  \u2593\u2588\u2588 \u2591\u2592\u2591       \u2592 \u2591\u2592\u2591 \u2591  \u2591 \u2592 \u2592\u2591     \u2591     \u2591 \u2591  \u2591 \u2591 \u2592  \u2591 \u2591\u2592  \u2591                                             \r\n"
                + //
                "                                        \u2591   \u2592   \u2591 \u2591 \u2591    \u2591   \u2592   \u2592 \u2592 \u2591\u2591        \u2591  \u2591\u2591 \u2591\u2591 \u2591 \u2591 \u2592    \u2591 \u2591       \u2591    \u2591 \u2591  \u2591  \u2591  \u2591                                              \r\n"
                + //
                "                                            \u2591   \u2591   \u2591        \u2591   \u2591 \u2591           \u2591  \u2591  \u2591    \u2591 \u2591              \u2591      \u2591        \u2591                                              \r\n"
                + //
                "" + all.reset + all.bgreset + all.rstblink);
    }

    static void Buscities() {
        System.out.print(all.cyan + all.ital
                + "                                                                           Hyderabad\n                                                                           Bengaluru\n                                                                           Chennai\n                                                                           Vijayawada\n"
                + all.reset);
    }

    static void trainfromcity() {
        System.out.println(all.red + "Secunderabad\n Warangal\nVijaywada" + all.reset);
    }

    static void traintocity() {
        System.out.println(all.red + "Warangal\nVishakapatnam\nKadapa" + all.reset);
    }

    // hotels

    static void displayhotels() {
        System.out.print("\t\t\t\t\t\t\t\t\t" + all.yellow
                + "1.Novotel\n\t\t\t\t\t\t\t\t\t2.Taj Banjara\n\t\t\t\t\t\t\t\t\t3.Silver Key\n\t\t\t\t\t\t\t\t\t4.Town House\n\t\t\t\t\t\t\t\t\t5.CV Hotel"
                + all.reset);
    }

    static void displayacrooms() {
        System.out.println(all.yellow + "\t\t\t\t\t\t\t   -------------------------------------");
        System.out.println(
                "\t\t\t\t\t\t\t   |" + all.violet + "   Type" + all.yellow + "      |" + all.violet + "  CATEGORY"
                        + all.yellow + "  |" + all.violet + " Price  " + all.yellow + "|");
        System.out.println("\t\t\t\t\t\t\t   -------------------------------------");
        System.out.println(all.yellow + "\t\t\t\t\t\t\t   |" + all.blue + " Single Room" + all.yellow + " |" + all.green
                + "    AC      "
                + all.yellow + "|" + all.skyblue + "  1500  " + all.yellow + "|");
        System.out.println(all.yellow + "\t\t\t\t\t\t\t   |" + all.blue + " Double Room" + all.yellow + " |" + all.green
                + "    AC      "
                + all.yellow + "|" + all.skyblue + "  3000  " + all.yellow + "|");
        System.out.println(all.yellow + "\t\t\t\t\t\t\t   |" + all.blue + " Deluxe Room" + all.yellow + " |" + all.green
                + "    AC      "
                + all.yellow + "|" + all.skyblue + "  5000  " + all.yellow + "|");
        System.out.println(all.yellow + "\t\t\t\t\t\t\t   |" + all.blue + " Suit Room  " + all.yellow + " |" + all.green
                + "    AC      "
                + all.yellow + "|" + all.skyblue + " 30000  " + all.yellow + "|");
        System.out.println(all.yellow + "\t\t\t\t\t\t\t   -------------------------------------" + all.reset);
    }

    static void displaynonacrooms() {
        System.out.println(all.yellow + "\t\t\t\t\t\t\t-------------------------------------");
        System.out
                .println("\t\t\t\t\t\t\t|" + all.violet + "   Type" + all.yellow + "      |" + all.violet + "  CATEGORY"
                        + all.yellow + "  |" + all.violet + " Price  " + all.yellow + "|");
        System.out.println("\t\t\t\t\t\t\t-------------------------------------");
        System.out.println(all.yellow + "\t\t\t\t\t\t\t|" + all.blue + " Single Room" + all.yellow + " |" + all.green
                + "    NonAC   "
                + all.yellow + "|" + all.skyblue + "   900  " + all.yellow + "|");
        System.out.println(all.yellow + "\t\t\t\t\t\t\t|" + all.blue + " Double Room" + all.yellow + " |" + all.green
                + "    NonAC   "
                + all.yellow + "|" + all.skyblue + "  2000  " + all.yellow + "|");
        System.out.println(all.yellow + "\t\t\t\t\t\t\t|" + all.blue + " Deluxe Room" + all.yellow + " |" + all.green
                + "    NonAC   "
                + all.yellow + "|" + all.skyblue + "  3000  " + all.yellow + "|");
        System.out.println(all.yellow + "\t\t\t\t\t\t\t|" + all.blue + " Suit Room  " + all.yellow + " |" + all.green
                + "    NonAC   "
                + all.yellow + "|" + all.skyblue + " 15000  " + all.yellow + "|");
        System.out.println(all.yellow + "\t\t\t\t\t\t\t-------------------------------------" + all.reset);
    }

    static void train() {
        System.out.println(all.yellow_bd_bt + "\t\t\t\t           .---._");
        all.sleep(100);
        System.out.println("\t\t\t\t        .--(. '  .).--.      . .-.");
        all.sleep(100);
        System.out.println("\t\t\t\t\t     . ( ' _) .)` (   .)-. ( ) '-'");
        all.sleep(100);
        System.out.println("\t\t\t\t\t    ( ,  ).        `(' . _)");
        all.sleep(100);
        System.out.println("\t\t\t\t\t  (')  _________      '-'");
        all.sleep(200);
        System.out.println("\t\t\t\t\t ____[_________]                                         ________");
        all.sleep(200);
        System.out.println("\t\t\t\t\t \\__/ | _ \\  ||    ,;,;,,                               [________]");
        all.sleep(200);
        System.out.println("\t\t\t\t\t _][__|(\")/__||  ,;;;;;;;;,   __________   __________   _| LILI |_");
        all.sleep(200);
        System.out.println("\t\t\t\t\t/             | |____      | |          | |  ___     | |      ____|");
        all.sleep(200);
        System.out.println("\t\t\t\t\t(| .--.    .--.| |     ___  | |   |  |   | |      ____| |____      |");
        all.sleep(200);
        System.out.println("\t\t\t\t\t/|/ .. \\~~/ .. \\_|_.-.__.-._|_|_.-:__:-._|_|_.-.__.-._|_|_.-.__.-._|");
        all.sleep(200);
        System.out.println("\t\t\t\t\t+=/_|\\ '' /~~\\ '' /=+( o )( o )+==( o )( o )=+=( o )( o )+==( o )( o )=+");
        all.sleep(200);
        System.out.println(
                "\t\t\t\t\t='=='='--'==+='--'===+'-'=='-'==+=='-'+='-'===+='-'=='-'==+=='-'=+'-'jgs+" + all.reset);
    }

    static void bus() {
        String x = "\n\tWELCOME TO BUS TICKET BOOKING SERVICES";
        System.out.println("\n");

        try {
            for (int i = 0; i < x.length(); i++) {
                Thread.sleep(100);

                char S = x.charAt(i);
                System.out.print(all.green + all.BOLD + "   " + S + all.reset);

            }
            System.out.println("\n");
        } catch (InterruptedException e) {
        }
        System.out.println(all.red
                + "                                                                     \t_______________________           \n"
                +
                "                                                                    \t|   |    |    |    | |  \\          \n"
                +
                "                                                                    \t|___|____|____|____|_|___\\         \n"
                +
                "                                                                    \t|    CV 120/121    | |    \\        \n"
                +
                "                                                                    \t`--(o)(o)------------(o)--'        "
                + all.white);
    }

    static void title() {

        System.out.println(all.blink + all.blue
                + " #   #  #####  #       ###    ###   #   #  #####         #####   ###          #####         ####     #     ###    ###     #    #       ###          #####  #   #  ####   ####   #####   ###    ###");
        System.out.println(
                " #   #  #      #      #   #  #   #  #   #  #               #    #   #             #         #   #   # #   #   #  #   #   # #   #      #   #         #      #   #  #   #  #   #  #      #   #  #   #");
        System.out.println(
                " #   #  #      #      #      #   #  ## ##  #               #    #   #            #          #   #  #   #  #      #      #   #  #      #             #       # #   #   #  #   #  #      #      #");
        System.out.println(
                " # # #  ####   #      #      #   #  # # #  ####            #    #   #            #          ####   #   #   ###   #      #   #  #       ###          ####     #    ####   ####   ####    ###    ###");
        System.out.println(
                " # # #  #      #      #      #   #  #   #  #               #    #   #           #           # #    #####      #  #      #####  #          #         #       # #   #      # #    #          #      #");
        System.out.println(
                " ## ##  #      #      #   #  #   #  #   #  #               #    #   #          #            #  #   #   #  #   #  #   #  #   #  #      #   #         #      #   #  #      #  #   #      #   #  #   #");
        System.out.println(
                " #   #  #####  #####   ###    ###   #   #  #####           #     ###           #            #   #  #   #   ###    ###   #   #  #####   ###          #####  #   #  #      #   #  #####   ###    ###"
                        + all.reset + all.white);
    }

    static void sleeperacbusseating() {
        System.out.println("__________________________      __________________________");
        System.out.println("|                        |      |                        |");
        System.out.println("|" + all.blue_bt + "     Lower deck         " + all.reset + "|      |" + all.blue_bt
                + "     Upper deck         " + all.reset + "|");
        System.out.println("|________________________|      |________________________|");
        System.out.println("| ____        ____  ____ |      | ____        ____  ____ |");
        System.out.println("| |  |        |  |  |  | |      | |  |        |  |  |  | |");
        System.out.println("| |" + all.RED_BOLD + " 1" + all.reset + "|        |" + all.RED_BOLD + " 2" + all.reset
                + "|  |" + all.RED_BOLD + " 3" + all.reset + "| |      | |" + all.RED_BOLD + "16" + all.reset
                + "|        |" + all.RED_BOLD + "17" + all.reset + "|  |" + all.RED_BOLD + "18" + all.reset + "| |");
        System.out.println("| |__|        |__|  |__| |      | |__|        |__|  |__| |");
        System.out.println("|                        |      |                        |");
        System.out.println("| ____        ____  ____ |      | ____        ____  ____ |");
        System.out.println("| |  |        |  |  |  | |      | |  |        |  |  |  | |");
        System.out.println("| |" + all.RED_BOLD + " 4" + all.reset + "|        |" + all.RED_BOLD + " 5" + all.reset
                + "|  |" + all.RED_BOLD + " 6" + all.reset + "| |      | |" + all.RED_BOLD + "19" + all.reset
                + "|        |" + all.RED_BOLD + "20" + all.reset + "|  |" + all.RED_BOLD + "21" + all.reset + "| |");
        System.out.println("| |__|        |__|  |__| |      | |__|        |__|  |__| |");
        System.out.println("|                        |      |                        |");
        System.out.println("| ____        ____  ____ |      | ____        ____  ____ |");
        System.out.println("| |  |        |  |  |  | |      | |  |        |  |  |  | |");
        System.out.println("| |" + all.RED_BOLD + " 7" + all.reset + "|        |" + all.RED_BOLD + " 8" + all.reset
                + "|  |" + all.RED_BOLD + " 9" + all.reset + "| |      | |" + all.RED_BOLD + "22" + all.reset
                + "|        |" + all.RED_BOLD + "23" + all.reset + "|  |" + all.RED_BOLD + "24" + all.reset + "| |");
        System.out.println("| |__|        |__|  |__| |      | |__|        |__|  |__| |");
        System.out.println("|                        |      |                        |");
        System.out.println("| ____        ____  ____ |      | ____        ____  ____ |");
        System.out.println("| |  |        |  |  |  | |      | |  |        |  |  |  | |");
        System.out.println("| |" + all.RED_BOLD + "10" + all.reset + "|        |" + all.RED_BOLD + "11" + all.reset
                + "|  |" + all.RED_BOLD + "12" + all.reset + "| |      | |" + all.RED_BOLD + "25" + all.reset
                + "|        |" + all.RED_BOLD + "26" + all.reset + "|  |" + all.RED_BOLD + "27" + all.reset + "| |");
        System.out.println("| |__|        |__|  |__| |      | |__|        |__|  |__| |");
        System.out.println("|                        |      |                        |");
        System.out.println("| ____        ____  ____ |      | ____        ____  ____ |");
        System.out.println("| |  |        |  |  |  | |      | |  |        |  |  |  | |");
        System.out.println("| |" + all.RED_BOLD + "13" + all.reset + "|        |" + all.RED_BOLD + "14" + all.reset
                + "|  |" + all.RED_BOLD + "15" + all.reset + "| |      | |" + all.RED_BOLD + "28" + all.reset
                + "|        |" + all.RED_BOLD + "29" + all.reset + "|  |" + all.RED_BOLD + "30" + all.reset + "| |");
        System.out.println("| |__|        |__|  |__| |      | |__|        |__|  |__| |");
        System.out.println("|                        |      |                        |");
        System.out.println("|________________________|      |________________________|");

    }

    static void sleepernonacbusseating() {
        System.out.println("\t\t\t\t\t\t\t\t\t __________________________      __________________________");
        System.out.println("\t\t\t\t\t\t\t\t\t |                        |      |                        |");
        System.out.println("\t\t\t\t\t\t\t\t\t |     Lower deck         |      |     Upper deck         |");
        System.out.println("\t\t\t\t\t\t\t\t\t |________________________|      |________________________|");
        System.out.println("\t\t\t\t\t\t\t\t\t | ____        ____  ____ |      | ____        ____  ____ |");
        System.out.println("\t\t\t\t\t\t\t\t\t | |  |        |  |  |  | |      | |  |        |  |  |  | |");
        System.out.println("\t\t\t\t\t\t\t\t\t | |" + all.RED_BOLD + " 1" + all.reset + "|        |" + all.RED_BOLD + " 2" + all.reset
                + "|  |" + all.RED_BOLD + " 3" + all.reset + "| |      | |" + all.RED_BOLD + "16" + all.reset
                + "|        |" + all.RED_BOLD + "17" + all.reset + "|  |" + all.RED_BOLD + "18" + all.reset + "| |");
        System.out.println("\t\t\t\t\t\t\t\t\t | |__|        |__|  |__| |      | |__|        |__|  |__| |");
        System.out.println("\t\t\t\t\t\t\t\t\t |                        |      |                        |");
        System.out.println("\t\t\t\t\t\t\t\t\t | ____        ____  ____ |      | ____        ____  ____ |");
        System.out.println("\t\t\t\t\t\t\t\t\t | |  |        |  |  |  | |      | |  |        |  |  |  | |");
        System.out.println("\t\t\t\t\t\t\t\t\t | |" + all.RED_BOLD + " 4" + all.reset + "|        |" + all.RED_BOLD + " 5" + all.reset
                + "|  |" + all.RED_BOLD + " 6" + all.reset + "| |      | |" + all.RED_BOLD + "19" + all.reset
                + "|        |" + all.RED_BOLD + "20" + all.reset + "|  |" + all.RED_BOLD + "21" + all.reset + "| |");
        System.out.println("\t\t\t\t\t\t\t\t\t | |__|        |__|  |__| |      | |__|        |__|  |__| |");
        System.out.println("\t\t\t\t\t\t\t\t\t |                        |      |                        |");
        System.out.println("\t\t\t\t\t\t\t\t\t | ____        ____  ____ |      | ____        ____  ____ |");
        System.out.println("\t\t\t\t\t\t\t\t\t | |  |        |  |  |  | |      | |  |        |  |  |  | |");
        System.out.println("\t\t\t\t\t\t\t\t\t | |" + all.RED_BOLD + " 7" + all.reset + "|        |" + all.RED_BOLD + " 8" + all.reset
                + "|  |" + all.RED_BOLD + " 9" + all.reset + "| |      | |" + all.RED_BOLD + "22" + all.reset
                + "|        |" + all.RED_BOLD + "23" + all.reset + "|  |" + all.RED_BOLD + "24" + all.reset + "| |");
        System.out.println("\t\t\t\t\t\t\t\t\t | |__|        |__|  |__| |      | |__|        |__|  |__| |");
        System.out.println("\t\t\t\t\t\t\t\t\t |                        |                                ");
        System.out.println("\t\t\t\t\t\t\t\t\t | ____        ____  ____ |      | ____        ____  ____ |");
        System.out.println("\t\t\t\t\t\t\t\t\t | |  |        |  |  |  | |      | |  |        |  |  |  | |");
        System.out.println("\t\t\t\t\t\t\t\t\t | |" + all.RED_BOLD + "10" + all.reset + "|        |" + all.RED_BOLD + "11" + all.reset
                + "|  |" + all.RED_BOLD + "12" + all.reset + "| |      | |" + all.RED_BOLD + "25" + all.reset
                + "|        |" + all.RED_BOLD + "26" + all.reset + "|  |" + all.RED_BOLD + "27" + all.reset + "| |");
        System.out.println("\t\t\t\t\t\t\t\t\t | |__|        |__|  |__| |      | |__|        |__|  |__| |");
        System.out.println("\t\t\t\t\t\t\t\t\t |                        |                                ");
        System.out.println("\t\t\t\t\t\t\t\t\t | ____        ____  ____ |      | ____        ____  ____ |");
        System.out.println("\t\t\t\t\t\t\t\t\t | |  |        |  |  |  | |      | |  |        |  |  |  | |");
        System.out.println("\t\t\t\t\t\t\t\t\t | |" + all.RED_BOLD + "13" + all.reset + "|        |" + all.RED_BOLD + "14" + all.reset
                + "|  |" + all.RED_BOLD + "15" + all.reset + "| |      | |" + all.RED_BOLD + "28" + all.reset
                + "|        |" + all.RED_BOLD + "29" + all.reset + "|  |" + all.RED_BOLD + "30" + all.reset + "| |");

        System.out.println("\t\t\t\t\t\t\t\t\t | |__|        |__|  |__| |      | |__|        |__|  |__| |");
        System.out.println("\t\t\t\t\t\t\t\t\t |                        |      |                        |");
        System.out.println("\t\t\t\t\t\t\t\t\t |________________________|      |________________________|");

    }

    static void seaternonacbusseating() {
        System.out.println("\t\t\t\t\t\t\t\t __________________________");
        System.out.println("\t\t\t\t\t\t\t\t |                        |");
        System.out.println("\t\t\t\t\t\t\t\t |         Seater         |");
        System.out.println("\t\t\t\t\t\t\t\t |________________________|");
        System.out.println("\t\t\t\t\t\t\t\t | ____  ____  ____  ____ |");
        System.out.println("\t\t\t\t\t\t\t\t | |" + all.RED_BOLD + " 1" + all.reset + "|  |" + all.RED_BOLD + " 2" + all.reset
                + "|  |" + all.RED_BOLD + " 3" + all.reset + "|  |" + all.RED_BOLD + " 4" + all.reset + "| |");
        System.out.println("\t\t\t\t\t\t\t\t | |__|  |__|  |__|  |__| |");
        System.out.println("\t\t\t\t\t\t\t\t | ____  ____  ____  ____ |");
        System.out.println("\t\t\t\t\t\t\t\t | |" + all.RED_BOLD + " 5" + all.reset + "|  |" + all.RED_BOLD + " 6" + all.reset
                + "|  |" + all.RED_BOLD + " 7" + all.reset + "|  |" + all.RED_BOLD + " 8" + all.reset + "| |");
        System.out.println("\t\t\t\t\t\t\t\t | |__|  |__|  |__|  |__| |");
        System.out.println("\t\t\t\t\t\t\t\t | ____  ____  ____  ____ |");
        System.out.println("\t\t\t\t\t\t\t\t | |" + all.RED_BOLD + " 9" + all.reset + "|  |" + all.RED_BOLD + "10" + all.reset
                + "|  |" + all.RED_BOLD + "11" + all.reset + "|  |" + all.RED_BOLD + "12" + all.reset + "| |");
        System.out.println("\t\t\t\t\t\t\t\t | |__|  |__|  |__|  |__| |");
        System.out.println("\t\t\t\t\t\t\t\t | ____  ____  ____  ____ |");
        System.out.println("\t\t\t\t\t\t\t\t | |" + all.RED_BOLD + "13" + all.reset + "|  |" + all.RED_BOLD + "14" + all.reset
                + "|  |" + all.RED_BOLD + "15" + all.reset + "|  |" + all.RED_BOLD + "16" + all.reset + "| |");
        System.out.println("\t\t\t\t\t\t\t\t | |__|  |__|  |__|  |__| |");
        System.out.println("\t\t\t\t\t\t\t\t | ____  ____  ____  ____ |");
        System.out.println("\t\t\t\t\t\t\t\t | |" + all.RED_BOLD + "17" + all.reset + "|  |" + all.RED_BOLD + "18" + all.reset
                + "|  |" + all.RED_BOLD + "19" + all.reset + "|  |" + all.RED_BOLD + "20" + all.reset + "| |");
        System.out.println("\t\t\t\t\t\t\t\t | |__|  |__|  |__|  |__| |");
        System.out.println("\t\t\t\t\t\t\t\t | ____  ____  ____  ____ |");
        System.out.println("\t\t\t\t\t\t\t\t | |" + all.RED_BOLD + "21" + all.reset + "|  |" + all.RED_BOLD + "22" + all.reset
                + "|  |" + all.RED_BOLD + "23" + all.reset + "|  |" + all.RED_BOLD + "24" + all.reset + "| |");
        System.out.println("\t\t\t\t\t\t\t\t | |__|  |__|  |__|  |__| |");
        System.out.println("\t\t\t\t\t\t\t\t | ____  ____  ____  ____ |");
        System.out.println("\t\t\t\t\t\t\t\t | |" + all.RED_BOLD + "25" + all.reset + "|  |" + all.RED_BOLD + "26" + all.reset
                + "|  |" + all.RED_BOLD + "27" + all.reset + "|  |" + all.RED_BOLD + "28" + all.reset + "| |");
        System.out.println("\t\t\t\t\t\t\t\t | |__|  |__|  |__|  |__| |");
        System.out.println("\t\t\t\t\t\t\t\t | ____  ____  ____  ____ |");
        System.out.println("\t\t\t\t\t\t\t\t | |" + all.RED_BOLD + "30" + all.reset + "|  |" + all.RED_BOLD + "31" + all.reset
                + "|  |" + all.RED_BOLD + "32" + all.reset + "|  |" + all.RED_BOLD + "33" + all.reset + "| |");
        System.out.println("\t\t\t\t\t\t\t\t | |__|  |__|  |__|  |__| |");
        System.out.println("\t\t\t\t\t\t\t\t |                        |");
        System.out.println("\t\t\t\t\t\t\t\t |________________________|");

    }

    static void acbuses() {

        System.out.println(all.blue + all.black_bg + all.change + all.thick + "                                     ");
        System.out.println("        1.VRCR Travels               ");
        System.out.println("                                     ");
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "        Time : 20:30 - 06:30         ");
        System.out.print("        Date : ");
        System.out.print(CurrentDate.time());
        System.out.println("            ");
        System.out.println("  Volvo MUlti Axle A/c Sleeper (2+1) ");
        System.out.println("                                     ");
        System.out.println();
        System.out.println(all.blue + all.black_bg + all.change + all.thick + "                                     ");
        System.out.println("         2.Intercity Travels         ");
        System.out.println("                                     ");
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "        Time : 21:30 - 09:30         ");
        System.out.print("        Date : ");
        System.out.print(CurrentDate.time());
        System.out.println("            ");
        System.out.println("        A/c sleeper (2+1)            ");
        System.out.println("                                     ");
        System.out.println();
        System.out.println(all.blue + all.black_bg + all.change + all.thick + "                                     ");
        System.out.println("         3.Kaveri Travels            ");
        System.out.println("                                     ");
        System.out.println(all.WHITE_BOLD + all.change + all.thick +"        Time : 21:00 - 08:00         ");
        System.out.print("        Date : ");
        System.out.print(CurrentDate.time());
        System.out.println("            ");
        System.out.println("        A/c Sleeper (2+1)            ");
        System.out.println("                                     ");
        System.out.println();
        System.out.println(all.blue + all.black_bg + all.change + all.thick + "                                     ");
        System.out.println("         4.CV Travels                ");
        System.out.println("                                     ");
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "        Time : 19:00 - 05:30         ");
        System.out.print("        Date : ");
        System.out.print(CurrentDate.time());
        System.out.println("            ");
        System.out.println("        A/c sleeper (2+1)            ");
        System.out.println("                                     " + all.reset + all.BOLD_RESET);
    }

    static void nonacbuses() {
        System.out.println(all.blue + all.black_bg + all.change + all.thick + "                                    ");
        System.out.println("        1.Amaravathi Travels        ");
        System.out.println("                                    ");
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "       Time : 18:00 - 05:00         ");
        System.out.print("       Date : ");
        System.out.print(CurrentDate.time());
        System.out.println("            ");
        System.out.println("       Non A/c Seater  (2+2)        ");
        System.out.println("                                    ");
        System.out.println();
        System.out.println(all.blue + all.black_bg + all.change + all.thick + "                                    ");
        System.out.println("         2.Orange Travels           ");
        System.out.println("                                    ");
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "      Time : 17:00 - 04:30          ");
        System.out.print("      Date : ");
        System.out.print(CurrentDate.time());
        System.out.println("             ");
        System.out.println("      Non A/c Sleeper (2+1)         ");
        System.out.println("                                    ");
        System.out.println();
        System.out.println(all.blue + all.black_bg + all.change + all.thick + "                                    ");
        System.out.println("       3.Bharath Travels            ");
        System.out.println("                                    ");
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "      Time : 21:00 - 06:00          ");
        System.out.print("      Date : ");
        System.out.print(CurrentDate.time());
        System.out.println("             ");
        System.out.println("      Non A/c Sleeper (2+1)         ");
        System.out.println("                                    ");
        System.out.println();
        System.out.println(all.blue + all.black_bg + all.change + all.thick + "                                    ");
        System.out.println("       4.National Travels           ");
        System.out.println("                                    ");
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "      Time : 22:00 - 07:00          ");
        System.out.print("      Date : ");
        System.out.print(CurrentDate.time());
        System.out.println("             ");
        System.out.println("      Non A/c Sleeper (2+1)         ");
        System.out.println("                                    " + all.reset + all.BOLD_RESET);
    }
}

class tickets {
    static long pnrotp() {
        long a = 1000000000 + (int) (Math.random() * 899999999);
        return a;
    }

    static void busticket(double totalamount, String categ, int busnum, double gst, double amount, int count) {
         String mode;
        String name="";
        if (categ.equalsIgnoreCase("nonac") && busnum == 1 || busnum == 3)
            mode = "Seater";
        else
            mode = "Sleeper";
            
        if(categ.equalsIgnoreCase("ac")&& busnum==1)
        {
             name="VRCR TRAVElS";
        }
        else if(categ.equalsIgnoreCase("ac")&&busnum==2)
        {
             name="INTERCITY TRAVElS";
        }
        else if(categ.equalsIgnoreCase("ac")&&busnum==3)
        {
             name="KAVERI TRAVElS";
        }
        else if(categ.equalsIgnoreCase("ac")&&busnum==4)
        {
             name="CV TRAVElS";
        }
        else if(categ.equalsIgnoreCase("nonac")&&busnum==1)
        {
             name="AMARAVATHI TRAVElS";
        }
        else if(categ.equalsIgnoreCase("nonac")&&busnum==2)
        {
             name="ORANGE TRAVElS";
        }
        else if(categ.equalsIgnoreCase("nonac")&&busnum==3)
        {
             name="BHARATH TRAVElS";
        }
        else if(categ.equalsIgnoreCase("nonac")&&busnum==4)
        {
            name="NATIONAL TRAVElS"; 
        }

        System.out.println();
        System.out.println(all.CYAN_BOLD + all.black_bg + all.change + all.thick
                + "\t\t\t\t\t\t\t                                 ");
        System.out.println("\t\t\t\t\t\t\t                                 ");
        System.out.print("\t\t\t\t\t\t\t    ");
        System.out.printf("%20s         ", name);
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t            BUS TICKET           ");
        System.out.println("\t\t\t\t\t\t\t                                 ");
        System.out.println(all.WHITE_BOLD + all.change + "\t\t\t\t\t\t\t                                 ");
        System.out.print("\t\t\t\t\t\t\t     DATE :  ");
        System.out.print(CurrentDate.time());
        System.out.println("          ");
        System.out.println("\t\t\t\t\t\t\t                                 ");
        System.out.println("\t\t\t\t\t\t\t                                 ");
        System.out.print("\t\t\t\t\t\t\t          AMOUNT : ");
        System.out.printf("%7s", amount);
        System.out.println("       ");
        System.out.print("\t\t\t\t\t\t\t             GST : ");
        System.out.printf("%7.1f", gst);
        System.out.println("       ");
        System.out.print("\t\t\t\t\t\t\t      Total Bill : ");
        System.out.printf("%7.1f", totalamount);
        System.out.println("       ");
        System.out.print("\t\t\t\t\t\t\t        CATEGORY : ");
        System.out.printf("%-6s", categ);
        System.out.println("        ");
        System.out.print("\t\t\t\t\t\t\t     Total Seats : ");
        System.out.printf("%-3s", count);
        System.out.println("           ");
        System.out.println("\t\t\t\t\t\t\t                                 ");
        System.out.print("\t\t\t\t\t\t\t              ");
        System.out.printf("%7s",mode );
        System.out.print( "            ");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t                                 ");
        System.out.println("\t\t\t\t\t\t\t      .....HAPPY JOURNEY.....    ");
        System.out.println("\t\t\t\t\t\t\t                                 " + all.reset + all.BOLD_RESET);


    }

    static void trainticket(double totalamount, String fromcity, String tocity, int trainno, int persons) {
        System.out.println(all.CYAN_BOLD + all.black_bg + all.change + all.thick
                + "\t\t\t\t\t\t                                                                          ");
        System.out.println("\t\t\t\t\t\t                     JOURNEY RESERVATION TICKET                           ");
        System.out.println("\t\t\t\t\t\t                                                                          ");
        System.out.println("\t\t\t\t\t\t      TRAIN NO                 DATE                      PNR NO           ");
        System.out.println("\t\t\t\t\t\t    --------------          ------------             -------------        ");
        System.out.println("\t\t\t\t\t\t                                                                          ");
        System.out.println("\t\t\t\t\t\t     " + trainno + "                   " + CurrentDate.time()
                + "               " + pnrotp() + "          ");
        System.out.println("\t\t\t\t\t\t    --------------          ------------             -------------        ");
        System.out.println("\t\t\t\t\t\t                                                                          ");
        System.out.print("\t\t\t\t\t\t   SOURCE : ");
        System.out.printf("%-13s", fromcity);
        System.out.print("   DESTINATION :");
        System.out.printf("%-14s", tocity);
        System.out.println("                   ");
        System.out.print("\t\t\t\t\t\t            No of Seats : ");
        System.out.printf("%4s", persons);
        System.out.println("                                            ");
        System.out.println("\t\t\t\t\t\t                                                                          ");
        System.out.println(all.BLUE_BOLD + all.change
                + "\t\t\t\t\t\t                                                                          ");
        System.out.println("\t\t\t\t\t\t                -----------------------------                             ");
        System.out.println("\t\t\t\t\t\t                |                           |                             ");
        System.out.print("\t\t\t\t\t\t     Total Fare:|");
        System.out.format("%14.2f", totalamount);
        System.out.println("             |                             ");
        System.out.println("\t\t\t\t\t\t                |                           |                             ");
        System.out.println("\t\t\t\t\t\t                -----------------------------                             ");
        System.out.println("\t\t\t\t\t\t               ..........HAPPY JOURNEY............                        ");
        System.out.println("\t\t\t\t\t\t                                                                          "
                + all.reset + all.BOLD_RESET);
    }

    static void uberticket(double amount, String name, double gst, double total) {
        System.out
                .println(all.BLUE_BOLD + all.blue_ul + "\t\t\t\t\t\t\t\t\tUBER PAYMENT BILL\n" + all.rstul + all.reset);
        System.out.println(all.black_bg_bt + all.yellow + all.change
                + "\t\t\t\t\t\t\t                                                      ");
        System.out.println("\t\t\t\t\t\t\t                    " + all.yellow_ul + "UBER" + all.rstul
                + "                              ");
        System.out.print("\t\t\t\t\t\t\t                                  Total : ");
        System.out.format("%-12.2f", amount);
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t                                  Date  : " + CurrentDate.time() + "  ");
        System.out.println("\t\t\t\t\t\t\t   Thanks for riding.                                 ");
        System.out.print("\t\t\t\t\t\t\t   Name :");
        System.out.printf("%-45s", name);
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t   We hope you Enjoyed your                           ");
        System.out.println("\t\t\t\t\t\t\t   ride this evening.                                 ");
        System.out.println("\t\t\t\t\t\t\t                                                      " + all.reset
                + all.bgreset + all.change + all.thick + all.bgreset);
        System.out.println("\t\t\t\t\t\t\t                                                      ");
        System.out.println("\t\t\t\t\t\t\t                                                      ");
        System.out.print("\t\t\t\t\t\t\t   Total    :");
        System.out.format("%7.2f                                  ", amount);
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t   Gst      :");
        System.out.format("%7.2f                                  ", gst);
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t   Subtotal :");
        System.out.format("%7.2f                                  ", total);
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t                .....Thank You.....                   ");
        System.out.println("\t\t\t\t\t\t\t                                                      ");
        System.out.println(all.reset + all.bgreset + all.change + all.thick);
    }
}

class Bus {
    static void Selectbuses(String from, String to, String categ) {
        if (categ.equalsIgnoreCase("AC")) {
            //String[] arr2 = { "VRCR TRAVELS", "INTERCITY TRAVELS", "KAVERI TRAVELS", "CV TRAVLES" };
            display.acbuses();
            while (true) {
                System.out.print("\t\t\t\t\t\t\tEnter the number of the bus you want: ");
                int busnum = all.sc.nextInt();
                if (busnum >= 1 && busnum <= 4) {
                    display.sleeperacbusseating();
                    while (true) {
                        System.out.print("\t\t\t\t\tEnter the number of seats you want: ");
                        int count = all.sc.nextInt();
                        if (count >= 1 || count <= 30) {
                            System.out.print("Choose the seat numbers: ");
                            int[] arr = new int[count];
                            for (int i = 0; i < count; i++) {
                                arr[i] = all.sc.nextInt();
                            }
                            billing.busbill(arr, count, categ, busnum);
                            all.sleep(1000);
                            break;
                        } else
                            System.out.print("\t\t\t\t\tPlease Enter Valid number of seats");
                    }
                    break;

                } else {
                    System.out.print("Please Enter valid bus number: ");
                }
                break;
            }
        } else if (categ.equalsIgnoreCase("NonAC")) {
            display.nonacbuses();
            while (true) {
                System.out.print("\t\t\t\t\tEnter the number of the bus you want: ");
                int busnum = all.sc.nextInt();
                if (busnum >= 1 && busnum <= 4) {
                    while (true) {
                        if (busnum == 2 || busnum == 4 || busnum==3) {
                             display.sleepernonacbusseating();
                            System.out.print("\t\t\t\t\tEnter the number of seats you want: ");
                            int count = all.sc.nextInt();
                            if (count >= 1 || count <= 30) {
                                System.out.print("Choose the seat numbers: ");
                                int[] arr = new int[count];
                                for (int i = 0; i < count; i++) {
                                    arr[i] = all.sc.nextInt();
                                }
                                billing.busbill(arr, count, categ, busnum);
                                all.sleep(1000);
                                break;

                            } else
                                System.out.print("\t\t\t\t\tPlease Enter Valid number of seats");
                        } else {
                             display.seaternonacbusseating();
                            System.out.print("\t\t\t\t\tEnter the number of seats you want: ");
                            int count = all.sc.nextInt();
                            if (count >= 1 || count <= 32) {
                                System.out.print("Choose the seat numbers: ");
                                int[] arr = new int[count];
                                for (int i = 0; i < count; i++) {
                                    arr[i] = all.sc.nextInt();
                                }
                                // System.out.print(
                                //         "\t\t\t\t\tIf you want to go for billing press 1 and any number for booking tickets again: ");
                                // int key = all.sc.nextInt();
                                // if (key == 1) {
                                    billing.busbill(arr, count, categ, busnum);
                                    all.sleep(1000);
                                    break;
                               // }
                            } else
                                System.out.print("Please Enter Valid number of seats");
                        }
                    }
                } else {
                    System.out.print("Please Enter valid bus number: ");
                }
                break;
            }
        }

    }

    static void busprocess() {
        // display.title();
        // String title = "---------- WELCOME TO 7 RASCALS EXPRESS -----------";
        // all.sleep(1000);
        // for(int i=0;i<=title.length()-1;i++)
        // {
        // System.out.print(title.charAt(i));
        // if(i<10|| i>=40)
        // all.sleep(50);
        // else if(i>=10 && i<15)
        // all.sleep(0);
        // else if(i>=35 && i<40)
        // all.sleep(0);
        // else
        // all.sleep(300);
        // }
        System.out.println();
        display.bus();
        System.out.println();
        System.out.println(
                "                                                                        CHOOSE YOUR FROM CITY :");
        System.out.println();
        display.Buscities();
        String cityname;
        String Tocity;
        String category;
        while (true) {
            System.out.print(
                    "\n                                                 ENTER YOUR FROM CITY               :                "
                            + all.white);
            cityname = all.sc.next();
            System.out.println("");
            display.Buscities();
            // displaycities();
            System.out
                    .print("\n                                                ENTER YOUR TO CITY                 :                ");
            Tocity = all.sc.next();
            System.out.println("");
            if (cityname.equalsIgnoreCase(Tocity))
                System.out.println("Both from and to cities cannot be same");
            else if ((!cityname.equalsIgnoreCase("chennai") && !cityname.equalsIgnoreCase("hyderabad")
                    && !cityname.equalsIgnoreCase("bengaluru") && !cityname.equalsIgnoreCase("vijayawada"))
                    && !Tocity.equalsIgnoreCase("chennai") && !Tocity.equalsIgnoreCase("hyderabad")
                    && !Tocity.equalsIgnoreCase("bengaluru") && !Tocity.equalsIgnoreCase("vijayawada")) {
                System.out.println("Please Enter valid From and To city names");
            } else if (!cityname.equalsIgnoreCase("chennai") && !cityname.equalsIgnoreCase("hyderabad")
                    && !cityname.equalsIgnoreCase("bengaluru") && !cityname.equalsIgnoreCase("vijayawada"))
                System.out.println("Please Enter valid From city name");
            else if (!Tocity.equalsIgnoreCase("chennai") && !Tocity.equalsIgnoreCase("hyderabad")
                    && !Tocity.equalsIgnoreCase("bengaluru") && !Tocity.equalsIgnoreCase("vijayawada"))
                System.out.println("Please Enter valid To city name");
            else
                break;
        }
        while (true) {
            System.out.print(all.green
                    + "\n                                                                     Select AC or Non AC: "
                    + all.reset);
            category = all.sc.next();
            System.out.println();
            if (!category.equalsIgnoreCase("AC") && !category.equalsIgnoreCase("Nonac"))
                System.out.println("Please Enter valid Category");
            else
                break;
        }

        Selectbuses(cityname, Tocity, category);
    }
}

class chooseTrain {

    static void SECtoWRL() {
        System.out.println("\t\t\t\t\t" + all.purple + all.black_bg + all.change + all.thick
                + "                                    ");
        System.out.println("\t\t\t\t\t         RAJDHANI EXP(22691)        ");
        System.out.println("\t\t\t\t\t                                    " + all.bgreset + all.reset);
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t 07:15     ---01h:33m---     08:48  ");
        System.out.println("\t\t\t\t\t    Secunderabad jn    Kazipet jn   ");
        System.out.println("\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t         Date : " + CurrentDate.time() + "          ");
        System.out.println("\t\t\t\t\t   ______  ______  ______  ______   ");
        System.out.println("\t\t\t\t\t   |    |  |    |  |    |  |    |   ");
        System.out.println("\t\t\t\t\t   | 3A |  | 2A |  | 1A |  | SL |   ");
        System.out.println("\t\t\t\t\t   |____|  |____|  |____|  |____|   ");
        System.out.println("\t\t\t\t\t                                    " + all.reset + all.BOLD_RESET);
        System.out.println();

        System.out.println("\t\t\t\t\t" + all.purple + all.black_bg + all.change + all.thick
                + "                                    ");
        System.out.println("\t\t\t\t\t       CHARMINAR EXP(12760)         ");
        System.out.println("\t\t\t\t\t                                    " + all.bgreset + all.reset);
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t 18:45     ---01h:47m---     20:12  ");
        System.out.println("\t\t\t\t\t  Secunderabad jn      Kazipet jn   ");
        System.out.println("\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t         Date : " + CurrentDate.time() + "          ");
        System.out.println("\t\t\t\t\t   ______  ______  ______  ______   ");
        System.out.println("\t\t\t\t\t   |    |  |    |  |    |  |    |   ");
        System.out.println("\t\t\t\t\t   | 3A |  | 2A |  | 1A |  | SL |   ");
        System.out.println("\t\t\t\t\t   |____|  |____|  |____|  |____|   ");
        System.out.println("\t\t\t\t\t                                    " + all.reset + all.BOLD_RESET);
        System.out.println();

    }

    static void SECtoVZG() {
        System.out.println("\t\t\t\t\t" + all.purple + all.black_bg + all.change + all.thick
                + "                                    ");
        System.out.println("\t\t\t\t\t         VISAKHA EXP(17016)         ");
        System.out.println("\t\t\t\t\t                                    " + all.bgreset + all.reset);
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t 16:50     ---14h:20m---     07:10  ");
        System.out.println("\t\t\t\t\t  Secunderabad jn    Vishakapatanam ");
        System.out.println("\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t         Date : " + CurrentDate.time() + "          ");
        System.out.println("\t\t\t\t\t   ______  ______  ______  ______   ");
        System.out.println("\t\t\t\t\t   |    |  |    |  |    |  |    |   ");
        System.out.println("\t\t\t\t\t   | 3A |  | 2A |  | 1A |  | SL |   ");
        System.out.println("\t\t\t\t\t   |____|  |____|  |____|  |____|   ");
        System.out.println("\t\t\t\t\t                                    " + all.reset + all.BOLD_RESET);
        System.out.println();

        System.out.println("\t\t\t\t\t" + all.purple + all.black_bg + all.change + all.thick
                + "                                    ");
        System.out.println("\t\t\t\t\t       VANDE BHARATH EXP(20834)     ");
        System.out.println("\t\t\t\t\t                                    " + all.bgreset + all.reset);
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t 15:00     ---08h:30m---     23:30  ");
        System.out.println("\t\t\t\t\t  Secunderabad jn    Vishakapatanam ");
        System.out.println("\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t         Date : " + CurrentDate.time() + "          ");
        System.out.println("\t\t\t\t\t   ______  ______  ______  ______   ");
        System.out.println("\t\t\t\t\t   |    |  |    |  |    |  |    |   ");
        System.out.println("\t\t\t\t\t   | 3A |  | 2A |  | 1A |  | SL |   ");
        System.out.println("\t\t\t\t\t   |____|  |____|  |____|  |____|   ");
        System.out.println("\t\t\t\t\t                                    " + all.reset + all.BOLD_RESET);
        System.out.println();

    }

    static void SECtoKDP() {
        System.out.println("\t\t\t\t\t" + all.purple + all.black_bg + all.change + all.thick
                + "                                    ");
        System.out.println("\t\t\t\t\t        VENKATADRI EXP(12797)       ");
        System.out.println("\t\t\t\t\t                                    " + all.bgreset + all.reset);
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t 20:05     ---08h:28m---     04:33  ");
        System.out.println("\t\t\t\t\t  Secunderabad jn          Kadapa   ");
        System.out.println("\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t         Date : " + CurrentDate.time() + "          ");
        System.out.println("\t\t\t\t\t   ______  ______  ______  ______   ");
        System.out.println("\t\t\t\t\t   |    |  |    |  |    |  |    |   ");
        System.out.println("\t\t\t\t\t   | 3A |  | 2A |  | 1A |  | SL |   ");
        System.out.println("\t\t\t\t\t   |____|  |____|  |____|  |____|   ");
        System.out.println("\t\t\t\t\t                                    " + all.reset + all.BOLD_RESET);
        System.out.println();

        System.out.println("\t\t\t\t\t" + all.purple + all.black_bg + all.change + all.thick
                + "                                    ");
        System.out.println("\t\t\t\t\t       RAYALASEEMA EXP(12794)       ");
        System.out.println("\t\t\t\t\t                                    " + all.bgreset + all.reset);
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t 17:20     ---09h:53m---     03:13  ");
        System.out.println("\t\t\t\t\t  Secunderabad jn          Kadapa   ");
        System.out.println("\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t         Date : " + CurrentDate.time() + "          ");
        System.out.println("\t\t\t\t\t   ______  ______  ______  ______   ");
        System.out.println("\t\t\t\t\t   |    |  |    |  |    |  |    |   ");
        System.out.println("\t\t\t\t\t   | 3A |  | 2A |  | 1A |  | SL |   ");
        System.out.println("\t\t\t\t\t   |____|  |____|  |____|  |____|   ");
        System.out.println("\t\t\t\t\t                                    " + all.reset + all.BOLD_RESET);
        System.out.println();

    }

    static void WRLtoKDP() {
        System.out.println("\t\t\t\t\t" + all.purple + all.black_bg + all.change + all.thick
                + "                                    ");
        System.out.println("\t\t\t\t\t              NZM EXP(12708)        ");
        System.out.println("\t\t\t\t\t                                    " + all.bgreset + all.reset);
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t 05:10     ---12h:58m---     18:08  ");
        System.out.println("\t\t\t\t\t    Warangal               Kadapa   ");
        System.out.println("\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t         Date : " + CurrentDate.time() + "          ");
        System.out.println("\t\t\t\t\t   ______  ______  ______  ______   ");
        System.out.println("\t\t\t\t\t   |    |  |    |  |    |  |    |   ");
        System.out.println("\t\t\t\t\t   | 3A |  | 2A |  | 1A |  | SL |   ");
        System.out.println("\t\t\t\t\t   |____|  |____|  |____|  |____|   ");
        System.out.println("\t\t\t\t\t                                    " + all.reset + all.BOLD_RESET);
        System.out.println();

    }

    static void WRLtoVZG() {
        System.out.println("\t\t\t\t\t" + all.purple + all.black_bg + all.change + all.thick
                + "                                    ");
        System.out.println("\t\t\t\t\t        GARIBRATH EXP(12740)        ");
        System.out.println("\t\t\t\t\t                                    " + all.bgreset + all.reset);
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t 22:20     ---09h:20m---     07:40  ");
        System.out.println("\t\t\t\t\t    Warangal       Vishakapatanam   ");
        System.out.println("\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t         Date : " + CurrentDate.time() + "          ");
        System.out.println("\t\t\t\t\t            __________              ");
        System.out.println("\t\t\t\t\t            |    3A  |              ");
        System.out.println("\t\t\t\t\t            |________|              ");
        System.out.println("\t\t\t\t\t                                    " + all.reset + all.BOLD_RESET);
        System.out.println();

        System.out.println("\t\t\t\t\t" + all.purple + all.black_bg + all.change + all.thick
                + "                                    ");
        System.out.println("\t\t\t\t\t       GODAVARI EXP(12728)          ");
        System.out.println("\t\t\t\t\t                                    " + all.bgreset + all.reset);
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t 19:40     ---09h:55m---     05:35  ");
        System.out.println("\t\t\t\t\t  Warangal         Vishakapatanam   ");
        System.out.println("\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t         Date : " + CurrentDate.time() + "          ");
        System.out.println("\t\t\t\t\t   ______  ______  ______  ______   ");
        System.out.println("\t\t\t\t\t   |    |  |    |  |    |  |    |   ");
        System.out.println("\t\t\t\t\t   | 3A |  | 2A |  | 1A |  | SL |   ");
        System.out.println("\t\t\t\t\t   |____|  |____|  |____|  |____|   ");
        System.out.println("\t\t\t\t\t                                    " + all.reset + all.BOLD_RESET);
        System.out.println();

    }

    static void VWtoVZG() {

        System.out.println("\t\t\t\t\t" + all.purple + all.black_bg + all.change + all.thick
                + "                                    ");
        System.out.println("\t\t\t\t\t        FALUKNUMA  EXP(12704)       ");
        System.out.println("\t\t\t\t\t                                    " + all.bgreset + all.reset);
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t 21:30     ---05h:50m---     03:20  ");
        System.out.println("\t\t\t\t\t  Vijayawada jn     Vishakapatanam  ");
        System.out.println("\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t         Date : " + CurrentDate.time() + "          ");
        System.out.println("\t\t\t\t\t   ______  ______  ______  ______   ");
        System.out.println("\t\t\t\t\t   |    |  |    |  |    |  |    |   ");
        System.out.println("\t\t\t\t\t   | 3A |  | 2A |  | 1A |  | SL |   ");
        System.out.println("\t\t\t\t\t   |____|  |____|  |____|  |____|   ");
        System.out.println("\t\t\t\t\t                                    " + all.reset + all.BOLD_RESET);
        System.out.println();

        System.out.println("\t\t\t\t\t" + all.purple + all.black_bg + all.change + all.thick
                + "                                    ");
        System.out.println("\t\t\t\t\t       PRASHANTHI EXP(18464)        ");
        System.out.println("\t\t\t\t\t                                    " + all.bgreset + all.reset);
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t 05:10     ---06h:00m---     11:10  ");
        System.out.println("\t\t\t\t\t  Vijayawada jn      Vishakapatanam ");
        System.out.println("\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t         Date : " + CurrentDate.time() + "          ");
        System.out.println("\t\t\t\t\t   ______  ______  ______  ______   ");
        System.out.println("\t\t\t\t\t   |    |  |    |  |    |  |    |   ");
        System.out.println("\t\t\t\t\t   | 3A |  | 2A |  | 1A |  | SL |   ");
        System.out.println("\t\t\t\t\t   |____|  |____|  |____|  |____|   ");
        System.out.println("\t\t\t\t\t                                    " + all.reset + all.BOLD_RESET);
        System.out.println();
    }

    static void VWtoWGL() {
        System.out.println("\t\t\t\t\t" + all.purple + all.black_bg + all.change + all.thick
                + "                                    ");
        System.out.println("\t\t\t\t\t           KERALA  EXP(12625)       ");
        System.out.println("\t\t\t\t\t                                    " + all.bgreset + all.reset);
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t 11:05     ---01h:58m---     13:03  ");
        System.out.println("\t\t\t\t\t  Vijayawada jn          Warangal   ");
        System.out.println("\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t         Date : " + CurrentDate.time() + "          ");
        System.out.println("\t\t\t\t\t   ______  ______  ______  ______   ");
        System.out.println("\t\t\t\t\t   |    |  |    |  |    |  |    |   ");
        System.out.println("\t\t\t\t\t   | 3A |  | 2A |  | 1A |  | SL |   ");
        System.out.println("\t\t\t\t\t   |____|  |____|  |____|  |____|   ");
        System.out.println("\t\t\t\t\t                                    " + all.reset + all.BOLD_RESET);
        System.out.println();

        System.out.println("\t\t\t\t\t" + all.purple + all.black_bg + all.change + all.thick
                + "                                    ");
        System.out.println("\t\t\t\t\t       SWARNA JAYANTHI EXP(12803)   ");
        System.out.println("\t\t\t\t\t                                    " + all.bgreset + all.reset);
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t 14:25     ---02h:45m---     17:10  ");
        System.out.println("\t\t\t\t\t  Vijayawada jn           Warangal  ");
        System.out.println("\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t         Date : " + CurrentDate.time() + "          ");
        System.out.println("\t\t\t\t\t   ______  ______  ______  ______   ");
        System.out.println("\t\t\t\t\t   |    |  |    |  |    |  |    |   ");
        System.out.println("\t\t\t\t\t   | 3A |  | 2A |  | 1A |  | SL |   ");
        System.out.println("\t\t\t\t\t   |____|  |____|  |____|  |____|   ");
        System.out.println("\t\t\t\t\t                                    " + all.reset + all.BOLD_RESET);
        System.out.println();
    }

    static void VWtoKDP() {
        System.out.println("\t\t\t\t\t" + all.purple + all.black_bg + all.change + all.thick
                + "                                    ");
        System.out.println("\t\t\t\t\t           THIRUMALA EXP(17488)     ");
        System.out.println("\t\t\t\t\t                                    " + all.bgreset + all.reset);
        System.out.println(all.WHITE_BOLD + all.change + all.thick + "\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t 20:25     ---10h:35m---     07:00  ");
        System.out.println("\t\t\t\t\t  Vijayawada jn            Kadapa   ");
        System.out.println("\t\t\t\t\t                                    ");
        System.out.println("\t\t\t\t\t         Date : " + CurrentDate.time() + "          ");
        System.out.println("\t\t\t\t\t   ______  ______  ______  ______   ");
        System.out.println("\t\t\t\t\t   |    |  |    |  |    |  |    |   ");
        System.out.println("\t\t\t\t\t   | 3A |  | 2A |  | 1A |  | SL |   ");
        System.out.println("\t\t\t\t\t   |____|  |____|  |____|  |____|   ");
        System.out.println("\t\t\t\t\t                                    " + all.reset + all.BOLD_RESET);
        System.out.println();

    }

}

class Train {
    static void trainStructure(int trainnum1, int trainnum2, String fromcity, String tocity) {
        System.out.println("Enter the Train Number : ");
        System.out.println();
        int trainno = 0;
        String categ;
        while (true) {
            trainno = Integer.parseInt(all.sc.nextLine());
            if (trainno != trainnum1 && trainno != trainnum2) {
                System.out.println("Please Enter valid Train Number");

            } else {
                break;
            }
        }

        System.out.println("Enter the class you want - ");
        while (true) {
            categ = all.sc.next();
            if ((categ.equalsIgnoreCase("1a") || categ.equalsIgnoreCase("2a") || categ.equalsIgnoreCase("3a")
                    || categ.equalsIgnoreCase("sl")) && (trainno != 20834 && trainno != 12740))
                break;
            else if ((categ.equalsIgnoreCase("cc") || categ.equalsIgnoreCase("ec")) && (trainno == 20834))
                break;
            else if ((categ.equalsIgnoreCase("3a")) && (trainno == 12740))
                break;
            else
                System.out.print("Please Enter valid class you want to select");
        }

        int totalseats = 0;
        while (true) {
            System.out.println("Enter Number of Seats : ");
            totalseats += all.sc.nextInt();
            // int k[]=otp.otp(totalseats,1,totalseats);
            // System.out.print(k[]);
            // System.out.println(otp.otp(totalseats,1,totalseats));
            System.out.println("Enter 1 for more Seats/n 2 for billing");
            int n = all.sc.nextInt();

            if (n == 2) {
                billing.trainbill(totalseats, categ, fromcity, tocity, trainno);
                break;
            } else if (n == 1)
                continue;
        }
    }

    static void trains(String fromcity, String tocity) {
        if (fromcity.equalsIgnoreCase("Secunderabad") && tocity.equalsIgnoreCase("Warangal")) {
            chooseTrain.SECtoWRL();
            trainStructure(12760, 22691, "Secunderabad", "Warangal");

        } else if (fromcity.equalsIgnoreCase("Secunderabad") && tocity.equalsIgnoreCase("Vishakapatnam")) {
            chooseTrain.SECtoVZG();
            trainStructure(17016, 20834, "Secunderabad", "Vishakapatnam");
        } else if (fromcity.equalsIgnoreCase("Secunderabad") && tocity.equalsIgnoreCase("Kadapa")) {
            chooseTrain.SECtoKDP();
            trainStructure(12797, 12794, "Secunderabad", "Kadapa");
        } else if (fromcity.equalsIgnoreCase("Warangal") && tocity.equalsIgnoreCase("Vishakapatnam")) {
            chooseTrain.WRLtoVZG();
            trainStructure(12740, 12728, "Warangal", "Vishakapatnam");
        } else if (fromcity.equalsIgnoreCase("Warangal") && tocity.equalsIgnoreCase("kadapa")) {
            chooseTrain.WRLtoKDP();
            trainStructure(12708, 12708, "Warangal", "Kadapa");

        } else if (fromcity.equalsIgnoreCase("Vijaywada") && tocity.equalsIgnoreCase("Vishakapatnam")) {
            chooseTrain.VWtoVZG();
            trainStructure(12704, 18464, "Vijaywada", "Vishakapatnam");
        } else if (fromcity.equalsIgnoreCase("Vijaywada") && tocity.equalsIgnoreCase("kadapa")) {
            chooseTrain.VWtoKDP();
            trainStructure(17488, 17488, "Vijaywada", "Kadapa");

        } else if (fromcity.equalsIgnoreCase("Vijaywada") && tocity.equalsIgnoreCase("Warangal")) {
            chooseTrain.VWtoWGL();
            trainStructure(12625, 12803, "Vijaywada", "Warangal");
        }

    }

    static void again() {
        System.out.println(
                all.purple_bt + all.purple_ul + "\t\t\t\t\t\t\t\t\tFrom Station Names" + all.reset + all.rstul);
        display.trainfromcity();
        System.out.println(all.PURPLE_BOLD + "\t\t\t\t\t\t\t\tEnter From Station Name : " + all.reset);
        String fromcity;
        while (true) {
            fromcity = all.sc.nextLine();
            if (!fromcity.equalsIgnoreCase("Secunderabad") && !fromcity.equalsIgnoreCase("Warangal")
                    && !fromcity.equalsIgnoreCase("Vijaywada"))
                System.out.println("Enter a valid Source Station name:");
            else
                break;
        }
        // String fromcity=all.sc.nextLine();
        System.out.println("\t\t\t\t\t\t\t\tTo Station Name");
        display.traintocity();
        System.out.println("\t\t\t\t\t\t\t\tEnter To Station Name : ");
        String tocity;
        while (true) {
            tocity = all.sc.nextLine();
            if (!tocity.equalsIgnoreCase("Warangal") && !tocity.equalsIgnoreCase("Kadapa")
                    && !tocity.equalsIgnoreCase("Vishakapatnam"))
                System.out.println("\t\t\t\t\t\t\t\tEnter valid Station name:");
            else
                break;
        }

        if (fromcity.equalsIgnoreCase(tocity)) {
            System.out.print("\t\t\t\t\t\t\t\tSource and Destination couldn't be Same");
            again();
        } else {
            trains(fromcity, tocity);
        }
    }

    static void trainprocess() {
        display.train();
        again();
    }
}

// uber

class bike {
    void choice(int stops, String name) {
        billing.uberbill(1, stops, 1, name);
    }
}

class Auto extends bike {
    void choice(int stops, String name) {
        System.out.print("\t\t\t\t\t\t\t\tEnter number of Persons : ");
        while (true) {
            int num = Integer.parseInt(all.sc.nextLine());
            if (num > 3 || num < 1) {
                System.out.print("\t\t\t\t\t\t\t\tPlease Enter valid number of people :");
            } else {
                billing.uberbill(num, stops, 2, name);
                break;
            }
        }
    }
}

class Car extends Auto {
    void choice(int stops, String name) {
        System.out.print("\t\t\t\t\t\t\t\tEnter number of Persons : ");
        while (true) {
            int num = Integer.parseInt(all.sc.nextLine());
            if (num > 4 || num < 1) {
                System.out.print("\t\t\t\t\t\t\t\tPlease Enter valid number of people : ");
            } else {
                billing.uberbill(num, stops, 2, name);
                break;
            }
        }

    }
}

class uber extends Car {
    static String[] arrplaces = { "", "Miyapur", "kphb", "BharatNagar", "Ameerpet", "khairatabad", "assembly",
            "Gandhibhavan", "MGbusstation", "NarayanaGuda" };

    public static void main(String[] args) {
        display.ubertitle();
        String from;
        String to;
        String ubername;
        int fromnum = 0;
        int tonum = 0;
        System.out.println(all.PURPLE_BOLD + all.purple_ul + "\n\n\t\t\t\t\t\t\t\tPlaces List" + all.reset + all.rstul);
        for (int i = 1; i <= 9; i++) {
            System.out.print(all.blue + "   " + arrplaces[i] + "");
            if (i != 9)
                System.out.print(all.red + " <-->" + all.reset);
        }
        System.out.print(all.reset);
        while (true) {
            System.out.print(all.GREEN_BOLD + "\n\n\t\t\t\t\t\t\t   Select From : " + all.reset);
            while (true) {
                from = all.sc.next();
                int i = 1;
                for (i = 1; i <= 9; i++) {
                    if (from.equalsIgnoreCase(arrplaces[i])) {
                        fromnum = i;
                        break;
                    }
                }
                if (i > 9)
                    System.out.print(all.RED_BOLD + "\t\t\t\t\t\t\tPlease Enter Valid From Place " + all.reset);
                if (i <= 9)
                    break;
            }
            System.out.print(all.skyblue + "\t\t\t\t\t\t\t\t    To : " + all.reset);
            while (true) {
                to = all.sc.next();
                int i = 1;
                for (i = 1; i <= 9; i++) {
                    if (to.equalsIgnoreCase(arrplaces[i])) {
                        tonum = i;
                        break;
                    }
                }
                if (i > 9)
                    System.out.print(all.RED_BOLD + all.red_ul + "\t\t\t\t\t\tPlease Enter Valid To Place" + all.reset
                            + all.rstul);
                if (i <= 9)
                    break;
            }
            if (from.equalsIgnoreCase(to)) {
                System.out.println(all.RED_BOLD + all.red_ul + "\t\t\t\t\t\t\tFrom and to places cannot be same"
                        + all.reset + all.rstul);
            } else {
                System.out.println(
                        all.YELLOW_BOLD + all.yellow_ul + "\t\t\t\t\t\t\t\tMode of Transports" + all.reset + all.rstul);
                System.out.println(all.GREEN_BOLD
                        + "\t\t\t\t\t\t\t\t\t1.Bike\n\t\t\t\t\t\t\t\t\t2.Auto\n\t\t\t\t\t\t\t\t\t3.Car\t\t\t\t\t\t\t\t\t"
                        + all.reset);
                System.out.print(all.PURPLE_BOLD + "\t\t\t\t\t\t\tSelect Your Mode Of Transport " + all.reset);
                all.sc.nextLine();
                int mode = Integer.parseInt(all.sc.nextLine());
                int count = tonum - fromnum;
                count = Math.abs(count);
                if (mode == 1) {
                    System.out.println(all.YELLOW_BOLD + all.yellow_ul + "\t\t\t\t\t\t\t\tYou have Chooosen Bike"
                            + all.reset + all.rstul);
                    bike obj = new bike();
                    System.out.print(all.BLUE_BOLD + "\t\t\t\t\t\t\t\tEnter Your Name : " + all.reset);
                    ubername = all.sc.nextLine();
                    obj.choice(count, ubername);
                } else if (mode == 2) {
                    System.out.println(all.YELLOW_BOLD + all.yellow_ul + "\t\t\t\t\t\t\t\tYou have Choosen Auto"
                            + all.reset + all.rstul);
                    Auto obj = new Auto();
                    System.out.print(all.BLUE_BOLD + "\t\t\t\t\t\t\t\tEnter Your Name : " + all.reset);
                    ubername = all.sc.nextLine();
                    obj.choice(count, ubername);
                } else if (mode == 3) {
                    System.out.println(all.YELLOW_BOLD + all.yellow_ul + "\t\t\t\t\t\t\t\tYou have Choosen Car"
                            + all.reset + all.rstul);
                    Car obj = new Car();
                    System.out.print(all.BLUE_BOLD + "\t\t\t\t\t\t\t\tEnter Your Name : " + all.reset);
                    ubername = all.sc.nextLine();
                    obj.choice(count, ubername);
                }
                break;
            }
        }

    }
}

/// Courier services
class Package {
    private long phonenumber;
    private long packageOTP;
    private String senderName;
    private String receiverName;
    private String source_address;
    private String dest_address;
    private double weight;
    private double bill_amount;
    private String payment_status;

    public Package(long phonenumber, long packageOTP, String senderName, String receiverName, String source_address,
            String dest_address, double weight, double bill_amount, String payment_status) {
        this.phonenumber = phonenumber;
        this.packageOTP = packageOTP;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.source_address = source_address;
        this.dest_address = dest_address;
        this.weight = weight;
        this.bill_amount = bill_amount;
        this.payment_status = payment_status;
    }

    public String getpaymentstatus() {
        return payment_status;
    }

    public long getphonenumber() {
        return phonenumber;
    }

    public long getPackageId() {
        return packageOTP;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public double getWeight() {
        return weight;
    }

    public String getSource() {
        return source_address;
    }

    public String getDest() {
        return dest_address;
    }

    public double getamount() {
        return bill_amount;
    }
}

class user1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(all.yellow_bg + all.black_bd_bt
                + all.blink
                + ("                                                                                                                                                                          \n        \u2591\u2592\u2588\u2591\u2591\u2592\u2588\u2591\u2592\u2588\u2580\u2580\u2580\u2591\u2592\u2588\u2591\u2591\u2591\u2591\u2592\u2588\u2580\u2580\u2584\u2591\u2592\u2588\u2580\u2580\u2580\u2588\u2591\u2592\u2588\u2580\u2584\u2580\u2588\u2591\u2592\u2588\u2580\u2580\u2580\u2591\u2591\u2591\u2580\u2580\u2588\u2580\u2580\u2591\u2592\u2588\u2580\u2580\u2580\u2588\u2591\u2591\u2591\u2592\u2588\u2580\u2580\u2584\u2591\u2592\u2588\u2580\u2580\u2580\u2588\u2591\u2592\u2588\u2591\u2592\u2588\u2591\u2592\u2588\u2580\u2580\u2584\u2591\u2580\u2588\u2580\u2591\u2592\u2588\u2580\u2580\u2580\u2591\u2592\u2588\u2580\u2580\u2584\u2591\u2591\u2591\u2592\u2588\u2580\u2580\u2580\u2588\u2591\u2592\u2588\u2580\u2580\u2580\u2591\u2592\u2588\u2580\u2580\u2584\u2591\u2592\u2588\u2591\u2591\u2592\u2588\u2591\u2580\u2588\u2580\u2591\u2592\u2588\u2580\u2580\u2584\u2591\u2592\u2588\u2580\u2580\u2580\u2591\u2592\u2588\u2580\u2580\u2580\u2588        \r        \n"
                        + //
                        "        \u2591\u2592\u2588\u2592\u2588\u2592\u2588\u2591\u2592\u2588\u2580\u2580\u2580\u2591\u2592\u2588\u2591\u2591\u2591\u2591\u2592\u2588\u2591\u2591\u2591\u2591\u2592\u2588\u2591\u2591\u2592\u2588\u2591\u2592\u2588\u2592\u2588\u2592\u2588\u2591\u2592\u2588\u2580\u2580\u2580\u2591\u2591\u2591\u2591\u2592\u2588\u2591\u2591\u2591\u2592\u2588\u2591\u2591\u2592\u2588\u2591\u2591\u2591\u2592\u2588\u2591\u2591\u2591\u2591\u2592\u2588\u2591\u2591\u2592\u2588\u2591\u2592\u2588\u2591\u2592\u2588\u2591\u2592\u2588\u2584\u2584\u2580\u2591\u2592\u2588\u2591\u2591\u2592\u2588\u2580\u2580\u2580\u2591\u2592\u2588\u2584\u2584\u2580\u2591\u2591\u2591\u2591\u2580\u2580\u2580\u2584\u2584\u2591\u2592\u2588\u2580\u2580\u2580\u2591\u2592\u2588\u2584\u2584\u2580\u2591\u2591\u2592\u2588\u2592\u2588\u2591\u2591\u2592\u2588\u2591\u2591\u2592\u2588\u2591\u2591\u2591\u2591\u2592\u2588\u2580\u2580\u2580\u2591\u2591\u2580\u2580\u2580\u2584\u2584        \r       \n"
                        + //
                        "        \u2591\u2592\u2580\u2584\u2580\u2584\u2580\u2591\u2592\u2588\u2584\u2584\u2584\u2591\u2592\u2588\u2584\u2584\u2588\u2591\u2592\u2588\u2584\u2584\u2580\u2591\u2592\u2588\u2584\u2584\u2584\u2588\u2591\u2592\u2588\u2591\u2591\u2592\u2588\u2591\u2592\u2588\u2584\u2584\u2584\u2591\u2591\u2591\u2591\u2592\u2588\u2591\u2591\u2591\u2592\u2588\u2584\u2584\u2584\u2588\u2591\u2591\u2591\u2592\u2588\u2584\u2584\u2580\u2591\u2592\u2588\u2584\u2584\u2584\u2588\u2591\u2591\u2580\u2584\u2584\u2580\u2591\u2592\u2588\u2591\u2592\u2588\u2591\u2584\u2588\u2584\u2591\u2592\u2588\u2584\u2584\u2584\u2591\u2592\u2588\u2591\u2592\u2588\u2591\u2591\u2591\u2592\u2588\u2584\u2584\u2584\u2588\u2591\u2592\u2588\u2584\u2584\u2584\u2591\u2592\u2588\u2591\u2592\u2588\u2591\u2591\u2591\u2580\u2584\u2580\u2591\u2591\u2584\u2588\u2584\u2591\u2592\u2588\u2584\u2584\u2580\u2591\u2592\u2588\u2584\u2584\u2584\u2591\u2592\u2588\u2584\u2584\u2584\u2588        \r       \n                                                                                                                                                                          "
                        + //
                        "")
                + all.bgreset + all.reset + all.rstblink);
        System.out.println(
                "\n                                                              ENTER THE COURIER SERVICE YOU WANT :                                                                                    ");
        System.out.println("1.DTDC EXPRESS.");
        System.out.println("2.BLUE DART EXPRESS.");
        System.out.print("Select Option : ");
        // all.sc.nextLine();
        int pickup = scanner.nextInt();
        scanner.nextLine();
        if (pickup == 2) {
            BlueDart blue = new BlueDart();
            blue.BlueDarter();
        } else if (pickup == 1) {
            DTDC dt = new DTDC();
            dt.DtDc();
         }// else if (pickup == 3) 
        // {
        //     System.out.println(all.red + "you are exiting the application" + all.reset);
        // } 
        else 
        {
            System.out.println(all.red + "Invalid Input  please select valid input " + all.reset);
            main(args);
        }
    }
}

class BlueDart {
    public void BlueDarter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("   \n");
        String pattern = "                          oooooooooo.  ooooo        ooooo     ooo oooooooooooo      oooooooooo.         .o.       ooooooooo.   ooooooooooooo                    \n"
                +
                "                          `888'   `Y8b `888'        `888'     `8' `888'     `8      `888'   `Y8b       .888.      `888   `Y88. 8'   888   `8      Yb     Yb     \n"
                +
                "                           888     888  888          888       8   888               888      888     .8\"888.      888   .d88'      888            `Yb    `Yb   \n"
                +
                "                           888oooo888'  888          888       8   888oooo8          888      888    .8' `888.     888ooo88P'       888              `Yb    `Yb \n"
                +
                "                           888    `88b  888          888       8   888    \"          888      888   .88ooo8888.    888`88b.         888              .dP    .dP \n"
                +
                "                           888    .88P  888       o  `88.    .8'   888       o       888     d88'  .8'     `888.   888  `88b.       888            .dP    .dP   \n"
                +
                "                          o888bood8P'  o888ooooood8    `YbodP'    o888ooooood8      o888bood8P'   o88o     o8888o o888o  o888o     o888o          dP     dP     \n";
        System.out.println("\n");
        char[] patternChars = pattern.toCharArray();
        try {
            for (char c : patternChars) {
                System.out.print(all.white_bg + all.blue + c + all.reset);
                Thread.sleep(5); // Adjust the sleep delay as needed
            }
        } catch (InterruptedException e) {
        }

        String x = "\t\tWELCOME TO BLUE DART EXPRESS ";
        System.out.println("\n");

        try {
            for (int i = 0; i < x.length(); i++) {
                Thread.sleep(100);

                char S = x.charAt(i);
                System.out.print(all.green + all.BOLD + "    " + S + all.reset);

            }
            System.out.println("\n");
        } catch (InterruptedException e) {
        }
        // System.out.println("\u001B[0m");

        boolean option1Executed = false;
        boolean option2Executed = true;
        boolean option3Executed = true;
        Package[] packages = new Package[10];
        int packageCount = 0;

        while (true) {
            double bill;
            String source_address = "", dest_address = "";
            int max = 100000, min = 999999;
            long OTP = 0;
            if (!option1Executed) {
                System.out.println(all.cyan + all.ital + "1. Check the list of Prices.");
            }
            System.out.println(all.cyan + all.ital + "2. Add a package.");
            System.out.println("3. Track a package.");
            System.out.println("4. Track Payment status.");
            System.out.println("5. Exit this program and visit home page.\n" + all.reset);
            System.out.print(all.green + all.ital + "Select an option: " + all.reset);
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1 && !option1Executed) {
                option1Executed = true;
                System.out.println(all.cyan + all.BOLD + all.ital
                        + "                                                                            list of Prices.              \n"
                        + all.reset);
                System.out.println(
                        "                                                            \u001B[33m"
                                + " ________________________________________________ "
                                + "\u001B[0m");
                System.out.println(
                        "                                                            \u001B[33m"
                                + "|                                                |"
                                + "\u001B[0m");
                System.out.println(all.green + all.BOLD
                        + "                                                            \u001B[33m"
                        + "|-------TRANSPORT CHARGES FOR LOCATIONS----------|" + "\u001B[0m"
                        + all.reset);
                System.out.println(
                        "                                                            \u001B[33m"
                                + "| ---------------------------------------------- |"
                                + "\u001B[33m");
                System.out.println(
                        "                                                            \u001B[33m"
                                + "|" + all.white + " source" + all.yellow + "      |"
                                + all.white + "  Destination" + all.yellow + "      |"
                                + all.white + " KMS" + all.yellow + "  |" + all.white
                                + " Price" + all.yellow + " |" + all.reset
                                + "\u001B[33m");
                System.out.println(
                        "                                                            \u001B[33m"
                                + "|----------------------------------------------- |"
                                + "\u001B[33m");
                System.out.println(all.white
                        + "                                                            \u001B[33m"
                        + "|" + all.green + " HYDERABAD" + all.yellow + "   |" + all.green
                        + "  MACHILIPATNAM" + all.yellow + "    |" + all.green + " 340"
                        + all.yellow + "  |" + all.green + " 680" + all.yellow + "   |"
                        + all.reset + "\u001B[33m");
                System.out.println(all.white
                        + "                                                            \u001B[33m"
                        + "|" + all.green + " HYDERABAD" + all.yellow + "   |" + all.green
                        + "  VIJAYAWADA   " + all.yellow + "    |" + all.green + " 274"
                        + all.yellow + "  |" + all.green + " 548" + all.yellow + "   |"
                        + all.reset + "\u001B[33m");
                System.out.println(all.white
                        + "                                                            \u001B[33m"
                        + "|" + all.green + " HYDERABAD" + all.yellow + "   |" + all.green
                        + "  WARANGAL     " + all.yellow + "    |" + all.green + " 146"
                        + all.yellow + "  |" + all.green + " 292" + all.yellow + "   |"
                        + all.reset + "\u001B[33m");
                System.out.println(all.white
                        + "                                                            \u001B[33m"
                        + "|" + all.green + " HYDERABAD" + all.yellow + "   |" + all.green
                        + "  VISAKHAPATNAM" + all.yellow + "    |" + all.green + " 615"
                        + all.yellow + "  |" + all.green + " 1230" + all.yellow + "  |"
                        + all.reset + "\u001B[33m");
                System.out.println(all.reset
                        + "                                                            \u001B[33m"
                        + "|" + all.green + " HYDERABAD" + all.yellow + "   |" + all.green
                        + "  KADAPA       " + all.yellow + "    |" + all.green + " 418"
                        + all.yellow + "  |" + all.green + " 836" + all.yellow + "   |"
                        + all.reset + "\u001B[33m");
                System.out.println(all.reset
                        + "                                                            \u001B[33m"
                        + "|" + all.green + " HYDERABAD" + all.yellow + "   |" + all.green
                        + "  BENGALURU    " + all.yellow + "    |" + all.green + " 572"
                        + all.yellow + "  |" + all.green + " 1144" + all.yellow + "  |"
                        + all.reset + "\u001B[33m");
                System.out.println(all.white
                        + "                                                            \u001B[33m"
                        + "|" + all.green + " HYDERABAD" + all.yellow + "   |" + all.green
                        + "  CHENNAI      " + all.yellow + "    |" + all.green + " 627"
                        + all.yellow + "  |" + all.green + " 1254" + all.yellow + "  |"
                        + all.reset + "\u001B[33m");
                System.out.println(all.white
                        + "                                                            \u001B[33m"
                        + "|________________________________________________|" + "\u001B[0m"
                        + all.reset);
            } else if (choice == 2) {
                System.out.println(all.cyan_bd_bt + all.cyan + all.ital
                        + "\n                                                                            ADD YOUR PACKAGE .\n"
                        + all.reset);
                System.out.println("");
                System.out.print(
                        "                                                 Enter phone number                 :                 ");// package
                                                                                                                                  // id

                long packagenumber = scanner.nextLong();
                OTP = min + (int) (Math.random() * ((max - min) + 1));
                scanner.nextLine(); // Consume newline
                long phonenumbers = packagenumber;
                int count = 0;
                while (phonenumbers != 0) {
                    // removing the last digit of the number n
                    phonenumbers = phonenumbers / 10;
                    // increasing count by 1
                    count = count + 1;
                }
                while (count != 10) {
                    System.out.println(
                            "                                                                Invalid phone number size\n");
                    System.out.print(
                            "                                                                    Re-enter phone number :");
                    packagenumber = scanner.nextLong();
                    phonenumbers = packagenumber;
                    count = 0;
                    while (phonenumbers != 0) {
                        // removing the last digit of the number n
                        phonenumbers = phonenumbers / 10;
                        // i increasing count by 1
                        count = count + 1;
                    }
                }
                System.out.println("");
                System.out.println(all.green
                        + "                                                 your package Id                    :                 "
                        + OTP + all.reset);
                System.out.println("");
                System.out.print(
                        "                                                 Enter sender's name                :                 ");// sender
                                                                                                                                  // name

                String senderName = scanner.nextLine();
                System.out.println("");
                System.out.print(
                        "                                                 Enter receiver's name              :                 ");// receiver
                                                                                                                                  // name

                String receiverName = scanner.nextLine();
                System.out.println("");
                System.out.print(
                        "                                                 Enter package weight (in kg)       :                 ");// Package
                                                                                                                                  // Weight

                double weight = scanner.nextDouble();

                System.out.println("\n");
                System.out.println(
                        all.cyan + all.BOLD
                                + "                                                                      YOUR SOURCE ADDRESS IS HYDERABAD ."
                                + all.reset);

                System.out.println("\n");

                System.out.println(all.yellow
                        + "                                                                          Select Destination Address:"
                        + all.reset);// Destination
                // Address
                System.out.println("\n");

                System.out.println(
                        "                                                                            1.MACHILIPATNAM.\n");
                System.out.println(
                        "                                                                            2.VIJAYAWADA .\n");
                System.out.println(
                        "                                                                            3.WARANGAL .\n");
                System.out.println(
                        "                                                                            4.VISAKHAPATNAM.\n");
                System.out.println(
                        "                                                                            5.KADAPA.\n");
                System.out.println(
                        "                                                                            6.BENGALURU.\n");
                System.out.println("\n");
                System.out.print(all.purple
                        + "                                                                     Enter Destination (option number):"
                        + all.reset);

                int chooser = 0;
                // scanner.nextLine();
                while (true) {
                    chooser = scanner.nextInt();
                    if (chooser == 1) {
                        dest_address = "MACHILIPATNAM";
                        break;
                    } else if (chooser == 2) {
                        dest_address = "VIJAYAWADA";
                        break;
                    } else if (chooser == 2) {
                        dest_address = "WARANGAL";
                        break;
                    } else if (chooser == 2) {
                        dest_address = "VISAKHAPATNAM";
                        break;
                    } else if (chooser == 2) {
                        dest_address = "KADAPA";
                        break;
                    } else if (chooser == 2) {
                        dest_address = "BENGALURU";
                        break;
                    } else {
                        System.out.print(all.red + all.red_ul + "\n\t\t\t\t\t\t\t\tEntered Invalid Input" + all.rstul
                                + all.reset);
                        System.out.print("\n\t\t\t\t\t\t\t\tPlease Enter Valid Input : ");
                    }

                }
                double service_charge = 0.0;
                if (chooser == 1)
                    service_charge = 680;
                else if (chooser == 2)
                    service_charge = 548;
                else if (chooser == 3)
                    service_charge = 292;
                else if (chooser == 4)
                    service_charge = 1230;
                else if (chooser == 5)
                    service_charge = 836;
                else if (chooser == 6)
                    service_charge = 1144;
                else if (chooser == 7)
                    service_charge = 1254;

                double bill_amount = (service_charge * 1 + (weight * 4.0));
                System.out.println(
                        "\n                                                                        Transportation cost: "
                                + bill_amount + " Rs");
                System.out.println();
                System.out.print(all.red
                        + "                                                       Would you like to proceed for  Payment(yes or no) options(1 or 0):"
                        + all.reset);

                int opt = scanner.nextInt();// user input for yes or no
                System.out.println("");
                if (opt == 1)// option to select payment in Blue Dart
                {
                    String payment_status = "Completed";
                    packages[packageCount] = new Package(packagenumber, OTP, senderName,
                            receiverName, source_address,
                            dest_address,
                            weight, bill_amount, payment_status);
                    packageCount++;
                    test.selectpaymethod(bill_amount);

                    // System.out.println(all.cyan + all.cyan_bd_bt + "1.GOOGLE PAY\n" + all.reset);
                    // System.out.println(
                    // all.yellow + all.yellow_bd_bt + "2.AMAZON PAY\n" + all.reset);
                    // System.out.println(all.blue + all.blue_bd_bt + "3.PHONE PE\n" + all.reset);
                    // System.out.println(all.white + all.white_bd_bt + "4.PAYTM\n" + all.reset);
                    // System.out.print("Select options :");
                    // int ch = scanner.nextInt();
                    // scanner.nextLine();
                    // switch (ch) {
                    // case 1:
                    // System.out.println(all.green + all.ital
                    // + " Amount paid after discount :"
                    // + all.reset + (bill_amount - 10));
                    // break;
                    // case 2:
                    // System.out.println(all.green + all.ital
                    // + " Amount paid after discount :"
                    // + all.reset
                    // + (bill_amount - 5));
                    // break;
                    // case 3:
                    // System.out.println(all.green + all.ital
                    // + " Amount paid after discount :"
                    // + all.reset
                    // + (bill_amount - 8));
                    // break;
                    // case 4:
                    // System.out.println(all.green + all.ital
                    // + " Amount paid after discount :"
                    // + all.reset
                    // + (bill_amount - 6));
                    // break;
                    // default:
                    // System.out.println("Invalid selection");
                    // break;
                    // }
                    System.out.println(all.blue + all.ital + all.green_bg_bt + all.black_ul + all.BOLD
                            + "\n                                                                        Package added successfully.                                                                       \n"
                            + all.reset);
                    System.out.println("");
                } else {
                    String payment_status = all.red + "Pending.." + all.reset;
                    packages[packageCount] = new Package(packagenumber, OTP, senderName,
                            receiverName, source_address,
                            dest_address,
                            weight, bill_amount, payment_status);
                    packageCount++;
                }
            } else if (choice == 3) {
                // Track a package
                System.out.println(all.cyan + all.cyan_bd_bt
                        + "                                                                            TRACK A PACKAGE \n  "
                        + all.reset);
                System.out.print("Enter package Id to track: ");
                long packageIdToTrack = scanner.nextLong();
                scanner.nextLine(); // Consume newline

                boolean packageFound = false;
                for (int i = 0; i < packageCount; i++) {
                    if (packages[i].getPackageId() == packageIdToTrack) {
                        packageFound = true;
                        System.out.println("\u001B[32m"
                                + "                                                                             Package found."
                                + "\u001B[0m");
                        System.out.println("");
                        System.out.println(
                                "                                                 sender's name                      :                 "
                                        + packages[i].getSenderName());
                        System.out.println("");
                        System.out.println(
                                "                                                 receiver's name                    :                 "
                                        + packages[i].getReceiverName());
                        System.out.println("");
                        System.out.println(
                                "                                                 Source                             :                 HYDERABAD ");
                        System.out.println("");
                        System.out.println(
                                "                                                 Destination                        :                 "
                                        + packages[i].getDest());
                        System.out.println("");
                        System.out.println(
                                "                                                 Phone number                       :                 "
                                        + packages[i].getphonenumber());
                        System.out.println("");
                        System.out.println(
                                "                                                 Weight                             :                 "
                                        + packages[i].getWeight() + " kg");
                        System.out.println("");
                        System.out.println(
                                "                                                 Amount Charged                     :                 "
                                        + packages[i].getamount());
                        System.out.println("");
                        break;
                    }
                }
                if (!packageFound) {
                    System.out.println(all.red + all.ital + "\t\t\t\t\t\t\t\tPackage not found." + all.reset);
                }
            } else if (choice == 4) {

                System.out.println(all.cyan + all.cyan_bd_bt
                        + "                                                                          TRACK PAYMENT STATUS \n"
                        + all.reset);
                System.out.print("Enter package Id to track: ");
                long packageIdToTrack = scanner.nextLong();
                scanner.nextLine(); // Consume newline

                boolean packageFound = false;
                for (int i = 0; i < packageCount; i++) {
                    if (packages[i].getPackageId() == packageIdToTrack) {
                        packageFound = true;
                        System.out.print("\n");
                        System.out.println(
                                "\u001B[32m"
                                        + "                                                                         ----Billing Details----"
                                        + "\u001B[0m");
                        System.out.println("");
                        System.out.println(
                                "                                                 receiver                           :                 "
                                        + packages[i].getReceiverName());
                        System.out.println("");
                        System.out.println(
                                "                                                 Source                             :                 HYDERABAD ");
                        System.out.println("");
                        System.out.println(
                                "                                                 Destination                        :                 "
                                        + packages[i].getDest());
                        System.out.println("");
                        System.out.println(
                                "                                                 Phone number                       :                 "
                                        + packages[i].getphonenumber());
                        System.out.println("");
                        System.out.println(
                                "                                                 Weight                             :                 "
                                        + packages[i].getWeight() + " kg");
                        System.out.println("");
                        System.out.println(
                                "                                                 Amount Charged                     :                 "
                                        + packages[i].getamount());
                        System.out.println("");
                        System.out.println(
                                "                                                 Payment status                     :                 "
                                        + packages[i].getpaymentstatus());
                        System.out.print("\n");
                        break;
                    }
                }
                if (!packageFound) {
                    System.out.println(all.red + all.ital
                            + "                                                              Package not found."
                            + all.reset);
                }
            } else if (choice == 5) {
                // Exit
                System.out.println(all.red + all.red_bd_bt + all.ital
                        + "\n                                                    Exiting the program."
                        + all.reset);
                        project.log();
                break;
            } else {
                System.out.println(all.red + "\t\t\t\t\t\t\t\tInvalid choice. Please try again." + all.reset);
            }
        }
    }
}

class DTDC {
    public void DtDc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("   \n");
        String pattern = "                                                    888 88e     88P'888'Y88   888 88e       e88'Y88     Y8b   Y8b   \n"
                +
                "                                                    888 888b    P'  888  'Y   888 888b     d888  'Y      Y8b   Y8b  \n"
                +
                "                                                    888 8888D       888       888 8888D   C8888           D8D   D8D \n"
                +
                "                                                    888 888P        888       888 888P     Y888  ,d      d8P   d8P  \n"
                +
                "                                                    888 88\"         888       888 88\"       \"88,d88     d8P   d8P  \n";
        System.out.println("\n");
        char[] patternChars = pattern.toCharArray();
        try {
            for (char c : patternChars) {
                System.out.print(all.white_bg + all.red + c + all.reset + all.bgreset);
                Thread.sleep(5); // Adjust the sleep delay as needed
            }
        } catch (InterruptedException e) {
        }

        String x = "\t\t\tWELCOME TO DTDC EXPRESS ";
        System.out.println("\n");

        try {
            for (int i = 0; i < x.length(); i++) {
                Thread.sleep(50);

                char S = x.charAt(i);
                System.out.print(all.green + all.BOLD + "    " + S + all.reset);

            }
            System.out.println();
        } catch (InterruptedException e) {
        }
        System.out.println();
        // System.out.println("\u001B[0m");

        boolean option1Executed = false;
        boolean option2Executed = true;
        boolean option3Executed = true;
        Package[] packages = new Package[10];
        int packageCount = 0;

        while (true) {
            String source_address = "", dest_address = "";
            int max = 100000, min = 999999;
            long OTP = 0;
            double bill;
            if (!option1Executed) {
                System.out.println(all.cyan + all.ital + "1. Check the list of Prices.");
            }
            System.out.println(all.cyan + all.ital + "2. Add a package.");
            System.out.println("3. Track a package.");
            System.out.println("4. Track Payment status.");
            System.out.println("5. Exit this program and visit home page.\n" + all.reset);
            System.out.print(all.green + all.ital + "Select an option: " + all.reset);
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1 && !option1Executed) {
                option1Executed = true;
                System.out.println(all.blue + all.BOLD + all.ital
                        + "                                                                            list of Prices.              "
                        + all.reset);
                System.out.println(
                        "                                                            \u001B[33m"
                                + " ________________________________________________ "
                                + "\u001B[0m");
                System.out.println(
                        "                                                            \u001B[33m"
                                + "|                                                |"
                                + "\u001B[0m");
                System.out.println(all.green + all.BOLD
                        + "                                                            \u001B[33m"
                        + "|-------TRANSPORT CHARGES FOR LOCATIONS----------|" + "\u001B[0m"
                        + all.reset);
                System.out.println(
                        "                                                            \u001B[33m"
                                + "| ---------------------------------------------- |"
                                + "\u001B[33m");
                System.out.println(
                        "                                                            \u001B[33m"
                                + "|" + all.white + " source" + all.yellow + "      |"
                                + all.white + "  Destination" + all.yellow + "      |"
                                + all.white + " KMS" + all.yellow + "  |" + all.white
                                + " Price" + all.yellow + " |" + all.reset
                                + "\u001B[33m");
                System.out.println(
                        "                                                            \u001B[33m"
                                + "|----------------------------------------------- |"
                                + "\u001B[33m");
                System.out.println(all.white
                        + "                                                            \u001B[33m"
                        + "|" + all.green + " HYDERABAD" + all.yellow + "   |" + all.green
                        + "  MACHILIPATNAM" + all.yellow + "    |" + all.green + " 340"
                        + all.yellow + "  |" + all.green + " 1020" + all.yellow + "  |"
                        + all.reset + "\u001B[33m");
                System.out.println(all.white
                        + "                                                            \u001B[33m"
                        + "|" + all.green + " HYDERABAD" + all.yellow + "   |" + all.green
                        + "  VIJAYAWADA   " + all.yellow + "    |" + all.green + " 274"
                        + all.yellow + "  |" + all.green + " 822" + all.yellow + "   |"
                        + all.reset + "\u001B[33m");
                System.out.println(all.white
                        + "                                                            \u001B[33m"
                        + "|" + all.green + " HYDERABAD" + all.yellow + "   |" + all.green
                        + "  WARANGAL     " + all.yellow + "    |" + all.green + " 146"
                        + all.yellow + "  |" + all.green + " 438" + all.yellow + "   |"
                        + all.reset + "\u001B[33m");
                System.out.println(all.white
                        + "                                                            \u001B[33m"
                        + "|" + all.green + " HYDERABAD" + all.yellow + "   |" + all.green
                        + "  VISAKHAPATNAM" + all.yellow + "    |" + all.green + " 615"
                        + all.yellow + "  |" + all.green + " 1845" + all.yellow + "  |"
                        + all.reset + "\u001B[33m");
                System.out.println(all.reset
                        + "                                                            \u001B[33m"
                        + "|" + all.green + " HYDERABAD" + all.yellow + "   |" + all.green
                        + "  KADAPA       " + all.yellow + "    |" + all.green + " 418"
                        + all.yellow + "  |" + all.green + " 1254" + all.yellow + "  |"
                        + all.reset + "\u001B[33m");
                System.out.println(all.reset
                        + "                                                            \u001B[33m"
                        + "|" + all.green + " HYDERABAD" + all.yellow + "   |" + all.green
                        + "  BENGALURU    " + all.yellow + "    |" + all.green + " 572"
                        + all.yellow + "  |" + all.green + " 1716" + all.yellow + "  |"
                        + all.reset + "\u001B[33m");
                System.out.println(all.white
                        + "                                                            \u001B[33m"
                        + "|" + all.green + " HYDERABAD" + all.yellow + "   |" + all.green
                        + "  CHENNAI      " + all.yellow + "    |" + all.green + " 627"
                        + all.yellow + "  |" + all.green + " 1881" + all.yellow + "  |"
                        + all.reset + "\u001B[33m");
                System.out.println(all.white
                        + "                                                            \u001B[33m"
                        + "|________________________________________________|" + "\u001B[0m"
                        + all.reset);
            } else if (choice == 2) {
                System.out.println(all.cyan_bd_bt + all.cyan + all.ital
                        + "\n                                                                            ADD YOUR PACKAGE .\n"
                        + all.reset);
                System.out.println("");
                System.out.print(
                        "                                                 Enter phone number                 :                 ");// package
                                                                                                                                  // id

                long packagenumber = scanner.nextLong();
                OTP = min + (int) (Math.random() * ((max - min) + 1));
                scanner.nextLine(); // Consume newline
                long phonenumbers = packagenumber;
                // while(true)
                // {
                // long packagenumber = scanner.nextLong();
                // if(packagenumber>=1000000000l || packagenumber<=9999999999l)
                // {
                // break;
                // }
                // else
                // {
                // System.out.print("\t\t\t\t\t\t\t\tInvalid Phone Number Size
                // \n\t\t\t\t\t\t\t\tRe-enter Phone Number :");

                // }
                // }

                int count = 0;
                while (phonenumbers != 0) {
                    // removing the last digit of the number n
                    phonenumbers = phonenumbers / 10;
                    // increasing count by 1
                    count = count + 1;
                }
                while (count != 10) {
                    System.out.println(
                            "                                                                Invalid phone number size\n");
                    System.out.print(
                            "                                                                    Re-enter phone number :");
                    packagenumber = scanner.nextLong();
                    phonenumbers = packagenumber;
                    count = 0;
                    while (phonenumbers != 0) {
                        // removing the last digit of the number n
                        phonenumbers = phonenumbers / 10;
                        // i increasing count by 1
                        count = count + 1;
                    }
                }
                System.out.println("");
                System.out.println(all.green
                        + "                                                 your package Id                    :                 "
                        + OTP + all.reset);
                System.out.println("");
                System.out.print(
                        "                                                 Enter sender's name                :                 ");// sender
                                                                                                                                  // name

                String senderName = scanner.nextLine();
                System.out.println("");
                System.out.print(
                        "                                                 Enter receiver's name              :                 ");// receiver
                                                                                                                                  // name

                String receiverName = scanner.nextLine();
                System.out.println("");
                System.out.print(
                        "                                                 Enter package weight (in kg)       :                 ");// Package
                                                                                                                                  // Weight

                double weight = scanner.nextDouble();

                System.out.println("\n");
                System.out.println(
                        all.cyan + all.BOLD
                                + "                                                                      YOUR SOURCE ADDRESS IS HYDERABAD ."
                                + all.reset);

                System.out.println("\n");

                System.out.println(all.yellow
                        + "                                                                          Select Destination Address:"
                        + all.reset);// Destination
                // Address
                System.out.println("\n");

                System.out.println(
                        "                                                                            1.MACHILIPATNAM.\n");
                System.out.println(
                        "                                                                            2.VIJAYAWADA .\n");
                System.out.println(
                        "                                                                            3.WARANGAL .\n");
                System.out.println(
                        "                                                                            4.VISAKHAPATNAM.\n");
                System.out.println(
                        "                                                                            5.KADAPA.\n");
                System.out.println(
                        "                                                                            6.BENGALURU.\n");
                System.out.println("\n");
                System.out.print(all.purple
                        + "                                                                     Enter Destination (option number):"
                        + all.reset);

                int chooser = 0;
                // scanner.nextLine();
                while (true) {
                    chooser = scanner.nextInt();
                    if (chooser == 1) {
                        dest_address = "MACHILIPATNAM";
                        break;
                    } else if (chooser == 2) {
                        dest_address = "VIJAYAWADA";
                        break;
                    } else if (chooser == 2) {
                        dest_address = "WARANGAL";
                        break;
                    } else if (chooser == 2) {
                        dest_address = "VISAKHAPATNAM";
                        break;
                    } else if (chooser == 2) {
                        dest_address = "KADAPA";
                        break;
                    } else if (chooser == 2) {
                        dest_address = "BENGALURU";
                        break;
                    } else {
                        System.out.print(all.red + all.red_ul + "\n\t\t\t\t\t\t\t\tEntered Invalid Input" + all.rstul
                                + all.reset);
                        System.out.print("\n\t\t\t\t\t\t\t\tPlease Enter Valid Input : ");
                    }

                }

                double service_charge = 0.0;
                if (chooser == 1)
                    service_charge = 1020;
                else if (chooser == 2)
                    service_charge = 822;
                else if (chooser == 3)
                    service_charge = 438;
                else if (chooser == 4)
                    service_charge = 1845;
                else if (chooser == 5)
                    service_charge = 1254;
                else if (chooser == 6)
                    service_charge = 1716;
                else if (chooser == 7)
                    service_charge = 1881;
                System.out.println("\n");
                double bill_amount = (service_charge * 1 + (weight * 5.0));
                System.out.println(
                        "                                                                        Transportation cost: "
                                + bill_amount + " Rs");
                System.out.println();
                System.out.print(all.red
                        + "                                                       Would you like to proceed for  Payment(yes or no) options(1 or 0):"
                        + all.reset);
                all.sc.nextLine();
                int opt = scanner.nextInt();// user input for yes or no
                System.out.println("");
                if (opt == 1)// option to select payment in Blue Dart
                {
                    String payment_status = "Completed";
                    packages[packageCount] = new Package(packagenumber, OTP, senderName,
                            receiverName, source_address,
                            dest_address,
                            weight, bill_amount, payment_status);
                    packageCount++;
                    test.selectpaymethod(bill_amount);
                    // System.out.println(all.cyan + all.cyan_bd_bt + " 1.GOOGLE PAY\n" +
                    // all.reset);
                    // System.out.println(all.yellow + all.yellow_bd_bt + " 2.AMAZON PAY\n" +
                    // all.reset);
                    // System.out.println(all.blue + all.blue_bd_bt + " 3.PHONE PE\n" + all.reset);
                    // System.out.println(all.white + all.white_bd_bt + " 4.PAYTM\n" + all.reset);
                    // System.out.println("\n");
                    // System.out.print(" Select options :");
                    // int ch = scanner.nextInt();
                    // System.out.println("");
                    // scanner.nextLine();
                    // switch (ch) {
                    // case 1:
                    // System.out.println(all.green + all.ital
                    // + " Amount paid after discount :"
                    // + all.reset + (bill_amount - 10));
                    // System.out.println("");
                    // break;
                    // case 2:
                    // System.out.println(all.green + all.ital
                    // + " Amount paid after discount :"
                    // + all.reset
                    // + (bill_amount - 5));
                    // System.out.println("");
                    // break;
                    // case 3:
                    // System.out.println(all.green + all.ital
                    // + " Amount paid after discount :"
                    // + all.reset
                    // + (bill_amount - 8));
                    // System.out.println("");
                    // break;
                    // case 4:
                    // System.out.println(all.green + all.ital
                    // + " Amount paid after discount :"
                    // + all.reset
                    // + (bill_amount - 6));
                    // System.out.println("");
                    // break;
                    // default:
                    // System.out.println("Invalid selection");
                    // break;
                    // }
                    System.out.println(all.blue + all.ital + all.green_bg_bt + all.black_ul + all.BOLD
                            + "\n                                                                        Package added successfully.                                                                       \n"
                            + all.reset);
                    System.out.println("");
                } else {
                    String payment_status = all.red + "Pending.." + all.reset;
                    packages[packageCount] = new Package(packagenumber, OTP, senderName,
                            receiverName, source_address,
                            dest_address,
                            weight, bill_amount, payment_status);
                    packageCount++;
                }
            } else if (choice == 3) {
                // Track a package
                System.out.println(all.cyan + all.cyan_bd_bt
                        + "                                                                            TRACK A PACKAGE \n  "
                        + all.reset);
                System.out.print("Enter package Id to track: ");
                long packageIdToTrack = scanner.nextLong();
                scanner.nextLine(); // Consume newline

                boolean packageFound = false;
                for (int i = 0; i < packageCount; i++) {
                    if (packages[i].getPackageId() == packageIdToTrack) {
                        packageFound = true;
                        System.out.println("\u001B[32m"
                                + "                                                                             Package found."
                                + "\u001B[0m");
                        System.out.println("");
                        System.out.println(
                                "                                                 sender's name                      :                 "
                                        + packages[i].getSenderName());
                        System.out.println("");
                        System.out.println(
                                "                                                 receiver's name                    :                 "
                                        + packages[i].getReceiverName());
                        System.out.println("");
                        System.out.println(
                                "                                                 Source                             :                 HYDERABAD ");
                        System.out.println("");
                        System.out.println(
                                "                                                 Destination                        :                 "
                                        + packages[i].getDest());
                        System.out.println("");
                        System.out.println(
                                "                                                 Phone number                       :                 "
                                        + packages[i].getphonenumber());
                        System.out.println("");
                        System.out.println(
                                "                                                 Weight                             :                 "
                                        + packages[i].getWeight() + " kg");
                        System.out.println("");
                        System.out.println(
                                "                                                 Amount Charged                     :                 "
                                        + packages[i].getamount());
                        System.out.println("");
                        break;
                    }
                }
                if (!packageFound) {
                    System.out.println(all.red + all.ital + "Package not found." + all.reset);
                }
            } else if (choice == 4) {

                System.out.println(all.cyan + all.cyan_bd_bt
                        + "                                                                          TRACK PAYMENT STATUS \n"
                        + all.reset);
                System.out.print("Enter package Id to track: ");
                long packageIdToTrack = scanner.nextLong();
                scanner.nextLine(); // Consume newline

                boolean packageFound = false;
                for (int i = 0; i < packageCount; i++) {
                    if (packages[i].getPackageId() == packageIdToTrack) {
                        packageFound = true;
                        System.out.print("\n");
                        System.out.println(
                                "\u001B[32m"
                                        + "                                                                         ----Billing Details----"
                                        + "\u001B[0m");
                        System.out.println("");
                        System.out.println(
                                "                                                 receiver                           :                 "
                                        + packages[i].getReceiverName());
                        System.out.println("");
                        System.out.println(
                                "                                                 Source                             :                 HYDERABAD ");
                        System.out.println("");
                        System.out.println(
                                "                                                 Destination                        :                 "
                                        + packages[i].getDest());
                        System.out.println("");
                        System.out.println(
                                "                                                 Phone number                       :                 "
                                        + packages[i].getphonenumber());
                        System.out.println("");
                        System.out.println(
                                "                                                 Weight                             :                 "
                                        + packages[i].getWeight() + " kg");
                        System.out.println("");
                        System.out.println(
                                "                                                 Amount Charged                     :                 "
                                        + packages[i].getamount());
                        System.out.println("");
                        System.out.println(
                                "                                                 Payment status                     :                 "
                                        + packages[i].getpaymentstatus());
                        System.out.print("\n");
                        break;
                    }
                }
                if (!packageFound) {
                    System.out.println(all.red + all.ital
                            + "                                                              Package not found."
                            + all.reset);
                }
            } else if (choice == 5) {
                // Exit
                System.out.println(all.red + all.red_bd_bt + all.ital
                        + "\n                                                    Exiting this program and directing to home page."
                        + all.reset);
                        project.log();
                break;
            } else {
                System.out.println(all.red + "\t\t\t\t\t\t\tInvalid choice. Please try again." + all.reset);
            }
        }
    }

}

// Project
class project {
    static void log() {
        while (true) {
            System.out.println(all.white_ul
                    + "\n                                                                                                                                                                          "
                    + all.reset);
            System.out.println(all.yellow + "\n            " + all.blink
                    + "*    *     *      *     *      *      *      *      *    *    OUR SERVICES :       *      *       *      *      *     *     *     *     *     *              "
                    + all.reset);
            System.out.println(all.white_ul
                    + "\n                                                                                                                                                                          "
                    + all.reset);
            System.out.println(all.cyan
                    + "\n\t\t\t\t\t\t\t\t\t1.Train Ticket Booking\n\t\t\t\t\t\t\t\t\t2.Bus Ticket Booking\n\t\t\t\t\t\t\t\t\t3.Uber\n\t\t\t\t\t\t\t\t\t4.Courier Services\n\t\t\t\t\t\t\t\t\t5.Food Ordering\n\t\t\t\t\t\t\t\t\t6.Hotel Booking\n\t\t\t\t\t\t\t\t\t7.Exit"
                    + all.reset);
            System.out.print(all.blue + "\n\t\t\t\t\t\t\t\t   Choose Your Option : " + all.reset);
            int k = Integer.parseInt(all.sc.next());
            if (k == 1) {
                Train.trainprocess();
                System.out.print(all.green + "\n\t\t\t\t\t\t\t\t1 for Home Page\n\t\t\t\t\t\t\t\tAny Number forExit\n");
                System.out.print(all.blue + "\n\t\t\t\t\t\t\t\tChoose Your Option : " + all.reset);
                int num = all.sc.nextInt();
                if (num == 1)
                    log();
                else {
                    System.out.print(all.YELLOW_BOLD + "\n\t\t\t\t\t\t\t\tThank  You" + all.BOLD_RESET);
                    break;
                }
            } else if (k == 2) {
                Bus.busprocess();
                System.out.print(all.green + "\n\t\t\t\t\t\t\t\t1 for Home Page\n\t\t\t\t\t\t\t\tAny Number forExit\n");
                System.out.print(all.blue + "\n\t\t\t\t\t\t\t\tChoose Your Option : " + all.reset);
                int num = all.sc.nextInt();
                if (num == 1)
                    log();
                else {
                    System.out.print(all.YELLOW_BOLD + "\n\t\t\t\t\t\t\t\tThank  You" + all.BOLD_RESET);
                    break;
                }
            } else if (k == 3) {

                uber.main(null);
                System.out.print(all.green + "\n\t\t\t\t\t\t\t\t1 for Home Page\n\t\t\t\t\t\t\t\tAny Number forExit\n");
                System.out.print(all.blue + "\n\t\t\t\t\t\t\t\tChoose Your Option : " + all.reset);
                int num = all.sc.nextInt();
                if (num == 1)
                    log();
                else {
                    System.out.print(all.YELLOW_BOLD + "\n\t\t\t\t\t\t\t\tThank  You" + all.BOLD_RESET);
                    break;
                }

            } else if (k == 4) {
                user1.main(null);
            } else if (k == 5) {
                Food.main(null);
                System.out.print(all.green + "\n\t\t\t\t\t\t\t\t1 for Home Page\n\t\t\t\t\t\t\t\tAny Number forExit\n");
                System.out.print(all.blue + "\n\t\t\t\t\t\t\t\tChoose Your Option : " + all.reset);
                int num = all.sc.nextInt();
                if (num == 1)
                    log();
                else {
                    System.out.print(all.YELLOW_BOLD + "\n\t\t\t\t\t\t\t\tThank  You" + all.BOLD_RESET);
                    break;
                }
            } else if (k == 6) {
                Hotel.main(null);
                System.out.print(all.green + "\n\t\t\t\t\t\t\t\t1 for Home Page\n\t\t\t\t\t\t\t\tAny Number forExit\n");
                System.out.print(all.blue + "\n\t\t\t\t\t\t\t\tChoose Your Option : " + all.reset);
                int num = all.sc.nextInt();
                if (num == 1)
                    log();
                else {
                    System.out.print(all.YELLOW_BOLD + "\n\t\t\t\t\t\t\t\tThank  You" + all.BOLD_RESET);
                    break;
                }
            } else if (k == 7) 
            {
                System.out.println(all.red + "\t\t\t\t\t\t\t\tExiting the application" + all.reset);
                display.image();

            }
             else {
                System.out.print("Please Enter Valid Input");
                log();
            }
            break;
        }
    }

    public static void main(String[] args) {
        System.out.println(all.white_bg + all.black_bd_bt
                + all.blink +
                "                                                                                                                                                                          \n                                        \u2588\u2588\u2588\u2588\u2588\u2588\u2557  \u2588\u2588\u2588\u2588\u2588\u2588\u2557  \u2588\u2588\u2588\u2588\u2588\u2588\u2557 \u2588\u2588\u2557  \u2588\u2588\u2557    \u2588\u2588\u2557\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557    \u2588\u2588\u2588\u2557   \u2588\u2588\u2557 \u2588\u2588\u2588\u2588\u2588\u2588\u2557 \u2588\u2588\u2557    \u2588\u2588\u2557                                               \r                   \n"
                + //
                "                                        \u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2554\u2550\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2554\u2550\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2551 \u2588\u2588\u2554\u255D    \u2588\u2588\u2551\u255A\u2550\u2550\u2588\u2588\u2554\u2550\u2550\u255D    \u2588\u2588\u2588\u2588\u2557  \u2588\u2588\u2551\u2588\u2588\u2554\u2550\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2551    \u2588\u2588\u2551                                               \r                     \n"
                + //
                "                                        \u2588\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u2588\u2588\u2551   \u2588\u2588\u2551\u2588\u2588\u2551   \u2588\u2588\u2551\u2588\u2588\u2588\u2588\u2588\u2554\u255D     \u2588\u2588\u2551   \u2588\u2588\u2551       \u2588\u2588\u2554\u2588\u2588\u2557 \u2588\u2588\u2551\u2588\u2588\u2551   \u2588\u2588\u2551\u2588\u2588\u2551 \u2588\u2557 \u2588\u2588\u2551                                               \r                     \n"
                + //
                "                                        \u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2551   \u2588\u2588\u2551\u2588\u2588\u2551   \u2588\u2588\u2551\u2588\u2588\u2554\u2550\u2588\u2588\u2557     \u2588\u2588\u2551   \u2588\u2588\u2551       \u2588\u2588\u2551\u255A\u2588\u2588\u2557\u2588\u2588\u2551\u2588\u2588\u2551   \u2588\u2588\u2551\u2588\u2588\u2551\u2588\u2588\u2588\u2557\u2588\u2588\u2551                                               \r                     \n"
                + //
                "                                        \u2588\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u255A\u2588\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u255A\u2588\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u2588\u2588\u2551  \u2588\u2588\u2557    \u2588\u2588\u2551   \u2588\u2588\u2551       \u2588\u2588\u2551 \u255A\u2588\u2588\u2588\u2588\u2551\u255A\u2588\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u255A\u2588\u2588\u2588\u2554\u2588\u2588\u2588\u2554\u255D                                               \r                     \n"
                + //
                "                                        \u255A\u2550\u2550\u2550\u2550\u2550\u255D  \u255A\u2550\u2550\u2550\u2550\u2550\u255D  \u255A\u2550\u2550\u2550\u2550\u2550\u255D \u255A\u2550\u255D  \u255A\u2550\u255D    \u255A\u2550\u255D   \u255A\u2550\u255D       \u255A\u2550\u255D  \u255A\u2550\u2550\u2550\u255D \u255A\u2550\u2550\u2550\u2550\u2550\u255D  \u255A\u2550\u2550\u255D\u255A\u2550\u2550\u255D                                                \r                                    \n                                                                                                                                                                        "
                + //
                "  " + all.bgreset + all.reset + all.rstblink);
        User.log();
    }
}

// login and signup
class login {
    private String username = "asdfg";
    private String password = "boomboom";
    private long phno = 1234567899l;

    login() {

    }

    login(String username, String password, long phno) {
        this.username = username;
        this.password = password;
        this.phno = phno;
    }

    void setName(String username) {
        this.username = username;
    }

    void setPass(String password) {
        this.password = password;
    }

    String getName() {
        return username;
    }

    String getPass() {
        return password;
    }

    long getPh() {
        return phno;
    }

    static int otpGenerator(String purpose) {
        String ab = "........";
        System.out.print(all.cyan
                + "\t\t\t\t\t\t\t        Please wait while we are sending OTP  ");
        for (int i = 0; i < ab.length() - 1; i++) {
            System.out.print(ab.charAt(i));
            all.sleep(500);
        }
        System.out.println(all.reset);
        int otp = 1000 + (int) (Math.random() * 8999);
        Mobile.messages(purpose, otp);
        return otp;
    }
}

class Mobile {
    static void messages(String purpose, int otp) {
        System.out.println(all.purple
                + "\t\t\t\t\t\t\t\n                                                                  Your OTP for Login is :"
                + otp
                + all.reset);
    }
}

class User {
    static Scanner sc = new Scanner(System.in);
    static login x = new login();

    static void login() {
        System.out.print(all.PURPLE_BOLD + "\t\t\t\t\t\t  Enter Your Username             :        " + all.reset);
        String name = sc.next();
        System.out.println();
        System.out.print(all.PURPLE_BOLD + "\t\t\t\t\t\t  Enter Your Password             :        " + all.reset);
        String pass = sc.next();
        System.out.println();
        if (name.equals(x.getName()) && pass.equals(x.getPass())) {
            System.out.println(all.GREEN_BOLD + "\t\t\t\t\t\t\t\t\tLogin Successfull" + all.reset);
            project.log();
        } else if (!(name).equals(x.getName()) && !(pass).equals(x.getPass())) {
            System.out.print(all.RED_BOLD + "\t\t\t\t\t\t\t\t      " + all.red_ul
                    + "You have Entered Invalid Credentials" + all.reset + all.rstul + all.blue
                    + "\n\n\t\t\t\t\t\t\t   Enter Your Mobile Number to know Your Username : " + all.reset);
            while (true) {
                long phno = sc.nextLong();
                if (phno == x.getPh()) {
                    System.out.println(all.yellow + "\t\t\t\t\t\t\t\t    Your username : " + x.getName() + all.reset);
                    System.out.println(
                            all.green + "\t\t\t\t\t\t\t\t\t    1.Login \n\t\t\t\t\t\t\t\t\t    2.Exit  " + all.reset);
                    System.out.print(all.blue + "\t\t\t\t\t\t\t\t   Choose Your Option : " + all.reset);
                    int num = Integer.parseInt(all.sc.nextLine());
                    if (num == 1)
                        login();
                    else if (num != 2)
                        System.out.print(all.red + all.red_ul + "\n\t\t\t\t\t\t\tPlease Enter valid Input" + all.reset
                                + all.rstul);
                    break;
                } else {
                    System.out.println(all.red + "\n\t\t\t\t\t\t\t\t        Invalid Mobile Number" + all.reset);
                    System.out.print("");
                    System.out.print(
                            all.blue + "\n\n\t\t\t\t\t\t\t      Please enter valid mobile number : " + all.reset);
                }
            }
        } else if (!(name).equals(x.getName())) {
            System.out.print(all.red + "\t\t\t\t\t\t\t\t     Invalid Username Press 1 to Reset" + all.reset);
            int n1 = sc.nextInt();
            System.out.println();
            if (n1 == 1) {
                System.out.print(all.cyan + "\t\t\t\t\t\t\t\t        Enter New Username : " + all.reset);
                x.setName(sc.next());
                System.out.println();
                System.out
                        .println(all.cyan + "\t\t\t\t\t\t\t\t         Your New Username : " + x.getName() + all.reset);
                System.out.print("\t\t\t\t\t\t\t\t     Press 1 to Login any Number to Exit");
                int n2 = all.sc.nextInt();
                System.out.println();
                if (n2 == 1)
                    login();
            }
        } else {
            System.out.print(all.RED_BOLD + all.red_ul + "\t\t\t\t\t\t\t\tInvalid Password Press 1 to Reset : "
                    + all.rstul + all.BOLD_RESET);
            int n1 = sc.nextInt();
            System.out.println();
            if (n1 == 1) {
                System.out.print(all.green + "\t\t\t\t\t\t\t\tEnter New Password : " + all.reset);
                x.setPass(sc.next());
                System.out.println();
                System.out.println(all.green + "\t\t\t\t\t\t\t\tYour New Password : " + x.getPass() + all.reset + "\n");
                System.out.print("\t\t\t\t\t\t\t\tPress 1 to Login and any number to Exit");
                System.out.print(all.blue + "\n\t\t\t\t\t\t\t\t   Choose Your Option : " + all.reset);
                int n2 = all.sc.nextInt();
                System.out.println();
                if (n2 == 1)
                    login();
            }
        }
    }

    static void signup() {
        long phno;
        System.out.print(all.blue + "\t\t\t\t\t\t\t\t   Enter Your Mobile Number : " + all.reset);
        while (true) {
            phno = Long.parseLong(all.sc.nextLine());
            if (phno >= 1000000000 && phno <= 9999999999l)
                break;
            else {
                System.out.print(all.RED_BOLD + all.red_ul
                        + "\t\t\t\t\t\t\t\t> > > > >Invalid Moblie Number< < < < <<\n" + all.rstul + all.BOLD_RESET);
                System.out.print(
                        all.blue + "\t\t\t\t\t\t\t     Please Enter Valid 10 Digit Mobile Number : " + all.reset);
            }
        }
        System.out.println();
        int otpsent = login.otpGenerator(all.green + "\t\t\t\t\t\tTo create New Login Account" + all.reset);
        while (true) {
            System.out.print(all.blue + "\n\t\t\t\t\t\t\t\t    Please Enter Your OTP : " + all.reset);
            int otp = Integer.parseInt(all.sc.nextLine());
            System.out.println();
            if (otp == otpsent) {
                System.out
                        .print(all.PURPLE_BOLD + "\t\t\t\t\t\t  Enter Your Username             :        " + all.reset);
                String name = sc.next();
                System.out.println();
                System.out
                        .print(all.PURPLE_BOLD + "\t\t\t\t\t\t  Enter Your Password             :        " + all.reset);
                String pass = sc.next();
                System.out.println();
                x = new login(name, pass, phno);
                System.out.println(all.white_ul
                        + "\n                                                                                                                                                                          "
                        + all.reset);
                System.out.println(all.GREEN_BOLD
                        + "\t\t\t\t\t\t\t\t\t\n                                                                       Signup Successfull"
                        + all.reset);
                System.out.println(all.white_ul
                        + "\n                                                                                                                                                                          "
                        + all.reset);
                System.out.print(all.PURPLE_BOLD
                        + "\t\t\t\t\t\t\t\n                                                             1.Login\n\n\t\t\t\t\t\t\t     2.Exit"
                        + all.reset);
                while (true) {
                    all.sc.nextLine();
                    int a = sc.nextInt();
                    if (a == 1)
                        login();
                    else if (a != 2)
                        System.out.print("Please Enter valid option");
                    else if (a == 2)
                        break;
                }

            } else {
                // System.out.println("Invalid otp \npress 1 to re-enter\npress 2 to resend");
                System.out.println("\t\t\t\t\t\t\t\t\t" + all.red + "Invalid otp " + all.reset
                        + "\n\t\t\t\t\t\t\t\t    " + all.green + "press 1 to re-enter" + all.reset
                        + "\n\t\t\t\t\t\t\t\t    " + all.yellow + "press 2 to resend" + all.reset);
                int n = sc.nextInt();
                if (n == 2) {
                    signup();
                    break;
                }
            }
        }

    }

    static void log() {
        System.out.println(all.green
                + "\n\t1.Login \t\t\t\t\t\t\t  2.Signup  \t\t\t\t\t\t\t\t   3.Exit"
                + all.reset);
        System.out.print(all.blue + "\n\t\t\t\t\t\t\t\t    Choose Your Option : " + all.reset);
        int n = sc.nextInt();
        System.out.println();
        if (n == 1) {
            login();
        } else if (n == 2) {
            signup();
        } else if (n == 3) {
            System.out
                    .println(all.red + all.red_ul + "\t\t\t\t\t\t\t\tExiting This Application" + all.reset + all.rstul);
        } else {
            System.out.println(all.red + "Invalid Input Try Again" + all.reset);
            log();
        }
    }
}

/// Bank
abstract class Bank {
    abstract void withdraw(double amount);
}

class SBIBank extends Bank {
    double balance = 20000;
    private int pin = 1234;

    void setpin(int pin) {
        this.pin = pin;
    }

    int getpin() {
        return pin;
    }

    void withdraw(double amount) {

        if (balance >= amount) {
            while (true) {
                System.out.print(all.magent + "\t\t\t\t\t\t\t\tEnter your PIN: " + all.reset);
                int n = Integer.parseInt(all.sc.nextLine());
                if (n == pin) {
                    System.out.println(all.green + "\t\t\t\t\t\t\t\tPIN verified" + all.reset);
                    balance = balance - amount;
                    System.out.println(all.CYAN_BOLD + "\t\t\t\t\t\t\t\tTransaction Successful" + all.reset);
                    break;
                } else if (n != pin) {
                    System.out.println(all.red + "\t\t\t\t\t\t\t\tInvalid PIN Re Enter the correct PIN" + all.reset);
                }
            }
        } else {
            System.out.println("\t\t\t\t\t\t\t\tInsufficent funds");
        }
        // return amount;
    }
}

class KotakBank extends Bank {
    double balance = 25000;
    private int pin = 12345;

    void setpin(int pin) {
        this.pin = pin;
    }

    int getpin() {
        return pin;
    }

    void withdraw(double amount) {
        if (balance >= amount) {

            System.out.print(all.magent + "\n\t\t\t\t\t\t\t\tEnter your PIN: " + all.reset);
            while (true) {
                int n = Integer.parseInt(all.sc.nextLine());
                if (n == pin) {
                    System.out.println(all.green + "\n\t\t\t\t\t\t\t\tPIN verified" + all.reset);
                    balance = balance - amount;
                    System.out.println(all.CYAN_BOLD + "\n\t\t\t\t\t\t\t\tTransaction Successful" + all.reset);
                    break;
                } else if (n != pin) {
                    System.out.println(all.red + "\n\t\t\t\t\t\t\t\tInvalid PIN " + all.reset);
                    System.out.println(all.purple + "\n\t\t\t\t\t\t\t\tPlease enter Correct PIN" + all.reset);
                }
            }
        } else {
            System.out.println(all.red + "\n\t\t\t\t\t\t\t\tInsufficent funds" + all.reset);
        }
        // return amount;
    }
}

class Paytm {
    void pay(double amount) {
        System.out.println(all.YELLOW_BOLD + "\n\t\t\t\t\t\t\t..........Please Select the Bank you want..........\n\n"
                + all.reset);
        System.out.println(all.blue + "\t\t\t\t\t\t\t\t1.SBI Bank \n\t\t\t\t\t\t\t\t2.Kotak Bank" + all.reset);
        System.out.print(all.magent + "\n\t\t\t\t\t\t\t\tEnter Bank:" + all.reset);
        // all.sc.nextLine();
        while (true) {
            int n = Integer.parseInt(all.sc.nextLine());
            if (n == 1) {
                SBIBank x = new SBIBank();
                x.withdraw((amount));
                break;
            } else if (n == 2) {
                KotakBank x = new KotakBank();
                x.withdraw((amount));
                break;
            } else {
                System.out.println(all.red + all.red_ul + "\t\t\t\t\t\t\t\tInvalid Option" + all.reset + all.rstul);
                System.out.print("\t\t\t\t\t\t\t\tPlease Enter Valid Option : ");
            }
        }
    }
}

class Phonepe {
    void pay(double amount) {
        System.out.println(all.YELLOW_BOLD + "\n\t\t\t\t\t\t\t..........Please Select the Bank you want..........\n\n"
                + all.reset);
        System.out.println(all.blue + "\t\t\t\t\t\t\t\t1.SBI Bank \n\t\t\t\t\t\t\t\t2.Kotak Bank" + all.reset);
        // all.sc.nextLine();
        while (true) {
            int n = Integer.parseInt(all.sc.nextLine());
            if (n == 1) {
                SBIBank x = new SBIBank();
                x.withdraw((amount));
            } else if (n == 2) {
                KotakBank x = new KotakBank();
                x.withdraw((amount));
            } else {
                System.out.print(all.red + all.red_ul + "\t\t\t\t\t\t\t\tInvalid Option" + all.reset + all.rstul);
                System.out.print("\t\t\t\t\t\t\t\tPlease Enter Valid Option : ");

            }
        }
    }
}

class Gpay {
    void pay(double amount) {
        System.out.println(all.YELLOW_BOLD + "\n\t\t\t\t\t\t\t..........Please Select the Bank you want..........\n\n"
                + all.reset);
        System.out.println("");
        System.out.println(all.blue + "\n\t\t\t\t\t\t\t\t1.SBI Bank \n\n\t\t\t\t\t\t\t\t\n 2.Kotak Bank\n" + all.reset);
        all.sc.nextLine();
        while (true) {
            int n = Integer.parseInt(all.sc.nextLine());
            if (n == 1) {
                System.out.println(all.magent + "\t\t\t\t\t\t\t\tEnter amount to pay :" + all.reset);
                SBIBank x = new SBIBank();
                x.withdraw((amount));
                break;
            } else if (n == 2) {
                KotakBank x = new KotakBank();
                x.withdraw((amount));
                break;
            } else {
                System.out.print(all.red + all.red_ul + "\t\t\t\t\t\t\t\tInvalid Option" + all.reset + all.rstul);
                System.out.print("\t\t\t\t\t\t\t\tPlease Enter Valid Option : ");
            }
        }
    }
}

class test {
    static Scanner sc = new Scanner(System.in);
    static int c = 0;

    static void selectpaymethod(double amount) {
        System.out.println(
                all.PURPLE_BOLD + all.purple_ul + "\n\t\t\t\t\t\t\t\tPayment Methods" + all.rstul + all.BOLD_RESET);
        System.out.println();
        System.out.println(all.GREEN_BOLD
                + "\t\t\t\t\t\t\t\t1.paytm\n\n\t\t\t\t\t\t\t\t2.phonepe\n\n\t\t\t\t\t\t\t\t3.Gpay\n\n\t\t\t\t\t\t\t\t4.Exit\n\n"
                + all.reset);
        System.out.print(all.BLUE_BOLD + "\n\t\t\t\t\t\t\t\tPlease select the option you require : " + all.reset);
        int a = Integer.parseInt(all.sc.nextLine());
        System.out.println("");
        if (a == 1) {
            System.out.println(all.yellow + "\t\t\t\t\t\t\t\tYou have Selected Paytm\n" + all.reset);
            Paytm x = new Paytm();
            x.pay(amount);
        } else if (a == 2) {
            System.out.println(all.yellow + "\t\t\t\t\t\t\t\tYou have Selected Phonepe" + all.reset);
            Phonepe x = new Phonepe();
            x.pay(amount);
        } else if (a == 3) {
            System.out.println(all.yellow + "\t\t\t\t\t\t\t\tYou have Selected Gpay" + all.reset);
            Gpay x = new Gpay();
            x.pay(amount);

        } else if (a == 4) {
            System.out.println(all.RED_BOLD + "\t\t\t\t\t\t\t\t Exiting this application" + all.reset);
            return;
        } else {
            c++;
            if (c >= 5) {
                System.out.println("You are Exceeded the no.of Attempts Try again after 24hrs");
                return;
            }
            System.out.println("Invalid Input");
            // selectpaymethod(double amount);
        }
    }
}

// Food

class Food {
    static String[] arritems = { "", "EggBiryani", "ChickenBiryani", "MuttonBiryani", "Chicken65", "VegBiryani",
            "PannerBiryani", "VegManchuria", "CocoCola", "Sprite", "Redbull", "Monster" };
    static int[] itemprice = { 0, 120, 180, 200, 150, 100, 160, 80, 20, 20, 105, 100 };
    static String[] listitems = new String[13];
    static int[] listquan = new int[13];
    static String X;
    static double Amt;
    static int Quantity;
    static double Total = 0;
    static int z = 0;
    static String[][] t = new String[13][2];
    static {
        for (int i = 1; i < 12; i++) {
            t[i][0] = arritems[i];
            t[i][1] = "0";
        }
    }
    Scanner sc = new Scanner(System.in);

    public void displaymenu() {
        System.out.print(all.black_bg + all.white + all.blink + all.change
                + "\t\t\t\t\t\t\t               _    _    _    _              \n");
        System.out.print("\t\t\t\t\t\t\t              / \\  / \\  / \\  / \\             \n");
        System.out.print("\t\t\t\t\t\t\t             ( M )( E )( N )( U )            \n");
        System.out.print("\t\t\t\t\t\t\t              \\_/  \\_/  \\_/  \\_/             \n" + all.reset + all.bgreset);
        System.out.println(all.violet + all.black_bg + all.change + all.thick
                + "\t\t\t\t\t\t\t                                             ");
        System.out.println("\t\t\t\t\t\t\t             **NON-VEG ITEMS**               " + all.bgreset + all.reset);
        System.out.println(
                all.CYAN_BOLD + all.change + all.thick + "\t\t\t\t\t\t\t                                             ");
        System.out.println("\t\t\t\t\t\t\t     1. EggBiryani                120/-      ");
        System.out.println("\t\t\t\t\t\t\t     2. ChickenBiryani            180/-      ");
        System.out.println("\t\t\t\t\t\t\t     3. MuttonBiryani             200/-      ");
        System.out.println("\t\t\t\t\t\t\t     4. Chicken65                 150/-      " + all.reset + all.BOLD_RESET);
        System.out.println(all.violet + all.black_bg + all.change + all.thick
                + "\t\t\t\t\t\t\t                                             ");
        System.out.println("\t\t\t\t\t\t\t             **VEG ITEMS**                   " + all.bgreset + all.reset);
        System.out.println(
                all.CYAN_BOLD + all.change + all.thick + "\t\t\t\t\t\t\t                                             ");
        System.out.println("\t\t\t\t\t\t\t     5. VegBiryani                100/-      ");
        System.out.println("\t\t\t\t\t\t\t     6. Pannerbiriyani            160/-      ");
        System.out.println("\t\t\t\t\t\t\t     7. VegManchuria               80/-      " + all.reset + all.BOLD_RESET);
        System.out.println(all.violet + all.black_bg + all.change + all.thick
                + "\t\t\t\t\t\t\t                                             ");
        System.out.println("\t\t\t\t\t\t\t           **SOFT DRINKS **                  ");
        System.out.println(
                all.CYAN_BOLD + all.change + all.thick + "\t\t\t\t\t\t\t                                             ");
        System.out.println("\t\t\t\t\t\t\t     8. CocoCola                   20/-      ");
        System.out.println("\t\t\t\t\t\t\t     9. Sprite                     20/-      ");
        System.out.println("\t\t\t\t\t\t\t    10. RedBull                   105/-      ");
        System.out.println("\t\t\t\t\t\t\t    11. Monster                   100/-      ");
        System.out.println("\t\t\t\t\t\t\t    12. Exit                                 ");
        System.out.println("\t\t\t\t\t\t\t                                             " + all.reset + all.BOLD_RESET);
    }

    public static void GenerateBill() {
        System.out.println();
        // System.out.println("****THANK YOU FOR ORDERING****");
        System.out.println("Items \t                 Quantity           Price ");
        System.out.println("___________________________________________________");
        for (int i = 1; i < 12; i++) {
            if (t[i][1].equals("0"))
                continue;
            int qua = Integer.parseInt(t[i][1]);
            double pr = (double) (qua * itemprice[i]);
            System.out.printf("%-15s         %3s      --    %10.2f\n", t[i][0], t[i][1], pr);
            // System.out.print(t[i][0]+"\t "+t[i][1]+"\t");
            // System.out.printf("",pr);
        }
        System.out.println("**************************************************");
        System.out.print("Amount to Pay                    : ");
        System.out.format("%14.2f", Total);
        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();
        test.selectpaymethod(Total);

    }

    static void ordering(String item, int itemprice) {
        System.out.println("You have selected " + item);
        System.out.println("Enter the Quantity : ");
        Quantity = Integer.parseInt(all.sc.nextLine());
        for (int i = 1; i < 12; i++) {
            if (t[i][0].equals(item)) {
                int old = Integer.parseInt(t[i][1]);
                int new_qua = old + Quantity;
                t[i][1] = Integer.toString(new_qua);
            }
        }
        Total = Total + Quantity * itemprice;
    }

    public static void order() {
        while (true) {
            System.out.println("Enter Your Choice....");
            int choice = Integer.parseInt(all.sc.nextLine());
            if (choice >= 1 && choice <= 12) {
                int num = choice;
                ordering(arritems[num], itemprice[num]);
                while (true) {
                    System.out.println("ENTER 1 FOR MORE ORDER (OR) ENTER 2 FOR BILLING");
                    int again = Integer.parseInt(all.sc.nextLine());
                    if (again == 1) {
                        order();
                        break;
                    } else if (again == 2) {
                        GenerateBill();
                        break;
                    } else {
                        System.out.println("Invalid Choice");
                    }
                }
                break;
            } else
                System.out.print("Invalid Choice Please Enter valid choice: ");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Food obj = new Food();
        all.sc.nextLine();
        System.out.println("ENTER 1 FOR MENU");
        int n = Integer.parseInt(all.sc.nextLine());
        if (n == 1) {
            obj.displaymenu();
        } else {
            System.out.print("PLEASE ENTER A VALID NUMBER FOR MENU");
        }

        order();
        // System.out.println("**************************************************");
        // System.out.print("Amount to Pay : ");
        // System.out.format("%14.2f",obj.Total);
        // System.out.println();

        // System.out.println("Plz Enter The Amount: ");
        // double a = sc.nextDouble();

        // if (obj.Total == a)
        // {
        // System.out.println("Payment Successful " + a);
        // System.out.println("....***THANK YOU FOR ORDERING***....");
        // System.out.println(" **** VISIT-AGAIN**** ");

        // }
        // else
        // {
        // System.out.println("Transaction Failed");
        // System.out.println("SORRY !.....PLEASE CHECK AND ENTER THE CORRECT AMOUNT");
        // }
    }
}



// hotel

class Hotel {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        display.hoteltitle();
        System.out.println(
                all.magent + all.ital + all.BOLD + "\n    \t\t\t\t\t                        WELCOME TO HOTEL BOOKINGS\n"
                        + all.reset);
        display.displayhotels();

        System.out.print("\n\t\t\t\t\t\t\t\t" + all.green + "Choose any hotel you want : " + all.reset);
        all.sc.nextLine();
        int hotelName = Integer.parseInt(all.sc.nextLine());

        System.out.print("\t\t\t\t\t\t\t\t" + all.red + "Choose the category you want : " + all.reset
                + " \n \t\t\t\t\t\t\t\t" + all.cyan + " 1. AC\n\t\t\t\t\t\t\t\t 2. Non-AC\n" + all.reset);
        int categ = 0;
        while (true) {
            System.out.print("\t\t\t\t\t\t\t\t" + all.green + "choose the option :" + all.reset);
            int choice = Integer.parseInt(all.sc.nextLine());
            if (choice == 1) {
                categ = 1;
                display.displayacrooms();
                break;
            } else if (choice == 2) {
                categ = 2;
                display.displaynonacrooms();
                break;
            } else {
                System.out.println(all.red + "\t\t\t\t\t\t\tPlease enter a valid category." + all.reset);
            }
        }

        System.out.print(
                "Choose type of room you want :  \n 1. Single room \n 2. Double room \n 3. Deluxe room\n 4. Suit room \n");
        int roomType = Integer.parseInt(all.sc.nextLine());

        int numRooms;

        while (true) {
            System.out.print("Enter the number of rooms you want to book: ");
            numRooms = Integer.parseInt(all.sc.nextLine());
            if (numRooms > 0) {
                break;
            } else {
                System.out.println("Please enter a valid number of rooms.");
            }
        }
        // test.selectpaymethod(totalamount);
        // System.out.print("Choose billing method:\n1. Credit Card\n2. Cash\n");

        // int billingMethod = Integer.parseInt(all.sc.nextLine());

        // System.out.println(all.green+all.Bold+all.ital+"You have successfully booked
        // " + numRooms + " rooms at "+hotelName+all.reset );

        double totalAmount = calculateTotalAmount(numRooms, categ, roomType);
        System.out.println("Total Amount: " + totalAmount);
        test.selectpaymethod(totalAmount);

        // if (billingMethod == 1)
        // {
        // System.out.println("Please make the payment using your credit card.");
        // }
        // else if (billingMethod == 2)
        // {
        // System.out.println("Please make the payment in cash at the reception.");
        // }
        // else
        // {
        // System.out.println("Invalid billing method selected.");
        // }
    }

    static double calculateTotalAmount(int numRooms, int categ, int roomType) {
        double roomPrice;
        if (categ == 1) {
            roomPrice = getAcRoomPrice(roomType);
        } else {
            roomPrice = getNonAcRoomPrice(roomType);
        }
        return numRooms * roomPrice;
    }

    static double getAcRoomPrice(int roomType) {
        switch (roomType) {
            case 1:
                return 1500.0; // Single Room
            case 2:
                return 3000.0; // Double Room
            case 3:
                return 5000.0; // Deluxe Room
            case 4:
                return 30000.0; // Suite Room
            default:
                return 0.0; // Invalid room type
        }
    }

    static double getNonAcRoomPrice(int roomType) {
        switch (roomType) {
            case 1:
                return 900.0; // Single Room
            case 2:
                return 2000.0; // Double Room
            case 3:
                return 3000.0; // Deluxe Room
            case 4:
                return 15000.0; // Suite Room
            default:
                return 0.0; // Invalid room type
        }
    }
}
