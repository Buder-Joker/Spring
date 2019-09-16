package com.ming.controller;


import com.ming.po.User;
import com.ming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /*@RequestMapping("/hello")
    public void sayHello(){
        System.out.println("***************");
    }*/

    @RequestMapping("/showUserList")
    public ModelAndView userController() throws Exception{

        List<User> userList =  userService.queryUserListService();

        ModelAndView modelAndView  = new ModelAndView();
        modelAndView.addObject("userListKey",userList);
        modelAndView.setViewName("showuser");
        return modelAndView;
    }

    /*
    String stuId = request.getParameter("stuId");
        StudentDao studentDAO = new StudentDao();
        Student student = studentDAO.findByIdStudent(stuId);
        request.setAttribute("student", student);
        request.getRequestDispatcher("query1.jsp").forward(request, response);
     */
    @RequestMapping("/getUser")
    public ModelAndView userIdController(int id) throws Exception{
        List<User> userList = userService.queryUserByIdService(id);
        ModelAndView modelAndView  = new ModelAndView();
        modelAndView.addObject("userListKey",userList);
        modelAndView.setViewName("query1");
        return modelAndView;
    }
}
