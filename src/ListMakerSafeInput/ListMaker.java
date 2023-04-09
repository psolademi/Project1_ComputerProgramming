package ListMakerSafeInput;

import java.util.ArrayList;
import java.util.Scanner;
public class ListMaker {
    static ArrayList<String> list = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        final String menu = "A- add, D- delete, P-print, Q =Quit";
        boolean done = false;
        String cmd = "";

        do
        {
            displayList();
            cmd = SafeInput.getRegExString(console, menu, "[AaDdPpQq]");
            cmd = cmd.toUpperCase();

            switch(cmd)
            {
                case "A":
                    Add();
                    break;
                case "D":
                    Delete();
                    break;
                case "P":
                    displayList();
                    break;
                case "Q":
                    Quit();
                    break;



            }
            System.out.println("cmd is " +cmd);
        }
        while(!done);
    }

    private static void Quit() {
        Scanner sc = new Scanner(System.in);
        String message = "Are you sure?";
        boolean quit = SafeInput.getYNConfirm(sc,message);
        if(quit) {
            System.exit(1);
        }
        return;
    }
    private static void Delete() {
        Scanner sc = new Scanner(System.in);
        String message = "Enter item number to remove";
        if(list.isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        int index = SafeInput.getRangedInt(sc, message,1, list.size());
        list.remove(index-1);
    }
    private static void Add() {
        Scanner sc = new Scanner(System.in);
        String item = SafeInput.getNonZeroLenString(sc, "Enter item to add");
        list.add(item);

    }
    private static void displayList()
    {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        if(list.size() !=0)
        {


            for(int i =0; i < list.size(); i++)
            {
                System.out.printf("%3d%35s", i+1, list.get(i) );
                System.out.println();
            }
        }
        else
            System.out.println("+++ List is empty +++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
