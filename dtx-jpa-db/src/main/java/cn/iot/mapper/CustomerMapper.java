package cn.iot.mapper;

import cn.iot.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerMapper extends JpaRepository<Customer,Long> {
}
