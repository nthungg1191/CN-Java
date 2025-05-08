<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
  <meta charset="UTF-8">
  <title>Bảng Sinh Viên</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class"">
  <div class="container">
    <h2 class="mb-4 text-center text-uppercase text-primary">Danh sách sinh viên</h2>

    <table class="table table-bordered border border-success text-white bg-dark">
      <thead class="table-primary text-dark">
        <tr>
          <th scope="col">STT</th>
          <th scope="col">Mã SV</th>
          <th scope="col">Họ và tên</th>
          <th scope="col">Quê quán</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <th scope="row">1</th>
          <td>SV001</td>
          <td>Nguyễn Văn Anh</td>
          <td>Hà Nội</td>
        </tr>
        <tr>
          <th scope="row">2</th>
          <td>SV002</td>
          <td>Trần Thị Bành</td>
          <td>Đà Nẵng</td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>SV003</td>
          <td>Lê Văn Cương</td>
          <td>TP. HCM</td>
        </tr>
      </tbody>
    </table>
  </div>
</body>
</html>
