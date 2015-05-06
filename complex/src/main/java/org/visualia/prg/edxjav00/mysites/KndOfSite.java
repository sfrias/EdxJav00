package org.visualia.prg.edxjav00.mysites;

/**
 * Created by Frias Moren on 06/05/2015.
 */
public enum KndOfSite {
    OTROS("Otros", 5),
    RESTAURANTE("Restaurante", 2),
    BAR("Bar", 6),
    COPAS("Copas", 0),
    ESPECTACULO("Espect�culo", 0),
    HOTEL("Hotel", 0),
    COMPRAS("Compras", 0),
    EDUCACION("Educaci�n", 0),
    DEPORTE("Deporte", 0),
    NATURALEZA("Naturaleza", 0),
    GASOLINERA("Gasolinera", 0);

    private final String texto;
    private final int recurso;

    KndOfSite(String texto, int recurso) {
        this.texto = texto;
        this.recurso = recurso;
    }

    public String getTexto() { return texto; }

    public int getRecurso() { return recurso; }
}