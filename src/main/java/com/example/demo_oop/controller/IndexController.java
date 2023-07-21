package com.example.demo_oop.controller;

import com.example.demo_oop.model.*;

import com.example.demo_oop.model.work.DevWork;
import com.example.demo_oop.model.work.HRWork;
import com.example.demo_oop.model.work.TesterWork;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping(path = "/")
public class IndexController {



    @GetMapping
    public String index(){
        demo_override();
        checkConnection();
        return "index";
    }

    public void checkConnection() {

    }
    private void demo_override() {
        // show staff object in constructor 5 params into 4 params belong person object
//        Staff a  = new Staff("Trần Tấn Tài ", "Long An", 23, "05/12/2001","Thực tập sinh");
//        a.show();
//        System.out.println("---------------------------");
//        // show staff object in constructor 1 param belong staff object
//        Staff b = new Staff("Nhân viên kinh doanh");
//        b.show();
//        System.out.println("---------------------------");
//        // show staff object in constructor none param
//        Staff c = new Staff();
//        c.show();
//        System.out.println("---------------------------");
//        // show HR staff in constructor 1 param belong HRStaff object
//        Staff d = new HRStaff("Receive CV from candidate");
//        d.show();
        // show HRStaff object with full params
        CEO abc = new CEO("Lâm Nhật Ánh", "Long An" , 23, "03/11/2001", Arrays.asList(
                new HRStaff(1,"Trần Tấn Tài ", "Long An", 23, "05/12/2001","HR xử lý tuyển sinh ","Code Java Spring Boot", 26, new HRWork()),
                new HRStaff(2,"Trần Tấn C ", "Long An", 23, "05/12/2001","HR xử lý hợp đồng","Code Java Spring Boot", 22, new HRWork()),
                new DevStaff(3,"Nguyễn Tấn D ", "Long An", 23, "05/12/2001","Dev Java ","Code Java Spring Boot", 23, new DevWork()),
                new TesterStaff(4,"Trần Tấn Cầu", "Long An", 23, "05/12/2001","QC ","Code Java Spring Boot", 25, new TesterWork())

                ));
//
        abc.show();
        // work of all staff off company managed by CEO abc

//        System.out.println("Lương của anh CEO: " +abc.changeCurrency(abc.payMent()));
//        HRStaff e  = new HRStaff("Trần Tấn Tài ", "Long An", 23, "05/12/2001","Thực tập sinh","Code Java Spring Boot", 999 );
//        System.out.println( "Số tiền mà nhân viên trên nhận được là: "+ e.changeCurrency(e.payMent()));


    }
}
