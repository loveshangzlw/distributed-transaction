package cn.iot.service;

import cn.iot.mapper.CustomerMapper;
import cn.iot.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    @Qualifier("orderJdbcTemplate")
    private JdbcTemplate orderJdbcTemplate;

    @Autowired
    @Qualifier("userJdbcTemplate")
    private JdbcTemplate customerJdbcTemplate;

    @Transactional
    public void save(){
        String sqlorder = "INSERT into orders values (1,'abc','rerf',23)";
        String sqlcustomer = "insert into customer values (1,'root','123','admin')";
        orderJdbcTemplate.execute(sqlorder);
        int b = 50/0;
        customerJdbcTemplate.execute(sqlcustomer);
    }
}
