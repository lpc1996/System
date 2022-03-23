<!--
    DATE:2022/2/10-19:16
    Author:旁观者
    FILE NAME:personalInfo.ftlh
    By:IntelliJ IDEA
-->
<!DOCTYPE html>
<html>
<head>
    <#include "common/meta.ftlh" />
    <title>个人资料</title>
    <#include "common/style.ftlh" />
    <#include "common/script.ftlh" />
</head>
<body>
<div class="container">
    <#include "common/header.ftlh" />

    <div class="row pl-3">
        <div class="col-md-2 nav flex-column nav-pills border" role="tablist" aria-orientation="vertical">
            <a id="accountInfoTab" href="#accountInfo" class="nav-link" data-toggle="pill" role="tab" aria-controls="accountInfo" aria-selected="true">账户信息</a>
            <a id="archiveInfoTab" href="#archiveInfo" class="nav-link" data-toggle="pill" role="tab" aria-controls="archiveInfo" aria-selected="false">档案信息</a>
        </div>
        <div class="col-md-10">
            <div class="tab-content border">
                <div class="tab-pane fade show active" id="accountInfo" role="tabpanel" aria-labelledby="accountInfoTab">
                    <ul id ="userInfo" class="list-group collapse show multi-collapse">
                        <li class="list-group-item"><span>账户Id</span><span class="float-right">${user.id}</span></li>
                        <li class="list-group-item"><span>账户昵称</span><span class="float-right">${user.name}</span></li>
                        <li class="list-group-item"><span>创建时间</span><span class="float-right">${user.createTime?string("yyyy年MM月dd日  HH点mm分ss秒")}</span></li>
                        <li class="list-group-item"><span>账户状态</span><span class="float-right">${user.status}</span></li>
                        <li class="list-group-item"><a class="btn btn-primary" role="button" data-toggle="collapse" data-target=".multi-collapse" aria-expanded="false">修改账户信息</a></li>
                    </ul>
                    <form id="updateUserForm" action="${basePath}/user/updateUser" method="post" class="form-horizontal multi-collapse collapse" novalidate="novalidate">
                        <div class="form-group">
                            <div class="input-group">
                                <label for="userIdInput">账户Id：</label>
                                <input id="userIdInput" name="id" type="text" class="form-control" value="${user.id}" readonly="true">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group">
                                <label for="userNameInput">账户昵称：</label>
                                <input id="userNameInput" name="name" type="text" class="form-control" value="${user.name}">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group">
                                <label for="createTimeInput">创建时间：</label>
                                <input id="createTimeInput" name="createTime" type="text" class="form-control" value='${user.createTime?string("yyyy年MM月dd日  HH点mm分ss秒")}' readonly="true">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group">
                                <label for="statusInput">账户状态：</label>
                                <input id="statusInput" name="status" type="text" class="form-control" value="${user.status}" readonly="true">
                            </div>
                        </div>
                        <div class="form-group">
                            <button id="updateUserBtn" type="submit" class="btn btn-primary">修改</button>
                            <button type="button" data-toggle="collapse" data-target=".multi-collapse" class="btn btn-primary" aria-expanded="false">取消</button>
                        </div>
                    </form>
                </div>
                <div id="archiveInfo" class="tab-pane fade border" role="tabpanel" aria-labelledby="archiveInfoTab">
                    <ul class="list-group">
                        <li class="list-group-item">
                            <span>学/工号</span><span class="float-right">${archive.id}</span>
                        </li>
                        <li class="list-group-item">
                            <span>姓名</span><span class="float-right">${archive.name}</span>
                        </li>
                        <li class="list-group-item">
                            <span>年龄</span><span class="float-right">${archive.age}</span>
                        </li>
                        <li class="list-group-item">
                            <span>性别</span><span class="float-right">${archive.sex}</span>
                        </li>
                        <li class="list-group-item">
                            <span>类型</span><span class="float-right">${archive.type}</span>
                        </li>
                        <li class="list-group-item">
                            <span>政治面貌</span><span class="float-right">${archive.politic}</span>
                        </li>
                        <li class="list-group-item">
                            <span>民族</span><span class="float-right">${archive.nation}</span>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>