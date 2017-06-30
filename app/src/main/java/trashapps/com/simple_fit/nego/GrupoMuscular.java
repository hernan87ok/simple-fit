package trashapps.com.simple_fit.nego;

import android.widget.TextView;

/**
 * Created by Hernan on 30/6/17.
 */

public class GrupoMuscular {

    private int idGrupoMusc;
    private TextView descripcion;

    public GrupoMuscular(int idGrupoMusc, TextView descripcion) {
        this.idGrupoMusc = idGrupoMusc;
        this.descripcion = descripcion;
    }

    public int getIdGrupoMusc() {
        return idGrupoMusc;
    }

    public void setIdGrupoMusc(int idGrupoMusc) {
        this.idGrupoMusc = idGrupoMusc;
    }

    public TextView getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(TextView descripcion) {
        this.descripcion = descripcion;
    }
}
