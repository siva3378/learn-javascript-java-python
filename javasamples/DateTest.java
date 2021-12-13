package javasamples;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class DateTest {
  public static void main(String[] args) {
    SimpleDateFormat formatter = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss z");
    String d = "Thu Nov 07 2019 09:00:00 GMT+0100 (Central European Standard Time)".split(" (", 2)[0];

    Date dt = formatter.parse(d);

    System.out.println("dt >>>" + dt);
  }
}