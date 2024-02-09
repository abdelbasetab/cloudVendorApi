package com.login.service.impl;

import com.login.model.CloudVendor;
import com.login.repository.CloudVendorRepository;
import com.login.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CLoudVendorServiceImpl implements CloudVendorService {

    @Autowired
    private CloudVendorRepository cloudVendorRepository;



    @Override
    public CloudVendor getCloudVendor(Long cloudVendorID) {
        return cloudVendorRepository.findById(cloudVendorID).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "saved";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);

        return "Updated";
    }

    @Override
    public String deleteCloudVendor(Long cloudVendorId) {

        cloudVendorRepository.deleteById(cloudVendorId);

        return "deleted";
    }
}
