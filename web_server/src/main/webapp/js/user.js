//刷新验证码
function refreshRandomImage(){
    let randomImage = $("#randomImage").attr("src");
    $("#randomImage").attr("src", randomImage.replace(/\?.*$/, '') + '?' + Math.random());
    alert("已刷新验证码!")
}

function getCookie(name) {
    var prefix = name + "="
    var start = document.cookie.indexOf(prefix)

    if (start == -1) {
        return null;
    }

    var end = document.cookie.indexOf(";", start + prefix.length)
    if (end == -1) {
        end = document.cookie.length;
    }

    var value = document.cookie.substring(start + prefix.length, end)
    return unescape(value);
}

$.validator.setDefaults({
    onkeyup:null,
    // onfocusin:function (element){
    //     let preElement = $(element).parent().parent();
    //     let errlabel = $(preElement).children("label.error");
    //     $(errlabel).style.display="block";
    // },
    // onfocusout:function (element){
    //     let preElement = $(element).parent().parent();
    //     let errlabel = $(preElement).children("label.error");
    //     $(errlabel).style.display="none";
    // },
    // submitHandler: function(form) {
    //     form.submit();
    // },
    errorPlacement:function (error,element){
        error.appendTo(element.parent().parent())
    }
})

//修改密码表单验证
$().ready(function (){
    $("#updatePassForm").validate({
        rules:{
            oldPassword: {
                required:true
            },
            newPassword:{
                required: true
            },
            checkNewPass:{
                required:true,
                equalTo:"#newPassword",
            }
        },
        messages:{
            oldPassword: {
                required:"请输入旧密码"
            },
            newPassword: {
                required:"请输入新密码"
            },
            checkNewPass: {
                required:"请重新输入新密码",
                equalTo: "两次密码不一致"
            }
        }
    });

    $('#updatePassBtn').on('click',function (){
        $('#updatePassForm').validate();
    });

    //登录部分表单验证
    $('#loginForm').validate({
        rules:{
            userName:{
                required:true
            },
            password:{
                required:true
            },
            randomCode:{
                required:true
            }
        },
        message:{
            userName: {
                required:"请输入用户名"
            },
            password: {
                required:"请输入密码"
            },
            randomCode: {
                required:"请输入验证码"
            }
        }
    });

    $('#loginBtn').on('click',function (){
        $('#loginForm').validate();
    });

    $(function (){
        let userId = $.cookie("userId");
        let userName = $.cookie("userName");
        if( userId != null && userName != null){
            $("#userInfo").removeClass("d-none");
            $("#noLogin").addClass("d-none");
        }else{
            let url = window.location; // 获取当前页面的地址
            let protocol = location.protocol //获取http或https
            let host = url.host //获取当前JSP页面的地址栏IP和端口号    即：//localhost:8080
            let contextPath = url.pathname.split("/")[1];  //获取项目名  即：showproduct
            let trail = url.pathname.split("/")[url.pathname.split("/").length-1];
            if(trail == "login"){
                return;
            }
            let basePath = protocol +"//"+host+"/"+contextPath;
            location.href=basePath+"/user/login";
        }
    });

    $("#updateUserForm").validate({
        rules:{
            id:{
                required:true
            },
            name:{
                required:true
            },
            createTime:{
                required:true
            },
            status:{
                required:true
            }
        }
    });
    
    $("#updateUserBtn").on("click",function () {
        $("#updateUserForm").validate();
    });
});

function updateUser(element){
    $(element).children("div").remove();
    $(element).children("a").remove();
    let input = $("<input id='userNameInput' type='text' name='userName' class=\"form-control w-25 rounded\" >");
    $(element).append(input);
    let changeBtn = $("<button id='changeBtn' type='button' class='btn-link btn-danger text-white rounded ml-2' >修改</button>");
    $(element).append(changeBtn);
    let cancelBtn = $("<button id='cancelBtn' type='button' class='btn-link btn-danger text-white rounded ml-2' onclick='backView($(this).parent(),$.cookie(\"userName\"))'>取消</button>");
    $(element).append(cancelBtn);
}

function backView(element,value){
    $(element).children("input.form-control").remove();
    $(element).children("button").remove();
    let userName = $("<div></div>");
    $(userName).text(value);
    $(element).append(userName);
    let editBtn = $("<a type='button' class='btn-link ml-1 input-text' onclick='updateUser($(this).parent() );'></a>")
    $(editBtn).append("<i class=\"fa-solid fa-pen-to-square\"></i>")
    $(editBtn).append("<span class=\"mb-1\">编辑</span>")
    $(element).append(editBtn);
}


