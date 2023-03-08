// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.FileReader;

public class Task2 {
    public static void main(String[] args) throws Exception {
        String[] filestring = ReadLineFromFile("file.txt");
        for (int i = 0; i < filestring.length; i++) {
            System.out.println(PrintLine(filestring[i]));
        }

    }

    public static String[] ReadLineFromFile(String pathway) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String s;
        int size = 0;
        while ((s = br.readLine()) != null) {
            size++;
        }
        br.close();
        String[] strdata = new String[size];
        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((s = br1.readLine()) != null) {
            strdata[i] = s;
            i++;
        }
        br1.close();
        // return strdata;
        return strdata;
    }

    public static StringBuilder PrintLine(String line) {
        StringBuilder result = new StringBuilder("");
        String[] fileData = line.split(",");
        String[] listName = { "Студент ", " получил ", " по предмету " };
        for (int i = 0; i < fileData.length; i++) {
            String[] fdata = fileData[i].split(":");
            result.append(listName[i]);
            result.append(fdata[1]);
        }
        return result;
    }
}