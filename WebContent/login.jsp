<%@ page contentType = "text/html; charset = UTF-8" %>
<%@ taglib prefix = "s" uri = "/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
	<title>Login</title>
</head>
<body>

        <center>
            <div class="container">
                <s:form class="form-signin" action="login" method="post" namespace="/default">

                    <table>
                        <tr> 
                            <td><s:textfield label="Email" name="email" /></td>
                        </tr>
                        <tr>
                            <td><s:password label="Password" name="password" /></td>
                        </tr>
                    </table>

                    <s:submit value="Accedi" />

                </s:form>
            </div>
        </center>
</body>
</html>