package Solution.Solution;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Application {
    public static void main(String[] args) {
        Properties connectionDatasource = new Properties();

        try(InputStream inputStream = Application.class.getResourceAsStream("/datasource.properties")) {
            connectionDatasource.load((inputStream));

        } catch (IOException e) {
            panic (e);
        }

        String url = connectionDatasource.getProperty("url");//getProperty - возвращает (key) и присваиваем строке
        try (Connection connection = DriverManager.getConnection(url, connectionDatasource)) { //возвращаем подключение
//делаем через драйвменеджер вернутть коннектион (аргументы это наш путь от куда мы берем базу данных, )
      try ( PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM ranks;")){
          ResultSet resultSet = preparedStatement.executeQuery();
//          Объекты Statement сами по себе не "помнят" SQL-выражение;
// последнее должно быть указано в качестве аргумента методов Statement.executeXXX.
// Объекты PreparedStatement не принимают SQL-выражения в виде аргументов этих методов, так как они уже содержат прекомпилированные SQL-выражения.
// Объекты типа CallableStatement наследуют эти методы без параметров от PreparedStatement. Использование аргументов в методах executeXXX объектов PreparedStatement и CallableStatement приведет к генерации ошибки SQLException.
          //Метод executeQuery необходим для запросов, результатом которых является один единственный набор значений,
          // таких как запросов SELECT.
//Интерфейс Statement предоставляет три различных метода выполнения SQL-выражений: executeQuery,
// executeUpdate и execute, в зависимости от SQL-запроса.

          //Интерфейс Statement предоставляет базовые методы для выполнения запросов и извлечения результатов.
          //Интерфейс PreparedStatement добавляет методы управления входными (IN) параметрами;
          //CallableStatement добавляет методы для манипуляции выходними (OUT) параметрами.

          while (resultSet.next()){
              long id = resultSet.getLong("id");
              String name = resultSet.getString("name");
              long lowerTh = resultSet.getLong("lov_t");
              long upper_t = resultSet.getLong("upper_t");
              System.out.printf("id: %d, name: %s, lower: %d, upper: %d ", id, name, lowerTh, upper_t);
          }

      }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    private static void panic (Throwable e){
        e.printStackTrace();
        System.exit(1);
    }
}
