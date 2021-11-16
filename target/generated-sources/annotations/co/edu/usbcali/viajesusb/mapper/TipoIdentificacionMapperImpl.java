package co.edu.usbcali.viajesusb.mapper;

import co.edu.usbcali.viajesusb.domain.TipoIdentificacion;
import co.edu.usbcali.viajesusb.dto.TipoIdentificacionDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-16T12:34:27-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class TipoIdentificacionMapperImpl implements TipoIdentificacionMapper {

    @Override
    public TipoIdentificacionDTO tipoIdentificacionToTipoIdentificacionDTO(TipoIdentificacion tipoIdentificacion) {
        if ( tipoIdentificacion == null ) {
            return null;
        }

        TipoIdentificacionDTO tipoIdentificacionDTO = new TipoIdentificacionDTO();

        return tipoIdentificacionDTO;
    }

    @Override
    public List<TipoIdentificacionDTO> listTipoIdentificacionToListTipoIdentificacionDTO(List<TipoIdentificacion> tipoIdentificaciones) {
        if ( tipoIdentificaciones == null ) {
            return null;
        }

        List<TipoIdentificacionDTO> list = new ArrayList<TipoIdentificacionDTO>( tipoIdentificaciones.size() );
        for ( TipoIdentificacion tipoIdentificacion : tipoIdentificaciones ) {
            list.add( tipoIdentificacionToTipoIdentificacionDTO( tipoIdentificacion ) );
        }

        return list;
    }
}
