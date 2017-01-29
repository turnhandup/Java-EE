<%--
  Created by IntelliJ IDEA.
  User: PANNA
  Date: 29.01.2017
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="java.lang.*" %>

<html>
<body>
<h1 align="center">Coffee Recommandation JSP View</h1>
<p>

        <%
  List styles = (List) request.getAttribute("styles");
  Iterator it = styles.iterator();
  while(it.hasNext()) {
   // out.print("<br>try: " + it.next());
  }
%>

</body>
</html>
