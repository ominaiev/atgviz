//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.22 at 12:14:36 PM PDT 
//


package tech.oleks.atgviz.model.gsa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="item-descriptor" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attribute" type="{}Attribute" maxOccurs="unbounded"/>
 *                   &lt;element name="property" type="{}Property" maxOccurs="unbounded"/>
 *                   &lt;element name="table" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="attribute" type="{}Attribute"/>
 *                             &lt;element name="property" type="{}Property" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="id-column-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="multi-column-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="shared-table-sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="expert" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="display-name-resource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="id-separator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="writable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cache-mode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="item-cache-timeout" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="folder" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="query-cache-size" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="sub-type-property" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="super-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="query-expire-timeout" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="display-property" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="use-id-for-path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="item-cache-size" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "itemDescriptor"
})
@XmlRootElement(name = "gsa-template")
public class GsaTemplate {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(name = "item-descriptor", required = true)
    protected List<ItemDescriptor> itemDescriptor;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the itemDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDescriptor }
     * 
     * 
     */
    public List<ItemDescriptor> getItemDescriptor() {
        if (itemDescriptor == null) {
            itemDescriptor = new ArrayList<ItemDescriptor>();
        }
        return this.itemDescriptor;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "author",
        "version"
    })
    public static class Header {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String author;
        @XmlElement(required = true)
        protected String version;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the author property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthor() {
            return author;
        }

        /**
         * Sets the value of the author property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthor(String value) {
            this.author = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="attribute" type="{}Attribute" maxOccurs="unbounded"/>
     *         &lt;element name="property" type="{}Property" maxOccurs="unbounded"/>
     *         &lt;element name="table" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="attribute" type="{}Attribute"/>
     *                   &lt;element name="property" type="{}Property" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="id-column-name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="multi-column-name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="shared-table-sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="expert" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="display-name-resource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="id-separator" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="writable" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cache-mode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="item-cache-timeout" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="content" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="folder" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="query-cache-size" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="sub-type-property" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="super-type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="query-expire-timeout" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="display-property" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="use-id-for-path" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="item-cache-size" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attribute",
        "property",
        "table"
    })
    public static class ItemDescriptor {

        @XmlElement(required = true)
        protected List<Attribute> attribute;
        @XmlElement(required = true)
        protected List<Property> property;
        @XmlElement(required = true)
        protected List<Table> table;
        @XmlAttribute(name = "expert")
        protected String expert;
        @XmlAttribute(name = "display-name-resource")
        protected String displayNameResource;
        @XmlAttribute(name = "id-separator")
        protected String idSeparator;
        @XmlAttribute(name = "writable")
        protected String writable;
        @XmlAttribute(name = "cache-mode")
        protected String cacheMode;
        @XmlAttribute(name = "item-cache-timeout")
        protected Integer itemCacheTimeout;
        @XmlAttribute(name = "content")
        protected String content;
        @XmlAttribute(name = "folder")
        protected String folder;
        @XmlAttribute(name = "default")
        protected String _default;
        @XmlAttribute(name = "query-cache-size")
        protected Integer queryCacheSize;
        @XmlAttribute(name = "sub-type-property")
        protected String subTypeProperty;
        @XmlAttribute(name = "super-type")
        protected String superType;
        @XmlAttribute(name = "hidden")
        protected String hidden;
        @XmlAttribute(name = "query-expire-timeout")
        protected Integer queryExpireTimeout;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "display-property")
        protected String displayProperty;
        @XmlAttribute(name = "use-id-for-path")
        protected String useIdForPath;
        @XmlAttribute(name = "item-cache-size")
        protected Integer itemCacheSize;

        /**
         * Gets the value of the attribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Attribute }
         * 
         * 
         */
        public List<Attribute> getAttribute() {
            if (attribute == null) {
                attribute = new ArrayList<Attribute>();
            }
            return this.attribute;
        }

        /**
         * Gets the value of the property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Property }
         * 
         * 
         */
        public List<Property> getProperty() {
            if (property == null) {
                property = new ArrayList<Property>();
            }
            return this.property;
        }

        /**
         * Gets the value of the table property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the table property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTable().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Table }
         * 
         * 
         */
        public List<Table> getTable() {
            if (table == null) {
                table = new ArrayList<Table>();
            }
            return this.table;
        }

        /**
         * Gets the value of the expert property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpert() {
            return expert;
        }

        /**
         * Sets the value of the expert property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpert(String value) {
            this.expert = value;
        }

        /**
         * Gets the value of the displayNameResource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplayNameResource() {
            return displayNameResource;
        }

        /**
         * Sets the value of the displayNameResource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplayNameResource(String value) {
            this.displayNameResource = value;
        }

        /**
         * Gets the value of the idSeparator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdSeparator() {
            return idSeparator;
        }

        /**
         * Sets the value of the idSeparator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdSeparator(String value) {
            this.idSeparator = value;
        }

        /**
         * Gets the value of the writable property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWritable() {
            return writable;
        }

        /**
         * Sets the value of the writable property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWritable(String value) {
            this.writable = value;
        }

        /**
         * Gets the value of the cacheMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCacheMode() {
            return cacheMode;
        }

        /**
         * Sets the value of the cacheMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCacheMode(String value) {
            this.cacheMode = value;
        }

        /**
         * Gets the value of the itemCacheTimeout property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getItemCacheTimeout() {
            return itemCacheTimeout;
        }

        /**
         * Sets the value of the itemCacheTimeout property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setItemCacheTimeout(Integer value) {
            this.itemCacheTimeout = value;
        }

        /**
         * Gets the value of the content property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            return content;
        }

        /**
         * Sets the value of the content property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
        }

        /**
         * Gets the value of the folder property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFolder() {
            return folder;
        }

        /**
         * Sets the value of the folder property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFolder(String value) {
            this.folder = value;
        }

        /**
         * Gets the value of the default property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefault() {
            return _default;
        }

        /**
         * Sets the value of the default property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefault(String value) {
            this._default = value;
        }

        /**
         * Gets the value of the queryCacheSize property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQueryCacheSize() {
            return queryCacheSize;
        }

        /**
         * Sets the value of the queryCacheSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQueryCacheSize(Integer value) {
            this.queryCacheSize = value;
        }

        /**
         * Gets the value of the subTypeProperty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubTypeProperty() {
            return subTypeProperty;
        }

        /**
         * Sets the value of the subTypeProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubTypeProperty(String value) {
            this.subTypeProperty = value;
        }

        /**
         * Gets the value of the superType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuperType() {
            return superType;
        }

        /**
         * Sets the value of the superType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuperType(String value) {
            this.superType = value;
        }

        /**
         * Gets the value of the hidden property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHidden() {
            return hidden;
        }

        /**
         * Sets the value of the hidden property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHidden(String value) {
            this.hidden = value;
        }

        /**
         * Gets the value of the queryExpireTimeout property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQueryExpireTimeout() {
            return queryExpireTimeout;
        }

        /**
         * Sets the value of the queryExpireTimeout property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQueryExpireTimeout(Integer value) {
            this.queryExpireTimeout = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the displayProperty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplayProperty() {
            return displayProperty;
        }

        /**
         * Sets the value of the displayProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplayProperty(String value) {
            this.displayProperty = value;
        }

        /**
         * Gets the value of the useIdForPath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseIdForPath() {
            return useIdForPath;
        }

        /**
         * Sets the value of the useIdForPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseIdForPath(String value) {
            this.useIdForPath = value;
        }

        /**
         * Gets the value of the itemCacheSize property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getItemCacheSize() {
            return itemCacheSize;
        }

        /**
         * Sets the value of the itemCacheSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setItemCacheSize(Integer value) {
            this.itemCacheSize = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="attribute" type="{}Attribute"/>
         *         &lt;element name="property" type="{}Property" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="id-column-name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="multi-column-name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="shared-table-sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "attribute",
            "property"
        })
        public static class Table {

            @XmlElement(required = true)
            protected Attribute attribute;
            @XmlElement(required = true)
            protected List<Property> property;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "id-column-name")
            protected String idColumnName;
            @XmlAttribute(name = "type")
            protected String type;
            @XmlAttribute(name = "multi-column-name")
            protected String multiColumnName;
            @XmlAttribute(name = "shared-table-sequence")
            protected Integer sharedTableSequence;

            /**
             * Gets the value of the attribute property.
             * 
             * @return
             *     possible object is
             *     {@link Attribute }
             *     
             */
            public Attribute getAttribute() {
                return attribute;
            }

            /**
             * Sets the value of the attribute property.
             * 
             * @param value
             *     allowed object is
             *     {@link Attribute }
             *     
             */
            public void setAttribute(Attribute value) {
                this.attribute = value;
            }

            /**
             * Gets the value of the property property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the property property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Property }
             * 
             * 
             */
            public List<Property> getProperty() {
                if (property == null) {
                    property = new ArrayList<Property>();
                }
                return this.property;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the idColumnName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdColumnName() {
                return idColumnName;
            }

            /**
             * Sets the value of the idColumnName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdColumnName(String value) {
                this.idColumnName = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the multiColumnName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMultiColumnName() {
                return multiColumnName;
            }

            /**
             * Sets the value of the multiColumnName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMultiColumnName(String value) {
                this.multiColumnName = value;
            }

            /**
             * Gets the value of the sharedTableSequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSharedTableSequence() {
                return sharedTableSequence;
            }

            /**
             * Sets the value of the sharedTableSequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSharedTableSequence(Integer value) {
                this.sharedTableSequence = value;
            }

        }

    }

}