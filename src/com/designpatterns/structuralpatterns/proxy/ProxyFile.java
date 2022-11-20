package com.designpatterns.structuralpatterns.proxy;

public class ProxyFile implements Service {
    private FileDownloadService fileDownloadService;
    private final String filename;

    public ProxyFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void downloadFile() {
        System.out.println("Checking if the client has access to the resource...");
        System.out.println("Access granted!");
        if(fileDownloadService == null) {
            fileDownloadService = new FileDownloadService(filename);
        }
        fileDownloadService.downloadFile();
    }
}