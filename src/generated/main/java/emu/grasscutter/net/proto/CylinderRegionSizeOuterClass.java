// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CylinderRegionSize.proto

package emu.grasscutter.net.proto;

public final class CylinderRegionSizeOuterClass {
  private CylinderRegionSizeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CylinderRegionSizeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CylinderRegionSize)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float radius = 2;</code>
     * @return The radius.
     */
    float getRadius();

    /**
     * <code>float height = 13;</code>
     * @return The height.
     */
    float getHeight();
  }
  /**
   * <pre>
   * Obf: IDHBCOHLJPD
   * </pre>
   *
   * Protobuf type {@code CylinderRegionSize}
   */
  public static final class CylinderRegionSize extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CylinderRegionSize)
      CylinderRegionSizeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CylinderRegionSize.newBuilder() to construct.
    private CylinderRegionSize(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CylinderRegionSize() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CylinderRegionSize();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CylinderRegionSize(
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
            case 21: {

              radius_ = input.readFloat();
              break;
            }
            case 109: {

              height_ = input.readFloat();
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
      return emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.internal_static_CylinderRegionSize_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.internal_static_CylinderRegionSize_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize.class, emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize.Builder.class);
    }

    public static final int RADIUS_FIELD_NUMBER = 2;
    private float radius_;
    /**
     * <code>float radius = 2;</code>
     * @return The radius.
     */
    @java.lang.Override
    public float getRadius() {
      return radius_;
    }

    public static final int HEIGHT_FIELD_NUMBER = 13;
    private float height_;
    /**
     * <code>float height = 13;</code>
     * @return The height.
     */
    @java.lang.Override
    public float getHeight() {
      return height_;
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
      if (radius_ != 0F) {
        output.writeFloat(2, radius_);
      }
      if (height_ != 0F) {
        output.writeFloat(13, height_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (radius_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, radius_);
      }
      if (height_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(13, height_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize other = (emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize) obj;

      if (java.lang.Float.floatToIntBits(getRadius())
          != java.lang.Float.floatToIntBits(
              other.getRadius())) return false;
      if (java.lang.Float.floatToIntBits(getHeight())
          != java.lang.Float.floatToIntBits(
              other.getHeight())) return false;
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
      hash = (37 * hash) + RADIUS_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getRadius());
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getHeight());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize prototype) {
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
     * Obf: IDHBCOHLJPD
     * </pre>
     *
     * Protobuf type {@code CylinderRegionSize}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CylinderRegionSize)
        emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSizeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.internal_static_CylinderRegionSize_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.internal_static_CylinderRegionSize_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize.class, emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize.newBuilder()
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
        radius_ = 0F;

        height_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.internal_static_CylinderRegionSize_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize build() {
        emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize buildPartial() {
        emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize result = new emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize(this);
        result.radius_ = radius_;
        result.height_ = height_;
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
        if (other instanceof emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize) {
          return mergeFrom((emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize other) {
        if (other == emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize.getDefaultInstance()) return this;
        if (other.getRadius() != 0F) {
          setRadius(other.getRadius());
        }
        if (other.getHeight() != 0F) {
          setHeight(other.getHeight());
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
        emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float radius_ ;
      /**
       * <code>float radius = 2;</code>
       * @return The radius.
       */
      @java.lang.Override
      public float getRadius() {
        return radius_;
      }
      /**
       * <code>float radius = 2;</code>
       * @param value The radius to set.
       * @return This builder for chaining.
       */
      public Builder setRadius(float value) {
        
        radius_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float radius = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRadius() {
        
        radius_ = 0F;
        onChanged();
        return this;
      }

      private float height_ ;
      /**
       * <code>float height = 13;</code>
       * @return The height.
       */
      @java.lang.Override
      public float getHeight() {
        return height_;
      }
      /**
       * <code>float height = 13;</code>
       * @param value The height to set.
       * @return This builder for chaining.
       */
      public Builder setHeight(float value) {
        
        height_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float height = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearHeight() {
        
        height_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:CylinderRegionSize)
    }

    // @@protoc_insertion_point(class_scope:CylinderRegionSize)
    private static final emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize();
    }

    public static emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CylinderRegionSize>
        PARSER = new com.google.protobuf.AbstractParser<CylinderRegionSize>() {
      @java.lang.Override
      public CylinderRegionSize parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CylinderRegionSize(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CylinderRegionSize> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CylinderRegionSize> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CylinderRegionSizeOuterClass.CylinderRegionSize getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CylinderRegionSize_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CylinderRegionSize_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030CylinderRegionSize.proto\"4\n\022CylinderRe" +
      "gionSize\022\016\n\006radius\030\002 \001(\002\022\016\n\006height\030\r \001(\002" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CylinderRegionSize_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CylinderRegionSize_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CylinderRegionSize_descriptor,
        new java.lang.String[] { "Radius", "Height", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
