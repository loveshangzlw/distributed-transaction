package cn.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.iot.mapper")
public class DbDbTransaction {
    public static void main(String[] args) {
        SpringApplication.run(DbDbTransaction.class,args);
    }
}
