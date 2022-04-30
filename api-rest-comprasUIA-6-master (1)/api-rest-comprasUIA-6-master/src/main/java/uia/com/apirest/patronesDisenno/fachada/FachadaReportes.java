package uia.com.apirest.patronesDisenno.fachada;

import org.springframework.stereotype.Component;
import uia.com.apirest.compras.GestorCompras;
import uia.com.apirest.compras.InfoComprasUIA;
import uia.com.apirest.modelo.ItemComprasUIAModelo;
import uia.com.apirest.modelo.ItemSolicitudOCModelo;

import java.util.ArrayList;
import java.util.List;

@Component
public abstract class FachadaReportes extends FachadaModel{
    public FachadaReportes(GestorCompras gestorCompras) {
        super(gestorCompras);
    }

    public List<InfoComprasUIA>itemsReportes(int id){
        return this.itemsReportes(id);
    }
    @Override
    public ArrayList<ItemComprasUIAModelo> getItems(int id) {
        return null;
    }

    @Override
    public ArrayList<ItemSolicitudOCModelo> getSolicitudesOC(int id){
        return null;
    }


}
