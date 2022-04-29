function editDict(formId,editType){
    let dictForm = $("form#"+formId);
    dictForm.validate();
    if(dictForm.valid()){
        let data = getFormData(dictForm);
        data["updateTime"]=getNowTime();
        data["editType"]=editType;
        $.ajax({
            url:$(dictForm).attr("action"),
            type:"post",
            dataType:"json",
            data: data,
            success:function (resultJSONObject){
                $("#add-dict-modal").modal("hide");
                if(resultJSONObject == true){
                    reloadJqGrid("dict-table");
                }else{
                    alert("提交失败");
                }
            }
        });
    }
}

function delDict(){
    let dictTable = $('table#dict-table');
    if(hasSelect(dictTable)){
        alert("没有选中数据");
    }else {
        let selData = getGridSelData($(dictTable));
        let ifDel = confirm("确认要删除 Id="+selData["id"]+" 的数据字典吗？");
        if(ifDel == true){
            $.ajax({
                url:"/web_server/systemSetting/delDict",
                type:"post",
                dataType: "json",
                data:selData,
                success:function (result){
                    if (result == true){
                        reloadJqGrid("dict-table");
                    }
                }
            });
        }
    }
}