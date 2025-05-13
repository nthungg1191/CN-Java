<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lời chào</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow rounded-4 text-center">
        <div class="card-body">
            <h1 class="text-primary">
                <%
                    String greeting = (String) session.getAttribute("greeting");
                    if (greeting != null) {
                        out.print(greeting);
                    } else {
                        out.print("Ngôn ngữ không xác định");
                    }
                %>
            </h1>
            <a href="languageForm.jsp" class="btn btn-outline-primary mt-4">Chọn lại ngôn ngữ</a>
        </div>
    </div>
</div>

</body>
</html>
