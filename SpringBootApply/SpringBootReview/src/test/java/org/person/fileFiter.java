package org.person;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class fileFiter implements FileFilter, FilenameFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".properties");
    }

    @Override
    public boolean accept(File dir, String name) {
        System.out.println(name);
        return name.endsWith(".properties");
    }
}
