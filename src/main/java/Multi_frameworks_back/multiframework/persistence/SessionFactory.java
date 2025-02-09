package Multi_frameworks_back.multiframework.persistence;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.Reader;
@Service
public class SessionFactory {


    private static SessionFactory instance = null;
    private SqlSessionFactory factory =null;

    private SessionFactory() {

        String resources = "MapperConfig.xml";
        Reader lector = null;

        try{

            lector = Resources.getResourceAsReader(resources);
            factory = new SqlSessionFactoryBuilder().build(lector);

        }catch (Exception e){
            System.out.println("Error al cargar el archivo de configuración de MyBatis");
            e.printStackTrace();
        }
    }

    public static SessionFactory getInstance(){
        if(instance == null){
            instance = new SessionFactory();
        }
        return instance;
    }

    public SqlSessionFactory getFactory(){
        return factory;
    }


}
