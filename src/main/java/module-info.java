module org.javaclass.arraylist {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.javaclass.arraylist to javafx.fxml;
    exports org.javaclass.arraylist;
}