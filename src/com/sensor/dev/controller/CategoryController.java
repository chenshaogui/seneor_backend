package com.sensor.dev.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sensor.dev.service.PersonService;
import com.sensor.dev.util.ImageUtil;
import com.sensor.dev.util.Page;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CategoryController {

	
	
	
 @ResponseBody
 @RequestMapping("/getManyCategory")
 public String getManyCategory() {
	 PersonService personService=new PersonService();
     return (String) JSONObject.toJSON(personService.list());
 }
 
 @ResponseBody
 @RequestMapping(value="/get",method = RequestMethod.GET)
 public String getMany() {
     return  (String) JSONObject.toJSON("test");
 }
}
