package com.login.service;

import com.login.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {


    public CloudVendor getCloudVendor(Long cloudVendorID);

    public List<CloudVendor> getAllCloudVendors();


    public String createCloudVendor(CloudVendor cloudVendor);

    public String updateCloudVendor(CloudVendor cloudVendor);


    public String deleteCloudVendor(Long cloudVendorId);


}
