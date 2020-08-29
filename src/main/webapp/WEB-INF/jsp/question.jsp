<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
<head>
</head>
<body style="background-color: lightpink;">
<form method="Get" action="/question"> 
<h1  style="margin-left:400px;">Queries</h1>  
<table border="8" width="50%" cellpadding="20" style="margin-left:auto;margin-right:auto;margin-top:0px;margin-bottom:100px;">
	<tr>
    <th id="id">ID</th>
    <th id="question">Question</th>
    
  </tr>  
   <c:forEach var="question" items="${question}">   
   <tr>  
   <td>${question.id}</td>  
   <td>${question.question}</td>  
   </tr>   
  
    <br/>
   </c:forEach>  
   </table> 
  
	</form>
	
   </body>  
</html>