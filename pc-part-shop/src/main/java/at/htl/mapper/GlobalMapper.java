package at.htl.mapper;

import at.htl.model.ConfiguredPCDTO;
import at.htl.model.CustomerDTO;
import at.htl.model.PrebuiltPCDTO;
import at.htl.workload.customer.Customer;
import at.htl.workload.pc.ConfiguredPC;
import at.htl.workload.pc.PrebuiltPC;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface GlobalMapper {
    GlobalMapper INSTANCE = Mappers.getMapper(GlobalMapper.class);

    CustomerDTO customerToCustomerDTO(Customer c);
    List<PrebuiltPCDTO> listPrebuiltPCToDTO(List<PrebuiltPC> l);
    ConfiguredPCDTO configuredPCToDTO(ConfiguredPC c);
}
