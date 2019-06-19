package hjx.struts.action;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import hjx.struts.entity.User;
import hjx.struts.service.UserService;
@Controller
public class UserAction extends ActionSupport {
	@Resource(name="userService")
	private UserService us;
	public String findUserById() {
		User user= us.findUserById(4);
		System.out.println(user);
		return SUCCESS;
	}
}
