package com.suraj.mapper;

import com.suraj.config.DynamicConfig;
import com.suraj.dto.DynamicConfigDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DtoMapper {

  DynamicConfigDto toDynamicConfigDto(DynamicConfig dynamicConfig);
}
