<!--
    DATE:2022/2/1
    Author:旁观者
    FILE NAME:$NAME.ftlh
    By:IntelliJ IDEA
-->
<!DOCTYPE html>
<html lang="en">
<head>
    <#include "./common/meta.ftlh" />
    <title>登录</title>
    <#include "./common/style.ftlh" />
    <#include "./common/script.ftlh" />
</head>
<body>
    <div class="container">
        <#include "./common/header.ftlh"/>

        <div class="row">
            <div class="col-md-6">
                <h3>欢迎使用本系统</h3>
                <p>学生使用学号登录；教职工使用工号登录；</p>
                <p>初始密码为学/工号，登录后请及时修改密码！</p>
            </div>
            <div class="col-md-6 login-box">
                <form id="loginForm" action="${basePath}/user/check" method="post" class="form-horizontal">
                    <div class="login-title">
                        <span>用户登录</span>
                    </div>
                    <div class="form-group has-feedback">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <i class="input-group-text align-middle font-icon fa-solid fa-user-large"></i>
                            </div>
<#--                                <span></span>-->
                            <input id="userName" type="text" class="form-control" name="userName" placeholder="请输入用户名">
                        </div>
                    </div>
                    <div class="form-group has-feedback">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <i class="input-group-text align-middle font-icon fa-solid fa-lock"></i>
                            </div>
                            <input id="password" type="password" class="form-control" name="password" placeholder="请输入密码">
                        </div>
                    </div>
                    <div class="from-group randomImage-box">
                        <div class="input-group">
                            <label for="randomCodeInput" ><span>验证码：</span></label>
                            <img id="randomImage" src="${basePath}/user/getRandomImage" alt="点击更换图片" title="点击更换图片" onclick="refreshRandomImage()"/>
                            <input id="randomCodeInput" class="form-control" type="text" maxlength="4" name="randomCode" placeholder="请输入验证码"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <input id="loginBtn" type="submit" class="form-control btn btn-outline-primary" value="快速登录"/>
                    </div>
                    <div class="form-group">
                        <div class="row">
                            <div class="col-md-3">
                                <button type="button" class="btn btn-link text-nowrap" href="#">快速注册</button>
                            </div>
                            <div class="col-md-3 offset-md-6">
                                <button type="button" class="btn btn-link text-nowrap" href="#">忘记密码？</button>
                            </div>
                        </div>
                    </div>
                    <div class="form-group" style="display: <#if errMsg??>block<#else>none</#if>">
                        <div class="alert alert-danger" role="alert">
                            <#if errMsg??>
                                ${errMsg}
                            </#if>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>