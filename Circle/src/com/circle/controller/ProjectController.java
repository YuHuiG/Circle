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

import com.circle.biz.PROJECTBiz;
import com.circle.biz.PROJECT_MESSAGEBiz;
import com.circle.entity.Capital;
import com.circle.entity.CapitalType;
import com.circle.entity.PROJECT;
import com.circle.entity.PROJECT_MESSAGE;
import com.circle.util.PageHelper;

@Controller
public class ProjectController {
	@Autowired
	private PROJECT_MESSAGEBiz project_MESSAGEBiz;
	@Autowired
	private PROJECTBiz projectBiz;

	@RequestMapping("/project/project")
	public ModelAndView project() {
		return new ModelAndView("/project/project");
	}

	@RequestMapping("/project/projectImsAdd")
	public ModelAndView projectImsAdd(
			@ModelAttribute("project_MESSAGE") PROJECT_MESSAGE project_MESSAGE,
			HttpServletRequest request, int tzzijin1, int tzdanwei1) {
		System.out.println("======project_MESSAGE=" + project_MESSAGE);
		List<PROJECT> Sprojlist = this.projectBiz.Sprojectlist();
		List<PROJECT> Bprojlist = this.projectBiz.Bprojectlist();
		request.getSession().setAttribute("Sprojlist", Sprojlist);
		request.getSession().setAttribute("Bprojlist", Bprojlist);
		String pmMoney = "" + (tzzijin1 + tzdanwei1) / 2;
		project_MESSAGE.setPmMoney(pmMoney);
		this.project_MESSAGEBiz.insertSelective(project_MESSAGE);
		return this.projectImsList("1", request);
	}

	@RequestMapping("/project/showImsAdd")
	public ModelAndView showImsAdd(HttpServletRequest request) {
		List<PROJECT> Sprojlist = this.projectBiz.Sprojectlist();
		List<PROJECT> Bprojlist = this.projectBiz.Bprojectlist();
		request.getSession().setAttribute("Sprojlist", Sprojlist);
		request.getSession().setAttribute("Bprojlist", Bprojlist);
		return new ModelAndView("/project/projectImsAdd");

	}

	@RequestMapping("/project/projectImsList")
	public ModelAndView projectImsList(String page, HttpServletRequest request) {
		if (page == null) {
			page = "1";
		}
		Map<String, Object> prams = new HashMap<String, Object>();
		prams.put("currPage", page);
		int row = 10;
		int total = this.project_MESSAGEBiz.count();
		List<PROJECT_MESSAGE> list = this.project_MESSAGEBiz.queryall(prams);
		PageHelper ph = new PageHelper(row, total, Integer.parseInt(page), list);
		return new ModelAndView("/project/projectImsList", "ph", ph);
	}

	@RequestMapping("/project/projectImsUpdate")
	public ModelAndView projectImsUpdate(
			@ModelAttribute("project_MESSAGE") PROJECT_MESSAGE project_MESSAGE,
			HttpServletRequest request) {
		this.project_MESSAGEBiz.updateByPrimaryKeySelective(project_MESSAGE);
		return this.projectImsList("1", request);

	}

	@RequestMapping("/project/showImsUpdate")
	public ModelAndView showImsUpdate(int pmId, HttpServletRequest request) {
		PROJECT_MESSAGE pm = this.project_MESSAGEBiz.selectByPrimaryKey(pmId);
		List<PROJECT> Bprojlist = this.projectBiz.Bprojectlist();
		request.getSession().setAttribute("Bprojlist", Bprojlist);
		return new ModelAndView("/project/projectImsUpdate", "pm", pm);
	}

	@RequestMapping("/project/deleteIms")
	public ModelAndView deleteIms(int pmId, HttpServletRequest request) {
		this.project_MESSAGEBiz.deleteByPrimaryKey(pmId);
		return this.projectImsList(null, request);
	}

	@RequestMapping("/project/showTypeAdd")
	public ModelAndView showTypeAdd(HttpServletRequest request) {
		List<PROJECT> Sprojlist = this.projectBiz.Sprojectlist();
		List<PROJECT> Bprojlist = this.projectBiz.Bprojectlist();
		request.getSession().setAttribute("Sprojlist", Sprojlist);
		request.getSession().setAttribute("Bprojlist", Bprojlist);
		return new ModelAndView("/project/projectTypeAdd");
	}

	@RequestMapping("/project/projectTypeAdd")
	public ModelAndView projectTypeAdd(
			@ModelAttribute("project") PROJECT project,
			HttpServletRequest request) {
		this.projectBiz.insert(project);

		return this.projectTypeList(request);
	}

	@RequestMapping("/project/projectTypeList")
	public ModelAndView projectTypeList(HttpServletRequest request) {
		List<PROJECT> Sprojlist = this.projectBiz.Sprojectlist();
		List<PROJECT> Bprojlist = this.projectBiz.Bprojectlist();
		request.getSession().setAttribute("Sprojlist", Sprojlist);
		request.getSession().setAttribute("Bprojlist", Bprojlist);
		return new ModelAndView("/project/projectTypeList");
	}

	@RequestMapping("/project/showTypeUpdate")
	public ModelAndView showTypeUpdate(int pId, HttpServletRequest request) {
		PROJECT proj = this.projectBiz.selectByPrimaryKey(pId);
		List<PROJECT> Sprojlist = this.projectBiz.Sprojectlist();
		List<PROJECT> Bprojlist = this.projectBiz.Bprojectlist();
		request.getSession().setAttribute("Sprojlist", Sprojlist);
		request.getSession().setAttribute("Bprojlist", Bprojlist);
		return new ModelAndView("/project/projectTypeUpdate", "proj", proj);
	}

	@RequestMapping("/project/projectTypeUpdate")
	public ModelAndView projectTypeUpdate(
			@ModelAttribute("project") PROJECT project,
			HttpServletRequest request) {
		this.projectBiz.updateByPrimaryKey(project);
		return this.projectTypeList(request);
	}

	@RequestMapping("/project/projectTypedelete")
	public ModelAndView projectTypedelete(int pId, HttpServletRequest request) {
		this.projectBiz.deleteByPrimaryKey(pId);
		return this.projectTypeList(request);
	}
}
