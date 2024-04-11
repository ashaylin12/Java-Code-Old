import javax.swing.JOptionPane;

public class secDig {
    private String psuedo;
    private int num1 = 0;

    public int digit() {
        do
        {
            psuedo = JOptionPane.showInputDialog("Please enter your security code digit");
           } while (psuedo.length() > 20);

           int b;
           String check = psuedo;
           int a;
           do {
               a = 1;
               check.replace('0', '1');

               for (int i = 0; i < check.length(); i++) {
                   b = Integer.parseInt(check.substring(i, i + 1));
                   if (b == 0) {
                    b = 1; }
                    a = a * b;
                    }

               check = Integer.toString(a);
              } while (check.length() > 1);
        num1 = a;
        return num1;
                        }
        public static void main(String[] ags) {
        secDig a = new secDig();
        System.out.println("Your security digit to use is the following number : "+ a.digit());
    }
}
