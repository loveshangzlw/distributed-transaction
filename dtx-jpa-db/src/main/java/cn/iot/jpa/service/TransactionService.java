package cn.iot.jpa.service;

import cn.iot.jpa.bean.Customer;
import cn.iot.jpa.dao.CustomerJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {

    @Autowired
    private CustomerJpaRepository customerMapper;

    @Autowired
    @Qualifier("orderJdbcTemplate")
    private JdbcTemplate orderJdbcTemplate;



    @Transactional
    public void save(){

        String sqlorder = "INSERT into orders values (1,'abc','rerf',23)";
        orderJdbcTemplate.execute(sqlorder);
        int b = 50/0;
        Customer customer = new Customer();
        customer.setPassword("123");
        customer.setRole("adminstrot");
        customer.setUsername("Penstaro");
        customerMapper.save(customer);


    }
}
