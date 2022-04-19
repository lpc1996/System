function initDictForm(modal){
    let dictForm = $('form#dict-form');
    let dictTable = $('table#dict-table');
    if(hasSelect(dictTable)){
        alert("没有选中数据");
    }else{
        let rowId = $(dictTable).jqGrid("getGridParam","selrow");
        let selData = $(dictTable).getRowData(rowId);
        let inputArray = $("form#dict-form input");
        $.each(inputArray , function (index){
            $(inputArray[index]).attr("value",selData[$(inputArray[index]).attr("name")]);
        })
        modal.modal("show");
    }
}

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

                }
            }
        });
    }
}