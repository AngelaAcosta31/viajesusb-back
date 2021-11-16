package co.edu.usbcali.viajesusb.mapper;

import co.edu.usbcali.viajesusb.domain.Destino;
import co.edu.usbcali.viajesusb.domain.TipoDestino;
import co.edu.usbcali.viajesusb.dto.DestinoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-16T12:33:49-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.3.1300.v20210419-1022, environment: Java 16.0.1 (Oracle Corporation)"
)
@Component
public class DestinoMapperImpl implements DestinoMapper {

    @Override
    public DestinoDTO destinoToDestinoDTO(Destino destino) {
        if ( destino == null ) {
            return null;
        }

        DestinoDTO destinoDTO = new DestinoDTO();

        destinoDTO.setIdTide( destinoTipoDestinoIdTide( destino ) );
        destinoDTO.setCodigoTipoDestino( destinoTipoDestinoCodigo( destino ) );
        destinoDTO.setNombreTipoDestino( destinoTipoDestinoNombre( destino ) );
        destinoDTO.setAire( destino.getAire() );
        destinoDTO.setCodigo( destino.getCodigo() );
        destinoDTO.setDescripcion( destino.getDescripcion() );
        destinoDTO.setEstado( destino.getEstado() );
        destinoDTO.setFechaCreacion( destino.getFechaCreacion() );
        destinoDTO.setFechaModificacion( destino.getFechaModificacion() );
        destinoDTO.setIdDest( destino.getIdDest() );
        destinoDTO.setMar( destino.getMar() );
        destinoDTO.setNombre( destino.getNombre() );
        destinoDTO.setTierra( destino.getTierra() );
        destinoDTO.setUsuCreador( destino.getUsuCreador() );
        destinoDTO.setUsuModificador( destino.getUsuModificador() );

        return destinoDTO;
    }

    @Override
    public List<DestinoDTO> listDestinoToListDestinoDTO(List<Destino> listaDestino) {
        if ( listaDestino == null ) {
            return null;
        }

        List<DestinoDTO> list = new ArrayList<DestinoDTO>( listaDestino.size() );
        for ( Destino destino : listaDestino ) {
            list.add( destinoToDestinoDTO( destino ) );
        }

        return list;
    }

    @Override
    public List<DestinoDTO> listaDestinoToListDestinoDTO(Page<Destino> destinos) {
        if ( destinos == null ) {
            return null;
        }

        List<DestinoDTO> list = new ArrayList<DestinoDTO>();
        for ( Destino destino : destinos ) {
            list.add( destinoToDestinoDTO( destino ) );
        }

        return list;
    }

    private Long destinoTipoDestinoIdTide(Destino destino) {
        if ( destino == null ) {
            return null;
        }
        TipoDestino tipoDestino = destino.getTipoDestino();
        if ( tipoDestino == null ) {
            return null;
        }
        long idTide = tipoDestino.getIdTide();
        return idTide;
    }

    private String destinoTipoDestinoCodigo(Destino destino) {
        if ( destino == null ) {
            return null;
        }
        TipoDestino tipoDestino = destino.getTipoDestino();
        if ( tipoDestino == null ) {
            return null;
        }
        String codigo = tipoDestino.getCodigo();
        if ( codigo == null ) {
            return null;
        }
        return codigo;
    }

    private String destinoTipoDestinoNombre(Destino destino) {
        if ( destino == null ) {
            return null;
        }
        TipoDestino tipoDestino = destino.getTipoDestino();
        if ( tipoDestino == null ) {
            return null;
        }
        String nombre = tipoDestino.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
    }
}
