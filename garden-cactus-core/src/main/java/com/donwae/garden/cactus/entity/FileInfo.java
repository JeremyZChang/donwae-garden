package com.donwae.garden.cactus.entity;

/**
 * TODO
 *
 * @auther Jeremy
 * 2018/10/25 上午9:58
 */
public class FileInfo {

    public FileInfo(String path) {
        this.path = path;
    }

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
