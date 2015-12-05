<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'addBook.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="../js/themes/default/default.css" />
	<link rel="stylesheet" href="../js/plugins/code/prettify.css" />
	<script charset="utf-8" src="../js/kindeditor.js"></script>
	<script charset="utf-8" src="../js/lang/zh_CN.js"></script>
	<script charset="utf-8" src="../js/plugins/code/prettify.js"></script>
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		#add{
		width:300px;
		margin: 0 auto;}
	</style>
	
	<script>
			KindEditor.ready(function(K) {
				var editor = K.editor({
					cssPath : '../js/plugins/code/prettify.css',
					uploadJson : '../admin/fileup/upload_json.jsp',
					fileManagerJson : '../admin/fileup/file_manager_json.jsp',
					
				});
				K('#image').click(function() {
					editor.loadPlugin('image', function() {
						editor.plugin.imageDialog({
							showRemote : false,
							imageUrl : K('#url').val(),
							clickFn : function(url, title, width, height, border, align) {
								K('#url').val(url);
								editor.hideDialog();
							}
						});
					});
				});
			});
		</script>
	
  </head>
  
  <body>
  <div id="add">
	  	<h1>添加图书</h1>
	  	<form action="bookadd" method="get">
	  		书名：<input type="text" name="book.name"/><br/><br/>
	  		简介：<input type="text" name="book.description"/><br/><br/>
	  		图片：<input type="text" id="url" value=""  name="book.cover"/> <input type="button" id="image" value="选择图片" />
	  		类别:<select name="book.categoryid">
	  					<option value="1">计算机</option>
	  					<option value="2">文学</option>
	  					<option value="3">人文科学</option>
	  					<option value="4">生物技术</option>
	  				</select><br/><br/>
	  	<input type="submit" value="添加图书"/>
	  	</form>
  	</div>
  </body>
</html>
