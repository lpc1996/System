<!--
    DATE:2022/2/10-19:33
    Author:旁观者
    FILE NAME:leftNav.ftlh
    By:IntelliJ IDEA
-->
<div class="col-lg-2 col-xl-1 bd-sidebar">
    <div class="panel-group table-responsive">
        <div class="panel panel-primary">
            <div id="systemSettingTab" class="panel-heading" data-toggle="collapse" data-target="#systemSetting" role="tab">
                <h4 class="panel-title">
                    <span>系统设置</span>
                    <i class="fa-solid fa-angle-down"></i>
                </h4>
            </div>
            <div id="systemSetting" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="systemSettingTab">
                <ul class="list-group">
                    <li class="list-group-item">
                        <a href="" class="btn-link">用户管理</a>
                    </li>
                    <li class="list-group-item">
                        <a href="" class="btn-link">角色管理</a>
                    </li>
                    <li class="list-group-item">
                        <a href="" class="btn-link">权限管理</a>
                    </li>
                    <li class="list-group-item">
                        <a href="" class="btn-link">字段管理</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <script>
        $(".panel-heading").click(function(e){
            /*切换折叠指示图标*/
            $(this).find("i").toggleClass("fa-angle-down");
            $(this).find("i").toggleClass("fa-angle-up");
        });
    </script>
</div>
