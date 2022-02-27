package com.bharat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bharat.dao.EBSMRepo;
import com.bharat.entity.EBSM;

@Controller
public class EBSMController {
	@Autowired
	EBSMRepo br;
	
	@RequestMapping("/")
	public String show()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/addbill")
	@ResponseBody
	public String addbill(EBSM b)
	{
		br.save(b);
		return "Bill Added...";
	}
	
	@RequestMapping("/viewbill")
	@ResponseBody
	public String viewbill(int id)
	{
		
		EBSM b = br.findById(id).orElse(new EBSM());
		return b.toString();
	}
	
	@RequestMapping("/viewallbill")
	@ResponseBody
	public String viewallbill()
	{
		List<EBSM> l = (List<EBSM>) br.findAll();
		return l.toString();
	}
	
	@RequestMapping("/updatebill")
	@ResponseBody
	public String updatepd(EBSM b)
	{
		br.save(b);
		return "address Updated...";
	}
	
	@RequestMapping("/deletebill")
	@ResponseBody
	public String deletebill(int id)
	{
			br.deleteById(id);
			return "payment Deleted";
	}
}