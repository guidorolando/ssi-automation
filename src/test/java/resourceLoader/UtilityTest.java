package resourceLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UtilityTest {

    public Properties loadProperties(String path){
        Properties props = null;
        props  = new Properties();
        InputStream input = getClass().getResourceAsStream(path);
        try{
            props.load(input);
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            if(input!= null){
                try{
                    input.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return props;
    }
}
