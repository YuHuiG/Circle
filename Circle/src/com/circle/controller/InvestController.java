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

import com.circle.biz.INVEST_MESSAGEBiz;
import com.circle.biz.INVEST_TYPEBiz;
import com.circle.biz.INVEST_USER_MESSAGEBiz;
import com.circle.entity.INVEST_MESSAGE;
import com.circle.entity.INVEST_TYPE;
import com.circle.entity.INVEST_USER_MESSAGE;
import com.circle.util.PageHelper;

@Controller
public class InvestController {
	@Autowired
	private INVEST_TYPEBiz invest_TYPEBiz;
	@Autowired
	private INVEST_MESSAGEBiz invest_MESSAGEBiz;
	@Autowired
	private INVEST_USER_MESSAGEBiz invest_USER_MESSAGEBiz;

	@RequestMapping("/invest/invest")
	public ModelAndView Invest() {
		return new ModelAndView("/invest/Invest");
	}

	/**
	 * InvestIms
	 * **/
	@RequestMapping("/invest/showImsAdd")
	public ModelAndView showImsAdd(HttpServletRequest request) {
		List<INVEST_TYPE> btype = this.invest_TYPEBiz.Btypelist();
		request.getSession().setAttribute("btype", btype);
		return new ModelAndView("/invest/InvestImsAdd");
	}

	@RequestMapping("/invest/investImsAdd")
	public ModelAndView InvestImsAdd(
			@ModelAttribute("invest_MESSAGE") INVEST_MESSAGE invest_MESSAGE,
			HttpServletRequest request) {
		this.invest_MESSAGEBiz.insert(invest_MESSAGE);
		return this.InvestImsList(null, request);
	}

	@RequestMapping("/invest/investImsList")
	public ModelAndView InvestImsList(String page, HttpServletRequest request) {
		if (page == null) {
			page = "1";
		}
		Map<String, Object> prams = new HashMap<String, Object>();
		prams.put("currPage", page);
		int row = 10;
		int total = this.invest_MESSAGEBiz.count();
		List<INVEST_MESSAGE> list = this.invest_MESSAGEBiz.queryall(prams);

		PageHelper ph = new PageHelper(row, total, Integer.parseInt(page), list);
		List<INVEST_TYPE> btype = this.invest_TYPEBiz.Btypelist();
		request.getSession().setAttribute("btype", btype);
		return new ModelAndView("/invest/InvestImsList", "ph", ph);
	}

	@RequestMapping("/invest/showInvestImsUpdate")
	public ModelAndView showInvestImsUpdate(int imId) {
		INVEST_MESSAGE ims = this.invest_MESSAGEBiz.selectByPrimaryKey(imId);
		return new ModelAndView("/invest/InvestImsUpdate", "ims", ims);
	}

	@RequestMapping("/invest/investImsUpdate")
	public ModelAndView InvestImsUpdate(
			@ModelAttribute("invest_MESSAGE") INVEST_MESSAGE invest_MESSAGE,
			HttpServletRequest request) {
		this.invest_MESSAGEBiz.updateByPrimaryKeySelective(invest_MESSAGE);
		return this.InvestImsList(null, request);

	}

	@RequestMapping("/invest/deleteIms")
	public ModelAndView deleteIms(int imId, HttpServletRequest request) {
		this.invest_MESSAGEBiz.deleteByPrimaryKey(imId);
		return this.InvestImsList(null, request);
	}

	/**
	 * InvestType
	 * **/
	@RequestMapping("/invest/showInvestTypeAdd")
	public ModelAndView showInvestTypeAdd() {
		return new ModelAndView("/invest/InvestTypeAdd");
	}

	@RequestMapping("/invest/investTypeAdd")
	public ModelAndView InvestTypeAdd(
			@ModelAttribute("invest_TYPE") INVEST_TYPE invest_TYPE,
			HttpServletRequest request) {
		if (invest_TYPE != null) {
			this.invest_TYPEBiz.insert(invest_TYPE);
		}
		return this.InvestTypeList(request);
	}

	@RequestMapping("/invest/investTypeList")
	public ModelAndView InvestTypeList(HttpServletRequest request) {
		List<INVEST_TYPE> stype = this.invest_TYPEBiz.Stypelist();
		List<INVEST_TYPE> btype = this.invest_TYPEBiz.Btypelist();
		request.getSession().setAttribute("stype", stype);
		request.getSession().setAttribute("btype", btype);
		return new ModelAndView("/invest/InvestTypeList");
	}

	@RequestMapping("/invest/showInvestTypeUpdate")
	public ModelAndView showInvestTypeUpdate(int itId) {
		INVEST_TYPE itype = this.invest_TYPEBiz.selectByPrimaryKey(itId);
		return new ModelAndView("/invest/InvestTypeUpdate", "itype", itype);
	}

	@RequestMapping("/invest/investTypeUpdate")
	public ModelAndView InvestTypeUpdate(
			@ModelAttribute("invest_TYPE") INVEST_TYPE invest_TYPE,
			HttpServletRequest request) {
		System.out.println(invest_TYPE);
		this.invest_TYPEBiz.updateByPrimaryKeySelective(invest_TYPE);
		return this.InvestTypeList(request);
	}

	@RequestMapping("/invest/deleteInvestType")
	public ModelAndView deleteInvestType(int itId, HttpServletRequest request) {
		this.invest_TYPEBiz.deleteByPrimaryKey(itId);
		return this.InvestTypeList(request);
	}

	/**
	 * Investor
	 * **/
	@RequestMapping("/invest/investorAdd")
	public ModelAndView InvestorAdd(
			@ModelAttribute("invest_USER_MESSAGE") INVEST_USER_MESSAGE invest_USER_MESSAGE,
			HttpServletRequest request) {
		this.invest_USER_MESSAGEBiz.insert(invest_USER_MESSAGE);
		return this.InvestorList(null, request);
	}

	@RequestMapping("/invest/showtorAdd")
	public ModelAndView showtorAdd() {
		return new ModelAndView("/invest/InvestorAdd");
	}

	@RequestMapping("/invest/investorList")
	public ModelAndView InvestorList(String page, HttpServletRequest request) {
		if (page == null) {
			page = "1";
		}
		int row = 10;
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("currPage", page);
		int total = this.invest_USER_MESSAGEBiz.count();
		List<INVEST_USER_MESSAGE> list = this.invest_USER_MESSAGEBiz
				.queryall(parms);
		PageHelper ph = new PageHelper(row, total, Integer.parseInt(page), list);

		return new ModelAndView("/invest/InvestorList", "ph", ph);
	}

	@RequestMapping("/invest/showInvestorUpdate")
	public ModelAndView showInvestor(int iumId) {
		INVEST_USER_MESSAGE itor = this.invest_USER_MESSAGEBiz
				.selectByPrimaryKey(iumId);
		return new ModelAndView("/invest/InvestorUpdate", "itor", itor);
	}

	@RequestMapping("/invest/investorUpdate")
	public ModelAndView InvestorUpdate(
			@ModelAttribute("invest_USER_MESSAGE") INVEST_USER_MESSAGE invest_USER_MESSAGE,
			HttpServletRequest request) {
		this.invest_USER_MESSAGEBiz
				.updateByPrimaryKeySelective(invest_USER_MESSAGE);
		return this.InvestorList(null, request);
	}

	@RequestMapping("/invest/deleteInvestor")
	public ModelAndView deleteInvestor(int iumId, HttpServletRequest request) {
		this.invest_USER_MESSAGEBiz.deleteByPrimaryKey(iumId);
		return this.InvestorList(null, request);
	}
}
