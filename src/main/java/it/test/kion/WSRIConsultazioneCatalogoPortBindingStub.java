/**
 * WSRIConsultazioneCatalogoPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.test.kion;

public class WSRIConsultazioneCatalogoPortBindingStub extends org.apache.axis.client.Stub implements it.test.kion.WSRIConsultazioneCatalogo {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMetadataFormats");
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoMetadataFormat"));
        oper.setReturnClass(it.test.kion.WsdtoMetadataFormat[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"),
                      "it.test.kion.ApplicationException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuthorProductsByAB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authorID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "metadataPrefix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoFilter"), it.test.kion.WsdtoFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoAuthorProducts"));
        oper.setReturnClass(it.test.kion.WsdtoAuthorProducts.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException"),
                      "it.test.kion.AuthorNotFoundException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException"),
                      "it.test.kion.UnsupportedMetadataFormatException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"),
                      "it.test.kion.ApplicationException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedOrderingTokenException"),
                      "it.test.kion.UnsupportedOrderingTokenException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedOrderingTokenException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuthorProductsByURI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authorURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "metadataPrefix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoFilter"), it.test.kion.WsdtoFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoAuthorProducts"));
        oper.setReturnClass(it.test.kion.WsdtoAuthorProducts.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException"),
                      "it.test.kion.AuthorNotFoundException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException"),
                      "it.test.kion.UnsupportedMetadataFormatException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"),
                      "it.test.kion.ApplicationException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedOrderingTokenException"),
                      "it.test.kion.UnsupportedOrderingTokenException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedOrderingTokenException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuthorProductsByCF");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CF"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "metadataPrefix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoFilter"), it.test.kion.WsdtoFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoAuthorProducts"));
        oper.setReturnClass(it.test.kion.WsdtoAuthorProducts.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException"),
                      "it.test.kion.AuthorNotFoundException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException"),
                      "it.test.kion.UnsupportedMetadataFormatException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"),
                      "it.test.kion.ApplicationException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedOrderingTokenException"),
                      "it.test.kion.UnsupportedOrderingTokenException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedOrderingTokenException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProductByID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "metadataPrefix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoProduct"));
        oper.setReturnClass(it.test.kion.WsdtoProduct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException"),
                      "it.test.kion.UnsupportedMetadataFormatException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"),
                      "it.test.kion.ApplicationException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ProductNotFoundException"),
                      "it.test.kion.ProductNotFoundException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ProductNotFoundException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProductByURI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "metadataPrefix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoProduct"));
        oper.setReturnClass(it.test.kion.WsdtoProduct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException"),
                      "it.test.kion.UnsupportedMetadataFormatException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"),
                      "it.test.kion.ApplicationException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ProductNotFoundException"),
                      "it.test.kion.ProductNotFoundException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ProductNotFoundException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProductByHandle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "metadataPrefix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoProduct"));
        oper.setReturnClass(it.test.kion.WsdtoProduct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException"),
                      "it.test.kion.UnsupportedMetadataFormatException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"),
                      "it.test.kion.ApplicationException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ProductNotFoundException"),
                      "it.test.kion.ProductNotFoundException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ProductNotFoundException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProductsByQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "metadataPrefix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoFilter"), it.test.kion.WsdtoFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoProducts"));
        oper.setReturnClass(it.test.kion.WsdtoProducts.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException"),
                      "it.test.kion.AuthorNotFoundException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException"),
                      "it.test.kion.UnsupportedMetadataFormatException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"),
                      "it.test.kion.ApplicationException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedOrderingTokenException"),
                      "it.test.kion.UnsupportedOrderingTokenException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedOrderingTokenException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSummaryByAB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authorID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoSummary"));
        oper.setReturnClass(it.test.kion.WsdtoSummary.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException"),
                      "it.test.kion.AuthorNotFoundException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"),
                      "it.test.kion.ApplicationException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSummaryByCF");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CF"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoSummary"));
        oper.setReturnClass(it.test.kion.WsdtoSummary.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException"),
                      "it.test.kion.AuthorNotFoundException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"),
                      "it.test.kion.ApplicationException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSummaryByURI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authorURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoSummary"));
        oper.setReturnClass(it.test.kion.WsdtoSummary.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException"),
                      "it.test.kion.AuthorNotFoundException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"),
                      "it.test.kion.ApplicationException",
                      new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException"), 
                      true
                     ));
        _operations[10] = oper;

    }

    public WSRIConsultazioneCatalogoPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WSRIConsultazioneCatalogoPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WSRIConsultazioneCatalogoPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", ">>ApplicationException>i18NParams>entry");
            cachedSerQNames.add(qName);
            cls = it.test.kion.ApplicationExceptionI18NParamsEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", ">ApplicationException>i18NParams");
            cachedSerQNames.add(qName);
            cls = it.test.kion.ApplicationExceptionI18NParams.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ApplicationException");
            cachedSerQNames.add(qName);
            cls = it.test.kion.ApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "AuthorNotFoundException");
            cachedSerQNames.add(qName);
            cls = it.test.kion.AuthorNotFoundException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "field");
            cachedSerQNames.add(qName);
            cls = it.test.kion.Field.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getAuthorProductsByAB");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetAuthorProductsByAB.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getAuthorProductsByABResponse");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetAuthorProductsByABResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getAuthorProductsByCF");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetAuthorProductsByCF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getAuthorProductsByCFResponse");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetAuthorProductsByCFResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getAuthorProductsByURI");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetAuthorProductsByURI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getAuthorProductsByURIResponse");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetAuthorProductsByURIResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getMetadataFormats");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetMetadataFormats.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getMetadataFormatsResponse");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetMetadataFormatsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getProductByHandle");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetProductByHandle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getProductByHandleResponse");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetProductByHandleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getProductByID");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetProductByID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getProductByIDResponse");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetProductByIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getProductByURI");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetProductByURI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getProductByURIResponse");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetProductByURIResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getProductsByQuery");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetProductsByQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getProductsByQueryResponse");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetProductsByQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getSummaryByAB");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetSummaryByAB.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getSummaryByABResponse");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetSummaryByABResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getSummaryByCF");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetSummaryByCF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getSummaryByCFResponse");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetSummaryByCFResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getSummaryByURI");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetSummaryByURI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getSummaryByURIResponse");
            cachedSerQNames.add(qName);
            cls = it.test.kion.GetSummaryByURIResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "order");
            cachedSerQNames.add(qName);
            cls = it.test.kion.Order.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "ProductNotFoundException");
            cachedSerQNames.add(qName);
            cls = it.test.kion.ProductNotFoundException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedMetadataFormatException");
            cachedSerQNames.add(qName);
            cls = it.test.kion.UnsupportedMetadataFormatException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "UnsupportedOrderingTokenException");
            cachedSerQNames.add(qName);
            cls = it.test.kion.UnsupportedOrderingTokenException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoAuthorProducts");
            cachedSerQNames.add(qName);
            cls = it.test.kion.WsdtoAuthorProducts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoFilter");
            cachedSerQNames.add(qName);
            cls = it.test.kion.WsdtoFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoMetadataFormat");
            cachedSerQNames.add(qName);
            cls = it.test.kion.WsdtoMetadataFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoOrderingToken");
            cachedSerQNames.add(qName);
            cls = it.test.kion.WsdtoOrderingToken.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoProduct");
            cachedSerQNames.add(qName);
            cls = it.test.kion.WsdtoProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoProducts");
            cachedSerQNames.add(qName);
            cls = it.test.kion.WsdtoProducts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoSummary");
            cachedSerQNames.add(qName);
            cls = it.test.kion.WsdtoSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "wsdtoType");
            cachedSerQNames.add(qName);
            cls = it.test.kion.WsdtoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public it.test.kion.WsdtoMetadataFormat[] getMetadataFormats() throws java.rmi.RemoteException, it.test.kion.ApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getMetadataFormats"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.test.kion.WsdtoMetadataFormat[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.test.kion.WsdtoMetadataFormat[]) org.apache.axis.utils.JavaUtils.convert(_resp, it.test.kion.WsdtoMetadataFormat[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.ApplicationException) {
              throw (it.test.kion.ApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.test.kion.WsdtoAuthorProducts getAuthorProductsByAB(java.lang.Integer authorID, java.lang.String metadataPrefix, it.test.kion.WsdtoFilter filter) throws java.rmi.RemoteException, it.test.kion.AuthorNotFoundException, it.test.kion.UnsupportedMetadataFormatException, it.test.kion.ApplicationException, it.test.kion.UnsupportedOrderingTokenException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getAuthorProductsByAB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authorID, metadataPrefix, filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.test.kion.WsdtoAuthorProducts) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.test.kion.WsdtoAuthorProducts) org.apache.axis.utils.JavaUtils.convert(_resp, it.test.kion.WsdtoAuthorProducts.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.AuthorNotFoundException) {
              throw (it.test.kion.AuthorNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.UnsupportedMetadataFormatException) {
              throw (it.test.kion.UnsupportedMetadataFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.ApplicationException) {
              throw (it.test.kion.ApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.UnsupportedOrderingTokenException) {
              throw (it.test.kion.UnsupportedOrderingTokenException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.test.kion.WsdtoAuthorProducts getAuthorProductsByURI(java.lang.String authorURI, java.lang.String metadataPrefix, it.test.kion.WsdtoFilter filter) throws java.rmi.RemoteException, it.test.kion.AuthorNotFoundException, it.test.kion.UnsupportedMetadataFormatException, it.test.kion.ApplicationException, it.test.kion.UnsupportedOrderingTokenException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getAuthorProductsByURI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authorURI, metadataPrefix, filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.test.kion.WsdtoAuthorProducts) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.test.kion.WsdtoAuthorProducts) org.apache.axis.utils.JavaUtils.convert(_resp, it.test.kion.WsdtoAuthorProducts.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.AuthorNotFoundException) {
              throw (it.test.kion.AuthorNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.UnsupportedMetadataFormatException) {
              throw (it.test.kion.UnsupportedMetadataFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.ApplicationException) {
              throw (it.test.kion.ApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.UnsupportedOrderingTokenException) {
              throw (it.test.kion.UnsupportedOrderingTokenException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.test.kion.WsdtoAuthorProducts getAuthorProductsByCF(java.lang.String CF, java.lang.String metadataPrefix, it.test.kion.WsdtoFilter filter) throws java.rmi.RemoteException, it.test.kion.AuthorNotFoundException, it.test.kion.UnsupportedMetadataFormatException, it.test.kion.ApplicationException, it.test.kion.UnsupportedOrderingTokenException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getAuthorProductsByCF"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CF, metadataPrefix, filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.test.kion.WsdtoAuthorProducts) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.test.kion.WsdtoAuthorProducts) org.apache.axis.utils.JavaUtils.convert(_resp, it.test.kion.WsdtoAuthorProducts.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.AuthorNotFoundException) {
              throw (it.test.kion.AuthorNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.UnsupportedMetadataFormatException) {
              throw (it.test.kion.UnsupportedMetadataFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.ApplicationException) {
              throw (it.test.kion.ApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.UnsupportedOrderingTokenException) {
              throw (it.test.kion.UnsupportedOrderingTokenException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.test.kion.WsdtoProduct getProductByID(java.lang.Integer productID, java.lang.String metadataPrefix) throws java.rmi.RemoteException, it.test.kion.UnsupportedMetadataFormatException, it.test.kion.ApplicationException, it.test.kion.ProductNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getProductByID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productID, metadataPrefix});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.test.kion.WsdtoProduct) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.test.kion.WsdtoProduct) org.apache.axis.utils.JavaUtils.convert(_resp, it.test.kion.WsdtoProduct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.UnsupportedMetadataFormatException) {
              throw (it.test.kion.UnsupportedMetadataFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.ApplicationException) {
              throw (it.test.kion.ApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.ProductNotFoundException) {
              throw (it.test.kion.ProductNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.test.kion.WsdtoProduct getProductByURI(java.lang.String productURI, java.lang.String metadataPrefix) throws java.rmi.RemoteException, it.test.kion.UnsupportedMetadataFormatException, it.test.kion.ApplicationException, it.test.kion.ProductNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getProductByURI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productURI, metadataPrefix});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.test.kion.WsdtoProduct) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.test.kion.WsdtoProduct) org.apache.axis.utils.JavaUtils.convert(_resp, it.test.kion.WsdtoProduct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.UnsupportedMetadataFormatException) {
              throw (it.test.kion.UnsupportedMetadataFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.ApplicationException) {
              throw (it.test.kion.ApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.ProductNotFoundException) {
              throw (it.test.kion.ProductNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.test.kion.WsdtoProduct getProductByHandle(java.lang.String productHandle, java.lang.String metadataPrefix) throws java.rmi.RemoteException, it.test.kion.UnsupportedMetadataFormatException, it.test.kion.ApplicationException, it.test.kion.ProductNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getProductByHandle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productHandle, metadataPrefix});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.test.kion.WsdtoProduct) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.test.kion.WsdtoProduct) org.apache.axis.utils.JavaUtils.convert(_resp, it.test.kion.WsdtoProduct.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.UnsupportedMetadataFormatException) {
              throw (it.test.kion.UnsupportedMetadataFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.ApplicationException) {
              throw (it.test.kion.ApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.ProductNotFoundException) {
              throw (it.test.kion.ProductNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.test.kion.WsdtoProducts getProductsByQuery(java.lang.String query, java.lang.String metadataPrefix, it.test.kion.WsdtoFilter filter) throws java.rmi.RemoteException, it.test.kion.AuthorNotFoundException, it.test.kion.UnsupportedMetadataFormatException, it.test.kion.ApplicationException, it.test.kion.UnsupportedOrderingTokenException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getProductsByQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, metadataPrefix, filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.test.kion.WsdtoProducts) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.test.kion.WsdtoProducts) org.apache.axis.utils.JavaUtils.convert(_resp, it.test.kion.WsdtoProducts.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.AuthorNotFoundException) {
              throw (it.test.kion.AuthorNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.UnsupportedMetadataFormatException) {
              throw (it.test.kion.UnsupportedMetadataFormatException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.ApplicationException) {
              throw (it.test.kion.ApplicationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.UnsupportedOrderingTokenException) {
              throw (it.test.kion.UnsupportedOrderingTokenException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.test.kion.WsdtoSummary getSummaryByAB(java.lang.Integer authorID) throws java.rmi.RemoteException, it.test.kion.AuthorNotFoundException, it.test.kion.ApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getSummaryByAB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authorID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.test.kion.WsdtoSummary) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.test.kion.WsdtoSummary) org.apache.axis.utils.JavaUtils.convert(_resp, it.test.kion.WsdtoSummary.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.AuthorNotFoundException) {
              throw (it.test.kion.AuthorNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.ApplicationException) {
              throw (it.test.kion.ApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.test.kion.WsdtoSummary getSummaryByCF(java.lang.String CF) throws java.rmi.RemoteException, it.test.kion.AuthorNotFoundException, it.test.kion.ApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getSummaryByCF"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CF});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.test.kion.WsdtoSummary) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.test.kion.WsdtoSummary) org.apache.axis.utils.JavaUtils.convert(_resp, it.test.kion.WsdtoSummary.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.AuthorNotFoundException) {
              throw (it.test.kion.AuthorNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.ApplicationException) {
              throw (it.test.kion.ApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.test.kion.WsdtoSummary getSummaryByURI(java.lang.String authorURI) throws java.rmi.RemoteException, it.test.kion.AuthorNotFoundException, it.test.kion.ApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.ri.u-gov.cineca.it/", "getSummaryByURI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authorURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.test.kion.WsdtoSummary) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.test.kion.WsdtoSummary) org.apache.axis.utils.JavaUtils.convert(_resp, it.test.kion.WsdtoSummary.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.AuthorNotFoundException) {
              throw (it.test.kion.AuthorNotFoundException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.test.kion.ApplicationException) {
              throw (it.test.kion.ApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
