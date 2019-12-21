/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.rev.thriftentity;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2019-12-22")
public class DrawState implements org.apache.thrift.TBase<DrawState, DrawState._Fields>, java.io.Serializable, Cloneable, Comparable<DrawState> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DrawState");

  private static final org.apache.thrift.protocol.TField SPRITE_DRAW_FIELD_DESC = new org.apache.thrift.protocol.TField("spriteDraw", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField SPRITE_UPDATE_FIELD_DESC = new org.apache.thrift.protocol.TField("spriteUpdate", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField SPRITE_VISIBLE_FIELD_DESC = new org.apache.thrift.protocol.TField("spriteVisible", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DrawStateStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DrawStateTupleSchemeFactory();

  public boolean spriteDraw; // required
  public boolean spriteUpdate; // required
  public boolean spriteVisible; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SPRITE_DRAW((short)1, "spriteDraw"),
    SPRITE_UPDATE((short)2, "spriteUpdate"),
    SPRITE_VISIBLE((short)3, "spriteVisible");

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
        case 1: // SPRITE_DRAW
          return SPRITE_DRAW;
        case 2: // SPRITE_UPDATE
          return SPRITE_UPDATE;
        case 3: // SPRITE_VISIBLE
          return SPRITE_VISIBLE;
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
  private static final int __SPRITEDRAW_ISSET_ID = 0;
  private static final int __SPRITEUPDATE_ISSET_ID = 1;
  private static final int __SPRITEVISIBLE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SPRITE_DRAW, new org.apache.thrift.meta_data.FieldMetaData("spriteDraw", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SPRITE_UPDATE, new org.apache.thrift.meta_data.FieldMetaData("spriteUpdate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SPRITE_VISIBLE, new org.apache.thrift.meta_data.FieldMetaData("spriteVisible", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DrawState.class, metaDataMap);
  }

  public DrawState() {
  }

  public DrawState(
    boolean spriteDraw,
    boolean spriteUpdate,
    boolean spriteVisible)
  {
    this();
    this.spriteDraw = spriteDraw;
    setSpriteDrawIsSet(true);
    this.spriteUpdate = spriteUpdate;
    setSpriteUpdateIsSet(true);
    this.spriteVisible = spriteVisible;
    setSpriteVisibleIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DrawState(DrawState other) {
    __isset_bitfield = other.__isset_bitfield;
    this.spriteDraw = other.spriteDraw;
    this.spriteUpdate = other.spriteUpdate;
    this.spriteVisible = other.spriteVisible;
  }

  public DrawState deepCopy() {
    return new DrawState(this);
  }

  @Override
  public void clear() {
    setSpriteDrawIsSet(false);
    this.spriteDraw = false;
    setSpriteUpdateIsSet(false);
    this.spriteUpdate = false;
    setSpriteVisibleIsSet(false);
    this.spriteVisible = false;
  }

  public boolean isSpriteDraw() {
    return this.spriteDraw;
  }

  public DrawState setSpriteDraw(boolean spriteDraw) {
    this.spriteDraw = spriteDraw;
    setSpriteDrawIsSet(true);
    return this;
  }

  public void unsetSpriteDraw() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SPRITEDRAW_ISSET_ID);
  }

  /** Returns true if field spriteDraw is set (has been assigned a value) and false otherwise */
  public boolean isSetSpriteDraw() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SPRITEDRAW_ISSET_ID);
  }

  public void setSpriteDrawIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SPRITEDRAW_ISSET_ID, value);
  }

  public boolean isSpriteUpdate() {
    return this.spriteUpdate;
  }

  public DrawState setSpriteUpdate(boolean spriteUpdate) {
    this.spriteUpdate = spriteUpdate;
    setSpriteUpdateIsSet(true);
    return this;
  }

  public void unsetSpriteUpdate() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SPRITEUPDATE_ISSET_ID);
  }

  /** Returns true if field spriteUpdate is set (has been assigned a value) and false otherwise */
  public boolean isSetSpriteUpdate() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SPRITEUPDATE_ISSET_ID);
  }

  public void setSpriteUpdateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SPRITEUPDATE_ISSET_ID, value);
  }

  public boolean isSpriteVisible() {
    return this.spriteVisible;
  }

  public DrawState setSpriteVisible(boolean spriteVisible) {
    this.spriteVisible = spriteVisible;
    setSpriteVisibleIsSet(true);
    return this;
  }

  public void unsetSpriteVisible() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SPRITEVISIBLE_ISSET_ID);
  }

  /** Returns true if field spriteVisible is set (has been assigned a value) and false otherwise */
  public boolean isSetSpriteVisible() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SPRITEVISIBLE_ISSET_ID);
  }

  public void setSpriteVisibleIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SPRITEVISIBLE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SPRITE_DRAW:
      if (value == null) {
        unsetSpriteDraw();
      } else {
        setSpriteDraw((java.lang.Boolean)value);
      }
      break;

    case SPRITE_UPDATE:
      if (value == null) {
        unsetSpriteUpdate();
      } else {
        setSpriteUpdate((java.lang.Boolean)value);
      }
      break;

    case SPRITE_VISIBLE:
      if (value == null) {
        unsetSpriteVisible();
      } else {
        setSpriteVisible((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SPRITE_DRAW:
      return isSpriteDraw();

    case SPRITE_UPDATE:
      return isSpriteUpdate();

    case SPRITE_VISIBLE:
      return isSpriteVisible();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SPRITE_DRAW:
      return isSetSpriteDraw();
    case SPRITE_UPDATE:
      return isSetSpriteUpdate();
    case SPRITE_VISIBLE:
      return isSetSpriteVisible();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof DrawState)
      return this.equals((DrawState)that);
    return false;
  }

  public boolean equals(DrawState that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_spriteDraw = true;
    boolean that_present_spriteDraw = true;
    if (this_present_spriteDraw || that_present_spriteDraw) {
      if (!(this_present_spriteDraw && that_present_spriteDraw))
        return false;
      if (this.spriteDraw != that.spriteDraw)
        return false;
    }

    boolean this_present_spriteUpdate = true;
    boolean that_present_spriteUpdate = true;
    if (this_present_spriteUpdate || that_present_spriteUpdate) {
      if (!(this_present_spriteUpdate && that_present_spriteUpdate))
        return false;
      if (this.spriteUpdate != that.spriteUpdate)
        return false;
    }

    boolean this_present_spriteVisible = true;
    boolean that_present_spriteVisible = true;
    if (this_present_spriteVisible || that_present_spriteVisible) {
      if (!(this_present_spriteVisible && that_present_spriteVisible))
        return false;
      if (this.spriteVisible != that.spriteVisible)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((spriteDraw) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((spriteUpdate) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((spriteVisible) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(DrawState other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSpriteDraw()).compareTo(other.isSetSpriteDraw());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpriteDraw()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.spriteDraw, other.spriteDraw);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSpriteUpdate()).compareTo(other.isSetSpriteUpdate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpriteUpdate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.spriteUpdate, other.spriteUpdate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSpriteVisible()).compareTo(other.isSetSpriteVisible());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpriteVisible()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.spriteVisible, other.spriteVisible);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DrawState(");
    boolean first = true;

    sb.append("spriteDraw:");
    sb.append(this.spriteDraw);
    first = false;
    if (!first) sb.append(", ");
    sb.append("spriteUpdate:");
    sb.append(this.spriteUpdate);
    first = false;
    if (!first) sb.append(", ");
    sb.append("spriteVisible:");
    sb.append(this.spriteVisible);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DrawStateStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DrawStateStandardScheme getScheme() {
      return new DrawStateStandardScheme();
    }
  }

  private static class DrawStateStandardScheme extends org.apache.thrift.scheme.StandardScheme<DrawState> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DrawState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SPRITE_DRAW
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.spriteDraw = iprot.readBool();
              struct.setSpriteDrawIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SPRITE_UPDATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.spriteUpdate = iprot.readBool();
              struct.setSpriteUpdateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SPRITE_VISIBLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.spriteVisible = iprot.readBool();
              struct.setSpriteVisibleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DrawState struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SPRITE_DRAW_FIELD_DESC);
      oprot.writeBool(struct.spriteDraw);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SPRITE_UPDATE_FIELD_DESC);
      oprot.writeBool(struct.spriteUpdate);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SPRITE_VISIBLE_FIELD_DESC);
      oprot.writeBool(struct.spriteVisible);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DrawStateTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DrawStateTupleScheme getScheme() {
      return new DrawStateTupleScheme();
    }
  }

  private static class DrawStateTupleScheme extends org.apache.thrift.scheme.TupleScheme<DrawState> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DrawState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSpriteDraw()) {
        optionals.set(0);
      }
      if (struct.isSetSpriteUpdate()) {
        optionals.set(1);
      }
      if (struct.isSetSpriteVisible()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSpriteDraw()) {
        oprot.writeBool(struct.spriteDraw);
      }
      if (struct.isSetSpriteUpdate()) {
        oprot.writeBool(struct.spriteUpdate);
      }
      if (struct.isSetSpriteVisible()) {
        oprot.writeBool(struct.spriteVisible);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DrawState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.spriteDraw = iprot.readBool();
        struct.setSpriteDrawIsSet(true);
      }
      if (incoming.get(1)) {
        struct.spriteUpdate = iprot.readBool();
        struct.setSpriteUpdateIsSet(true);
      }
      if (incoming.get(2)) {
        struct.spriteVisible = iprot.readBool();
        struct.setSpriteVisibleIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

