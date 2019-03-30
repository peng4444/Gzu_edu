package cn.gzu.edu.web.controller;

import cn.gzu.edu.model.User;
import cn.gzu.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 用户登录成功，跳转到用户管理界面
     * @return
     */
    @RequestMapping("login")
    public String login(){
        System.out.println("=====登录成功=====");
        return "login";
    }

    /**
     * 增加用户
     * @return
     */
    @RequestMapping("edit")
    public String edit(){
        return "User/UserEdit";
    }

    /**
     * 根据id删除用户
     * @return
     */
    public String delete(Integer id){
        return "User/UserDelete";
    }

    public String update(Integer id){
        return "User/UserUpdate";
    }

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    @RequestMapping("find")
    public String find(Integer id){
        User user = userService.findById(id);
        System.out.println(user);
        return "User/UserManage";
    }

    @RequestMapping("manage")
    public String manage(){
        return "User/UserManage";
    }

    @RequestMapping("info")
    public String info(){
        return "User/UserInfo";
    }


}
