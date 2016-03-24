connection = ...@\label{sql:connection}@
stmt = connection.createStatement();@\label{sql:createStmt}@
BufferedReader br = ...@\label{sql:createBr}@
String name = br.readLine();@\label{sql:name}@
String sql = "SELECT * FROM users WHERE name=" + name + ";";@\label{sql:sql}@
stmt.executeQuery(sql);@\label{sql:sink}@
