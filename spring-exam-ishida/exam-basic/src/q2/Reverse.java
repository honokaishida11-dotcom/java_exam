package q2;

/**
 * Q2. 文字列を逆転させなさい。確認する文字列はどんなものでも構いません。
 *
 * <pre>
 * (例)
 * "abcde" => "edcba"
 * "酔いしれ占う仲良いあの娘" => " この愛よ叶うなら嬉しいよ"
 * </pre>
 *
 * メソッドreverseを作成しなさい。
 *
 * @author y.morinaga
 */
public class Reverse {

    public static void main(String[] args) {
        //        String reversed = reverse("よいしれうらなうなかよいあのこ");
        //        System.out.println(reversed);

        String str1 = "abcde";
        String str2 = "よいしれうらなうなかよいあのこ";

        System.out.println(reverse(str1));
        System.out.println(reverse(str2));

    }


        public static String reverse(String text){

            String reversed = "";

            for (int i = text.length() -1 ; i >= 0 ; i--){
                reversed += text.charAt(i);
            }
            return reversed;
        }
    }
