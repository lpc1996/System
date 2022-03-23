<!--
    DATE:2022/2/5-19:03
    Author:旁观者
    FILE NAME:updatePassword.ftlh
    By:IntelliJ IDEA
-->
<!DOCTYPE HTML>
<html>
<head>
    <#include "./common/meta.ftlh" />
    <title>修改密码</title>
    <#include "./common/style.ftlh" />

    <#include "./common/script.ftlh" />
</head>
<body>
    <div class="container">
        <#include "./common/header.ftlh" />
        <div class="row box">
            <div class="col-md-4 offset-md-4 bg-light up-pass-box">
                <form id="updatePassForm" action="${basePath}/user/checkNewPass" method="POST" class="form-horizontal">
                    <div class="form-group text-center">
                        <span>修改密码</span>
                    </div>
                    <div class="form-group">
                        <div class="input-group">
                            <label for="userNameInput" class="form-inline label-margin">用户名：</label>
                            <input id="userNameInput" name="userId" type="text" class="form-control" readonly="true" value="">
                            <script type="text/javascript" >
                                let userId = $.cookie("userId");
                                if(userId != null){
                                    $("input#userNameInput").val(userId);
                                }else{
                                    alert("未登录或登录过期，请重新登陆")
                                    $(location).attr("href","${basePath}/user/login");
                                }
                            </script>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="input-group">
                            <label class="form-inline label-margin" for="oldPassword">输入旧密码：</label>
                            <input id="oldPassword" type="password" class="form-control" name="oldPassword" placeholder="请输入旧密码">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="input-group">
                            <label class="form-inline label-margin" for="newPassword">输入新密码：</label>
                            <input id="newPassword" name="newPassword" type="password" class="form-control" placeholder="请输入新密码">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="input-group">
                            <label class="form-inline label-margin" for="checkNewPass">确认新密码：</label>
                            <input id="checkNewPass" name="checkNewPass" class="form-control" type="password" placeholder="请重新输入新密码" />
                        </div>
                    </div>
                    <div class="from-group">
                        <button id="updatePassBtn" type="submit" class="btn btn-outline-primary btn-block">修改密码</button>
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