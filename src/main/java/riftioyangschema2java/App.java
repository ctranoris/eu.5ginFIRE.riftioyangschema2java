package riftioyangschema2java;

import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.VnfdBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        VnfdBuilder v = new VnfdBuilder();
        v.setName("testaki");
        Vnfd vnfd1 = v.build();
        v.setName("testaki2");
        Vnfd vnfd2 = v.build();

        System.out.println( "VNFD name = "  + vnfd1.getName() );
        System.out.println( "VNFD name = "  + vnfd2.getName() );
    }
}
