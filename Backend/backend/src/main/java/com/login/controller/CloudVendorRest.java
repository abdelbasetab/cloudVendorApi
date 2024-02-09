package com.login.controller;

import com.login.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/cloudvendor")
public interface CloudVendorRest {

    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable Long cloudVendorId);

    @GetMapping("")
    public List<CloudVendor> getAllCloudVendorDetails();


    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor);

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor);

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(@PathVariable Long CloudVendorId);

}
