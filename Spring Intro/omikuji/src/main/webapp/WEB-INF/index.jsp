<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>OMIKUJI</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

    <!-- jQuery (add this before Bootstrap.js) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>

    <!-- Your local CSS -->
    <link rel="stylesheet" href="/css/main.css" />

    <!-- Bootstrap JS -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <h4>Send an OMIKUJI</h4>
    <div>
        <form action="processOm" method="POST">
            Pick any number from 5 To 25: <br />
            <input type="number" name="number" /> <br />
            <br />
            <!-- Add other input fields here -->

            Send And Show a Friend <br />
            <button type="submit">Send</button>
        </form>
    </div>
</body>
</html>