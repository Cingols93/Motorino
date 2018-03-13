<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

        <script type="text/javascript">
            $(document).ready(function(){
                $contentLoadTriggered = false;
                $("#content-box").scroll(function(){
                    if($("#content-box").scrollTop() >= ($("#content-wrapper").height() - $("#content-box").height()) && $contentLoadTriggered == false)
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