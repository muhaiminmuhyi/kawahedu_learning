package Task;

import Task.Model.modelList;
import Task.Model.modelViewMenu;

import java.util.*;
import java.util.regex.Pattern;

public class MidTest {

    /*
    * INITIALIZATION VARIABLE
    * */

    static modelViewMenu mvm = new modelViewMenu();
    static modelList ml = new modelList();
    static Scanner scan = new Scanner(System.in);
    static List<String> name_food = new ArrayList<String>();
    static List<Integer> worldcup_year = new ArrayList<Integer>();

    static List<String> province_names = Arrays.asList(ml.province());

    static List<String> program_language = Arrays.asList(ml.language_program());

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu(){
        mvm.midTest();

        System.out.print("Choose Number : ");
        String numMenu = scan.nextLine();

        if (numMenu.equals("1"))
            Regex();
        else if(numMenu.equals("2")) {
            mvm.midTestTwo();
            System.out.print("Choose Number : ");
            String numMenuTwo = scan.nextLine();

            if (numMenuTwo.equals("1"))
                name_food();
            else if (numMenuTwo.equals("2"))
                world_cup_year();
            else if (numMenuTwo.equals("3"))
                province_names();
            else if (numMenuTwo.equals("4"))
                language_program();
            else
                System.out.println("Nothing but the best !!");
        }

    }

    public static void Regex(){
        System.out.print("Input Regex Here : ");
        String regexInput = scan.nextLine();

        String patternEmail = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        String patternIpAddr = "\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b";
        String patternDate = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        String patternDateTwo = "[a-zA-Z]{3,}[,\\s]\\s*[a-zA-Z]{3,}\\s*[0-9]{2,}";

        boolean CheckEmail = Pattern.matches(patternEmail, regexInput);
        boolean CheckIpAddr = Pattern.matches(patternIpAddr, regexInput);
        boolean CheckDate = Pattern.matches(patternDate, regexInput);
        boolean CheckDateTwo = Pattern.matches(patternDateTwo, regexInput);

        if (CheckEmail)
            System.out.println("This is email !");
        else if (CheckIpAddr)
            System.out.println("This is Ip Address !");
        else if (CheckDate)
            System.out.println("This is Date dd-MM-yyyy and dd/MM/yyyy !");
        else if (CheckDateTwo)
            System.out.println("This is Date dddd, MMMMM yyyy !");
        else
            System.out.println("nothing but the best !!");

        YesOrNo();
    }

    public static void province_names(){
        System.out.println("Before sorting :");
        province_names.forEach(System.out::println);

        province_names.sort(Collections.reverseOrder());

        System.out.println("After sorting by descending :");
        province_names.forEach(System.out::println);
    }

    public static void language_program() {
        List<String> al = new ArrayList<>(program_language);
        al.remove(3);
        al.remove(5);
        al.remove(1);
        al.remove(2);
        al.remove(4);
        al.forEach(System.out::println);
    }

    public static void world_cup_year(){
        worldcup_year.add(2022);
        worldcup_year.add(2018);
        worldcup_year.add(2014);
        worldcup_year.add(2010);

        worldcup_year.forEach(System.out::println);
    }

    public static void name_food(){
        name_food.add("Ketoprak");
        name_food.add("Gado-Gado");
        name_food.add("Bakso");
        name_food.add("Cilor");
        name_food.add("Mielor");
        name_food.add("Cireng");
        name_food.add("Seblak");
        name_food.add("Gudeg");
        name_food.add("Rendang");
        name_food.add("Opor");

        name_food.forEach(System.out::println);
    }

    public static void YesOrNo(){
        System.out.print("Continue ? Y/N :");
        String valContinue = scan.nextLine();
        if (valContinue.equals("Y"))
            Regex();
        else if(valContinue.equals("N"))
            scan.close();
        else
            System.out.println("input false");
    }
}
