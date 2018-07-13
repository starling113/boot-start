import java.text.SimpleDateFormat;
import java.util.Date;

public class TestReport {

    public static void main(String[] args) {
        System.out.println(new String("制表日期：")+new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }
}
