package job;


import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

@Slf4j
public class MyJob extends TimerTask {

    @Override
    public void run() {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-hhmmss");
        String fileName = simpleDateFormat.format(now) + ".txt";

        try {
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            writer.close();
            System.out.println(fileName);
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            log.error(e.getMessage());
        }

    }
}
