// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CKBNKFFKGMA.proto

package emu.grasscutter.net.proto;

public final class CKBNKFFKGMAOuterClass {
  private CKBNKFFKGMAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CKBNKFFKGMAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CKBNKFFKGMA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
     * @return Whether the nKNMKOLGKFD field is set.
     */
    boolean hasNKNMKOLGKFD();
    /**
     * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
     * @return The nKNMKOLGKFD.
     */
    emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP getNKNMKOLGKFD();
    /**
     * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
     */
    emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPPOrBuilder getNKNMKOLGKFDOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 9298
   * </pre>
   *
   * Protobuf type {@code CKBNKFFKGMA}
   */
  public static final class CKBNKFFKGMA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CKBNKFFKGMA)
      CKBNKFFKGMAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CKBNKFFKGMA.newBuilder() to construct.
    private CKBNKFFKGMA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CKBNKFFKGMA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CKBNKFFKGMA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CKBNKFFKGMA(
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
            case 114: {
              emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.Builder subBuilder = null;
              if (nKNMKOLGKFD_ != null) {
                subBuilder = nKNMKOLGKFD_.toBuilder();
              }
              nKNMKOLGKFD_ = input.readMessage(emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(nKNMKOLGKFD_);
                nKNMKOLGKFD_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.internal_static_CKBNKFFKGMA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.internal_static_CKBNKFFKGMA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA.class, emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA.Builder.class);
    }

    public static final int NKNMKOLGKFD_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP nKNMKOLGKFD_;
    /**
     * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
     * @return Whether the nKNMKOLGKFD field is set.
     */
    @java.lang.Override
    public boolean hasNKNMKOLGKFD() {
      return nKNMKOLGKFD_ != null;
    }
    /**
     * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
     * @return The nKNMKOLGKFD.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP getNKNMKOLGKFD() {
      return nKNMKOLGKFD_ == null ? emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.getDefaultInstance() : nKNMKOLGKFD_;
    }
    /**
     * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPPOrBuilder getNKNMKOLGKFDOrBuilder() {
      return getNKNMKOLGKFD();
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
      if (nKNMKOLGKFD_ != null) {
        output.writeMessage(14, getNKNMKOLGKFD());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nKNMKOLGKFD_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getNKNMKOLGKFD());
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
      if (!(obj instanceof emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA other = (emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA) obj;

      if (hasNKNMKOLGKFD() != other.hasNKNMKOLGKFD()) return false;
      if (hasNKNMKOLGKFD()) {
        if (!getNKNMKOLGKFD()
            .equals(other.getNKNMKOLGKFD())) return false;
      }
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
      if (hasNKNMKOLGKFD()) {
        hash = (37 * hash) + NKNMKOLGKFD_FIELD_NUMBER;
        hash = (53 * hash) + getNKNMKOLGKFD().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA prototype) {
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
     * CmdId: 9298
     * </pre>
     *
     * Protobuf type {@code CKBNKFFKGMA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CKBNKFFKGMA)
        emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.internal_static_CKBNKFFKGMA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.internal_static_CKBNKFFKGMA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA.class, emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA.newBuilder()
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
        if (nKNMKOLGKFDBuilder_ == null) {
          nKNMKOLGKFD_ = null;
        } else {
          nKNMKOLGKFD_ = null;
          nKNMKOLGKFDBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.internal_static_CKBNKFFKGMA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA build() {
        emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA buildPartial() {
        emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA result = new emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA(this);
        if (nKNMKOLGKFDBuilder_ == null) {
          result.nKNMKOLGKFD_ = nKNMKOLGKFD_;
        } else {
          result.nKNMKOLGKFD_ = nKNMKOLGKFDBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA) {
          return mergeFrom((emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA other) {
        if (other == emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA.getDefaultInstance()) return this;
        if (other.hasNKNMKOLGKFD()) {
          mergeNKNMKOLGKFD(other.getNKNMKOLGKFD());
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
        emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP nKNMKOLGKFD_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP, emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.Builder, emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPPOrBuilder> nKNMKOLGKFDBuilder_;
      /**
       * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
       * @return Whether the nKNMKOLGKFD field is set.
       */
      public boolean hasNKNMKOLGKFD() {
        return nKNMKOLGKFDBuilder_ != null || nKNMKOLGKFD_ != null;
      }
      /**
       * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
       * @return The nKNMKOLGKFD.
       */
      public emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP getNKNMKOLGKFD() {
        if (nKNMKOLGKFDBuilder_ == null) {
          return nKNMKOLGKFD_ == null ? emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.getDefaultInstance() : nKNMKOLGKFD_;
        } else {
          return nKNMKOLGKFDBuilder_.getMessage();
        }
      }
      /**
       * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
       */
      public Builder setNKNMKOLGKFD(emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP value) {
        if (nKNMKOLGKFDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          nKNMKOLGKFD_ = value;
          onChanged();
        } else {
          nKNMKOLGKFDBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
       */
      public Builder setNKNMKOLGKFD(
          emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.Builder builderForValue) {
        if (nKNMKOLGKFDBuilder_ == null) {
          nKNMKOLGKFD_ = builderForValue.build();
          onChanged();
        } else {
          nKNMKOLGKFDBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
       */
      public Builder mergeNKNMKOLGKFD(emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP value) {
        if (nKNMKOLGKFDBuilder_ == null) {
          if (nKNMKOLGKFD_ != null) {
            nKNMKOLGKFD_ =
              emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.newBuilder(nKNMKOLGKFD_).mergeFrom(value).buildPartial();
          } else {
            nKNMKOLGKFD_ = value;
          }
          onChanged();
        } else {
          nKNMKOLGKFDBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
       */
      public Builder clearNKNMKOLGKFD() {
        if (nKNMKOLGKFDBuilder_ == null) {
          nKNMKOLGKFD_ = null;
          onChanged();
        } else {
          nKNMKOLGKFD_ = null;
          nKNMKOLGKFDBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
       */
      public emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.Builder getNKNMKOLGKFDBuilder() {
        
        onChanged();
        return getNKNMKOLGKFDFieldBuilder().getBuilder();
      }
      /**
       * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
       */
      public emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPPOrBuilder getNKNMKOLGKFDOrBuilder() {
        if (nKNMKOLGKFDBuilder_ != null) {
          return nKNMKOLGKFDBuilder_.getMessageOrBuilder();
        } else {
          return nKNMKOLGKFD_ == null ?
              emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.getDefaultInstance() : nKNMKOLGKFD_;
        }
      }
      /**
       * <code>.LLOOADCMMPP NKNMKOLGKFD = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP, emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.Builder, emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPPOrBuilder> 
          getNKNMKOLGKFDFieldBuilder() {
        if (nKNMKOLGKFDBuilder_ == null) {
          nKNMKOLGKFDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP, emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.Builder, emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPPOrBuilder>(
                  getNKNMKOLGKFD(),
                  getParentForChildren(),
                  isClean());
          nKNMKOLGKFD_ = null;
        }
        return nKNMKOLGKFDBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CKBNKFFKGMA)
    }

    // @@protoc_insertion_point(class_scope:CKBNKFFKGMA)
    private static final emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA();
    }

    public static emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CKBNKFFKGMA>
        PARSER = new com.google.protobuf.AbstractParser<CKBNKFFKGMA>() {
      @java.lang.Override
      public CKBNKFFKGMA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CKBNKFFKGMA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CKBNKFFKGMA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CKBNKFFKGMA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CKBNKFFKGMAOuterClass.CKBNKFFKGMA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CKBNKFFKGMA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CKBNKFFKGMA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CKBNKFFKGMA.proto\032\021LLOOADCMMPP.proto\"0" +
      "\n\013CKBNKFFKGMA\022!\n\013NKNMKOLGKFD\030\016 \001(\0132\014.LLO" +
      "OADCMMPPB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.getDescriptor(),
        });
    internal_static_CKBNKFFKGMA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CKBNKFFKGMA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CKBNKFFKGMA_descriptor,
        new java.lang.String[] { "NKNMKOLGKFD", });
    emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
