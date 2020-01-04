package cn.iot.chain.controller;

import cn.iot.chain.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/save")
    public String save(){
        transactionService.save();
        return "abc";
    }
}
