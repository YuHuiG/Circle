package com.circle.controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.circle.biz.ESSAY_MESSAGEBiz;
import com.circle.biz.ESSAY_TYPEBiz;
import com.circle.entity.ESSAY_MESSAGE;
import com.circle.entity.ESSAY_TYPE;
import com.circle.util.PageHelper;

@Controller
public class EssayController {
	@Autowired
	private ESSAY_TYPEBiz essay_TYPEBiz;
	@Autowired
	private ESSAY_MESSAGEBiz essay_MESSAGEBiz;

	/**
	 * 
	 * essayIms
	 * 
	 * **/
	@RequestMapping("/essay/essay")
	public ModelAndView essay() {
		return new ModelAndView("/essay/essay");
	}

	@RequestMapping("/essay/showessayImsAdd")
	public ModelAndView showessayImsAdd(HttpServletRequest request) {
		List<ESSAY_TYPE> stype = this.essay_TYPEBiz.Stypelist();
		List<ESSAY_TYPE> btype = this.essay_TYPEBiz.Btypelist();
		request.getSession().setAttribute("stype", stype);
		request.getSession().setAttribute("btype", btype);
		return new ModelAndView("/essay/essayImsAdd");
	}

	@RequestMapping("/essay/essayImsAdd")
	public ModelAndView essayImsAdd(
			@ModelAttribute("essay_MESSAGE") ESSAY_MESSAGE essay_MESSAGE,
			HttpServletRequest request) {
		if(essay_MESSAGE.getEmDate().equals("")){
			essay_MESSAGE.setEmDate(new Date(0));
		}
		this.essay_MESSAGEBiz.insertSelective(essay_MESSAGE);
		return this.essayImsList(null, request);
	}

	@RequestMapping("/essay/essayImsList")
	public ModelAndView essayImsList(String page, HttpServletRequest request) {
		if (page == null) {
			page = "1";
		}
		int row = 10;
		Map<String, Object> parm = new HashMap<String, Object>();
		parm.put("currPage", page);
		int total = this.essay_MESSAGEBiz.count();
		List<ESSAY_MESSAGE> list = this.essay_MESSAGEBiz.queryall(parm);
		PageHelper ph = new PageHelper(row, total, Integer.parseInt(page), list);
		return new ModelAndView("/essay/essayImsList", "ph", ph);
	}

	@RequestMapping("/essay/showessayImsUpdate")
	public ModelAndView showessayImsUpdate(int id) {
		ESSAY_MESSAGE emupdate = this.essay_MESSAGEBiz.selectByPrimaryKey(id);
		return new ModelAndView("/essay/essayImsUpdate", "emupdate", emupdate);
	}

	@RequestMapping("/essay/essayImsUpdate")
	public ModelAndView essayImsUpdate(
			@ModelAttribute("essay_MESSAGE") ESSAY_MESSAGE essay_MESSAGE,
			HttpServletRequest request) {
		this.essay_MESSAGEBiz.updateByPrimaryKeySelective(essay_MESSAGE);
		return this.essayImsList(null, request);
	}

	@RequestMapping("/essay/deletesessayIms")
	public ModelAndView deletesessayIms(int id, HttpServletRequest request) {
		this.essay_MESSAGEBiz.deleteByPrimaryKey(id);
		return this.essayImsList(null, request);
	}

	/**
	 * essayType
	 * **/
	@RequestMapping("/essay/showessayTypeAdd")
	public ModelAndView showessayTypeAdd() {
		List<ESSAY_TYPE> stype = this.essay_TYPEBiz.Stypelist();
		System.out.println(stype);
		return new ModelAndView("/essay/essayTypeAdd", "stype", stype);
	}

	@RequestMapping("/essay/essayTypeAdd")
	public ModelAndView essayTypeAdd(
			@ModelAttribute("essay_TYPE") ESSAY_TYPE essay_TYPE,
			HttpServletRequest request) {
		this.essay_TYPEBiz.insert(essay_TYPE);
		return this.essayTypeList(request);
	}

	@RequestMapping("/essay/essayTypeList")
	public ModelAndView essayTypeList(HttpServletRequest request) {
		List<ESSAY_TYPE> stype = this.essay_TYPEBiz.Stypelist();
		List<ESSAY_TYPE> btype = this.essay_TYPEBiz.Btypelist();
		request.getSession().setAttribute("stype", stype);
		request.getSession().setAttribute("btype", btype);
		return new ModelAndView("/essay/essayTypeList");
	}

	@RequestMapping("/essay/essayTypeUpdate")
	public ModelAndView essayTypeUpdate(
			@ModelAttribute("essay_TYPE") ESSAY_TYPE essay_TYPE,
			HttpServletRequest request) {
		this.essay_TYPEBiz.updateByPrimaryKeySelective(essay_TYPE);
		return this.essayTypeList(request);
	}

	@RequestMapping("/essay/showessayTypeUpdate")
	public ModelAndView showessayTypeUpdate(int id, HttpServletRequest request) {
		ESSAY_TYPE et = this.essay_TYPEBiz.selectByPrimaryKey(id);
		List<ESSAY_TYPE> stype = this.essay_TYPEBiz.Stypelist();
		request.getSession().setAttribute("et", et);
		return new ModelAndView("/essay/essayTypeUpdate", "stype", stype);
	}

	@RequestMapping("/essay/deleteType")
	public ModelAndView deleteType(int id, HttpServletRequest request) {
		this.essay_TYPEBiz.deleteByPrimaryKey(id);
		return this.essayTypeList(request);
	}
}
