package trashapps.com.simple_fit.nego;

import android.widget.TextView;

/**
 * Created by Hernan on 30/6/17.
 */

public class Musculo {

    private int idMusculo;
    private GrupoMuscular grupo;
    private TextView descripcion;

    public Musculo(int idMusculo, GrupoMuscular grupo, TextView descripcion) {
        this.idMusculo = idMusculo;
        this.grupo = grupo;
        this.descripcion = descripcion;
    }

    public int getIdMusculo() {
        return idMusculo;
    }

    public void setIdMusculo(int idMusculo) {
        this.idMusculo = idMusculo;
    }

    public GrupoMuscular getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoMuscular grupo) {
        this.grupo = grupo;
    }

    public TextView getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(TextView descripcion) {
        this.descripcion = descripcion;
    }
}
