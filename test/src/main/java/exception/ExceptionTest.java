package exception;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Slf4j
public class ExceptionTest {

    public static void main(String[] args) {
        //通过路径获得文件
        File file = new File("d://xxx.txt");
        try {
            //获取输入流
            FileInputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            log.error(e.getMessage());
        }
    }
}
