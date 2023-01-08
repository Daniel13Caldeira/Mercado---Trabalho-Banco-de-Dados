package model;

import java.util.ArrayList;

public class Receita {
    
    private ArrayList<Remedio> remedios;
    private int id;
    
    public Receita(int id, ArrayList<Remedio> remedios) {
        this.remedios = remedios;
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public ArrayList<Remedio> getRemedios() {
        return remedios;
    }

    public void setQuantidadeRemedio(Remedio remedio) {
        for (int i = 0; i < remedios.size(); i++) {
            remedios.get(i).setQuantidade(remedio.getQuantidade());
        }
    }
}
