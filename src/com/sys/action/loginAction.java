package com.sys.action;

import java.util.HashMap;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.sys.beans.User;
import com.sys.dao.UserDAO;

@Namespace("/default")
@ResultPath("/")
@Results({
	@Result(name="success", location = "/home.jsp"),
	@Result(name="failure", location = "/login.jsp")
})
public class loginAction  extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String email;
	private String password;
	
	@Actions({ @Action("/login") })
	@Override
	public String execute() throws Exception {
		
		HashMap<String, Object> params = new HashMap<>();
		params.put("email", email);
		params.put("password", password);
		User u = new UserDAO().selectUserByCredentials(params);
		if(u != null) {
			return "success";
		}else {
			return "failure";
		}
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
