module org.example.retopeliculasjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;


    opens org.example.retopeliculasjavafx to javafx.fxml;
    exports org.example.retopeliculasjavafx;
}