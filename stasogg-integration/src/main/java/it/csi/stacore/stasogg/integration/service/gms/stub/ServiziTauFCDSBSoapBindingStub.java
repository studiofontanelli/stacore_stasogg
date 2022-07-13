/**
 * ServiziTauFCDSBSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.stacore.stasogg.integration.service.gms.stub;

public class ServiziTauFCDSBSoapBindingStub extends org.apache.axis.client.Stub implements it.csi.stacore.stasogg.integration.service.gms.stub.ServiziTau {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[32];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaIdentitaDaID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "Identita"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.Identita.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaIdentitaDaIDReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault1"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaCFDaID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaCFDaIDReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault1"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaSoggettiSimili");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "AnagraficaDefinitiva"), it.csi.stacore.stasogg.integration.service.gms.stub.AnagraficaDefinitiva.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "AnagraficaDefinitiva"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.AnagraficaDefinitiva[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaSoggettiSimiliReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaStoricaSoggettoCF");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "Anagrafica"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaStoricaSoggettoCFReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault5"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscaleNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault6"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonCensitoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscaleNonCensitoCsiException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("elencoFontiDisponibili");
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "FonteProvenienza"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "elencoFontiDisponibiliReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaSoggettoCF");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "Anagrafica"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaSoggettoCFReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault5"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscaleNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaSoggettoID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "Anagrafica"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaSoggettoIDReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault1"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaStoricaSoggettoID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "Anagrafica"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaStoricaSoggettoIDReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault1"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaIdentitaDaCF");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "Identita"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.Identita[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaIdentitaDaCFReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault5"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscaleNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault6"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonCensitoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscaleNonCensitoCsiException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaImpresa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoImpresa"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaImpresaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaIndirizziID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "Indirizzo"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaIndirizziIDReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault1"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault7"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IndirizzoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaPersonaFisica");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoPF"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaPersonaFisicaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaPersonaFisicaCompleta");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "ModuloRicercaPF"), it.csi.stacore.stasogg.integration.service.gms.stub.ModuloRicercaPF.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoPF"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaPersonaFisicaCompletaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listaSintetica");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "Identita"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.Identita[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "listaSinteticaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault1"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aggiornaAnagraficaImpresa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoImpresa"), it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault1"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault8"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNonInLimitiCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault9"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "AggiornamentoImpossibileCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aggiornaDomicilioFiscaleImpresa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "Indirizzo"), it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault1"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault8"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNonInLimitiCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault9"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "AggiornamentoImpossibileCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aggiornaDomicilioFiscalePersonaFisica");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "Indirizzo"), it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault1"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault8"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNonInLimitiCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault9"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "AggiornamentoImpossibileCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aggiornaPersonaFisica");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoPF"), it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault1"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault8"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNonInLimitiCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault9"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "AggiornamentoImpossibileCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciDomicilioFiscalePersonaFisica");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "Indirizzo"), it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault10"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "InserimentoImpossibileCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault1"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault8"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNonInLimitiCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciImpresa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoImpresa"), it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "inserisciImpresaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault10"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "InserimentoImpossibileCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault8"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNonInLimitiCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciIndirizzoSpedizione");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "Indirizzo"), it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault10"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "InserimentoImpossibileCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault1"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault8"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNonInLimitiCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciPersonaFisica");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoPF"), it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "inserisciPersonaFisicaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault10"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "InserimentoImpossibileCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault8"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNonInLimitiCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciSoggettoSimilePF");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoPF"), it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "inserisciSoggettoSimilePFReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault10"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "InserimentoImpossibileCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault8"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNonInLimitiCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciSoggettoSimilePG");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoImpresa"), it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "inserisciSoggettoSimilePGReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault10"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "InserimentoImpossibileCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault8"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNonInLimitiCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modificaCodiceFiscale");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "ModuloModificaCF"), it.csi.stacore.stasogg.integration.service.gms.stub.ModuloModificaCF.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault9"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "AggiornamentoImpossibileCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modificaCodiceFiscaleImpresa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "ModuloModificaCFImpresa"), it.csi.stacore.stasogg.integration.service.gms.stub.ModuloModificaCFImpresa.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault9"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "AggiornamentoImpossibileCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modificaCodiceFiscalePersonaFisica");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:gmsregsrv", "ModuloModificaCFPersonaFisica"), it.csi.stacore.stasogg.integration.service.gms.stub.ModuloModificaCFPersonaFisica.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault9"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "AggiornamentoImpossibileCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaPersonaFisicaWithAuthentication");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoPF"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaPersonaFisicaWithAuthenticationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault4"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaIdentitaDaCFWithAuthentication");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "Identita"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.Identita[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaIdentitaDaCFWithAuthenticationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault5"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscaleNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault6"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonCensitoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscaleNonCensitoCsiException"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaCFDaIDWithAuthentication");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaCFDaIDWithAuthenticationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault1"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaSoggettoIDWithAuthentication");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "Anagrafica"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaSoggettoIDWithAuthenticationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault1"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaSoggettoCFWithAuthentication");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:gmsregsrv", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:gmsregsrv", "Anagrafica"));
        oper.setReturnClass(it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaSoggettoCFWithAuthenticationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault2"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault5"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscaleNonValidoCsiException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault3"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:gmsregsrv", "fault"),
                      "it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException",
                      new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException"), 
                      true
                     ));
        _operations[31] = oper;

    }

    public ServiziTauFCDSBSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ServiziTauFCDSBSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ServiziTauFCDSBSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
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
            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">aggiornaAnagraficaImpresa");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.AggiornaAnagraficaImpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">aggiornaAnagraficaImpresaResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.AggiornaAnagraficaImpresaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">aggiornaDomicilioFiscaleImpresa");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.AggiornaDomicilioFiscaleImpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">aggiornaDomicilioFiscaleImpresaResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.AggiornaDomicilioFiscaleImpresaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">aggiornaDomicilioFiscalePersonaFisica");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.AggiornaDomicilioFiscalePersonaFisica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">aggiornaDomicilioFiscalePersonaFisicaResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.AggiornaDomicilioFiscalePersonaFisicaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">aggiornaPersonaFisica");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.AggiornaPersonaFisica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">aggiornaPersonaFisicaResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.AggiornaPersonaFisicaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">elencoFontiDisponibili");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.ElencoFontiDisponibili.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">elencoFontiDisponibiliResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.ElencoFontiDisponibiliResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">inserisciDomicilioFiscalePersonaFisica");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserisciDomicilioFiscalePersonaFisica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">inserisciDomicilioFiscalePersonaFisicaResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserisciDomicilioFiscalePersonaFisicaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">inserisciImpresa");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserisciImpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">inserisciImpresaResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserisciImpresaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">inserisciIndirizzoSpedizione");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserisciIndirizzoSpedizione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">inserisciIndirizzoSpedizioneResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserisciIndirizzoSpedizioneResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">inserisciPersonaFisica");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserisciPersonaFisica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">inserisciPersonaFisicaResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserisciPersonaFisicaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">inserisciSoggettoSimilePF");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserisciSoggettoSimilePF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">inserisciSoggettoSimilePFResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserisciSoggettoSimilePFResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">inserisciSoggettoSimilePG");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserisciSoggettoSimilePG.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">inserisciSoggettoSimilePGResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserisciSoggettoSimilePGResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">listaSintetica");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.ListaSintetica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">listaSinteticaResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.ListaSinteticaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">modificaCodiceFiscale");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.ModificaCodiceFiscale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">modificaCodiceFiscaleImpresa");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.ModificaCodiceFiscaleImpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">modificaCodiceFiscaleImpresaResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.ModificaCodiceFiscaleImpresaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">modificaCodiceFiscalePersonaFisica");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.ModificaCodiceFiscalePersonaFisica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">modificaCodiceFiscalePersonaFisicaResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.ModificaCodiceFiscalePersonaFisicaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">modificaCodiceFiscaleResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.ModificaCodiceFiscaleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaCFDaID");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaCFDaID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaCFDaIDResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaCFDaIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaCFDaIDWithAuthentication");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaCFDaIDWithAuthentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaCFDaIDWithAuthenticationResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaCFDaIDWithAuthenticationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaIdentitaDaCF");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaIdentitaDaCF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaIdentitaDaCFResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaIdentitaDaCFResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaIdentitaDaCFWithAuthentication");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaIdentitaDaCFWithAuthentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaIdentitaDaCFWithAuthenticationResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaIdentitaDaCFWithAuthenticationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaIdentitaDaID");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaIdentitaDaID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaIdentitaDaIDResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaIdentitaDaIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaImpresa");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaImpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaImpresaResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaImpresaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaIndirizziID");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaIndirizziID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaIndirizziIDResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaIndirizziIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaPersonaFisica");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaPersonaFisica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaPersonaFisicaCompleta");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaPersonaFisicaCompleta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaPersonaFisicaCompletaResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaPersonaFisicaCompletaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaPersonaFisicaResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaPersonaFisicaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaPersonaFisicaWithAuthentication");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaPersonaFisicaWithAuthentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaPersonaFisicaWithAuthenticationResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaPersonaFisicaWithAuthenticationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaSoggettiSimili");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaSoggettiSimili.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaSoggettiSimiliResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaSoggettiSimiliResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaSoggettoCF");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaSoggettoCF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaSoggettoCFResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaSoggettoCFResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaSoggettoCFWithAuthentication");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaSoggettoCFWithAuthentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaSoggettoCFWithAuthenticationResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaSoggettoCFWithAuthenticationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaSoggettoID");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaSoggettoID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaSoggettoIDResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaSoggettoIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaSoggettoIDWithAuthentication");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaSoggettoIDWithAuthentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaSoggettoIDWithAuthenticationResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaSoggettoIDWithAuthenticationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaStoricaSoggettoCF");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaStoricaSoggettoCF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaStoricaSoggettoCFResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaStoricaSoggettoCFResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaStoricaSoggettoID");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaStoricaSoggettoID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", ">ricercaStoricaSoggettoIDResponse");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.RicercaStoricaSoggettoIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "AbstractLuogoNazionale");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.AbstractLuogoNazionale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "AggiornamentoImpossibileCsiException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "AggiornamentoImpossibileException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "AggiornamentoImpossibileException.ErrorCode");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileExceptionErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "AltroLuogo");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.AltroLuogo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "Anagrafica");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "AnagraficaDefinitiva");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.AnagraficaDefinitiva.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "Attivita");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.Attivita.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "Cittadinanza");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.Cittadinanza.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "Civico");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.Civico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscale");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscaleNonCensitoCsiException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonCensitoCsiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscaleNonCensitoException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonCensitoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscaleNonValidoCsiException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "CodiceFiscaleNonValidoException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "Comune");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.Comune.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "CSIException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.CSIException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "DateGMS");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.DateGMS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "DettaglioToponomastica");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.DettaglioToponomastica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "FonteProvenienza");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "FonteRiferimento");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.FonteRiferimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "GMSAbstractException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "GMSAbstractObject");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.GMSAbstractObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "GMSServizioIndisponibileException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "Identita");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.Identita.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "IdentitaDefinitiva");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaDefinitiva.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "IdentitaImpresa");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaImpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "IdentitaPersonaFisica");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaPersonaFisica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "IdentitaProvvisoriaImpresa");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaProvvisoriaImpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "IdentitaProvvisoriaPersonaFisica");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.IdentitaProvvisoriaPersonaFisica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoCsiException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "IdInputNonValidoException.ErrorCode");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoExceptionErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "Indirizzo");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "IndirizzoDefinitivo");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoDefinitivo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "IndirizzoEstero");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoEstero.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
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
            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "IndirizzoNazionale");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoNazionale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "IndirizzoNonTrovatoCsiException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoNonTrovatoCsiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "IndirizzoNonTrovatoException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoNonTrovatoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "IndirizzoProvvisorio");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoProvvisorio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "InserimentoImpossibileCsiException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "InserimentoImpossibileException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "InserimentoImpossibileException.ErrorCode");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileExceptionErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "Luogo");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.Luogo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNascitaFiltroRicerca");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNascitaFiltroRicerca.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNazionale");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNazionale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNonCensito");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonCensito.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNonInLimitiCsiException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "LuogoNonInLimitiException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "ModuloModificaCF");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.ModuloModificaCF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "ModuloModificaCFImpresa");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.ModuloModificaCFImpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "ModuloModificaCFPersonaFisica");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.ModuloModificaCFPersonaFisica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "ModuloRicercaPF");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.ModuloRicercaPF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "NaturaGiuridica");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.NaturaGiuridica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoCsiException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "OggettoInputNonValidoException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "Provincia");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.Provincia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "Regione");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.Regione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoImpresa");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoCsiException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoNonTrovatoException.ErrorCode");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoExceptionErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "SoggettoPF");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "StatoAnagraficoSoggetto");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.StatoAnagraficoSoggetto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "StatoIndirizzo");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.StatoIndirizzo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "StatoSoggetto");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.StatoSoggetto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "SystemException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.SystemException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "TipoIndirizzo");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.TipoIndirizzo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "UserException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.UserException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoCsiException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "UtenteNonAbilitatoException");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:gmsregsrv", "Via");
            cachedSerQNames.add(qName);
            cls = it.csi.stacore.stasogg.integration.service.gms.stub.Via.class;
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

    public it.csi.stacore.stasogg.integration.service.gms.stub.Identita ricercaIdentitaDaID(java.lang.Long in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaIdentitaDaID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Identita) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Identita) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.Identita.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String ricercaCFDaID(java.lang.Long in0) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaCFDaID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.AnagraficaDefinitiva[] ricercaSoggettiSimili(it.csi.stacore.stasogg.integration.service.gms.stub.AnagraficaDefinitiva in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaSoggettiSimili"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.AnagraficaDefinitiva[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.AnagraficaDefinitiva[]) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.AnagraficaDefinitiva[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[] ricercaStoricaSoggettoCF(java.lang.String in0, java.util.Calendar in1, java.lang.String in2) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonCensitoCsiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaStoricaSoggettoCF"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[]) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonCensitoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonCensitoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza[] elencoFontiDisponibili() throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "elencoFontiDisponibili"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza[]) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.FonteProvenienza[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[] ricercaSoggettoCF(java.lang.String in0) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaSoggettoCF"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[]) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica ricercaSoggettoID(java.lang.Long in0) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaSoggettoID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica ricercaStoricaSoggettoID(java.lang.Long in0, java.util.Calendar in1, java.lang.String in2) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaStoricaSoggettoID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] ricercaIdentitaDaCF(java.lang.String in0) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonCensitoCsiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaIdentitaDaCF"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Identita[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Identita[]) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.Identita[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonCensitoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonCensitoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa[] ricercaImpresa(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaImpresa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa[]) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo[] ricercaIndirizziID(java.lang.Long in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoNonTrovatoCsiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaIndirizziID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo[]) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IndirizzoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[] ricercaPersonaFisica(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaPersonaFisica"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[]) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[] ricercaPersonaFisicaCompleta(it.csi.stacore.stasogg.integration.service.gms.stub.ModuloRicercaPF in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaPersonaFisicaCompleta"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[]) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] listaSintetica(java.lang.Long[] in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "listaSintetica"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Identita[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Identita[]) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.Identita[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void aggiornaAnagraficaImpresa(java.lang.Long in0, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa in1, java.lang.String in2) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "aggiornaAnagraficaImpresa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void aggiornaDomicilioFiscaleImpresa(java.lang.Long in0, it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo in1, java.lang.String in2) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "aggiornaDomicilioFiscaleImpresa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void aggiornaDomicilioFiscalePersonaFisica(java.lang.Long in0, it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo in1, java.lang.String in2) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "aggiornaDomicilioFiscalePersonaFisica"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void aggiornaPersonaFisica(java.lang.Long in0, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF in1, java.lang.String in2) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "aggiornaPersonaFisica"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void inserisciDomicilioFiscalePersonaFisica(java.lang.Long in0, it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo in1, java.lang.String in2) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "inserisciDomicilioFiscalePersonaFisica"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Long inserisciImpresa(it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "inserisciImpresa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void inserisciIndirizzoSpedizione(java.lang.Long in0, it.csi.stacore.stasogg.integration.service.gms.stub.Indirizzo in1, java.lang.String in2) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "inserisciIndirizzoSpedizione"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Long inserisciPersonaFisica(it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "inserisciPersonaFisica"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Long inserisciSoggettoSimilePF(it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "inserisciSoggettoSimilePF"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Long inserisciSoggettoSimilePG(it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoImpresa in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "inserisciSoggettoSimilePG"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.InserimentoImpossibileCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.LuogoNonInLimitiCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void modificaCodiceFiscale(it.csi.stacore.stasogg.integration.service.gms.stub.ModuloModificaCF in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "modificaCodiceFiscale"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void modificaCodiceFiscaleImpresa(it.csi.stacore.stasogg.integration.service.gms.stub.ModuloModificaCFImpresa in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "modificaCodiceFiscaleImpresa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void modificaCodiceFiscalePersonaFisica(it.csi.stacore.stasogg.integration.service.gms.stub.ModuloModificaCFPersonaFisica in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "modificaCodiceFiscalePersonaFisica"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.AggiornamentoImpossibileCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[] ricercaPersonaFisicaWithAuthentication(java.lang.String in0, java.lang.String in1, java.util.Calendar in2, java.lang.String in3) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaPersonaFisicaWithAuthentication"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[]) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoPF[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.OggettoInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Identita[] ricercaIdentitaDaCFWithAuthentication(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonCensitoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaIdentitaDaCFWithAuthentication"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Identita[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Identita[]) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.Identita[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonCensitoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonCensitoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String ricercaCFDaIDWithAuthentication(java.lang.Long in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaCFDaIDWithAuthentication"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica ricercaSoggettoIDWithAuthentication(java.lang.Long in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaSoggettoIDWithAuthentication"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.IdInputNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[] ricercaSoggettoCFWithAuthentication(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException, it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException, it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:gmsregsrv", "ricercaSoggettoCFWithAuthentication"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[]) org.apache.axis.utils.JavaUtils.convert(_resp, it.csi.stacore.stasogg.integration.service.gms.stub.Anagrafica[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.UtenteNonAbilitatoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.CodiceFiscaleNonValidoCsiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.GMSServizioIndisponibileException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) {
              throw (it.csi.stacore.stasogg.integration.service.gms.stub.SoggettoNonTrovatoCsiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
