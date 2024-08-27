package com.cbfacademy;
import java.util.*;

//  user defined exceptions = custom exceptions 

public class FileExtension {
    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("Filename is null or empty");
        }
        return filename.endsWith(".java");
    } 

    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> resultMap = new HashMap<String, Integer>();

        for (String filename : filenames) {
            try {
                boolean result = check(filename);
                if (result) {
                    resultMap.put(filename,1);  
                } else {
                    resultMap.put(filename, 0);
                }
            } catch (FilenameException ex) { /*Therefore code will not be interrupted because Exception has been caught */
                resultMap.put(filename, -1);
            }
        } 
        return resultMap;
    }
}