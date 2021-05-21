package app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/","/index","/main"})
public class MainController {
    List<User> users = new ArrayList<User>();
    
    @RequestMapping(path = {"users","user"},method = {RequestMethod.POST,RequestMethod.GET})
    public List<User> processUser()
    {
        return users;
    }

    @RequestMapping(path="users/addnewuser")
    public User addUser(@RequestBody User u)
    {
        users.add(u);
        return u;
    }

    @RequestMapping(path = {"products","product"})
    public String processProduct()
    {
        return "hello user";
    }

}
