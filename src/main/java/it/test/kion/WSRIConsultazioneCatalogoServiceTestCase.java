/**
 * WSRIConsultazioneCatalogoServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.test.kion;

public class WSRIConsultazioneCatalogoServiceTestCase {

    public void testWSRIConsultazioneCatalogoPortWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new it.test.kion.WSRIConsultazioneCatalogoServiceLocator().getWSRIConsultazioneCatalogoPortAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new it.test.kion.WSRIConsultazioneCatalogoServiceLocator().getServiceName());
    }

    public void test1WSRIConsultazioneCatalogoPortGetMetadataFormats() throws Exception {
        it.test.kion.WSRIConsultazioneCatalogoPortBindingStub binding;
        try {
            binding = (it.test.kion.WSRIConsultazioneCatalogoPortBindingStub)
                          new it.test.kion.WSRIConsultazioneCatalogoServiceLocator().getWSRIConsultazioneCatalogoPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            throw new Exception();
        }


        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            it.test.kion.WsdtoMetadataFormat[] value = null;
            value = binding.getMetadataFormats();
        }
        catch (it.test.kion.ApplicationException e1) {
            throw new Exception();
        }
            // TBD - validate results
    }

    public void test2WSRIConsultazioneCatalogoPortGetAuthorProductsByAB() throws Exception {
        it.test.kion.WSRIConsultazioneCatalogoPortBindingStub binding;
        try {
            binding = (it.test.kion.WSRIConsultazioneCatalogoPortBindingStub)
                          new it.test.kion.WSRIConsultazioneCatalogoServiceLocator().getWSRIConsultazioneCatalogoPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new Exception();

        }


        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            it.test.kion.WsdtoAuthorProducts value = null;
            value = binding.getAuthorProductsByAB(new java.lang.Integer(0), new java.lang.String(), new it.test.kion.WsdtoFilter());
        }
        catch (it.test.kion.AuthorNotFoundException e1) {
            throw new Exception();

        }
        catch (it.test.kion.UnsupportedMetadataFormatException e2) {
            throw new Exception();

        }
        catch (it.test.kion.ApplicationException e3) {
            throw new Exception();

        }
        catch (it.test.kion.UnsupportedOrderingTokenException e4) {

        }
            // TBD - validate results
    }

    public void test3WSRIConsultazioneCatalogoPortGetAuthorProductsByURI() throws Exception {
        it.test.kion.WSRIConsultazioneCatalogoPortBindingStub binding;
        try {
            binding = (it.test.kion.WSRIConsultazioneCatalogoPortBindingStub)
                          new it.test.kion.WSRIConsultazioneCatalogoServiceLocator().getWSRIConsultazioneCatalogoPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new Exception();

        }


        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            it.test.kion.WsdtoAuthorProducts value = null;
            value = binding.getAuthorProductsByURI(new java.lang.String(), new java.lang.String(), new it.test.kion.WsdtoFilter());
        }
        catch (it.test.kion.AuthorNotFoundException e1) {
            throw new Exception();

        }
        catch (it.test.kion.UnsupportedMetadataFormatException e2) {
            throw new Exception();

        }
        catch (it.test.kion.ApplicationException e3) {
            throw new Exception();

        }
        catch (it.test.kion.UnsupportedOrderingTokenException e4) {

        }
            // TBD - validate results
    }

    public void test4WSRIConsultazioneCatalogoPortGetAuthorProductsByCF() throws Exception {
        it.test.kion.WSRIConsultazioneCatalogoPortBindingStub binding;
        try {
            binding = (it.test.kion.WSRIConsultazioneCatalogoPortBindingStub)
                          new it.test.kion.WSRIConsultazioneCatalogoServiceLocator().getWSRIConsultazioneCatalogoPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new Exception();

        }


        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            it.test.kion.WsdtoAuthorProducts value = null;
            value = binding.getAuthorProductsByCF(new java.lang.String(), new java.lang.String(), new it.test.kion.WsdtoFilter());
        }
        catch (it.test.kion.AuthorNotFoundException e1) {
            throw new Exception();

        }
        catch (it.test.kion.UnsupportedMetadataFormatException e2) {
            throw new Exception();

        }
        catch (it.test.kion.ApplicationException e3) {
            throw new Exception();

        }
        catch (it.test.kion.UnsupportedOrderingTokenException e4) {
            throw new Exception();

        }
            // TBD - validate results
    }

    public void test5WSRIConsultazioneCatalogoPortGetProductByID() throws Exception {
        it.test.kion.WSRIConsultazioneCatalogoPortBindingStub binding;
        try {
            binding = (it.test.kion.WSRIConsultazioneCatalogoPortBindingStub)
                          new it.test.kion.WSRIConsultazioneCatalogoServiceLocator().getWSRIConsultazioneCatalogoPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new Exception();

        }

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            it.test.kion.WsdtoProduct value = null;
            value = binding.getProductByID(new java.lang.Integer(0), new java.lang.String());
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
            // TBD - validate results
    }

    public void test6WSRIConsultazioneCatalogoPortGetProductByHandle() throws Exception {
        it.test.kion.WSRIConsultazioneCatalogoPortBindingStub binding;
        try {
            binding = (it.test.kion.WSRIConsultazioneCatalogoPortBindingStub)
                          new it.test.kion.WSRIConsultazioneCatalogoServiceLocator().getWSRIConsultazioneCatalogoPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new Exception();

        }

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            it.test.kion.WsdtoProduct value = null;
            value = binding.getProductByHandle(new java.lang.String(), new java.lang.String());
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
            // TBD - validate results
    }

    public void test7WSRIConsultazioneCatalogoPortGetProductByURI() throws Exception {
        it.test.kion.WSRIConsultazioneCatalogoPortBindingStub binding;
        try {
            binding = (it.test.kion.WSRIConsultazioneCatalogoPortBindingStub)
                          new it.test.kion.WSRIConsultazioneCatalogoServiceLocator().getWSRIConsultazioneCatalogoPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new Exception();

        }


        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            it.test.kion.WsdtoProduct value = null;
            value = binding.getProductByURI(new java.lang.String(), new java.lang.String());
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
            // TBD - validate results
    }

    public void test8WSRIConsultazioneCatalogoPortGetProductsByQuery() throws Exception {
        it.test.kion.WSRIConsultazioneCatalogoPortBindingStub binding;
        try {
            binding = (it.test.kion.WSRIConsultazioneCatalogoPortBindingStub)
                          new it.test.kion.WSRIConsultazioneCatalogoServiceLocator().getWSRIConsultazioneCatalogoPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new Exception();

        }

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            it.test.kion.WsdtoProducts value = null;
            value = binding.getProductsByQuery(new java.lang.String(), new java.lang.String(), new it.test.kion.WsdtoFilter());
        }
        catch (it.test.kion.AuthorNotFoundException e1) {
            throw new Exception();

        }
        catch (it.test.kion.UnsupportedMetadataFormatException e2) {
            throw new Exception();

        }
        catch (it.test.kion.ApplicationException e3) {
            throw new Exception();

        }
        catch (it.test.kion.UnsupportedOrderingTokenException e4) {
            throw new Exception();

        }
            // TBD - validate results
    }

    public void test9WSRIConsultazioneCatalogoPortGetSummaryByAB() throws Exception {
        it.test.kion.WSRIConsultazioneCatalogoPortBindingStub binding;
        try {
            binding = (it.test.kion.WSRIConsultazioneCatalogoPortBindingStub)
                          new it.test.kion.WSRIConsultazioneCatalogoServiceLocator().getWSRIConsultazioneCatalogoPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new Exception();

        }


        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            it.test.kion.WsdtoSummary value = null;
            value = binding.getSummaryByAB(new java.lang.Integer(0));
        }
        catch (it.test.kion.AuthorNotFoundException e1) {
            throw new Exception();

        }
        catch (it.test.kion.ApplicationException e2) {
            throw new Exception();

        }
            // TBD - validate results
    }

    public void test10WSRIConsultazioneCatalogoPortGetSummaryByCF() throws Exception {
        it.test.kion.WSRIConsultazioneCatalogoPortBindingStub binding;
        try {
            binding = (it.test.kion.WSRIConsultazioneCatalogoPortBindingStub)
                          new it.test.kion.WSRIConsultazioneCatalogoServiceLocator().getWSRIConsultazioneCatalogoPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new Exception();

        }


        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            it.test.kion.WsdtoSummary value = null;
            value = binding.getSummaryByCF(new java.lang.String());
        }
        catch (it.test.kion.AuthorNotFoundException e1) {
            throw new Exception();

        }
        catch (it.test.kion.ApplicationException e2) {
            throw new Exception();

        }
            // TBD - validate results
    }

    public void test11WSRIConsultazioneCatalogoPortGetSummaryByURI() throws Exception {
        it.test.kion.WSRIConsultazioneCatalogoPortBindingStub binding;
        try {
            binding = (it.test.kion.WSRIConsultazioneCatalogoPortBindingStub)
                          new it.test.kion.WSRIConsultazioneCatalogoServiceLocator().getWSRIConsultazioneCatalogoPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new Exception();

        }


        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            it.test.kion.WsdtoSummary value = null;
            value = binding.getSummaryByURI(new java.lang.String());
        }
        catch (it.test.kion.AuthorNotFoundException e1) {
            throw new Exception();

        }
        catch (it.test.kion.ApplicationException e2) {
            throw new Exception();

        }
            // TBD - validate results
    }

}
