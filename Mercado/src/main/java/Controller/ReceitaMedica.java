package Controller;

import java.util.ArrayList;

public class ReceitaMedica {

    private ArrayList<Remedio> remedios;
    private String codMedico;
    private int id;

    public ReceitaMedica(int id, ArrayList<Remedio> remedios, String codMedico) {
        this.remedios = remedios;
        this.codMedico = codMedico;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCodMedico() {
        return codMedico;
    }

    public ArrayList<Remedio> getRemedios() {
        return remedios;
    }
}
