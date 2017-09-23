//package com.yang.jing.controller;
//
//import javax.annotation.Resource;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.yang.jing.domain.User;
//import com.yang.jing.service.UserQueryService;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//
//@RestController
//@RequestMapping("/test/user")
//@Api("操作User表")
//public class UserDataController {
//	@Resource
//	private UserQueryService userQueryService;
//	
//	@ApiOperation("获取用户信息")
//	@RequestMapping(value="/queryUser")
//    public User queryUser(int userId) {
//		return userQueryService.selectByPrimaryKey(userId);
//    }
//}
