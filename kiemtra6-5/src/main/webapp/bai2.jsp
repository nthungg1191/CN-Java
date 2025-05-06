<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
        String sa = request.getParameter("a");
        String sb = request.getParameter("b");
        String sc = request.getParameter("c");

        if (sa != null && sb != null && sc != null) {
            try {
                int a = Integer.parseInt(sa);
                int b = Integer.parseInt(sb);
                int c = Integer.parseInt(sc);

                if (a > 0 && b > 0 && c > 0 && 
                    a + b > c && a + c > b && b + c > a) {
                    out.println("<p style='color:green'>Ba cạnh a=" + a + ", b=" + b + ", c=" + c + " tạo thành một tam giác.</p>");
                } else {
                    out.println("<p style='color:red'>Ba cạnh không tạo thành tam giác.</p>");
                }
            } catch (NumberFormatException e) {
                out.println("<p style='color:red'>Vui lòng nhập số nguyên hợp lệ.</p>");
            }
        }
    %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>Kiểm tra 3 cạnh có tạo thành tam giác không</h2>
    
    <form method="post">
        Nhập cạnh a: <input type="number" name="a" required><br>
        Nhập cạnh b: <input type="number" name="b" required><br>
        Nhập cạnh c: <input type="number" name="c" required><br>
        <input type="submit" value="Kiểm tra">
    </form>
</body>
</html>