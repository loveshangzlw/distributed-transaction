package cn.iot.jpa.dao;

import cn.iot.jpa.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepository extends JpaRepository<Customer,Long> {
}
