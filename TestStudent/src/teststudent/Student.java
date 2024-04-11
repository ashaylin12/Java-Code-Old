/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudent;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashaylin Sewnath
 */
public class Student {

    private String name;
    private int Math = 0;
    private int Eng = 0;
    private int IT = 0;
    private int LO = 0;
    private int LS = 0;
    private int Phys = 0;
    private int Afr = 0;
    private int totalMark;
    private int avg = 0;
    private int HighMark = 0;
    private String HighSub = "English";

    public void setValues() {


        name = JOptionPane.showInputDialog("What is your name? ");

        Math = Integer.parseInt(JOptionPane.showInputDialog("Please enter the student's maths mark: "));
        Eng = Integer.parseInt(JOptionPane.showInputDialog("Please enter the student's english mark:  "));
        IT = Integer.parseInt(JOptionPane.showInputDialog("Please enter the student's IT mark: "));
        LO = Integer.parseInt(JOptionPane.showInputDialog("Please enter the student's LO mark: "));
        LS = Integer.parseInt(JOptionPane.showInputDialog("Please enter the student's Life Science mark: "));
        Phys = Integer.parseInt(JOptionPane.showInputDialog("Please enter the student's physics mark: "));
        Afr = Integer.parseInt(JOptionPane.showInputDialog("Please enter the student's afrikaans mark: "));


        totalMark = Math + LO + Phys + Afr + LS + IT + Eng;




    }

    public int GetAvg() {



        avg = (totalMark) / 7;
        return avg;

    }

    public void Achieve() {

        String Achievement;
        Achievement = "A";

        if (avg >= 80) {
            Achievement = "A";
        } else if (avg <= 79 && avg >= 70) {
            Achievement = "B";
        } else if (avg <= 69 && avg >= 60) {
            Achievement = "C";
        } else if (avg <= 59 && avg >= 50) {
            Achievement = "D";
        } else if (avg <= 49 && avg >= 40) {
            Achievement = "E";
        } else if (avg < 39) {
            Achievement = "F";
        }

        JOptionPane.showMessageDialog(null, "You Have Achieved an " + Achievement + " Aggregate!");

    }

    public int HighMark() {

        HighMark = Math;

        if (Eng > HighMark) {
            HighMark = Eng;
        }

        if (IT > HighMark) {
            HighMark = IT;
        }

        if (Phys > HighMark) {
            HighMark = Phys;
        }

        if (LS > HighMark) {
            HighMark = LS;
        }

        if (LO > HighMark) {
            HighMark = LO;
        }


        if (Afr > HighMark) {
            HighMark = Afr;
        }

        return HighMark;


    }

    public String HighSubject() {



        if (HighMark == LO) {
            HighSub = "Life Orientation";
        }

        if (HighMark == Math) {
            HighSub = "Maths";
        }

        if (HighMark == LS) {
            HighSub = "Life Science";
        }

        if (HighMark == IT) {
            HighSub = "Information Technology";
        }
        if (HighMark == Afr) {
            HighSub = "Afrikaans";
        }

        if (HighMark == Phys) {
            HighSub = "Physics";
        }
        return HighSub;


    }
}
