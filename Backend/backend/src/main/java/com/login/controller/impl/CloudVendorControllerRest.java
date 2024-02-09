package com.login.controller.impl;

import com.login.controller.CloudVendorRest;
import com.login.model.CloudVendor;
import com.login.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CloudVendorControllerRest implements CloudVendorRest {


    private CloudVendorService cloudVendorService;

    @Autowired
    public CloudVendorControllerRest(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @Override
    public CloudVendor getCloudVendorDetails(Long cloudVendorId) {
        return cloudVendorService.getCloudVendor(cloudVendorId);
    }

    @Override
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        return cloudVendorService.createCloudVendor(cloudVendor);
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        return cloudVendorService.updateCloudVendor(cloudVendor);
    }

    @Override
    public String deleteCloudVendor(Long CloudVendorId) {
        return cloudVendorService.deleteCloudVendor(CloudVendorId);
    }
}
