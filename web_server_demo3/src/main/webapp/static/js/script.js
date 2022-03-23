$().ready(function (){

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

