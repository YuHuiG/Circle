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

import com.circle.biz.CapitalBiz;
import com.circle.biz.CapitalTypeBiz;
import com.circle.entity.Capital;
import com.circle.entity.CapitalType;
import com.circle.util.PageHelper;

@Controller
public class CapitalController {
	@Autowired
	private CapitalBiz capitalBiz;

	@Autowired
	private CapitalTypeBiz capitalTypeBiz;

	@RequestMapping("/fmoney/FM")
	public ModelAndView FM() {

		return new ModelAndView("/fmoney/FM");
	}

	@RequestMapping("/fmoney/showFMIMSadd")
	public ModelAndView showFMIMSadd() {// 展示添加页面
		return new ModelAndView("/fmoney/FMIMSadd");
	}

	@RequestMapping("/fmoney/FMIMSadd")
	public ModelAndView FMIMSadd(@ModelAttribute("capital") Capital cp,
			HttpServletRequest request) {// 执行增加操作
		System.out.println(cp);
		this.capitalBiz.insert(cp);
		return this.FMIMSList(null, request);
	}

	@RequestMapping("/fmoney/FMIMSdelete")
	public ModelAndView FMIMSdelete(int id, HttpServletRequest request) {
		this.capitalBiz.deleteByPrimaryKey(id);
		return this.FMIMSList(null, request);
	}

	@RequestMapping("/fmoney/FMIMSList")
	public ModelAndView FMIMSList(String page, HttpServletRequest request) {
		if (page == null) {
			page = "1";
		}
		System.out.println("page========="+page);
		int row = 10;
		Map<String, Object> parm = new HashMap<String, Object>();
		parm.put("currPage", page);
		int total = this.capitalBiz.count();
		List<Capital> list = this.capitalBiz.queryall(parm);
		List<CapitalType> listsmalltype = this.capitalTypeBiz.querysmalltype();
		System.out.println(listsmalltype);
		request.getSession().setAttribute("listsmalltype", listsmalltype);
		PageHelper ph = new PageHelper(row, total, Integer.parseInt(page), list);
		return new ModelAndView("/fmoney/FMIMSList", "ph", ph);
	}

	@RequestMapping("/fmoney/showFMIMSUpdate")
	// 回填
	public ModelAndView showFMIMSUpdate(Integer id) {
		Capital cp = this.capitalBiz.selectByPrimaryKey(id);

		return new ModelAndView("/fmoney/FMIMSUpdate", "cp", cp);
	}

	@RequestMapping("/fmoney/FMIMSUpdate")
	// 执行修改操作
	public ModelAndView FMIMSUpdate(@ModelAttribute("capital") Capital cp,
			HttpServletRequest request) {
		this.capitalBiz.updateByPrimaryKeySelective(cp);
		return this.FMIMSList(null, request);
	}

	@RequestMapping("/fmoney/FMTypeAdd")
	public ModelAndView FMTypeAdd() {
		List<CapitalType> cp = this.capitalTypeBiz.querybigtype();
		return new ModelAndView("/fmoney/FMTypeAdd", "cp", cp);
	}

	@RequestMapping("fmoney/AddFmType")
	public ModelAndView AddFmType(
			@ModelAttribute("capitalType") CapitalType ct,
			HttpServletRequest request) {
		this.capitalTypeBiz.insert(ct);
		return this.FMTypeList(request);
	}

	@RequestMapping("/fmoney/FMTypeList")
	public ModelAndView FMTypeList(HttpServletRequest request) {
		List<CapitalType> list1 = this.capitalTypeBiz.querybigtype();
		List<CapitalType> list2 = this.capitalTypeBiz.querysmalltype();
		System.out.println(list1);
		System.out.println(list2);
		request.getSession().setAttribute("list1", list1);
		request.getSession().setAttribute("list2", list2);
		return new ModelAndView("/fmoney/FMTypeList");
	}

	@RequestMapping("/fmoney/FMTypeUpdate")
	// 回填
	public ModelAndView FMTypeUpdate(Integer sid, HttpServletRequest request) {
		CapitalType ctype = this.capitalTypeBiz.selectByPrimaryKey(sid);
		System.out.println(ctype);
		List<CapitalType> cp = this.capitalTypeBiz.querybigtype();
		request.getSession().setAttribute("cp", cp);
		return new ModelAndView("/fmoney/FMTypeUpdate", "ctype", ctype);
	}

	@RequestMapping("/fmoney/ZXFMTypeUpdate")
	// 执行修改操作
	public ModelAndView Update(@ModelAttribute("capitalType") CapitalType ct,
			HttpServletRequest request) {

		this.capitalTypeBiz.updateByPrimaryKey(ct);
		return this.FMTypeList(request);
	}

	@RequestMapping("/fmoney/FMTypedelete")
	public ModelAndView FMTypedelete(Integer sid, HttpServletRequest request) {
		this.capitalTypeBiz.deleteByPrimaryKey(sid);
		return this.FMTypeList(request);
	}

}
