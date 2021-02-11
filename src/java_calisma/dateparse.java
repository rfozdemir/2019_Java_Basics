package java_calisma;

import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateparse {
    public static void main(String[] args) {

      //  String date= LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
 //  It wil thrown an exception because related time (Probably)
      //  System.out.println(date);
//LocalDate date= LocalDate.of(2012,1,31);

//date.plusDays(10);
        //System.out.println(date);

        LocalDate date1=LocalDate.now();
        System.out.println(date1);
LocalDate date2=LocalDate.of(2020,12,15);
        System.out.println(date2);
LocalDate date3=LocalDate.parse("2020-06-20",DateTimeFormatter.ISO_DATE);
        System.out.println(date3);

    }
}
