/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consultazionecatalogoaxis;

import it.cineca.util.mods3_3.schema.ModsCollection;
import it.cineca.util.mods3_3.schema.ModsType;
import it.test.kion.WSRIConsultazioneCatalogoPortBindingStub;
import org.apache.axis.AxisEngine;
import org.apache.axis.EngineConfiguration;
import it.test.kion.WSRIConsultazioneCatalogoServiceLocator;
import it.test.kion.WsdtoProduct;
import org.apache.axis.encoding.TypeMapping;
import org.apache.axis.encoding.TypeMappingRegistry;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.apache.axis.encoding.ser.SimpleDeserializerFactory;
import org.apache.axis.encoding.ser.SimpleSerializerFactory;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;
import java.net.MalformedURLException;
import java.net.URL;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Created by Paolo on 21/02/2015.
 */
public class ConsultazioneCatalogoAxis {

    public static void main(String[] argv) throws Exception,ServiceException, MalformedURLException {
        ServiceFactory serviceFactory = ServiceFactory.newInstance();
        WSRIConsultazioneCatalogoServiceLocator locator = new WSRIConsultazioneCatalogoServiceLocator();
        locator.setWSRIConsultazioneCatalogoPortEndpointAddress("http://pmeriggi.sede.cilea.it:8080/ir/webservices/");
        URL url = new URL(locator.getWSRIConsultazioneCatalogoPortAddress() + "ConsultazioneCatalogo.wsdl");
        Service service = serviceFactory.createService(url, locator.getServiceName());

        WSRIConsultazioneCatalogoPortBindingStub binding;
        try {
            binding = (it.test.kion.WSRIConsultazioneCatalogoPortBindingStub)
                    locator.getWSRIConsultazioneCatalogoPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            throw new Exception();
        }


        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            it.test.kion.WsdtoMetadataFormat[] value = binding.getMetadataFormats();
            System.out.println(value[0].getName());
        }
        catch (it.test.kion.ApplicationException e1) {
            throw new Exception();
        }

        // Time out after a minute
        binding.setTimeout(60000);
        
        /*
        final AxisEngine engine = locator.getEngine();
        final EngineConfiguration clientEngineConfig = engine.getConfig();

        final QName qnAnyType =
                new QName("http://www.w3.org/2001/XMLSchema", "anyType");
        final SimpleSerializerFactory serFact =
                new SimpleSerializerFactory(String.class, qnAnyType);
        final SimpleDeserializerFactory deserFact =
                new SimpleDeserializerFactory(String.class, qnAnyType);

        final TypeMappingRegistry tmReg =
                clientEngineConfig.getTypeMappingRegistry();
        final TypeMapping typeMapping = tmReg.getOrMakeTypeMapping("m");
        typeMapping.register(String.class, qnAnyType,
                serFact, deserFact);
        tmReg.register("", typeMapping);
        */
        // Test operation
        try {
            /*
            Modificato stub :
            da private Object productMetadata; a private org.w3c.dom.Element productMetadata;
            */
            WsdtoProduct value = null;
            value = binding.getProductByHandle("1234/164953", "mods");
            Element doc = (Element) value.getProductMetadata();
            NodeList list = doc.getChildNodes();
            System.out.println(list.getLength());
            System.out.println(list.item(0).getChildNodes().item(0).getFirstChild().getTextContent());
        }
        catch (it.test.kion.UnsupportedMetadataFormatException e1) {
            throw new Exception();
        }
        catch (it.test.kion.ApplicationException e2) {
            throw new Exception();
        }
        catch (it.test.kion.ProductNotFoundException e3) {
            throw new Exception();
        }
    }
}
