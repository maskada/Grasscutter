// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NightCrowGadgetObservationMatchReq.proto

package emu.grasscutter.net.proto;

public final class NightCrowGadgetObservationMatchReqOuterClass {
  private NightCrowGadgetObservationMatchReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NightCrowGadgetObservationMatchReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NightCrowGadgetObservationMatchReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_gadget_state = 13;</code>
     * @return The targetGadgetState.
     */
    int getTargetGadgetState();

    /**
     * <code>uint32 gadget_entity_id = 14;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();
  }
  /**
   * <pre>
   * CmdId: 846
   * Obf: HPGAIHKJJJI
   * </pre>
   *
   * Protobuf type {@code NightCrowGadgetObservationMatchReq}
   */
  public static final class NightCrowGadgetObservationMatchReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NightCrowGadgetObservationMatchReq)
      NightCrowGadgetObservationMatchReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NightCrowGadgetObservationMatchReq.newBuilder() to construct.
    private NightCrowGadgetObservationMatchReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NightCrowGadgetObservationMatchReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NightCrowGadgetObservationMatchReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NightCrowGadgetObservationMatchReq(
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
            case 104: {

              targetGadgetState_ = input.readUInt32();
              break;
            }
            case 112: {

              gadgetEntityId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.internal_static_NightCrowGadgetObservationMatchReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.internal_static_NightCrowGadgetObservationMatchReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq.class, emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq.Builder.class);
    }

    public static final int TARGET_GADGET_STATE_FIELD_NUMBER = 13;
    private int targetGadgetState_;
    /**
     * <code>uint32 target_gadget_state = 13;</code>
     * @return The targetGadgetState.
     */
    @java.lang.Override
    public int getTargetGadgetState() {
      return targetGadgetState_;
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 14;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 14;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
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
      if (targetGadgetState_ != 0) {
        output.writeUInt32(13, targetGadgetState_);
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(14, gadgetEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetGadgetState_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, targetGadgetState_);
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, gadgetEntityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq other = (emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq) obj;

      if (getTargetGadgetState()
          != other.getTargetGadgetState()) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
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
      hash = (37 * hash) + TARGET_GADGET_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getTargetGadgetState();
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq prototype) {
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
     * CmdId: 846
     * Obf: HPGAIHKJJJI
     * </pre>
     *
     * Protobuf type {@code NightCrowGadgetObservationMatchReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NightCrowGadgetObservationMatchReq)
        emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.internal_static_NightCrowGadgetObservationMatchReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.internal_static_NightCrowGadgetObservationMatchReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq.class, emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq.newBuilder()
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
        targetGadgetState_ = 0;

        gadgetEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.internal_static_NightCrowGadgetObservationMatchReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq build() {
        emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq buildPartial() {
        emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq result = new emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq(this);
        result.targetGadgetState_ = targetGadgetState_;
        result.gadgetEntityId_ = gadgetEntityId_;
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
        if (other instanceof emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq) {
          return mergeFrom((emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq other) {
        if (other == emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq.getDefaultInstance()) return this;
        if (other.getTargetGadgetState() != 0) {
          setTargetGadgetState(other.getTargetGadgetState());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
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
        emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int targetGadgetState_ ;
      /**
       * <code>uint32 target_gadget_state = 13;</code>
       * @return The targetGadgetState.
       */
      @java.lang.Override
      public int getTargetGadgetState() {
        return targetGadgetState_;
      }
      /**
       * <code>uint32 target_gadget_state = 13;</code>
       * @param value The targetGadgetState to set.
       * @return This builder for chaining.
       */
      public Builder setTargetGadgetState(int value) {
        
        targetGadgetState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_gadget_state = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetGadgetState() {
        
        targetGadgetState_ = 0;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 14;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 14;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:NightCrowGadgetObservationMatchReq)
    }

    // @@protoc_insertion_point(class_scope:NightCrowGadgetObservationMatchReq)
    private static final emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq();
    }

    public static emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NightCrowGadgetObservationMatchReq>
        PARSER = new com.google.protobuf.AbstractParser<NightCrowGadgetObservationMatchReq>() {
      @java.lang.Override
      public NightCrowGadgetObservationMatchReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NightCrowGadgetObservationMatchReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NightCrowGadgetObservationMatchReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NightCrowGadgetObservationMatchReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NightCrowGadgetObservationMatchReqOuterClass.NightCrowGadgetObservationMatchReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NightCrowGadgetObservationMatchReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NightCrowGadgetObservationMatchReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(NightCrowGadgetObservationMatchReq.pro" +
      "to\"[\n\"NightCrowGadgetObservationMatchReq" +
      "\022\033\n\023target_gadget_state\030\r \001(\r\022\030\n\020gadget_" +
      "entity_id\030\016 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NightCrowGadgetObservationMatchReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NightCrowGadgetObservationMatchReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NightCrowGadgetObservationMatchReq_descriptor,
        new java.lang.String[] { "TargetGadgetState", "GadgetEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
