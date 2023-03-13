<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Create a teacher</title>
  </head>
  <body>
    <h2>Store Teacher</h2>
    <form action="teachers" method="post">
      <label>Teacher Name</label>
      <input type="text" name="teacherName" /><br />
      <input type="submit" value="Store Teacher" />
      <input type="reset" value="reset" />
    </form>
  </body>
</html>
