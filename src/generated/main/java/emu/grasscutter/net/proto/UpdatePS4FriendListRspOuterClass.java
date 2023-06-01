// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UpdatePS4FriendListRsp.proto

package emu.grasscutter.net.proto;

public final class UpdatePS4FriendListRspOuterClass {
  private UpdatePS4FriendListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdatePS4FriendListRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UpdatePS4FriendListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string psn_id_list = 15;</code>
     * @return A list containing the psnIdList.
     */
    java.util.List<java.lang.String>
        getPsnIdListList();
    /**
     * <code>repeated string psn_id_list = 15;</code>
     * @return The count of psnIdList.
     */
    int getPsnIdListCount();
    /**
     * <code>repeated string psn_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The psnIdList at the given index.
     */
    java.lang.String getPsnIdList(int index);
    /**
     * <code>repeated string psn_id_list = 15;</code>
     * @param index The index of the value to return.
     * @return The bytes of the psnIdList at the given index.
     */
    com.google.protobuf.ByteString
        getPsnIdListBytes(int index);

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 4040
   * Obf: ECHCGDJNBDG
   * </pre>
   *
   * Protobuf type {@code UpdatePS4FriendListRsp}
   */
  public static final class UpdatePS4FriendListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UpdatePS4FriendListRsp)
      UpdatePS4FriendListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdatePS4FriendListRsp.newBuilder() to construct.
    private UpdatePS4FriendListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdatePS4FriendListRsp() {
      psnIdList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UpdatePS4FriendListRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UpdatePS4FriendListRsp(
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
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 122: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                psnIdList_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              psnIdList_.add(s);
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
          psnIdList_ = psnIdList_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.internal_static_UpdatePS4FriendListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.internal_static_UpdatePS4FriendListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp.class, emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp.Builder.class);
    }

    public static final int PSN_ID_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.LazyStringList psnIdList_;
    /**
     * <code>repeated string psn_id_list = 15;</code>
     * @return A list containing the psnIdList.
     */
    public com.google.protobuf.ProtocolStringList
        getPsnIdListList() {
      return psnIdList_;
    }
    /**
     * <code>repeated string psn_id_list = 15;</code>
     * @return The count of psnIdList.
     */
    public int getPsnIdListCount() {
      return psnIdList_.size();
    }
    /**
     * <code>repeated string psn_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The psnIdList at the given index.
     */
    public java.lang.String getPsnIdList(int index) {
      return psnIdList_.get(index);
    }
    /**
     * <code>repeated string psn_id_list = 15;</code>
     * @param index The index of the value to return.
     * @return The bytes of the psnIdList at the given index.
     */
    public com.google.protobuf.ByteString
        getPsnIdListBytes(int index) {
      return psnIdList_.getByteString(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      for (int i = 0; i < psnIdList_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 15, psnIdList_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < psnIdList_.size(); i++) {
          dataSize += computeStringSizeNoTag(psnIdList_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getPsnIdListList().size();
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
      if (!(obj instanceof emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp other = (emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp) obj;

      if (!getPsnIdListList()
          .equals(other.getPsnIdListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getPsnIdListCount() > 0) {
        hash = (37 * hash) + PSN_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPsnIdListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp prototype) {
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
     * CmdId: 4040
     * Obf: ECHCGDJNBDG
     * </pre>
     *
     * Protobuf type {@code UpdatePS4FriendListRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UpdatePS4FriendListRsp)
        emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.internal_static_UpdatePS4FriendListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.internal_static_UpdatePS4FriendListRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp.class, emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp.newBuilder()
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
        psnIdList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.internal_static_UpdatePS4FriendListRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp build() {
        emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp buildPartial() {
        emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp result = new emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          psnIdList_ = psnIdList_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.psnIdList_ = psnIdList_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp) {
          return mergeFrom((emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp other) {
        if (other == emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp.getDefaultInstance()) return this;
        if (!other.psnIdList_.isEmpty()) {
          if (psnIdList_.isEmpty()) {
            psnIdList_ = other.psnIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePsnIdListIsMutable();
            psnIdList_.addAll(other.psnIdList_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.LazyStringList psnIdList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensurePsnIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          psnIdList_ = new com.google.protobuf.LazyStringArrayList(psnIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string psn_id_list = 15;</code>
       * @return A list containing the psnIdList.
       */
      public com.google.protobuf.ProtocolStringList
          getPsnIdListList() {
        return psnIdList_.getUnmodifiableView();
      }
      /**
       * <code>repeated string psn_id_list = 15;</code>
       * @return The count of psnIdList.
       */
      public int getPsnIdListCount() {
        return psnIdList_.size();
      }
      /**
       * <code>repeated string psn_id_list = 15;</code>
       * @param index The index of the element to return.
       * @return The psnIdList at the given index.
       */
      public java.lang.String getPsnIdList(int index) {
        return psnIdList_.get(index);
      }
      /**
       * <code>repeated string psn_id_list = 15;</code>
       * @param index The index of the value to return.
       * @return The bytes of the psnIdList at the given index.
       */
      public com.google.protobuf.ByteString
          getPsnIdListBytes(int index) {
        return psnIdList_.getByteString(index);
      }
      /**
       * <code>repeated string psn_id_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The psnIdList to set.
       * @return This builder for chaining.
       */
      public Builder setPsnIdList(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensurePsnIdListIsMutable();
        psnIdList_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string psn_id_list = 15;</code>
       * @param value The psnIdList to add.
       * @return This builder for chaining.
       */
      public Builder addPsnIdList(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensurePsnIdListIsMutable();
        psnIdList_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string psn_id_list = 15;</code>
       * @param values The psnIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllPsnIdList(
          java.lang.Iterable<java.lang.String> values) {
        ensurePsnIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, psnIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string psn_id_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearPsnIdList() {
        psnIdList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string psn_id_list = 15;</code>
       * @param value The bytes of the psnIdList to add.
       * @return This builder for chaining.
       */
      public Builder addPsnIdListBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensurePsnIdListIsMutable();
        psnIdList_.add(value);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:UpdatePS4FriendListRsp)
    }

    // @@protoc_insertion_point(class_scope:UpdatePS4FriendListRsp)
    private static final emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp();
    }

    public static emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdatePS4FriendListRsp>
        PARSER = new com.google.protobuf.AbstractParser<UpdatePS4FriendListRsp>() {
      @java.lang.Override
      public UpdatePS4FriendListRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdatePS4FriendListRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UpdatePS4FriendListRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdatePS4FriendListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdatePS4FriendListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdatePS4FriendListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034UpdatePS4FriendListRsp.proto\">\n\026Update" +
      "PS4FriendListRsp\022\023\n\013psn_id_list\030\017 \003(\t\022\017\n" +
      "\007retcode\030\010 \001(\005B\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UpdatePS4FriendListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpdatePS4FriendListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdatePS4FriendListRsp_descriptor,
        new java.lang.String[] { "PsnIdList", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
