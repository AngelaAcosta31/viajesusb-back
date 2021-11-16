package co.edu.usbcali.viajesusb.mapper;

import co.edu.usbcali.viajesusb.domain.Cliente;
import co.edu.usbcali.viajesusb.domain.TipoIdentificacion;
import co.edu.usbcali.viajesusb.dto.ClienteDTO;
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
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteDTO clienteToClienteDTO(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setTipoIdentificacion( clienteTipoIdentificacionNombre( cliente ) );
        clienteDTO.setTipoIdentificacionCodigo( clienteTipoIdentificacionCodigo( cliente ) );
        clienteDTO.setId_tiid( clienteTipoIdentificacionIdTipoIdentificacion( cliente ) );
        clienteDTO.setCorreo( cliente.getCorreo() );
        clienteDTO.setEstado( cliente.getEstado() );
        clienteDTO.setFechaCreacion( cliente.getFechaCreacion() );
        clienteDTO.setFechaModificacion( cliente.getFechaModificacion() );
        clienteDTO.setFechaNacimiento( cliente.getFechaNacimiento() );
        clienteDTO.setIdCliente( cliente.getIdCliente() );
        clienteDTO.setNombre( cliente.getNombre() );
        clienteDTO.setNumeroIdentificacion( cliente.getNumeroIdentificacion() );
        clienteDTO.setPrimerApellido( cliente.getPrimerApellido() );
        clienteDTO.setSegundoApellido( cliente.getSegundoApellido() );
        clienteDTO.setSexo( cliente.getSexo() );
        clienteDTO.setTelefono1( cliente.getTelefono1() );
        clienteDTO.setTelefono2( cliente.getTelefono2() );
        clienteDTO.setUsuCreador( cliente.getUsuCreador() );
        clienteDTO.setUsuModificador( cliente.getUsuModificador() );

        return clienteDTO;
    }

    @Override
    public List<ClienteDTO> listClienteToListClienteDTO(List<Cliente> clientes) {
        if ( clientes == null ) {
            return null;
        }

        List<ClienteDTO> list = new ArrayList<ClienteDTO>( clientes.size() );
        for ( Cliente cliente : clientes ) {
            list.add( clienteToClienteDTO( cliente ) );
        }

        return list;
    }

    @Override
    public List<ClienteDTO> listClienteToListClienteDTO(Page<Cliente> clientes) {
        if ( clientes == null ) {
            return null;
        }

        List<ClienteDTO> list = new ArrayList<ClienteDTO>();
        for ( Cliente cliente : clientes ) {
            list.add( clienteToClienteDTO( cliente ) );
        }

        return list;
    }

    @Override
    public List<ClienteDTO> listaClienteToListClienteDTO(List<ClienteDTO> clientes) {
        if ( clientes == null ) {
            return null;
        }

        List<ClienteDTO> list = new ArrayList<ClienteDTO>( clientes.size() );
        for ( ClienteDTO clienteDTO : clientes ) {
            list.add( clienteDTO );
        }

        return list;
    }

    private String clienteTipoIdentificacionNombre(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }
        TipoIdentificacion tipoIdentificacion = cliente.getTipoIdentificacion();
        if ( tipoIdentificacion == null ) {
            return null;
        }
        String nombre = tipoIdentificacion.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
    }

    private String clienteTipoIdentificacionCodigo(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }
        TipoIdentificacion tipoIdentificacion = cliente.getTipoIdentificacion();
        if ( tipoIdentificacion == null ) {
            return null;
        }
        String codigo = tipoIdentificacion.getCodigo();
        if ( codigo == null ) {
            return null;
        }
        return codigo;
    }

    private Long clienteTipoIdentificacionIdTipoIdentificacion(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }
        TipoIdentificacion tipoIdentificacion = cliente.getTipoIdentificacion();
        if ( tipoIdentificacion == null ) {
            return null;
        }
        Long idTipoIdentificacion = tipoIdentificacion.getIdTipoIdentificacion();
        if ( idTipoIdentificacion == null ) {
            return null;
        }
        return idTipoIdentificacion;
    }
}
