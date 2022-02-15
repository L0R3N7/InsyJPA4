package at.htl.mapper;

import at.htl.model.*;
import at.htl.workload.customer.Customer;
import at.htl.workload.parts.*;
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
    List<PartDTO> listPartToDto(List<Part> l);
    GraphicsCardDTO graphicsCardToDTO(GraphicsCard g);
    CaseDTO caseToDTO(Case c);
    CPUDTO cpuToDTO(CPU c);
    MotherboardDTO motherboardToDTO(Motherboard m);
    PSUDTO psuToDTO(PSU p);
    RAMDTO ramToDTO(RAM res);
    StorageDTO storageToDTO(Storage res);
}