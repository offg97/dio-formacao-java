module com.example.contabancaria {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.contabancaria to javafx.fxml;
    exports com.example.contabancaria;
}