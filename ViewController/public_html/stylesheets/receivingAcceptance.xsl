<?xml version="1.0" encoding="UTF-8"?>
 <xsl:stylesheet version="1.1" exclude-result-prefixes="fo" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format"
xmlns:java="http://xml.apache.org/xslt/java"
>
<xsl:output method="xml" version="1.0" omit-xml-declaration="no" indent="yes"/>
  <!--=========================-->
  <!--root element: DemoHeaderTVO-->
  <!--=========================-->
  <xsl:template match="BBLCDetailsVORow">
    <fo:root  font-family="Times"  >
    <fo:layout-master-set>
        <fo:simple-page-master master-name="simple" 
        page-height="11.69in" page-width="8.27in" 
        margin-top="0.30in" margin-bottom="0.35in" margin-left="0.7in" margin-right="0.6in">
            <fo:region-body region-name="xsl-region-body" margin-top="0.65in" />
            <fo:region-before region-name="xsl-region-before"  />
            <fo:region-after region-name="xsl-region-after" />
        </fo:simple-page-master>
    </fo:layout-master-set>
    <fo:page-sequence master-reference="simple">
<!--============================================================== HEADER NOTE  ==================================================-->

           <fo:static-content flow-name="xsl-region-before">
            <fo:block text-align="center" font-size="9pt">            
               <xsl:if test="OrgShortName='CAL'">
                   <fo:external-graphic  src="url('unitimage/CAL image.jpg')" />
               </xsl:if>              
                <xsl:if test="OrgShortName='CGL'">
                   <fo:external-graphic  src="url('unitimage/CGL image.jpg')" />
               </xsl:if>
                <xsl:if test="OrgShortName='CWPL'">               
                   <fo:external-graphic  src="url('unitimage/CWPL image.jpg')" />               
               </xsl:if>
                <xsl:if test="OrgShortName='GFL'">              
                   <fo:external-graphic  src="url('unitimage/GFL image.jpg')" />
               </xsl:if>
                <xsl:if test="OrgShortName='GWL'">              
                   <fo:external-graphic  src="url('unitimage/GWL image.jpg')" />               
               </xsl:if>                  
            </fo:block>
        </fo:static-content>
<!--============================================================== END OF HEADER NOTE  ==================================================-->

<!--============================================================== FOOTER NOTE ================================================= -->        
        <fo:static-content flow-name="xsl-region-after" font-family="Helvetica" >
             <fo:block text-align="left" font-size="7.5pt"  >
             
 <!--       <fo:block   linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
            >Corporate Office: <xsl:value-of select="CorporateAddress"/></fo:block>  -->
             
            <fo:block  white-space-collapse="false" white-space-treatment="preserve" linefeed-treatment="preserve">Corporate Office: 8th, 9th, 10th, 12th &#x026; 13th Floors, RCC Tower, 17 Mohakhali C/A, Dhaka-1212 Tel: 88-02-9844356, Fax : 88-02-8837137</fo:block>        
            <fo:block   linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
            >Factory: <xsl:value-of select="FactoryAddress"/></fo:block>     
            </fo:block>
        </fo:static-content>
        
<!-- ============================================================== END OF FOOTER NOTE ================================================= -->

<!--============================================================== BODY CONTENT ======================================================== -->  

 <fo:flow flow-name="xsl-region-body" >
 
<fo:block   font-size="12pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>Ref No. <xsl:value-of select="OrgShortName"/>/<xsl:value-of select="ShortBankName"/>/IMP/<xsl:value-of select="java:format(java:java.text.SimpleDateFormat.new('yyyy'), java:java.util.Date.new())" />/<xsl:value-of select="ImpBblcDetailId"/>
</fo:block>
<fo:block  font-size="12pt" >
Dated: <xsl:value-of select="java:format(java:java.text.SimpleDateFormat.new('MMMMM dd, yyyy'), java:java.util.Date.new())" />
</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="12pt" >The Manager</fo:block>
<!-- <fo:block  font-size="13pt" >Import Department </fo:block> -->
<fo:block  font-size="12pt" ><xsl:value-of select="BankName"/></fo:block>
<fo:block  font-size="12pt" ><xsl:value-of select="AddressLine1"/></fo:block>
<fo:block  font-size="12pt" ><xsl:value-of select="AddressLine2"/> </fo:block>
<fo:block  font-size="12pt"><xsl:value-of select="AddressLine3"/></fo:block>
<fo:block  font-size="12pt">  <xsl:value-of select="AddressLine4"/></fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="12pt" text-align="justify" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>Subject: Request for <fo:inline  text-decoration="underline">acceptance of original documents against LC / NULC No. <xsl:value-of select="BBLCLines/BBLCLinesVORow/BblcNo"/> dated <xsl:value-of select="BBLCLines/BBLCLinesVORow/LcIssueDate"/> in favor of <xsl:value-of select="BBLCLines/BBLCLinesVORow/BeneficiaryName"/>.</fo:inline></fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="12pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>Dear Sir,</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="12pt" text-align="justify"
>We would request you to endorse the original shipping documents in our favor. Details are as below: 
</fo:block>
<fo:block   font-size="12pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false">
Invoice No. <xsl:value-of select="InvoiceNo"/>; Invoice Amount:  <xsl:value-of select="Attribute30"/><xsl:text> </xsl:text><xsl:value-of select='format-number(ImportValue, "###,###.00")'/> 
</fo:block>
<fo:block  font-size="12pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false">
Bill Of Lading No. <xsl:value-of select="ConsignmentNo"/> Dated <xsl:value-of select="TransportDocumentDate"/>
</fo:block>
<fo:block  font-size="12pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false">
Destination: Chittagong Sea port.
</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="12pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>Type of settlement: by Debiting Sundry / DFC / MOB / ERQ Account.
</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="12pt" text-align="justify"
>We authorize you to retire the original documents despite any discrepancy found in due course and debit all costs, margin and related charges, losses, if any, to our account. 
</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="12pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>Please deliver the original shipping documents to our authorized representative on our behalf.
</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="12pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>Thanking you.       

Yours faithfully,
<fo:block  font-size="12pt" >for  <xsl:value-of select="OrgName"/></fo:block>


Authorized Signature
</fo:block>
        </fo:flow>
    </fo:page-sequence>
</fo:root>
</xsl:template>
</xsl:stylesheet>