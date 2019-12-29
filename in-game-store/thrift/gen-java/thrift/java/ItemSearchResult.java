/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift.java;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2019-12-29")
public class ItemSearchResult implements org.apache.thrift.TBase<ItemSearchResult, ItemSearchResult._Fields>, java.io.Serializable, Cloneable, Comparable<ItemSearchResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ItemSearchResult");

  private static final org.apache.thrift.protocol.TField ITEM_FIELD_DESC = new org.apache.thrift.protocol.TField("item", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ItemSearchResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ItemSearchResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<ShopItem> item; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ITEM((short)1, "item");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ITEM
          return ITEM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ITEM, new org.apache.thrift.meta_data.FieldMetaData("item", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.LIST        , "ItemList")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ItemSearchResult.class, metaDataMap);
  }

  public ItemSearchResult() {
  }

  public ItemSearchResult(
    java.util.List<ShopItem> item)
  {
    this();
    this.item = item;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ItemSearchResult(ItemSearchResult other) {
    if (other.isSetItem()) {
      java.util.List<ShopItem> __this__item = new java.util.ArrayList<ShopItem>(other.item.size());
      for (ShopItem other_element : other.item) {
        __this__item.add(new ShopItem(other_element));
      }
      this.item = __this__item;
    }
  }

  public ItemSearchResult deepCopy() {
    return new ItemSearchResult(this);
  }

  @Override
  public void clear() {
    this.item = null;
  }

  public int getItemSize() {
    return (this.item == null) ? 0 : this.item.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<ShopItem> getItemIterator() {
    return (this.item == null) ? null : this.item.iterator();
  }

  public void addToItem(ShopItem elem) {
    if (this.item == null) {
      this.item = new java.util.ArrayList<ShopItem>();
    }
    this.item.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<ShopItem> getItem() {
    return this.item;
  }

  public ItemSearchResult setItem(@org.apache.thrift.annotation.Nullable java.util.List<ShopItem> item) {
    this.item = item;
    return this;
  }

  public void unsetItem() {
    this.item = null;
  }

  /** Returns true if field item is set (has been assigned a value) and false otherwise */
  public boolean isSetItem() {
    return this.item != null;
  }

  public void setItemIsSet(boolean value) {
    if (!value) {
      this.item = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ITEM:
      if (value == null) {
        unsetItem();
      } else {
        setItem((java.util.List<ShopItem>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ITEM:
      return getItem();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ITEM:
      return isSetItem();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ItemSearchResult)
      return this.equals((ItemSearchResult)that);
    return false;
  }

  public boolean equals(ItemSearchResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_item = true && this.isSetItem();
    boolean that_present_item = true && that.isSetItem();
    if (this_present_item || that_present_item) {
      if (!(this_present_item && that_present_item))
        return false;
      if (!this.item.equals(that.item))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetItem()) ? 131071 : 524287);
    if (isSetItem())
      hashCode = hashCode * 8191 + item.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ItemSearchResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetItem()).compareTo(other.isSetItem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.item, other.item);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ItemSearchResult(");
    boolean first = true;

    sb.append("item:");
    if (this.item == null) {
      sb.append("null");
    } else {
      sb.append(this.item);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ItemSearchResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ItemSearchResultStandardScheme getScheme() {
      return new ItemSearchResultStandardScheme();
    }
  }

  private static class ItemSearchResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<ItemSearchResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ItemSearchResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ITEM
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.item = new java.util.ArrayList<ShopItem>(_list16.size);
                @org.apache.thrift.annotation.Nullable ShopItem _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = new ShopItem();
                  _elem17.read(iprot);
                  struct.item.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setItemIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ItemSearchResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.item != null) {
        oprot.writeFieldBegin(ITEM_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.item.size()));
          for (ShopItem _iter19 : struct.item)
          {
            _iter19.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ItemSearchResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ItemSearchResultTupleScheme getScheme() {
      return new ItemSearchResultTupleScheme();
    }
  }

  private static class ItemSearchResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<ItemSearchResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ItemSearchResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetItem()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetItem()) {
        {
          oprot.writeI32(struct.item.size());
          for (ShopItem _iter20 : struct.item)
          {
            _iter20.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ItemSearchResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.item = new java.util.ArrayList<ShopItem>(_list21.size);
          @org.apache.thrift.annotation.Nullable ShopItem _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = new ShopItem();
            _elem22.read(iprot);
            struct.item.add(_elem22);
          }
        }
        struct.setItemIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

