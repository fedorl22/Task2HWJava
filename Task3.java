// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение). 
// Без встр. функций


// public class Task3 {
//     public static void main(String[] args) {
//         String s = "1aaasdttfttdsaaa1";
//         int length = s.length();
//          if (length == 0)
//             System.out.println("True");
//         int left = 0;
//         int right = length - 1;
//         int a = 0;
//         while (left < right) {
//             if (s.charAt(left) != s.charAt(right)) {
//                 a = 1;
//                 System.out.println("False");
//                 break ;
//             } else {
//                 left++;
//                 right--;
                
//             }
//         }
//         if (a==0) {
//         System.out.println("True");    
//         }

//     }
// }
public class Task3 {
    public static void main(String[] args) {
        String s = "1aaasdttfttdsaaa1";
        System.out.println(Palindrome(s));
    }

    public static boolean Palindrome(String s) {
        int len = s.length();
        if (len == 0)
            return true;
        int l = 0;
        int r = len - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}