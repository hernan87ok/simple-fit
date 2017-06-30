package trashapps.com.simple_fit.nego;

import android.widget.TextView;

import java.util.List;

/**
 * Created by Hernan on 30/6/17.
 */

public class Ejercicio {

    private int id_ejercicio;
    // Bicep, Cuadriceps, Dorsales, etc...
    private Musculo musculo;
    //El grupo base seria Tronco, Piernas, Brazos, Espalda, etc...
    private GrupoMuscular grupoBase;
    private TextView tituloEjer;
    private TextView descripcion;
    private List<TextView> ubicFotos;
    private boolean favorito;



    public Ejercicio(int id_ejercicio, Musculo musculo, TextView tituloEjer, TextView descripcion, List<TextView> ubicFotos) {
        this.id_ejercicio = id_ejercicio;
        this.musculo = musculo;
        this.tituloEjer = tituloEjer;
        this.descripcion = descripcion;
        this.ubicFotos = ubicFotos;
    }

    public GrupoMuscular getGrupoBase() {
        return grupoBase;
    }

    public void setGrupoBase(GrupoMuscular grupoBase) {
        this.grupoBase = grupoBase;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public int getId_ejercicio() {
        return id_ejercicio;
    }

    public void setId_ejercicio(int id_ejercicio) {
        this.id_ejercicio = id_ejercicio;
    }

    public Musculo getMusculo() {
        return musculo;
    }

    public void setMusculo(Musculo musculo) {
        this.musculo = musculo;
    }

    public TextView getTituloEjer() {
        return tituloEjer;
    }

    public void setTituloEjer(TextView tituloEjer) {
        this.tituloEjer = tituloEjer;
    }

    public TextView getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(TextView descripcion) {
        this.descripcion = descripcion;
    }

    public List<TextView> getUbicFotos() {
        return ubicFotos;
    }

    public void setUbicFotos(List<TextView> ubicFotos) {
        this.ubicFotos = ubicFotos;
    }
}
