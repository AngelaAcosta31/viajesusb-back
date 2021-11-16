package co.edu.usbcali.viajesusb.mapper;

import co.edu.usbcali.viajesusb.domain.TipoDestino;
import co.edu.usbcali.viajesusb.dto.TipoDestinoDTO;
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
public class TipoDestinoMapperImpl implements TipoDestinoMapper {

    @Override
    public TipoDestinoDTO tipoDestinoToTipoDestinoDTO(TipoDestino tipoDestino) {
        if ( tipoDestino == null ) {
            return null;
        }

        TipoDestinoDTO tipoDestinoDTO = new TipoDestinoDTO();

        return tipoDestinoDTO;
    }

    @Override
    public List<TipoDestinoDTO> listTipoDestinoToListTipoDestinoDTO(List<TipoDestino> listaTipoDestino) {
        if ( listaTipoDestino == null ) {
            return null;
        }

        List<TipoDestinoDTO> list = new ArrayList<TipoDestinoDTO>( listaTipoDestino.size() );
        for ( TipoDestino tipoDestino : listaTipoDestino ) {
            list.add( tipoDestinoToTipoDestinoDTO( tipoDestino ) );
        }

        return list;
    }
}
