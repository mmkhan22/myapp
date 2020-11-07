<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>

</head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<h2>Techfest Sessions</h2>

<table class="w3-table-all">
    <tr class="w3-green">
        <th>Description</th>
        <th>Speaker</th>
        <th>Start Date</th>
        <th>End Date</th>
    </tr>
    <c:forEach var = "events" items = "${events}">

        <tr>
            <td>${events.getDescription()}</td>
            <td>${events.getSpeaker()}</td>
            <td>${events.getStartDate()}</td>
            <td>${events.getEndDate()}</td>
        </tr>

    </c:forEach>

</table>



</body>
</html>
