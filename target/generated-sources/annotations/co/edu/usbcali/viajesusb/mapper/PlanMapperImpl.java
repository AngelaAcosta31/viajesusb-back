package co.edu.usbcali.viajesusb.mapper;

import co.edu.usbcali.viajesusb.domain.Cliente;
import co.edu.usbcali.viajesusb.domain.Plan;
import co.edu.usbcali.viajesusb.domain.Usuario;
import co.edu.usbcali.viajesusb.dto.PlanDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-16T12:33:49-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.3.1300.v20210419-1022, environment: Java 16.0.1 (Oracle Corporation)"
)
@Component
public class PlanMapperImpl implements PlanMapper {

    @Override
    public PlanDTO planToPlanDTO(Plan plan) {
        if ( plan == null ) {
            return null;
        }

        PlanDTO planDTO = new PlanDTO();

        planDTO.setIdCliente( planClienteIdCliente( plan ) );
        planDTO.setIdUsuario( planUsuarioIdUsuario( plan ) );
        planDTO.setLoginUsuario( planUsuarioLogin( plan ) );
        planDTO.setNombreCliente( planClienteNombre( plan ) );
        planDTO.setNombreUsuario( planUsuarioNombre( plan ) );
        planDTO.setNumeroIdentificacionCliente( planClienteNumeroIdentificacion( plan ) );
        planDTO.setCantidadPersonas( plan.getCantidadPersonas() );
        planDTO.setCodigo( plan.getCodigo() );
        planDTO.setDescripcionSolicitud( plan.getDescripcionSolicitud() );
        planDTO.setEstado( plan.getEstado() );
        planDTO.setFechaCreacion( plan.getFechaCreacion() );
        planDTO.setFechaFinViaje( plan.getFechaFinViaje() );
        planDTO.setFechaInicioViaje( plan.getFechaInicioViaje() );
        planDTO.setFechaModificacion( plan.getFechaModificacion() );
        planDTO.setFechaSolicitud( plan.getFechaSolicitud() );
        planDTO.setIdPlan( plan.getIdPlan() );
        planDTO.setNombre( plan.getNombre() );
        planDTO.setUsuCreador( plan.getUsuCreador() );
        planDTO.setUsuModificador( plan.getUsuModificador() );
        planDTO.setValorTotal( plan.getValorTotal() );

        return planDTO;
    }

    @Override
    public List<PlanDTO> listPlanToListPlanDTO(List<Plan> planes) {
        if ( planes == null ) {
            return null;
        }

        List<PlanDTO> list = new ArrayList<PlanDTO>( planes.size() );
        for ( Plan plan : planes ) {
            list.add( planToPlanDTO( plan ) );
        }

        return list;
    }

    private Long planClienteIdCliente(Plan plan) {
        if ( plan == null ) {
            return null;
        }
        Cliente cliente = plan.getCliente();
        if ( cliente == null ) {
            return null;
        }
        Long idCliente = cliente.getIdCliente();
        if ( idCliente == null ) {
            return null;
        }
        return idCliente;
    }

    private Long planUsuarioIdUsuario(Plan plan) {
        if ( plan == null ) {
            return null;
        }
        Usuario usuario = plan.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        Long idUsuario = usuario.getIdUsuario();
        if ( idUsuario == null ) {
            return null;
        }
        return idUsuario;
    }

    private String planUsuarioLogin(Plan plan) {
        if ( plan == null ) {
            return null;
        }
        Usuario usuario = plan.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        String login = usuario.getLogin();
        if ( login == null ) {
            return null;
        }
        return login;
    }

    private String planClienteNombre(Plan plan) {
        if ( plan == null ) {
            return null;
        }
        Cliente cliente = plan.getCliente();
        if ( cliente == null ) {
            return null;
        }
        String nombre = cliente.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
    }

    private String planUsuarioNombre(Plan plan) {
        if ( plan == null ) {
            return null;
        }
        Usuario usuario = plan.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        String nombre = usuario.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
    }

    private String planClienteNumeroIdentificacion(Plan plan) {
        if ( plan == null ) {
            return null;
        }
        Cliente cliente = plan.getCliente();
        if ( cliente == null ) {
            return null;
        }
        String numeroIdentificacion = cliente.getNumeroIdentificacion();
        if ( numeroIdentificacion == null ) {
            return null;
        }
        return numeroIdentificacion;
    }
}
