module org.example.retopeliculasjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires static lombok;
    requires java.desktop;


    opens org.example.retopeliculasjavafx to javafx.fxml;
    exports org.example.retopeliculasjavafx;

    opens org.example.retopeliculasjavafx.controllers to javafx.fxml;
    exports org.example.retopeliculasjavafx.controllers;
}