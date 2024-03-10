import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PGS_파일명정렬 {
    public String[] solution(String[] files) {
        Pattern pattern = Pattern.compile("(\\D+)(\\d+)*");

        Arrays.sort(files, (o1, o2) -> {
            Matcher matcher1 = pattern.matcher(o1);
            Matcher matcher2 = pattern.matcher(o2);

            if (matcher1.find() && matcher2.find()) {
                int headCompare = matcher1.group(1).toLowerCase().compareTo(matcher2.group(1).toLowerCase());
                if (headCompare != 0) {
                    return headCompare;
                } else {
                    return Integer.compare(Integer.parseInt(matcher1.group(2)), Integer.parseInt(matcher2.group(2)));
                }
            }
            return 0;
        });
        return files;
    }
}