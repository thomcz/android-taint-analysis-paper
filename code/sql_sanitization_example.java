connection = ...
stmt = connection.createStatement();
BufferedReader br = ...
String name = br.readLine();
name = onlyLetters(name);
String sql = "SELECT * FROM users WHERE name=" + name + ";";
stmt.executeQuery(sql);
