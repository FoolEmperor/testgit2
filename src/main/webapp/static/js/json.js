$(function(){
	$("input[type=button]").click(function(){
		$.ajax({
			url:"json/senddata",
			//传输中文信息的时候不要使用get，get方法是会通过链接来传递参数，而且会自动urlEncode(编码)
			type:"post",
			data:{
				"id":"1001",
				"name":"张君宝",
				"sex":"男"
			},
			dataType:"json",
			success:function(data){
				alert(data);
			},
			error:function(message){
				alert(message);
			}
		});
	});
});