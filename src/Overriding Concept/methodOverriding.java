class Bank {
    double roi() {
        return 0;
    }
}

class icici extends Bank {
    double roi() {
        return 10.5;
    }
}

class sbi extends Bank {
    double roi() {
        return 8.5;
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        icici ic = new icici();
        double output = ic.roi();
        System.out.println(output);

        sbi sb = new sbi();
        double sbiOutput = sb.roi();
        System.out.println(sbiOutput);
    }
}
