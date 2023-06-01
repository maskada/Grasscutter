// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageMarketStoreViewStrategyReq.proto

package emu.grasscutter.net.proto;

public final class VintageMarketStoreViewStrategyReqOuterClass {
  private VintageMarketStoreViewStrategyReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageMarketStoreViewStrategyReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageMarketStoreViewStrategyReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 strategy_id = 2;</code>
     * @return The strategyId.
     */
    int getStrategyId();

    /**
     * <code>repeated uint32 strategy_list = 13;</code>
     * @return A list containing the strategyList.
     */
    java.util.List<java.lang.Integer> getStrategyListList();
    /**
     * <code>repeated uint32 strategy_list = 13;</code>
     * @return The count of strategyList.
     */
    int getStrategyListCount();
    /**
     * <code>repeated uint32 strategy_list = 13;</code>
     * @param index The index of the element to return.
     * @return The strategyList at the given index.
     */
    int getStrategyList(int index);
  }
  /**
   * <pre>
   * CmdId: 21521
   * Obf: FMKDOMIHJDP
   * </pre>
   *
   * Protobuf type {@code VintageMarketStoreViewStrategyReq}
   */
  public static final class VintageMarketStoreViewStrategyReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageMarketStoreViewStrategyReq)
      VintageMarketStoreViewStrategyReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageMarketStoreViewStrategyReq.newBuilder() to construct.
    private VintageMarketStoreViewStrategyReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageMarketStoreViewStrategyReq() {
      strategyList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageMarketStoreViewStrategyReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintageMarketStoreViewStrategyReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 16: {

              strategyId_ = input.readUInt32();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                strategyList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              strategyList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                strategyList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                strategyList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          strategyList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.internal_static_VintageMarketStoreViewStrategyReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.internal_static_VintageMarketStoreViewStrategyReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq.class, emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq.Builder.class);
    }

    public static final int STRATEGY_ID_FIELD_NUMBER = 2;
    private int strategyId_;
    /**
     * <code>uint32 strategy_id = 2;</code>
     * @return The strategyId.
     */
    @java.lang.Override
    public int getStrategyId() {
      return strategyId_;
    }

    public static final int STRATEGY_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList strategyList_;
    /**
     * <code>repeated uint32 strategy_list = 13;</code>
     * @return A list containing the strategyList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getStrategyListList() {
      return strategyList_;
    }
    /**
     * <code>repeated uint32 strategy_list = 13;</code>
     * @return The count of strategyList.
     */
    public int getStrategyListCount() {
      return strategyList_.size();
    }
    /**
     * <code>repeated uint32 strategy_list = 13;</code>
     * @param index The index of the element to return.
     * @return The strategyList at the given index.
     */
    public int getStrategyList(int index) {
      return strategyList_.getInt(index);
    }
    private int strategyListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (strategyId_ != 0) {
        output.writeUInt32(2, strategyId_);
      }
      if (getStrategyListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(strategyListMemoizedSerializedSize);
      }
      for (int i = 0; i < strategyList_.size(); i++) {
        output.writeUInt32NoTag(strategyList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (strategyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, strategyId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < strategyList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(strategyList_.getInt(i));
        }
        size += dataSize;
        if (!getStrategyListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        strategyListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq other = (emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq) obj;

      if (getStrategyId()
          != other.getStrategyId()) return false;
      if (!getStrategyListList()
          .equals(other.getStrategyListList())) return false;
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
      hash = (37 * hash) + STRATEGY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStrategyId();
      if (getStrategyListCount() > 0) {
        hash = (37 * hash) + STRATEGY_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getStrategyListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq prototype) {
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
     * CmdId: 21521
     * Obf: FMKDOMIHJDP
     * </pre>
     *
     * Protobuf type {@code VintageMarketStoreViewStrategyReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageMarketStoreViewStrategyReq)
        emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.internal_static_VintageMarketStoreViewStrategyReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.internal_static_VintageMarketStoreViewStrategyReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq.class, emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq.newBuilder()
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
        strategyId_ = 0;

        strategyList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.internal_static_VintageMarketStoreViewStrategyReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq build() {
        emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq buildPartial() {
        emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq result = new emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq(this);
        int from_bitField0_ = bitField0_;
        result.strategyId_ = strategyId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          strategyList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.strategyList_ = strategyList_;
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
        if (other instanceof emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq) {
          return mergeFrom((emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq other) {
        if (other == emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq.getDefaultInstance()) return this;
        if (other.getStrategyId() != 0) {
          setStrategyId(other.getStrategyId());
        }
        if (!other.strategyList_.isEmpty()) {
          if (strategyList_.isEmpty()) {
            strategyList_ = other.strategyList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStrategyListIsMutable();
            strategyList_.addAll(other.strategyList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int strategyId_ ;
      /**
       * <code>uint32 strategy_id = 2;</code>
       * @return The strategyId.
       */
      @java.lang.Override
      public int getStrategyId() {
        return strategyId_;
      }
      /**
       * <code>uint32 strategy_id = 2;</code>
       * @param value The strategyId to set.
       * @return This builder for chaining.
       */
      public Builder setStrategyId(int value) {
        
        strategyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 strategy_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStrategyId() {
        
        strategyId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList strategyList_ = emptyIntList();
      private void ensureStrategyListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          strategyList_ = mutableCopy(strategyList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 strategy_list = 13;</code>
       * @return A list containing the strategyList.
       */
      public java.util.List<java.lang.Integer>
          getStrategyListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(strategyList_) : strategyList_;
      }
      /**
       * <code>repeated uint32 strategy_list = 13;</code>
       * @return The count of strategyList.
       */
      public int getStrategyListCount() {
        return strategyList_.size();
      }
      /**
       * <code>repeated uint32 strategy_list = 13;</code>
       * @param index The index of the element to return.
       * @return The strategyList at the given index.
       */
      public int getStrategyList(int index) {
        return strategyList_.getInt(index);
      }
      /**
       * <code>repeated uint32 strategy_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The strategyList to set.
       * @return This builder for chaining.
       */
      public Builder setStrategyList(
          int index, int value) {
        ensureStrategyListIsMutable();
        strategyList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 strategy_list = 13;</code>
       * @param value The strategyList to add.
       * @return This builder for chaining.
       */
      public Builder addStrategyList(int value) {
        ensureStrategyListIsMutable();
        strategyList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 strategy_list = 13;</code>
       * @param values The strategyList to add.
       * @return This builder for chaining.
       */
      public Builder addAllStrategyList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureStrategyListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, strategyList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 strategy_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearStrategyList() {
        strategyList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:VintageMarketStoreViewStrategyReq)
    }

    // @@protoc_insertion_point(class_scope:VintageMarketStoreViewStrategyReq)
    private static final emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq();
    }

    public static emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageMarketStoreViewStrategyReq>
        PARSER = new com.google.protobuf.AbstractParser<VintageMarketStoreViewStrategyReq>() {
      @java.lang.Override
      public VintageMarketStoreViewStrategyReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintageMarketStoreViewStrategyReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintageMarketStoreViewStrategyReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageMarketStoreViewStrategyReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VintageMarketStoreViewStrategyReqOuterClass.VintageMarketStoreViewStrategyReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageMarketStoreViewStrategyReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageMarketStoreViewStrategyReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'VintageMarketStoreViewStrategyReq.prot" +
      "o\"O\n!VintageMarketStoreViewStrategyReq\022\023" +
      "\n\013strategy_id\030\002 \001(\r\022\025\n\rstrategy_list\030\r \003" +
      "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageMarketStoreViewStrategyReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageMarketStoreViewStrategyReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageMarketStoreViewStrategyReq_descriptor,
        new java.lang.String[] { "StrategyId", "StrategyList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
