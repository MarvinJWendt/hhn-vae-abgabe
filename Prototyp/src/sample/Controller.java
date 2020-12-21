package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.orm.PersistentException;
import vae.Admin;
import vae.AdminDAO;

public class Controller {

    @FXML
    public TextField name;

    @FXML
    public TextField role;

    @FXML
    public TextField email;

    @FXML
    public Label status;

    public void onClick(ActionEvent actionEvent) {
        Admin admin = AdminDAO.createAdmin();

        admin.setName(name.getText());
        admin.setRole(role.getText().toLowerCase());
        admin.seteMail(email.getText());

        name.setText("");
        role.setText("");
        email.setText("");

        saveAdmin(admin);
    }

    public void saveAdmin(Admin admin) {
        try {
            AdminDAO.save(admin);
            status.setText("Erfolgreich gespeichert");
        } catch (PersistentException e) {
            status.setText("Fehler: " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
