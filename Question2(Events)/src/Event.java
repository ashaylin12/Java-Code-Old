
public class Event {

    private String name;
    private String person;
    private String date;
    private double income = 0.0;
    private double expenses = 0.0;

    public Event(String Name, String Person, String Date, double Income, double Expenses) {
        name = Name;
        person = Person;
        date = Date;
        income = Income;
        expenses = Expenses;
    }

    public String toString() {
        String temp = "";
        temp = String.format("%-30s%-35s%-20sR%-13.2f%-12.2f", name, person, date, income, expenses);
        return temp;
    }

    public double calculateProfit() {
        double profit = income - expenses;

        return profit;
    }

    public int findTerm() {
        int term = 0;
        String month = date.substring(5, 7);
        int numMonth = Integer.parseInt(month);
        if (numMonth == 1 || numMonth == 2 || numMonth == 3) {
            term = 1;
        } else if (numMonth == 4 || numMonth == 5 || numMonth == 6) {
            term = 2;
        } else if (numMonth == 7 || numMonth == 8 || numMonth == 9) {
            term = 3;
        }

        return term;
    }

    public String constructNameString() {

        String fullName = "";
        int psnSpace = person.indexOf("");
        int psnComma = person.indexOf(",");
        String surname = person.substring(psnSpace + 1, psnComma);
        String firstName = person.substring(psnComma + 1);
        String initials = firstName.charAt(0) + "";
        int len = firstName.length();
        for (int i = 1; i < len; i++) {
            if (firstName.charAt(i) == ' ') {
                {
                    initials = initials + firstName.charAt(i + 1);
                }
            }
        }
       fullName = initials + " " + surname;
        
        return fullName;
    }
    
    
    
}
