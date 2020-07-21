package com.suraj.controller;

import com.suraj.config.DynamicConfig;
import com.suraj.mapper.DtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/config")
public class ConfigController {

  @Autowired private DynamicConfig dynamicConfig;

  @Autowired private DtoMapper dtoMapper;

  @GetMapping
  public ResponseEntity getConfigs() {
    return ResponseEntity.ok(dtoMapper.toDynamicConfigDto(dynamicConfig));
  }
}
