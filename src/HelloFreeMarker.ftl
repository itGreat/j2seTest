<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>MyFreeMarkerTestHtml.html</title>
	
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

  </head>
  
  <body>
    <font color="red">${hello}</font><br/>
    <table>
    	<tr>
    		<td>序号</td>
    		<td>文件名称</td>
    		<td>文件类型</td>
    		<td>修改时间</td>
    		<td>文件大小</td>
    		<td>位置</td>
    	</tr>
    	<#list files as fs>
    	<tr>
    		<td>${fs.id}</td>
    		<td>${fs.fileName}</td>
    		<td>${fs.type}</td>
    		<td>${fs.modifyDate}</td>
    		<td>${fs.size}</td>
    		<td>${fs.absolutePath}</td>
    	</tr>
    	</#list> 
    </table>
  </body>
</html>