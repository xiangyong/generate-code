var MyPopWindow = {
	openWindow : function(url, width, height){
		JqueryDialog.Open1("自动编译系统",url, width ,height);
	},
	openWindow1 : function(url){
		var width=800;
		var height=600;
		MyPopWindow.openWindow(url, width ,height);
	},
	openWindow2 : function(url){
		var width=600;
		var height=400;
		MyPopWindow.openWindow(url, width ,height);
	},
	
	SubmitCompletedCallback : function(data){
		var msg = data.message;
		var result =false;
		if(data.code== "200"){result=true;}	
		//Jquery Dialog回调函数
		window.parent.JqueryDialog.SubmitCompleted(msg, result, result);
	},
	
	SubmitCompletedCallback2 : function(data,url){
		var alertMsg = data.message;
		if($.trim(alertMsg).length > 0 ){alert(alertMsg);}
		var result = data.code== "200"; 	
		if(result && $.trim(alertMsg).length > 0 ){window.location.href = url;}
	},
	
	ExecutePost : function(msg, url, data) {
		var r = window.confirm(msg);
        if(r == true){
			jQuery.post(url, data,
				function(data) {
					alert(data.message);
					if(data.code == "200"){	
						var queryForm=window.document.forms[0];
						if(typeof(queryForm) != "undefined"){
							queryForm.submit();
						}else{
							window.location.href = window.location.href;
						}	
						window.close();
					}
				}
			);
		}
	},
	
	ExecuteDelete : function(url, data) {
        MyPopWindow.ExecutePost("删除后不能恢复，确定删除该条记录吗？", url, data);
	},
    ExecuteRecovery : function(url, data) {
        MyPopWindow.ExecutePost("确定要启用该条记录吗？", url, data);
    }
}


var CheckboxUtils = {
	/*设置全选或全不选
	 *<input id="checkAll" type="checkbox" onClick="CheckboxUtils.setCheckedAll('subBox',this.checked);"/>全选
	 *或者 
	 * $("#checkAll").click(function() {
        	CheckboxUtils.setCheckedAll("subBox",this.checked);
   		});
	*/
	setCheckedAll : function(subCheckboxName,checked){
		$("input[name='"+subCheckboxName+"']").attr("checked",checked);
	},
	
	getAllCheckedValues : function (checkboxName){
   		var arrChk=$("input[name='"+checkboxName+"']:checked");
        var s="";
        $(arrChk).each(function(){
           s=s+this.value+',';                        
        });
        if(s.length>0){
	    	  s = s.substr(0,s.length-1);	          
		}
		return s;
   	} 
}

var FormUtils = {
	//调用方法     
	serializeForm : function (formId) {    
		var elements = FormUtils.getElements(formId);    
		var queryComponents = new Array();    
		
		for (var i = 0; i < elements.length; i++) {    
			var queryComponent = FormUtils.serializeElement(elements[i]);    
			if (queryComponent)    
				queryComponents.push(queryComponent);    
		}    
		
		return queryComponents.join('&');  
	},
	//获取指定form中的所有的<input>对象    
	getElements:function (formId) {    
		var form = document.getElementById(formId);    
		var elements = new Array();    
		var tagElements = form.getElementsByTagName('input');    
		for (var j = 0; j < tagElements.length; j++){  
			elements.push(tagElements[j]);  
		}  
		return elements;    
	},
	
	//获取单个input中的【name,value】数组  
	inputSelector:function (element) {    
		if (element.checked)    
			return [element.name, element.value];    
	},
	
	input:function (element) {    
		switch (element.type.toLowerCase()) {    
			case 'submit':    
			case 'hidden':    
			case 'password':    
			case 'text':    
				return [element.name, element.value];    
			case 'checkbox':    
			case 'radio':    
				return FormUtils.inputSelector(element);    
		}    
		return false;    
	},
	
	//组合URL  
	serializeElement:function (element) {    
		var method = element.tagName.toLowerCase();    
		var parameter = FormUtils.input(element);    
		
		if (parameter) {    
			var key = encodeURIComponent(parameter[0]);    
			if (key.length == 0) return;    
			
			if (parameter[1].constructor != Array)    
				parameter[1] = [parameter[1]];    
			  
			var values = parameter[1];    
			var results = [];    
			for (var i=0; i<values.length; i++) {    
				results.push(key + '=' + encodeURIComponent(values[i]));    
			}    
			return results.join('&');    
		}    
	}
}


/*
 函数：格式化日期
 参数：formatStr-格式化字符串
 d：将日显示为不带前导零的数字，如1
 dd：将日显示为带前导零的数字，如01
 ddd：将日显示为缩写形式，如Sun
 dddd：将日显示为全名，如Sunday
 M：将月份显示为不带前导零的数字，如一月显示为1
 MM：将月份显示为带前导零的数字，如01
 MMM：将月份显示为缩写形式，如Jan
 MMMM：将月份显示为完整月份名，如January
 yy：以两位数字格式显示年份
 yyyy：以四位数字格式显示年份
 h：使用12小时制将小时显示为不带前导零的数字，注意||的用法
 hh：使用12小时制将小时显示为带前导零的数字
 H：使用24小时制将小时显示为不带前导零的数字
 HH：使用24小时制将小时显示为带前导零的数字
 m：将分钟显示为不带前导零的数字
 mm：将分钟显示为带前导零的数字
 s：将秒显示为不带前导零的数字
 ss：将秒显示为带前导零的数字
 l：将毫秒显示为不带前导零的数字
 ll：将毫秒显示为带前导零的数字
 tt：显示am/pm
 TT：显示AM/PM
 返回：格式化后的日期
 */
Date.prototype.format = function (formatStr) {
    var date = this;
    /*
     函数：填充0字符
     参数：value-需要填充的字符串, length-总长度
     返回：填充后的字符串
     */
    var zeroize = function (value, length) {
        if (!length) {
            length = 2;
        }
        value = new String(value);
        for (var i = 0, zeros = ''; i < (length - value.length); i++) {
            zeros += '0';
        }
        return zeros + value;
    };
    return formatStr.replace(/"[^"]*"|'[^']*'|\b(?:d{1,4}|M{1,4}|yy(?:yy)?|([hHmstT])\1?|[lLZ])\b/g, function($0) {
        switch ($0) {
            case 'd': return date.getDate();
            case 'dd': return zeroize(date.getDate());
            case 'ddd': return ['Sun', 'Mon', 'Tue', 'Wed', 'Thr', 'Fri', 'Sat'][date.getDay()];
            case 'dddd': return ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'][date.getDay()];
            case 'M': return date.getMonth() + 1;
            case 'MM': return zeroize(date.getMonth() + 1);
            case 'MMM': return ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'][date.getMonth()];
            case 'MMMM': return ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'][date.getMonth()];
            case 'yy': return new String(date.getFullYear()).substr(2);
            case 'yyyy': return date.getFullYear();
            case 'h': return date.getHours() % 12 || 12;
            case 'hh': return zeroize(date.getHours() % 12 || 12);
            case 'H': return date.getHours();
            case 'HH': return zeroize(date.getHours());
            case 'm': return date.getMinutes();
            case 'mm': return zeroize(date.getMinutes());
            case 's': return date.getSeconds();
            case 'ss': return zeroize(date.getSeconds());
            case 'l': return date.getMilliseconds();
            case 'll': return zeroize(date.getMilliseconds());
            case 'tt': return date.getHours() < 12 ? 'am' : 'pm';
            case 'TT': return date.getHours() < 12 ? 'AM' : 'PM';
        }
    });
}

