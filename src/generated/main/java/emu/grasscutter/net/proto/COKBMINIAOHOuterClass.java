// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: COKBMINIAOH.proto

package emu.grasscutter.net.proto;

public final class COKBMINIAOHOuterClass {
  private COKBMINIAOHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface COKBMINIAOHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:COKBMINIAOH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 14;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
     * @return Whether the gMOHFGOJCBB field is set.
     */
    boolean hasGMOHFGOJCBB();
    /**
     * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
     * @return The gMOHFGOJCBB.
     */
    emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO getGMOHFGOJCBB();
    /**
     * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
     */
    emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJOOrBuilder getGMOHFGOJCBBOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 1045
   * </pre>
   *
   * Protobuf type {@code COKBMINIAOH}
   */
  public static final class COKBMINIAOH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:COKBMINIAOH)
      COKBMINIAOHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use COKBMINIAOH.newBuilder() to construct.
    private COKBMINIAOH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private COKBMINIAOH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new COKBMINIAOH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private COKBMINIAOH(
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
            case 42: {
              emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO.Builder subBuilder = null;
              if (gMOHFGOJCBB_ != null) {
                subBuilder = gMOHFGOJCBB_.toBuilder();
              }
              gMOHFGOJCBB_ = input.readMessage(emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gMOHFGOJCBB_);
                gMOHFGOJCBB_ = subBuilder.buildPartial();
              }

              break;
            }
            case 112: {

              galleryId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.COKBMINIAOHOuterClass.internal_static_COKBMINIAOH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.COKBMINIAOHOuterClass.internal_static_COKBMINIAOH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH.class, emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 14;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 14;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int GMOHFGOJCBB_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO gMOHFGOJCBB_;
    /**
     * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
     * @return Whether the gMOHFGOJCBB field is set.
     */
    @java.lang.Override
    public boolean hasGMOHFGOJCBB() {
      return gMOHFGOJCBB_ != null;
    }
    /**
     * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
     * @return The gMOHFGOJCBB.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO getGMOHFGOJCBB() {
      return gMOHFGOJCBB_ == null ? emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO.getDefaultInstance() : gMOHFGOJCBB_;
    }
    /**
     * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJOOrBuilder getGMOHFGOJCBBOrBuilder() {
      return getGMOHFGOJCBB();
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
      if (gMOHFGOJCBB_ != null) {
        output.writeMessage(5, getGMOHFGOJCBB());
      }
      if (galleryId_ != 0) {
        output.writeUInt32(14, galleryId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gMOHFGOJCBB_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getGMOHFGOJCBB());
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, galleryId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH other = (emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (hasGMOHFGOJCBB() != other.hasGMOHFGOJCBB()) return false;
      if (hasGMOHFGOJCBB()) {
        if (!getGMOHFGOJCBB()
            .equals(other.getGMOHFGOJCBB())) return false;
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
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      if (hasGMOHFGOJCBB()) {
        hash = (37 * hash) + GMOHFGOJCBB_FIELD_NUMBER;
        hash = (53 * hash) + getGMOHFGOJCBB().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH prototype) {
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
     * CmdId: 1045
     * </pre>
     *
     * Protobuf type {@code COKBMINIAOH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:COKBMINIAOH)
        emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.COKBMINIAOHOuterClass.internal_static_COKBMINIAOH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.COKBMINIAOHOuterClass.internal_static_COKBMINIAOH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH.class, emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH.newBuilder()
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
        galleryId_ = 0;

        if (gMOHFGOJCBBBuilder_ == null) {
          gMOHFGOJCBB_ = null;
        } else {
          gMOHFGOJCBB_ = null;
          gMOHFGOJCBBBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.COKBMINIAOHOuterClass.internal_static_COKBMINIAOH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH build() {
        emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH buildPartial() {
        emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH result = new emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH(this);
        result.galleryId_ = galleryId_;
        if (gMOHFGOJCBBBuilder_ == null) {
          result.gMOHFGOJCBB_ = gMOHFGOJCBB_;
        } else {
          result.gMOHFGOJCBB_ = gMOHFGOJCBBBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH) {
          return mergeFrom((emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH other) {
        if (other == emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.hasGMOHFGOJCBB()) {
          mergeGMOHFGOJCBB(other.getGMOHFGOJCBB());
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
        emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 14;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 14;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO gMOHFGOJCBB_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO, emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO.Builder, emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJOOrBuilder> gMOHFGOJCBBBuilder_;
      /**
       * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
       * @return Whether the gMOHFGOJCBB field is set.
       */
      public boolean hasGMOHFGOJCBB() {
        return gMOHFGOJCBBBuilder_ != null || gMOHFGOJCBB_ != null;
      }
      /**
       * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
       * @return The gMOHFGOJCBB.
       */
      public emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO getGMOHFGOJCBB() {
        if (gMOHFGOJCBBBuilder_ == null) {
          return gMOHFGOJCBB_ == null ? emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO.getDefaultInstance() : gMOHFGOJCBB_;
        } else {
          return gMOHFGOJCBBBuilder_.getMessage();
        }
      }
      /**
       * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
       */
      public Builder setGMOHFGOJCBB(emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO value) {
        if (gMOHFGOJCBBBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          gMOHFGOJCBB_ = value;
          onChanged();
        } else {
          gMOHFGOJCBBBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
       */
      public Builder setGMOHFGOJCBB(
          emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO.Builder builderForValue) {
        if (gMOHFGOJCBBBuilder_ == null) {
          gMOHFGOJCBB_ = builderForValue.build();
          onChanged();
        } else {
          gMOHFGOJCBBBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
       */
      public Builder mergeGMOHFGOJCBB(emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO value) {
        if (gMOHFGOJCBBBuilder_ == null) {
          if (gMOHFGOJCBB_ != null) {
            gMOHFGOJCBB_ =
              emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO.newBuilder(gMOHFGOJCBB_).mergeFrom(value).buildPartial();
          } else {
            gMOHFGOJCBB_ = value;
          }
          onChanged();
        } else {
          gMOHFGOJCBBBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
       */
      public Builder clearGMOHFGOJCBB() {
        if (gMOHFGOJCBBBuilder_ == null) {
          gMOHFGOJCBB_ = null;
          onChanged();
        } else {
          gMOHFGOJCBB_ = null;
          gMOHFGOJCBBBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
       */
      public emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO.Builder getGMOHFGOJCBBBuilder() {
        
        onChanged();
        return getGMOHFGOJCBBFieldBuilder().getBuilder();
      }
      /**
       * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
       */
      public emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJOOrBuilder getGMOHFGOJCBBOrBuilder() {
        if (gMOHFGOJCBBBuilder_ != null) {
          return gMOHFGOJCBBBuilder_.getMessageOrBuilder();
        } else {
          return gMOHFGOJCBB_ == null ?
              emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO.getDefaultInstance() : gMOHFGOJCBB_;
        }
      }
      /**
       * <code>.JBKHLEDBGJO GMOHFGOJCBB = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO, emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO.Builder, emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJOOrBuilder> 
          getGMOHFGOJCBBFieldBuilder() {
        if (gMOHFGOJCBBBuilder_ == null) {
          gMOHFGOJCBBBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO, emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJO.Builder, emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.JBKHLEDBGJOOrBuilder>(
                  getGMOHFGOJCBB(),
                  getParentForChildren(),
                  isClean());
          gMOHFGOJCBB_ = null;
        }
        return gMOHFGOJCBBBuilder_;
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


      // @@protoc_insertion_point(builder_scope:COKBMINIAOH)
    }

    // @@protoc_insertion_point(class_scope:COKBMINIAOH)
    private static final emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH();
    }

    public static emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<COKBMINIAOH>
        PARSER = new com.google.protobuf.AbstractParser<COKBMINIAOH>() {
      @java.lang.Override
      public COKBMINIAOH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new COKBMINIAOH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<COKBMINIAOH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<COKBMINIAOH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.COKBMINIAOHOuterClass.COKBMINIAOH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_COKBMINIAOH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_COKBMINIAOH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021COKBMINIAOH.proto\032\021JBKHLEDBGJO.proto\"D" +
      "\n\013COKBMINIAOH\022\022\n\ngallery_id\030\016 \001(\r\022!\n\013GMO" +
      "HFGOJCBB\030\005 \001(\0132\014.JBKHLEDBGJOB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.getDescriptor(),
        });
    internal_static_COKBMINIAOH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_COKBMINIAOH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_COKBMINIAOH_descriptor,
        new java.lang.String[] { "GalleryId", "GMOHFGOJCBB", });
    emu.grasscutter.net.proto.JBKHLEDBGJOOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}