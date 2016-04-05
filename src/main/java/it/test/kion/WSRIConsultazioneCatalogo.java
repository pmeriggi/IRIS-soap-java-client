/**
 * WSRIConsultazioneCatalogo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.test.kion;

public interface WSRIConsultazioneCatalogo extends java.rmi.Remote {
    public it.test.kion.WsdtoMetadataFormat[] getMetadataFormats() throws java.rmi.RemoteException, it.test.kion.ApplicationException;
    public it.test.kion.WsdtoAuthorProducts getAuthorProductsByAB(java.lang.Integer authorID, java.lang.String metadataPrefix, it.test.kion.WsdtoFilter filter) throws java.rmi.RemoteException, it.test.kion.AuthorNotFoundException, it.test.kion.UnsupportedMetadataFormatException, it.test.kion.ApplicationException, it.test.kion.UnsupportedOrderingTokenException;
    public it.test.kion.WsdtoAuthorProducts getAuthorProductsByURI(java.lang.String authorURI, java.lang.String metadataPrefix, it.test.kion.WsdtoFilter filter) throws java.rmi.RemoteException, it.test.kion.AuthorNotFoundException, it.test.kion.UnsupportedMetadataFormatException, it.test.kion.ApplicationException, it.test.kion.UnsupportedOrderingTokenException;
    public it.test.kion.WsdtoAuthorProducts getAuthorProductsByCF(java.lang.String CF, java.lang.String metadataPrefix, it.test.kion.WsdtoFilter filter) throws java.rmi.RemoteException, it.test.kion.AuthorNotFoundException, it.test.kion.UnsupportedMetadataFormatException, it.test.kion.ApplicationException, it.test.kion.UnsupportedOrderingTokenException;
    public it.test.kion.WsdtoProduct getProductByID(java.lang.Integer productID, java.lang.String metadataPrefix) throws java.rmi.RemoteException, it.test.kion.UnsupportedMetadataFormatException, it.test.kion.ApplicationException, it.test.kion.ProductNotFoundException;
    public it.test.kion.WsdtoProduct getProductByHandle(java.lang.String productHandle, java.lang.String metadataPrefix) throws java.rmi.RemoteException, it.test.kion.UnsupportedMetadataFormatException, it.test.kion.ApplicationException, it.test.kion.ProductNotFoundException;
    public it.test.kion.WsdtoProduct getProductByURI(java.lang.String productURI, java.lang.String metadataPrefix) throws java.rmi.RemoteException, it.test.kion.UnsupportedMetadataFormatException, it.test.kion.ApplicationException, it.test.kion.ProductNotFoundException;
    public it.test.kion.WsdtoProducts getProductsByQuery(java.lang.String query, java.lang.String metadataPrefix, it.test.kion.WsdtoFilter filter) throws java.rmi.RemoteException, it.test.kion.AuthorNotFoundException, it.test.kion.UnsupportedMetadataFormatException, it.test.kion.ApplicationException, it.test.kion.UnsupportedOrderingTokenException;
    public it.test.kion.WsdtoSummary getSummaryByAB(java.lang.Integer authorID) throws java.rmi.RemoteException, it.test.kion.AuthorNotFoundException, it.test.kion.ApplicationException;
    public it.test.kion.WsdtoSummary getSummaryByCF(java.lang.String CF) throws java.rmi.RemoteException, it.test.kion.AuthorNotFoundException, it.test.kion.ApplicationException;
    public it.test.kion.WsdtoSummary getSummaryByURI(java.lang.String authorURI) throws java.rmi.RemoteException, it.test.kion.AuthorNotFoundException, it.test.kion.ApplicationException;
}
