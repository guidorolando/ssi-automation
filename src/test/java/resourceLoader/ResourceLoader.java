package resourceLoader;

import java.io.File;

public class ResourceLoader {

    public static File loadfile(String pathFile){
        ClassLoader classLoader = ResourceLoader.class.getClassLoader();
        return  new File(classLoader.getResource(pathFile).getFile());
    }

}
