public class Nullo1 {
  public static void main(String[] args) {

    String string01= "あいう";
    System.out.println(string1 + "の文字数：" + string1.length());

    string1 = "";
    System.out.println(string1 + "の文字数：" + string1.length());
    // nullの変数を参照するとNullPointerExceptionのエラー
    string1 = null;
    System.out.println(string1 + "の文字数：" + string1.length());

  }
}
