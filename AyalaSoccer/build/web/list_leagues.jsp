<%-- 
    Document   : list_leagues
    Created on : 12/09/2015, 12:09:31 PM
    Author     : Livs
--%>
<html> 
    <title>Duke's Soccer League: List Leagues</title> 
    <body>
        <!-- Page Heading -->
        <table border='1' cellpadding='5' cellspacing='0' width='400'>
            <tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>
                <td><h3>Duke's Soccer League: List Leagues</h3></td> 
            </tr> 
        </table>
        <p>
            The set of soccer leagues are:
        </p>
        
        <h3>League:</h3>
        <b>${applicationScope.currentLeague.name}</b>
        <br/>
        <h3>Year:</h3>
        <b>${applicationScope.currentLeague.year}<b>
        <br/>
        <a href="admin/add_league.html">Registrar a new  League</a>
        
        <!--
        <ul> 
            <li>The Summer of Soccer Love 2004</li> 
            <li>Fall Soccer League (2003)</li>
            <li>Fall Soccer League (2004)</li>
            <li>Soccer League (Spring '03)</li>
            <li>Summer Soccer Fest 2003</li>
            <li>Soccer League (Spring '04)</li> 
        </ul> 
        
        -->
        
    </body>
</html> 