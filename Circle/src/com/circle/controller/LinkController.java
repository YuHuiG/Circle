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

import com.circle.biz.LINK_MESSAGEBiz;
import com.circle.biz.LINK_TYPEBiz;
import com.circle.entity.LINK_MESSAGE;
import com.circle.entity.LINK_TYPE;
import com.circle.util.PageHelper;

@Controller
public class LinkController {
	@Autowired
	private LINK_TYPEBiz link_TYPEBiz;
	@Autowired
	private LINK_MESSAGEBiz link_MESSAGEBiz;

	/**
	 * 
	 * linkIms
	 * 
	 * **/
	@RequestMapping("/link/link")
	public ModelAndView link() {
		return new ModelAndView("/link/link");
	}

	@RequestMapping("/link/showlinkImsAdd")
	public ModelAndView showlinkImsAdd() {
		List<LINK_TYPE> typelink = this.link_TYPEBiz.queryAll();
		return new ModelAndView("/link/linkImsAdd", "typelink", typelink);
	}

	@RequestMapping("/link/linkImsAdd")
	public ModelAndView linkImsAdd(
			@ModelAttribute("link_MESSAGE") LINK_MESSAGE link_MESSAGE,
			HttpServletRequest request) {
		this.link_MESSAGEBiz.insert(link_MESSAGE);
		return this.linkImsList(null, request);
	}

	@RequestMapping("/link/linkImsList")
	public ModelAndView linkImsList(String page, HttpServletRequest request) {
		if (page == null) {
			page = "1";
		}
		Map<String, Object> prams = new HashMap<String, Object>();
		prams.put("currPage", page);
		int row = 10;
		int total = this.link_MESSAGEBiz.count();
		List<LINK_MESSAGE> list = this.link_MESSAGEBiz.queryall(prams);
		PageHelper ph = new PageHelper(row, total, Integer.parseInt(page), list);
		return new ModelAndView("/link/linkImsList", "ph", ph);
	}

	@RequestMapping("/link/showlinkImsUpdate")
	public ModelAndView showlinkImsUpdate(int id, HttpServletRequest request) {
		LINK_MESSAGE lt = this.link_MESSAGEBiz.selectByPrimaryKey(id);
		List<LINK_TYPE> typelink = this.link_TYPEBiz.queryAll();
		request.getSession().setAttribute("typelink", typelink);
		return new ModelAndView("/link/linkImsUpdate", "lts", lt);
	}

	@RequestMapping("/link/linkImsUpdate")
	public ModelAndView linkImsUpdate(
			@ModelAttribute("link_MESSAGE") LINK_MESSAGE link_MESSAGE,
			HttpServletRequest request) {
		this.link_MESSAGEBiz.updateByPrimaryKeySelective(link_MESSAGE);
		return this.linkImsList(null, request);
	}

	@RequestMapping("/link/deletelinkIms")
	public ModelAndView deletelinkIms(int id, HttpServletRequest request) {
		this.link_MESSAGEBiz.deleteByPrimaryKey(id);
		return this.linkImsList(null, request);
	}

	/**
	 * 
	 * linkType
	 * 
	 * **/
	@RequestMapping("/link/showlinkTypeAdd")
	public ModelAndView showlinkTypeAdd() {

		return new ModelAndView("/link/linkTypeAdd");
	}

	@RequestMapping("/link/linkTypeAdd")
	public ModelAndView linkTypeAdd(
			@ModelAttribute("linktype") LINK_TYPE linktype) {
		this.link_TYPEBiz.insert(linktype);
		return new ModelAndView("/link/linkTypeAdd");
	}

	@RequestMapping("/link/linkTypeList")
	public ModelAndView linkTypeList() {
		List<LINK_TYPE> list = this.link_TYPEBiz.queryAll();
		return new ModelAndView("/link/linkTypeList", "list", list);
	}

	@RequestMapping("/link/showlinkTypeUpdate")
	public ModelAndView showlinkTypeUpdate(int id) {
		LINK_TYPE lt = this.link_TYPEBiz.selectByPrimaryKey(id);
		return new ModelAndView("/link/linkTypeUpdate", "lts", lt);
	}

	@RequestMapping("/link/linkTypeUpdate")
	public ModelAndView linkTypeUpdate(
			@ModelAttribute("linktype") LINK_TYPE linktype) {
		this.link_TYPEBiz.updateByPrimaryKeySelective(linktype);
		return this.linkTypeList();
	}

	@RequestMapping("/link/deletelinkType")
	public ModelAndView deletelinkType(int id) {
		this.link_TYPEBiz.deleteByPrimaryKey(id);
		return this.linkTypeList();
	}
}
