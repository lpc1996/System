<#--<nav class="nav-nar navbar-default navbar-fixed-top" role="navigation">-->
<#--    <div class="navbar-header">-->

<#--        <button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-context" type="button">-->
<#--            <span class="sr-only">切换导航</span>-->
<#--            <i class="fa-solid fa-bars"></i>-->
<#--        </button>-->
<#--&lt;#&ndash;        <a class="navbar-brand" href="${basePath}/index">校园管理系统</a>&ndash;&gt;-->
<#--    </div>-->
<#--    <div class="collapse navbar-collapse" id="navbar-context">-->
<#--        <ul class="nav navbar-nav">-->
<#--            <li class="nav-item"><a href="${basePath}/index">首页</a></li>-->
<#--            <li class="nav-item"><a href="${basePath}/user/updatePass">修改密码</a></li>-->
<#--            <li class="nav-item"><a href="${basePath}/user/login">登录</a></li>-->
<#--        </ul>-->
<#--        <div>-->
<#--            <div id="userInfo" class="d-none">-->
<#--                <div>-->
<#--                    <p>-->
<#--                        ${userId}:${userName}-->
<#--                    </p>-->
<#--                </div>-->
<#--            </div>-->
<#--        </div>-->
<#--    </div>-->
<#--</nav>-->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="${basePath}/index">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="${basePath}/index">首页 <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-expanded="false">
                    Dropdown
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Something else here</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled">Disabled</a>
            </li>
        </ul>
<#--        <form class="form-inline my-2 my-lg-0">-->
<#--            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">-->
<#--            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>-->
<#--        </form>-->
        <div id="noLogin" class="navbar-nav text-light bg-danger">
            <a href="${basePath}/user/login" class="nav-link">登录</a>
            <span class="nav-link">/</span>
            <a href="#" class="nav-link">注册</a>
        </div>
        <div id="userInfo" class="navbar-nav text-danger bd-danger d-none">
            <div class="navbar-nav dropdown">
                <a href="#" class="nav-link dropdown-toggle" id="userDropdown" role="button" data-toggle="dropdown" aria-expanded="false">${user.id}</a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a href="${basePath}/user/personalInfo" class="dropdown-item">个人中心</a>
                    <a href="${basePath}/user/accountSetting" class="dropdown-item">账户设置</a>
                    <a href="${basePath}/user/logout" class="dropdown-item">退出登录</a>
                </div>
            </div>
        </div>
    </div>
</nav>