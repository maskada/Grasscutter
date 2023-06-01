// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonPlayerDieReq.proto

package emu.grasscutter.net.proto;

public final class DungeonPlayerDieReqOuterClass {
  private DungeonPlayerDieReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonPlayerDieReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonPlayerDieReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 9;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>.PlayerDieType die_type = 7;</code>
     * @return The enum numeric value on the wire for dieType.
     */
    int getDieTypeValue();
    /**
     * <code>.PlayerDieType die_type = 7;</code>
     * @return The dieType.
     */
    emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType getDieType();
  }
  /**
   * <pre>
   * CmdId: 994
   * Obf: JMLIFMDIDOM
   * </pre>
   *
   * Protobuf type {@code DungeonPlayerDieReq}
   */
  public static final class DungeonPlayerDieReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonPlayerDieReq)
      DungeonPlayerDieReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonPlayerDieReq.newBuilder() to construct.
    private DungeonPlayerDieReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonPlayerDieReq() {
      dieType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonPlayerDieReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonPlayerDieReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 56: {
              int rawValue = input.readEnum();

              dieType_ = rawValue;
              break;
            }
            case 72: {

              dungeonId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.internal_static_DungeonPlayerDieReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.internal_static_DungeonPlayerDieReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq.class, emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 9;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 9;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int DIE_TYPE_FIELD_NUMBER = 7;
    private int dieType_;
    /**
     * <code>.PlayerDieType die_type = 7;</code>
     * @return The enum numeric value on the wire for dieType.
     */
    @java.lang.Override public int getDieTypeValue() {
      return dieType_;
    }
    /**
     * <code>.PlayerDieType die_type = 7;</code>
     * @return The dieType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType getDieType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType result = emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType.valueOf(dieType_);
      return result == null ? emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (dieType_ != emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType.PLAYER_DIE_TYPE_NONE.getNumber()) {
        output.writeEnum(7, dieType_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(9, dungeonId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dieType_ != emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType.PLAYER_DIE_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, dieType_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, dungeonId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq other = (emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (dieType_ != other.dieType_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + DIE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + dieType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 994
     * Obf: JMLIFMDIDOM
     * </pre>
     *
     * Protobuf type {@code DungeonPlayerDieReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonPlayerDieReq)
        emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.internal_static_DungeonPlayerDieReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.internal_static_DungeonPlayerDieReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq.class, emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dungeonId_ = 0;

        dieType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.internal_static_DungeonPlayerDieReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq build() {
        emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq buildPartial() {
        emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq result = new emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq(this);
        result.dungeonId_ = dungeonId_;
        result.dieType_ = dieType_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq) {
          return mergeFrom((emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq other) {
        if (other == emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.dieType_ != 0) {
          setDieTypeValue(other.getDieTypeValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 9;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 9;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int dieType_ = 0;
      /**
       * <code>.PlayerDieType die_type = 7;</code>
       * @return The enum numeric value on the wire for dieType.
       */
      @java.lang.Override public int getDieTypeValue() {
        return dieType_;
      }
      /**
       * <code>.PlayerDieType die_type = 7;</code>
       * @param value The enum numeric value on the wire for dieType to set.
       * @return This builder for chaining.
       */
      public Builder setDieTypeValue(int value) {
        
        dieType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerDieType die_type = 7;</code>
       * @return The dieType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType getDieType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType result = emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType.valueOf(dieType_);
        return result == null ? emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType.UNRECOGNIZED : result;
      }
      /**
       * <code>.PlayerDieType die_type = 7;</code>
       * @param value The dieType to set.
       * @return This builder for chaining.
       */
      public Builder setDieType(emu.grasscutter.net.proto.PlayerDieTypeOuterClass.PlayerDieType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        dieType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerDieType die_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDieType() {
        
        dieType_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DungeonPlayerDieReq)
    }

    // @@protoc_insertion_point(class_scope:DungeonPlayerDieReq)
    private static final emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq();
    }

    public static emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonPlayerDieReq>
        PARSER = new com.google.protobuf.AbstractParser<DungeonPlayerDieReq>() {
      @java.lang.Override
      public DungeonPlayerDieReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonPlayerDieReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonPlayerDieReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonPlayerDieReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonPlayerDieReqOuterClass.DungeonPlayerDieReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonPlayerDieReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonPlayerDieReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031DungeonPlayerDieReq.proto\032\023PlayerDieTy" +
      "pe.proto\"K\n\023DungeonPlayerDieReq\022\022\n\ndunge" +
      "on_id\030\t \001(\r\022 \n\010die_type\030\007 \001(\0162\016.PlayerDi" +
      "eTypeB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PlayerDieTypeOuterClass.getDescriptor(),
        });
    internal_static_DungeonPlayerDieReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonPlayerDieReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonPlayerDieReq_descriptor,
        new java.lang.String[] { "DungeonId", "DieType", });
    emu.grasscutter.net.proto.PlayerDieTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
