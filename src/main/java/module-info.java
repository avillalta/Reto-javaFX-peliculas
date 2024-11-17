module org.example.retopeliculasjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires static lombok;


    opens org.example.retopeliculasjavafx to javafx.fxml;
    exports org.example.retopeliculasjavafx;
}