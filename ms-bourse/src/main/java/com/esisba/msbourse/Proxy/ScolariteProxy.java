package com.esisba.msbourse.Proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "ms-scolarite",url="http://localhost:8082")
public interface ScolariteProxy {
}
