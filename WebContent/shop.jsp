<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="it.consoft.nameless.model.User"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="head.jsp"%>
<title>Profilo</title>

</head>
<body>
<%@ include file="navbar.jsp"%>
	<div="#content-box">
		<div class="container">
			<% out.write(request.getAttribute("listMoto").toString()); %>
		</div>
	</div>

 <script type="text/javascript">
            $(document).ready(function(){
                $contentLoadTriggered = false;
                $("#content-box").scroll(function(){
                    if($("#content-box").scrollTop() >= ($("body").height() - $("#content-box").height()) && $contentLoadTriggered == false)
                    {
                        $contentLoadTriggered = true;
                        $.get("infinitContentServlet", function(data){
                            $("#content-wrapper").append(data);
                            $contentLoadTriggered = false;
                        });
                    }

                });
            });
        </script>


</body>
</html>