<%-- 
    Document   : index.jsp
    Created on : 12/09/2015, 12:06:33 PM
    Author     : Livs
--%>

<%@page import="java.util.Date"%>
<html> 
    <head> 
        <link rel="stylesheet" type="text/css" href="css/main.css" media="screen" />
        <title>Duke's Soccer League: Home</title>
    </head>
    <body bgcolor='white'> 
        <!-- Page Heading --> 
        <table border='1' cellpadding='5' cellspacing='0'
               width='400'>
            <tr bgcolor='#CCCCFF' align='center' valign='center' 
                height='20'> 
                <td><h3>Duke's Soccer League: Home</h3></td>
            </tr>
        </table> 
        <p> 
            This is the Home page for Duke's Soccer League. 
        </p>
        <h3>Players</h3>
        <ul> 
            <li><a href='list_leagues.jsp'>List all leagues</a></li>
            <li>Register for a league (TBA)</li>
        </ul> 
        <h3>League Administrator</h3> 
        <ul>
            <li><a href='admin/add_league.html' >Add a new league (TBA)</a></li>
            <h3>Date=<%= new Date() %>
        </ul> 
    </body> 
</html>

