import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


    }

    public static int countSmileys(List<String> arr) {
        if (arr == null) {
            return 0;
        }

        int count = 0;
        for (String face : arr) {
            if (isSmile(face)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isSmile(String face) {
        int facelength = face.length();
        if (facelength == 2) {
            char eye = face.charAt(0);
            char mouth = face.charAt(1);
            return (eye == ';' || eye == ':') && (mouth == ')' || mouth == 'D');
        } else if (face.length() == 3) {
            char eye = face.charAt(0);
            char nose = face.charAt(1);
            char mouth = face.charAt(2);
            return (eye == ';' || eye == ':') && (nose == '-' || nose == '~') && (mouth == ')' || mouth == 'D');

        }
        return false;


    }
}
