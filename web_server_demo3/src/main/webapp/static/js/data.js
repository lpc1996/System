function insertRow(table){
    let selectRow = $(table).jqGrid('getGridParam','selrow');
    let ind = $(selectRow).getInd(selectRow);
    let newInd = ind+1;

}

