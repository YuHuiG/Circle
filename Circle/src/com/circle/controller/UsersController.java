package com.circle.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.circle.biz.UsersBiz;
import com.circle.biz.WebbiBiz;
import com.circle.entity.Users;
import com.circle.entity.Webbi;
import com.circle.util.GetIp;
import com.circle.util.PageHelper;

@Controller
public class UsersController {
	@Autowired
	private UsersBiz usersbiz;

	@Autowired
	private WebbiBiz webbiBiz;

	@RequestMapping("login")
	public ModelAndView login(@ModelAttribute("users") Users u,
			HttpServletRequest request) {
		// Users user = this.usersbiz.login(u);
		// if (user != null) {
		// request.getSession().setAttribute("user", user);
		return new ModelAndView("/message/ISM");
		// } else {
		// return new ModelAndView("index", "msg", "登录失败，账号或密码有误！");
		// }

	}

	@RequestMapping("/index")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping("/loginout")
	public ModelAndView loginout(HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		return new ModelAndView("index");
	}

	@RequestMapping("/message/ISM")
	public ModelAndView ISM() {
		return new ModelAndView("/message/ISM");
	}

	@RequestMapping("/IMSWeb")
	public ModelAndView IMSWeb(HttpServletRequest request) {
		Webbi wb = this.webbiBiz.selectByPrimaryKey(1);
		System.out.println(wb);
		request.getSession().setAttribute("wb", wb);
		return new ModelAndView("/message/IMSWeb");
	}

	@RequestMapping("/updateWeb")
	public ModelAndView updateWeb(@ModelAttribute("webbi") Webbi wb,
			HttpServletRequest request) {
		System.out.println(wb);
		this.webbiBiz.updateByPrimaryKey(wb);
		request.getSession().setAttribute("wb", wb);
		return new ModelAndView("/message/IMSWeb");
	}

	@RequestMapping("/IMSUsers")
	public ModelAndView IMSUsers(String page, HttpServletRequest request) {
		if (page == null) {
			page = "1";
		}
		int row = 3;// 设置行数
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("currPage", page);
		parms.put("pageSize", row);
		int total = this.usersbiz.count();
		// System.out.println(total);
		// int total = Integer.parseInt(totala);
		List<Users> list = this.usersbiz.queryAll(parms);
		// System.out.println(list + "::");
		PageHelper ph = new PageHelper(row, total, Integer.parseInt(page), list);
		request.getSession().setAttribute("ph", ph);
		return new ModelAndView("/message/IMSUsers");
	}

	@RequestMapping("/IMSUpdateUser")
	// 回填
	public ModelAndView IMSUpdateUser(int id) {
		Users updateuser = this.usersbiz.queryid(id);
		return new ModelAndView("/message/IMSUpdateUser", "updateuser",
				updateuser);
	}

	@RequestMapping("/UpdateUser")
	// 执行修改操作
	public ModelAndView UpdateUser(@ModelAttribute("users") Users u) {
		this.usersbiz.update(u);
		return new ModelAndView("/message/ISM");
	}

	@RequestMapping("/IMSAddUser")
	public ModelAndView IMSAddUser() {
		return new ModelAndView("/message/IMSAddUser");
	}

	@RequestMapping("/AddUser")
	public ModelAndView AddUser(@ModelAttribute("users") Users u,
			HttpServletRequest request) {
		u.setIp(new GetIp().getIpAddr(request));
		u.setAddr("湖北荆州");
		System.out.println(u);
		// try {
		// GetAddr a=new GetAddr();
		// System.out.println(a.getAddresses(u.getIp(), "UTF-8"));
		// } catch (UnsupportedEncodingException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		this.usersbiz.Add(u);
		return this.IMSUsers(null, request);
	}

	@RequestMapping("/deleteUser")
	public ModelAndView deleteUser(int id, HttpServletRequest request) {
		this.usersbiz.delete(id);
		return this.IMSUsers(null, request);
	}

}
