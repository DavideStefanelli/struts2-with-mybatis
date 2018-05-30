package com.sys.action;

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
	@Result(name="success", location = "/index.jsp")
})
public class InsertAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String name;
	private String surname;
	private String email;
	private String password;
	
	@Actions({ @Action("/insert") })
	@Override
	public String execute() throws Exception {
		
		User u = new User();
		u.setEmail(email);
		u.setPassword(password);
		u.setName(name);
		u.setSurname(surname);
		
		new UserDAO().insertUser(u); 

		return "success";
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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
