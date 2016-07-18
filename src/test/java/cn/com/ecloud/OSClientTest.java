package cn.com.ecloud;
import org.openstack4j.api.OSClient;
import org.openstack4j.model.compute.Server;
import org.openstack4j.openstack.OSFactory;

import java.util.List;

/**
 * Created by tomhat on 16-7-18.
 */
public class OSClientTest {
    public static void main(String[] args) {
    	
        OSClient.OSClientV2 os = OSFactory.builderV2()
                .endpoint("http://10.1.3.42:5000/v2.0")
                .credentials("zhangjunxyys@163.com", "2222.com")
                .tenantName("20151112ceshi_wu")
                .authenticate();

        System.out.println(os);
        List<? extends Server> list = os.compute().servers().list();
        System.out.printf("server:" + list.toString());

    }
}
