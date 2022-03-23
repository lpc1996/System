<!--
    DATE:2022/2/12-20:04
    Author:旁观者
    FILE NAME:accountSettings.ftlh
    By:IntelliJ IDEA
-->
<!DOCTYPE html>
<html>
<head>
    <#include "common/meta.ftlh">
    <title>账户设置</title>
    <#include "common/style.ftlh">
    <#include "common/script.ftlh">
</head>
<body>
<div class="container">
    <#include "common/header.ftlh">
    <div class="row w-100 ml-0">
        <ul class="list-group w-100">
            <li class="list-group-item">
                <span>密码</span>
                <a href="${basePath}/user/updatePass" class="btn-link ml-5 float-right">
                    <span class="ml-2">修改密码</span>
                </a>
            </li>
        </ul>
    </div>
</div>
</body>
</html>