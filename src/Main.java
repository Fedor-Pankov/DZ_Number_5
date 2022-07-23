public class Main {
    public static void main(String[] args) {
        //Первая задача:
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }
        System.out.print(" \n");
        for (i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }
        System.out.print(" \n");

//Вторая задача:
        int friday = 2;
        while (friday < 32) {
            System.out.println("Сегодня пятница " + friday + "-е число" + " необходимо подготовить отчет");
            friday = friday + 7;
        }
        System.out.println(" \n");

//Третья задача:
        int one = 0;
        int year = 2022;
        while (one < year + 100) {
            if (one > 1850)
                System.out.println("Комета пролетела рядом с Землёй в " + one + " году");
            one = one + 79;
        }
    }
}