package com.yang.jing.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/user")
@Api("userController相关api")
/**
 * 这个类是测试类与数据库无关，测试swagger和spring-boot测试类
 * @author Administrator
 *
 */
public class UserController {
    @ApiOperation("获取用户信息")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType="header",name="username",dataType="String",
        		          required=true,value="用户的姓名",defaultValue="zhaojigang"),
        @ApiImplicitParam(paramType="query",name="password",dataType="String",
                          required=true,value="用户的密码",defaultValue="wangna")
    })
    @ApiResponses({
        @ApiResponse(code=400,message="请求参数没填好"),
        @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/getUser",method=RequestMethod.GET)
    @ResponseBody
    public String getUser( @RequestHeader("username") String username, 
    		@RequestParam("password") String password) {
        return "user";
    }
    @RequestMapping(value="/testQuery",method=RequestMethod.POST)
    @ResponseBody
    public String QueryUser(String user,String password) {
        return user+"的密码是："+password;
    }
    
}
