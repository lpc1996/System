$.validator.setDefaults({
    onkeyup:null,
    errorPlacement:function (error,element){
        error.appendTo(element.parent().parent())
    }
})

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
                equalTo: "两次输入的密码不一致"
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
                required:true,
                length:4
            }
        },
        message:{
            userId: {
                required:"请输入用户名"
            },
            password: {
                required:"请输入密码"
            },
            randomCode: {
                required:"请输入验证码",
                length: "验证码的长度必须是四位"
            }
        }
    });

    $('#loginBtn').on('click',function (){
        $('#loginForm').validate();
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