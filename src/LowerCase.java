class LowerCase {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        //Pattern pattern = Pattern.compile("^[a-z]*$");
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("")){
                answer += " ";
                continue;
            }
            String firstChar = String.valueOf(str[i].charAt(0));
            firstChar = firstChar.toUpperCase();
            String lastStr = str[i].substring(1, str[i].length());
            lastStr = lastStr.toLowerCase();
            answer += firstChar + lastStr + " ";
        }
        if(s.charAt(s.length() -1 ) != ' ')
            answer = answer.trim();

        return answer;
    }
}