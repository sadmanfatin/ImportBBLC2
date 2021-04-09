<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.1" exclude-result-prefixes="fo" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format">
  <xsl:output method="xml" version="1.0" omit-xml-declaration="no" indent="yes"/>
  <!--=========================-->
  <!--root element: DemoHeaderTVO-->
  <!--=========================-->
  <xsl:template match="DemoHeaderTVO">
<fo:root font-family="Helvetica">
    <fo:layout-master-set>
        <fo:simple-page-master master-name="simple" 
        page-height="29.7cm" page-width="21cm" 
        margin-top="1cm" margin-bottom="1.8cm" margin-left="2cm" margin-right="2cm">
            <fo:region-body region-name="xsl-region-body" margin-left="1cm" margin-top="2.5cm"/>
            <fo:region-before region-name="xsl-region-before" extent="1cm" />
            <fo:region-after region-name="xsl-region-after"  />
        </fo:simple-page-master>
    </fo:layout-master-set>
    <fo:page-sequence master-reference="simple">
<!--== HEADER NOTE  =================-->
        <fo:static-content flow-name="xsl-region-before">
            <fo:block text-align="center" font-size="9pt">
                <fo:external-graphic  src="file:///C:/JDeveloper/production/pdfreport/ViewController/public_html/stylesheets/logo2.jpg" />
            </fo:block>
        </fo:static-content>
<!--== END OF HEADER NOTE  =================-->
<!-- FOOTER NOTE ========================== -->        
        <fo:static-content flow-name="xsl-region-after">
             <fo:block text-align="center" font-size="7.5pt">
            <fo:block font-family="Helvetica"  linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
            >Corporate Office: 8th, 9th, 10th, 12th &#x026; 13th Floors, RCC Tower, 17 Mohakhali C/A, Dhaka-1212 Tel: 88-02-9844356, Fax : 88-02-8837137</fo:block>        
            <fo:block font-family="Helvetica"  linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
            >Factory : Vogra, Chandana, Gazipur Sadar, Gazipur, Bangladesh Tel : 9292792-4, 9292547, Fax : 880-2-9292795</fo:block>
            </fo:block>
        </fo:static-content>
<!--END OF FOOTER NOTE ========================== -->
<!-- BODY CONTENT  -->        
        <fo:flow flow-name="xsl-region-body">
            <fo:block  font-size="13pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>Our Ref No. CGL/CITI/IMP/2020/07</fo:block>
<fo:block  font-size="13pt" >Dated July 21, 2020</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="13pt" >The Manager</fo:block>
<fo:block  font-size="13pt" >Import Department </fo:block>
<fo:block  font-size="13pt">Citibank N.A.</fo:block>
<fo:block  font-size="13pt">8, Gulshan Avenue </fo:block>
<fo:block  font-size="13pt">Gulshan-1, Dhaka-1212</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="13pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>Subject: <fo:inline  text-decoration="underline">Acceptance of original documents against 5632605983 dated 15-Apr-
2020 Beneficiary: Guangdong Textile Import &#x026; Export Co., Ltd.</fo:inline></fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="13pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>Dear Sir,</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="13pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>We would request you to endorse the original documents in our favor so that 
we can be able to release the consignment from the customs, port authority 
and other agencies which is waiting for clearance at Chittagong Sea port. 
</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="13pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>Invoice No. 2020SHGS001-10M; Invoice Amount: USD 95,959.36
</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="13pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>Bill Of Lading No. ETSE200512941B Dated 19-May-2020
</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="13pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>Type of settlement: by Debiting Sundry / DFC / MOB / ERQ Account.
</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="13pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>We authorize you to retire the original documents despite any discrepancy 
found in due course and debit all costs, margin and related charges, losses, 
if any. 
</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="13pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>We authorize Mr. Shamim to collect the documents from you on our behalf.
</fo:block>
<fo:block>&#160;</fo:block>
<fo:block  font-size="13pt" linefeed-treatment="preserve" white-space-treatment="preserve" white-space-collapse="false"
>Thanking you.       

Yours faithfully,
</fo:block>
        </fo:flow>
    </fo:page-sequence>
</fo:root>
</xsl:template>
</xsl:stylesheet>