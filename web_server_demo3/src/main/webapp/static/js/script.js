$().ready(function (){
    // $("button.refresh-btn").on("click",f)
})

//刷新验证码
function refreshRandomImage(){
    let randomImage = $("#randomImage").attr("src");
    $("#randomImage").attr("src", randomImage.replace(/\?.*$/, '') + '?' + Math.random());
    alert("已刷新验证码!");
}

function formatTimestappmp(cellvalue, options, rowObject) {
    var date = new Date(cellvalue);
    var Y = date.getFullYear() + '-';
    var M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) :
        date.getMonth() + 1) + '-';
    var D = date.getDate() + ' ';
    var h = date.getHours() + ':';
    var m = date.getMinutes() + ':';
    var s = date.getSeconds();
    return Y + M + D + h + m + s;
}

function get_unix_time(dateStr){
    var newstr = dateStr.replace(/-/g,'/');
    var date =   new Date(newstr);
    var time_str = date.getTime().toString();
    return time_str.substr(0, 10);
}

function getFormData(form) {
    var d = {};
    var t = $(form).serializeArray();
    $.each(t, function() {
        d[this.name] = this.value;
    });
    return d;
}

function hasSelect(table){
    let selectRow = $(table).jqGrid("getGridParam","selrow");
    return selectRow == null ? true : false;
}

/**
 * 清空表单数据
 * @param formId 表单ID
 */
function clearForm(formId){
    let inputArray = $("form#"+formId+" input");
    $.each(inputArray, function (index){
        $(inputArray[index]).attr("value",null);
    });
}

