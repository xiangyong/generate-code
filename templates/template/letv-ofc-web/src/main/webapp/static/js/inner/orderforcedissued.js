$(document).ready(function () {  
$("#buttonUpload").click(function(){     
  	var myFileVal = $('#focusissuedfile').val();
	if(myFileVal == null || myFileVal == ""){
		alert("请选择上传文件");
		return;
	}
	if(myFileVal.indexOf('.xls') == -1 && myFileVal.indexOf('.xlsx') == -1){
		alert("上传文件允许的类型为.xls或者.xlsx");
		return;
	}
      // 上传文件
    $.ajaxFileUpload({
        url:basePath+'/FocusIssued/upload',// 处理文件
        secureuri :false,
        fileElementId :'focusissuedfile',// file控件id
        dataType : 'json',
        success : function (data, status){
        	$('#modal-body').html(data.message);
        	$('#myModal').modal('show');
        },
        error: function(data, status, e){
      		alert("系统异常");
      		
        }
    })
    return false;
  }) 
  
}) 
