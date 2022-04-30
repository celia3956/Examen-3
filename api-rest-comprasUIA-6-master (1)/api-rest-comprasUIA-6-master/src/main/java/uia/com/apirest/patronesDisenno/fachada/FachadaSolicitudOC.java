package uia.com.apirest.patronesDisenno.fachada;

import org.springframework.stereotype.Component;
import uia.com.apirest.compras.GestorCompras;
import uia.com.apirest.modelo.ItemComprasUIAModelo;
import uia.com.apirest.modelo.ItemSolicitudOCModelo;

import java.util.ArrayList;

@Component
public abstract class FachadaSolicitudOC extends FachadaModel {

    public FachadaSolicitudOC(GestorCompras gestorCompras) {
        super(gestorCompras);
    }

    @Override
    public ArrayList<ItemComprasUIAModelo> getItems(int id) {
        return null;
    }

    @Override
    public ArrayList<ItemSolicitudOCModelo> getSolicitudesOC(int id){
        return this.itemsSolicitud(id);
    }
}
