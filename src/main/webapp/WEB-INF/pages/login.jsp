<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>接口测试平台-用户登录</title>
	<link href ="favicon.ico" rel="shortcut icon"> 
    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">
    <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script>
	    function checkEmpty(id, name) {
		    var value = $("#" + id).val();
		    if (value.length == 0) {
			alert(name + "不能为空");
			$("#" + id)[0].focus();
			return false;
		    }
		    return true;
		}
    	function login(){
	    	if (!checkEmpty("username", "用户名"))
	    		return false;
	        if (!checkEmpty("password", "密码"))
	    		return false;
	        $.ajax({
		    	type : "post",
		    	dataType : "json",
		    	url : "userLogin",
		    	data : $("#loginForm").serialize(),
		    	success : function(data) {
		    		alert("ceshi"+data.msg);    		
		    	},
		    	error : function() {
		    	    alert("错误！！");
		    	}
	        });
	        return false; 
    	}
    </script>
</head>

<body>
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">请登录</h3>
                    </div>
                    <div class="panel-body">
                        <form id="loginForm" action="">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="用户名" id="username" name="username" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="密码" id="password" name="password" type="password" value="" autocomplete="off">
                                </div>
                                <a href="#" class="btn btn-lg btn-success btn-block" onclick="login();return false;">登录</a>
                            </fieldset>
                        </form>
                    </div>
                    <div class="panel-footer">
                   		 没有账户？
						<a href="admin_user_registerPage"> 请注册</a>				
					</div>
                </div>
            </div>
        </div>
    </div>
    <!-- 显示的时间弹窗的div -->
	<div id="date"></div>
</body>

</html>
