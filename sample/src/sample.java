public class sample {

    public static int calc(int a, int b, char op) {

    int result;

    if (op == '+') {
      result = a + b;
    } else if (op == '-') {
      result = a - b;
    } else if (op == '*') {
      result = a * b;
    } else if (op == '/') {
      result = a / b;   // 整数同士なので整数除算
    } else {
      return -1;        // + - * / 以外の場合
    }

    return result;
  }

  // mainメソッド
  public static void main(String[] args) {

    /* 
    int ans1 = calc(10, 5, '+');
    int ans2 = calc(10, 5, '-');
    int ans3 = calc(10, 5, '*');
    int ans4 = calc(10, 5, '/');
    int ans5 = calc(10, 5, '%'); // 不正な演算子 */

    System.out.println(calc(10, 5, '+')); // 15
    System.out.println(calc(10, 5, '-')); // 5
    System.out.println(calc(10, 5, '*')); // 50
    System.out.println(calc(10, 5, '/')); // 2
    System.out.println(calc(10, 5, '%')); // -1
  }

}
