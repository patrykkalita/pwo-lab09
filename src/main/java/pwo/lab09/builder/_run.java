package pwo.lab09.builder;

import java.util.Scanner;

public class _run {

    public static void main(String[] args) {
        //TxtPic1 txtPic = new TxtPic1('.', '*', 20, "txtpic1.txt");
        //txtPic.save();

        TxtPic3 txtPic3 = new TxtPic3();
        
        Scanner sc = new Scanner(System.in);
        int a;
        char b,f;
        String file;
        
        do {
            System.out.println("Set size");
            a = sc.nextInt();
        }while(a < 0);
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Set background:");
        b = sc2.next().charAt(0);
        
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Set foreground:");
        f = sc3.next().charAt(0);
        
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Provide file name (with extension)");
        file = sc4.nextLine();

        txtPic3
                .setBackground(b)
                .setForeground(f)
                .setSize(a)
                .setFileName(file)
                .createTxtPic()
                .save();
    }
}

