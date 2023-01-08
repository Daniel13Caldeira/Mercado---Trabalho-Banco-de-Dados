package model;
import java.util.ArrayList;

public class ReceitaMedica {

    private ArrayList<Remedio> remedios;
    private int id;

    public ReceitaMedica(int id, ArrayList<Remedio> remedios) {
        this.remedios = remedios;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Remedio> getRemedios() {
        return remedios;
    }
}
