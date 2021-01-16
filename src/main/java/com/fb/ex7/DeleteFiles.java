package com.fb.ex7;

import java.io.File;
import java.io.FilenameFilter;

public class DeleteFiles {

    public static void exec(String parent, String ext) {
        File file = new File(parent);
        if (file.isDirectory()) {
            String[] listFiles = file.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return !name.endsWith(ext);
                }
            });
            for (String filename : listFiles) {

                File temp = new File(parent+"/"+filename);
                System.out.println(filename +" deleted ::"+temp.delete());
            } //end for
        }//end if


    }

    public static void main(String[] args) {
        String parent = "/Users/lmendoza/Documents/ORANGE HDD BKP/DATOS/music/others";
        String ext = ".mp3";
        DeleteFiles.exec(parent, ext);
    }
}