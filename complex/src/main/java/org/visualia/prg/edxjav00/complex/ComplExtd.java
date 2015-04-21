package org.visualia.prg.edxjav00.complex;

/**
 * Created by Frias Moren on 21/04/2015.
 */
public class ComplExtd extends Complex {
    private boolean esReal;
    /**
     * Clase extendida
     * @param par1 Primer Parametro
     * @param par2 Segundo Parametro
     * @param concert Sistema de Coordenadas
     */
    public ComplExtd(double par1, double par2, boolean concert) {
        super(par1, par2, concert);
        esReal = par1 ==0;
    }
    public ComplExtd(double par1){
        super(par1, 0, true);
        esReal = true;
    }
    @Override
    public void cxPlus(Complex csum) {
        super.cxPlus(csum);
        esReal = getImg() == - csum.getImg();
    }
    @Override
    public String strBinomic (){
        if(esReal) {
            return getReal() + " ¡real!";
        } else{
            return super.strBinomic();
        }
    }
    public String strCartesian (){
        if(esReal) {
            return getReal() + " ¡real!";
        } else{
            return super.strCartesian();
        }
    }
    public boolean esReal(){
        return esReal;
    }
}
