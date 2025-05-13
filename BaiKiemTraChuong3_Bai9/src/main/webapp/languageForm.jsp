<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chọn ngôn ngữ</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow rounded-4">
        <div class="card-header bg-primary text-white text-center fs-4">
            Chọn ngôn ngữ hiển thị
        </div>
        <div class="card-body">
            <form method="post" action="${pageContext.request.contextPath}/language">
                <div class="form-check mb-3">
                    <input class="form-check-input " type="radio" name="lang" value="vi" id="langVi">
                    <label class="form-check-label" for="langVi">Tiếng Việt</label>
                </div>
                <div class="form-check mb-4">
                    <input class="form-check-input" type="radio" name="lang" value="en" id="langEn">
                    <label class="form-check-label" for="langEn">English</label>
                </div>
                <div class="text-center">
                    <button type="submit" class="btn btn-success">Gửi</button>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
