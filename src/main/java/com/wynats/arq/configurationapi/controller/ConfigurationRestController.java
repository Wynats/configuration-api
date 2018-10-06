package com.wynats.arq.configurationapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wynats.arq.configurationapi.model.ComponentConfiguration;


@RestController
public class ConfigurationRestController {

	@RequestMapping("/configuration/{componentName}")
    public ResponseEntity<ComponentConfiguration> getConfiguration(@PathVariable("componentName") String componentName) {
        ComponentConfiguration componentConfiguration = new ComponentConfiguration();
        componentConfiguration.setColor("red");
        componentConfiguration.setId("atuj");
        componentConfiguration.setWidth(300);
		return new ResponseEntity<>(componentConfiguration,HttpStatus.OK);
    }
}
