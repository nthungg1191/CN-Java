<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String ketQua = "";
    String sa = request.getParameter("a");
    String sb = request.getParameter("b");
    String sc = request.getParameter("c");

    if (sa != null && sb != null && sc != null) {
        try {
            double a = Double.parseDouble(sa);
            double b = Double.parseDouble(sb);
            double c = Double.parseDouble(sc);

            if (a == 0) {
                if (b == 0) {
                    ketQua = (c == 0) ? "Phương trình vô số nghiệm" : "Phương trình vô nghiệm";
                } else {
                    double x = -c / b;
                    ketQua = "Phương trình bậc nhất, nghiệm x = " + x;
                }
            } else {
                double delta = b * b - 4 * a * c;
                if (delta < 0) {
                    ketQua = "Phương trình vô nghiệm";
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    ketQua = "Phương trình có nghiệm kép x = " + x;
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    ketQua = "Phương trình có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2;
                }
            }
        } catch (Exception e) {
            ketQua = "Lỗi nhập liệu: " + e.getMessage();
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
    <h2>Giải phương trình bậc 2: ax² + bx + c = 0</h2>
    <form method="get">
        a: <input type="text" name="a" value="<%= (sa != null) ? sa : "" %>"><br>
        b: <input type="text" name="b" value="<%= (sb != null) ? sb : "" %>"><br>
        c: <input type="text" name="c" value="<%= (sc != null) ? sc : "" %>"><br>
        <input type="submit" value="Giải">
    </form>
    <h3><%= ketQua %></h3>
</body>
</html>