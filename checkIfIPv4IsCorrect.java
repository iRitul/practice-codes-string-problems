import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            strings.add(line);
        }
        String regex = "^(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < strings.size(); i++) {
            Matcher matcher = pattern.matcher(strings.get(i));
            if (matcher.matches()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        scanner.close();
    }
}
