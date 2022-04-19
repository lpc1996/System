function insertRow(table){
    let selectRow = $(table).jqGrid('getGridParam','selrow');
    let ind = $(selectRow).getInd(selectRow);
    let newInd = ind+1;

}

function getNowTime(){
    let time = new Date();
    let today = time.getFullYear()+'-'+(time.getMonth() + 1) +'-'+time.getDate()+' '
        + time.getHours()+':' +time.getMinutes()+':'+time.getSeconds();
    return today;
}