<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.1" exclude-result-prefixes="fo" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format">
  <xsl:output method="xml" version="1.0" omit-xml-declaration="no" indent="yes"/>
  <!--=========================-->
  <!--root element: DemoHeaderTVO-->
  <!--=========================-->
  <xsl:template match="DemoHeaderTVO">
    <fo:root>
      <fo:layout-master-set>
        <fo:simple-page-master master-name="simpleA4" page-height="29.7cm" page-width="21cm" 
        margin-top="2cm" margin-bottom="2cm" margin-left="1.5cm" margin-right="1.5cm">
          <fo:region-body/>
        </fo:simple-page-master>
      </fo:layout-master-set>
      <fo:page-sequence master-reference="simpleA4">
        <fo:flow flow-name="xsl-region-body">
          <fo:block font-size="16pt" font-weight="bold" space-after="5mm">User Contact List</fo:block>
          <fo:block font-size="10pt">
            <fo:table table-layout="fixed" width="100%" border-style="solid" >
              <fo:table-column column-width="3.6cm"/>
              <fo:table-column column-width="3.6cm"/>
              <fo:table-column column-width="3.6cm"/>
              <fo:table-column column-width="3.6cm"/>
              <fo:table-column column-width="3.6cm"/>              
              <fo:table-header text-align="center" background-color="silver" font-weight="bold">
                <fo:table-row>
                  <fo:table-cell padding="1mm" border-style="solid">
                    <fo:block>Name</fo:block>
                  </fo:table-cell>
                  <fo:table-cell padding="1mm" border-style="solid">
                    <fo:block>Contact</fo:block>
                  </fo:table-cell>
                  <fo:table-cell padding="1mm" border-style="solid">
                    <fo:block>BuyerID</fo:block>
                  </fo:table-cell>
                  <fo:table-cell padding="1mm" border-style="solid">
                    <fo:block>Season</fo:block>
                  </fo:table-cell>
                  <fo:table-cell padding="1mm" border-style="solid">
                    <fo:block>BuyerName</fo:block>
                  </fo:table-cell>                  
                </fo:table-row>
              </fo:table-header>
              <fo:table-body>
                <xsl:apply-templates select="DemoHeaderTVORow"/>
              </fo:table-body>
            </fo:table>
          </fo:block>
        </fo:flow>
      </fo:page-sequence>
    </fo:root>
  </xsl:template>
  <!--=========================-->
  <!--child element: DemoHeaderTVORow-->
  <!--=========================-->
  <xsl:template match="DemoHeaderTVORow">
    <fo:table-row>
      <fo:table-cell padding-left="2mm" border-style="solid">
        <fo:block>
          <xsl:value-of select="Name"/>
        </fo:block>
      </fo:table-cell>
      <fo:table-cell padding-left="2mm" border-style="solid">
        <fo:block>
          <xsl:value-of select="Contact"/>
        </fo:block>
      </fo:table-cell>
      <fo:table-cell padding-left="2mm" border-style="solid">
        <fo:block>
          <xsl:value-of select="BuyerId"/>
        </fo:block>
      </fo:table-cell>
      <fo:table-cell padding-left="2mm" border-style="solid">
        <fo:block>
          <xsl:value-of select="Season"/>
        </fo:block>
      </fo:table-cell>
      <fo:table-cell padding-left="2mm" border-style="solid">
        <fo:block>
          <xsl:value-of select="BuyerName"/>
        </fo:block>
      </fo:table-cell>      
    </fo:table-row>
  </xsl:template>
</xsl:stylesheet>