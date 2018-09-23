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

import com.circle.biz.OTHER_MESSAGEBiz;
import com.circle.biz.OTHER_TYPEBiz;
import com.circle.entity.ESSAY_MESSAGE;
import com.circle.entity.OTHER_MESSAGE;
import com.circle.entity.OTHER_TYPE;
import com.circle.util.PageHelper;

@Controller
public class OtherController {
	@Autowired
	private OTHER_MESSAGEBiz other_MESSAGEBiz;
	@Autowired
	private OTHER_TYPEBiz other_TYPEBiz;

	/**
	 * otherIms
	 * **/
	@RequestMapping("/other/other")
	public ModelAndView other() {
		return new ModelAndView("/other/other");
	}

	@RequestMapping("/other/showotherImsAdd")
	public ModelAndView showotherImsAdd(HttpServletRequest request) {
		List<OTHER_TYPE> stype = this.other_TYPEBiz.Stypelist();
		List<OTHER_TYPE> btype = this.other_TYPEBiz.Btypelist();
		request.getSession().setAttribute("stype", stype);
		request.getSession().setAttribute("btype", btype);
		return new ModelAndView("/other/otherImsAdd");
	}

	@RequestMapping("/other/otherImsAdd")
	public ModelAndView otherImsAdd(
			@ModelAttribute("message") OTHER_MESSAGE message,
			HttpServletRequest request) {
		this.other_MESSAGEBiz.insert(message);
		return this.otherImsList(null, request);
	}

	@RequestMapping("/other/otherImsList")
	public ModelAndView otherImsList(String page, HttpServletRequest request) {
		if (page == null) {
			page = "1";
		}
		int row = 10;
		Map<String, Object> parm = new HashMap<String, Object>();
		parm.put("currPage", page);
		int total = this.other_MESSAGEBiz.count();
		List<OTHER_MESSAGE> list = this.other_MESSAGEBiz.queryall(parm);
		PageHelper ph = new PageHelper(row, total, Integer.parseInt(page), list);
		List<OTHER_TYPE> stype = this.other_TYPEBiz.Stypelist();
		List<OTHER_TYPE> btype = this.other_TYPEBiz.Btypelist();
		request.getSession().setAttribute("stype", stype);
		request.getSession().setAttribute("btype", btype);
		return new ModelAndView("/other/otherImsList", "ph", ph);
	}

	@RequestMapping("/other/showotherImsUpdate")
	public ModelAndView showotherImsUpdate(int id, HttpServletRequest request) {
		List<OTHER_TYPE> stype = this.other_TYPEBiz.Stypelist();
		List<OTHER_TYPE> btype = this.other_TYPEBiz.Btypelist();
		request.getSession().setAttribute("stype", stype);
		request.getSession().setAttribute("btype", btype);
		OTHER_MESSAGE message = this.other_MESSAGEBiz.selectByPrimaryKey(id);
		return new ModelAndView("/other/otherImsUpdate", "message", message);
	}

	@RequestMapping("/other/otherImsUpdate")
	public ModelAndView otherImsUpdate(
			@ModelAttribute("message") OTHER_MESSAGE message,
			HttpServletRequest request) {
		this.other_MESSAGEBiz.updateByPrimaryKeySelective(message);
		return this.otherImsList(null, request);
	}

	@RequestMapping("/other/deleteotherIms")
	public ModelAndView deleteotherIms(int id, HttpServletRequest request) {
		this.other_MESSAGEBiz.deleteByPrimaryKey(id);
		return this.otherImsList(null, request);
	}

	/**
	 * otherType
	 * **/
	@RequestMapping("/other/showotherTypeAdd")
	public ModelAndView showotherTypeAdd(HttpServletRequest request) {
		List<OTHER_TYPE> stype = this.other_TYPEBiz.Stypelist();
		List<OTHER_TYPE> btype = this.other_TYPEBiz.Btypelist();
		request.getSession().setAttribute("stype", stype);
		request.getSession().setAttribute("btype", btype);
		return new ModelAndView("/other/otherTypeAdd");
	}

	@RequestMapping("/other/otherTypeAdd")
	public ModelAndView otherTypeAdd(HttpServletRequest request,
			@ModelAttribute("othertype") OTHER_TYPE othertype) {
		this.other_TYPEBiz.insert(othertype);
		return this.otherTypeList(request);
	}

	@RequestMapping("/other/otherTypeList")
	public ModelAndView otherTypeList(HttpServletRequest request) {
		List<OTHER_TYPE> stype = this.other_TYPEBiz.Stypelist();
		List<OTHER_TYPE> btype = this.other_TYPEBiz.Btypelist();
		request.getSession().setAttribute("stype", stype);
		request.getSession().setAttribute("btype", btype);
		return new ModelAndView("/other/otherTypeList");
	}

	@RequestMapping("/other/showotherTypeUpdate")
	public ModelAndView showotherTypeUpdate(int id, HttpServletRequest request) {
		List<OTHER_TYPE> stype = this.other_TYPEBiz.Stypelist();
		OTHER_TYPE othert = this.other_TYPEBiz.selectByPrimaryKey(id);
		request.getSession().setAttribute("othert", othert);
		return new ModelAndView("/other/otherTypeUpdate", "stype", stype);
	}

	@RequestMapping("/other/otherTypeUpdate")
	public ModelAndView otherTypeUpdate(HttpServletRequest request,
			@ModelAttribute("othertype") OTHER_TYPE othertype) {
		this.other_TYPEBiz.updateByPrimaryKeySelective(othertype);
		return this.otherTypeList(request);
	}

	@RequestMapping("/other/deleteotherType")
	public ModelAndView deleteotherType(int id, HttpServletRequest request) {
		this.other_TYPEBiz.deleteByPrimaryKey(id);
		return this.otherTypeList(request);
	}
}
