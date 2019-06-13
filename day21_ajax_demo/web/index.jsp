<%--
  Created by IntelliJ IDEA.
  User: Lengyu
  Date: 2019/5/14
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>使用js完成省市二级联动案例</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <style>

    </style>
</head>
<body>
省：<select name="province" id="province">
    <option value="">-请选择-</option>
</select>
市：<select name="city" id="city">
    <option value="">-请选择-</option>
</select>
<script>
    $(function () {
        //文档就绪后，异步加载省份数据
        $.get("ProvinceServlet", {}, function (data) {
            //alert(data);
            $.each(data, function () {
                $("#province").append($("<option value='"+this.code+"'>"+this.name+"</option>"));
            });
        }, 'json');

        $("#province").change(function () {
            //1、清空city数据
            $("#city option:gt(0)").remove();
            //2、加载指定省份数据
            var pcode = $(this).val();
            //alert(pcode);
            $.get("CityServlet", {pcode: pcode}, function (data) {
                //alert(data)
                $.each(data, function () {
                    $("#city").append($("<option value='"+this.code+"'>"+this.name+"</option>"));
                });
            })
        });
    });
</script>
</body>
</html>
