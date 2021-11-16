package co.edu.usbcali.viajesusb.mapper;

import co.edu.usbcali.viajesusb.domain.Destino;
import co.edu.usbcali.viajesusb.domain.DetallePlan;
import co.edu.usbcali.viajesusb.domain.Plan;
import co.edu.usbcali.viajesusb.dto.DetallePlanDTO;
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
public class DetallePlanMapperImpl implements DetallePlanMapper {

    @Override
    public DetallePlanDTO detallePlanToDetallePlanDTO(DetallePlan detallePlan) {
        if ( detallePlan == null ) {
            return null;
        }

        DetallePlanDTO detallePlanDTO = new DetallePlanDTO();

        detallePlanDTO.setIdPlan( detallePlanPlanIdPlan( detallePlan ) );
        detallePlanDTO.setCodigoPlan( detallePlanPlanCodigo( detallePlan ) );
        detallePlanDTO.setNombrePlan( detallePlanPlanNombre( detallePlan ) );
        detallePlanDTO.setIdDest( detallePlanDestinoIdDest( detallePlan ) );
        detallePlanDTO.setCodigoDestino( detallePlanDestinoCodigo( detallePlan ) );
        detallePlanDTO.setNombreDestino( detallePlanDestinoNombre( detallePlan ) );
        detallePlanDTO.setAlimentacion( detallePlan.getAlimentacion() );
        detallePlanDTO.setCantidadDias( detallePlan.getCantidadDias() );
        detallePlanDTO.setCantidadNoches( detallePlan.getCantidadNoches() );
        detallePlanDTO.setEstado( detallePlan.getEstado() );
        detallePlanDTO.setFechaCreacion( detallePlan.getFechaCreacion() );
        detallePlanDTO.setFechaModificacion( detallePlan.getFechaModificacion() );
        detallePlanDTO.setHospedaje( detallePlan.getHospedaje() );
        detallePlanDTO.setIdDetallePlan( detallePlan.getIdDetallePlan() );
        detallePlanDTO.setTransporte( detallePlan.getTransporte() );
        detallePlanDTO.setTraslados( detallePlan.getTraslados() );
        detallePlanDTO.setUsuCreador( detallePlan.getUsuCreador() );
        detallePlanDTO.setUsuModificador( detallePlan.getUsuModificador() );
        detallePlanDTO.setValor( detallePlan.getValor() );

        return detallePlanDTO;
    }

    @Override
    public List<DetallePlanDTO> listDetallePlanToListDetallePlanDTO(List<DetallePlan> detallePlanes) {
        if ( detallePlanes == null ) {
            return null;
        }

        List<DetallePlanDTO> list = new ArrayList<DetallePlanDTO>( detallePlanes.size() );
        for ( DetallePlan detallePlan : detallePlanes ) {
            list.add( detallePlanToDetallePlanDTO( detallePlan ) );
        }

        return list;
    }

    private Long detallePlanPlanIdPlan(DetallePlan detallePlan) {
        if ( detallePlan == null ) {
            return null;
        }
        Plan plan = detallePlan.getPlan();
        if ( plan == null ) {
            return null;
        }
        Long idPlan = plan.getIdPlan();
        if ( idPlan == null ) {
            return null;
        }
        return idPlan;
    }

    private String detallePlanPlanCodigo(DetallePlan detallePlan) {
        if ( detallePlan == null ) {
            return null;
        }
        Plan plan = detallePlan.getPlan();
        if ( plan == null ) {
            return null;
        }
        String codigo = plan.getCodigo();
        if ( codigo == null ) {
            return null;
        }
        return codigo;
    }

    private String detallePlanPlanNombre(DetallePlan detallePlan) {
        if ( detallePlan == null ) {
            return null;
        }
        Plan plan = detallePlan.getPlan();
        if ( plan == null ) {
            return null;
        }
        String nombre = plan.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
    }

    private Long detallePlanDestinoIdDest(DetallePlan detallePlan) {
        if ( detallePlan == null ) {
            return null;
        }
        Destino destino = detallePlan.getDestino();
        if ( destino == null ) {
            return null;
        }
        long idDest = destino.getIdDest();
        return idDest;
    }

    private String detallePlanDestinoCodigo(DetallePlan detallePlan) {
        if ( detallePlan == null ) {
            return null;
        }
        Destino destino = detallePlan.getDestino();
        if ( destino == null ) {
            return null;
        }
        String codigo = destino.getCodigo();
        if ( codigo == null ) {
            return null;
        }
        return codigo;
    }

    private String detallePlanDestinoNombre(DetallePlan detallePlan) {
        if ( detallePlan == null ) {
            return null;
        }
        Destino destino = detallePlan.getDestino();
        if ( destino == null ) {
            return null;
        }
        String nombre = destino.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
    }
}
