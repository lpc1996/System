function editRole(){
    let roleForm = $("form#role-form");
    let roleTable = $("table#role-table");
    roleForm.validate();
    let formData = getFormData(roleForm);
    formData["editType"] = $("#role-submit").attr("value");
    if(roleForm.valid()){
        $.ajax({
            url:$(roleForm).attr("action"),
            type:"post",
            dataType:"json",
            data:formData,
            success:function (resultData){
                if(resultData == true){
                    $("#role-modal").modal("hide");
                    reloadJqGrid("role-table");
                    clearForm("role-form");
                }else{
                    alert("提交失败");
                }
            }
        });
    }
}