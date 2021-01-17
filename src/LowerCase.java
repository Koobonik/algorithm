import java.util.regex.Matcher;
import java.util.regex.Pattern;
class LowerCase {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] str = s.split(" ");
        Pattern pattern = Pattern.compile("^[a-z]*$");
        for(int i = 0; i < str.length; i++){
            Matcher matcher = pattern.matcher(String.valueOf(str[i].charAt(0)));
            if(matcher.matches()){
                String hi = String.valueOf(str[i].charAt(0));
                hi = hi.toUpperCase();

                answer = answer + str[i].replaceFirst(str[i], hi + str[i].substring(1)) + " ";
            }
            else {
                answer = answer + str[i] + " ";
            }
        }
        answer = answer.trim();

        return answer;
    }
}