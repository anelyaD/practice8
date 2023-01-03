import java.util.Scanner;

class P8task9169{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
// 9.169. Дано предложение. Вывести на экран:
// а) его слова, начинающиеся и оканчивающиеся на одну и ту же букву;

    String word = in.nextLine();
    String array[] = word.replace(" ","");

    for (int i = 0; i < array.length; i++) {
      int len = array[i].length();
      char arr[] = new char[len];

      for (int j = 0; j < len; j++ ) {
        arr[j] = array[i].charAt(j);
      }
      System.out.println(arr[0]);
      System.out.println(arr[len - 1]);

      if (arr[0] == arr[len - 1]) {
        System.out.println("ura");  
      }else if{
      System.out.println("not ura");
      }
    }
  }
}