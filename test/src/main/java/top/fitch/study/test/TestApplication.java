package top.fitch.study.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.fitch.study.StringUtil;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        System.out.println(StringUtil.isEmpty(""));
        SpringApplication.run(TestApplication.class, args);
    }

}
