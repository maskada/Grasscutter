// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGallerySorushTrialPhotoMatchInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGallerySorushTrialPhotoMatchInfoOuterClass {
  private SceneGallerySorushTrialPhotoMatchInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGallerySorushTrialPhotoMatchInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGallerySorushTrialPhotoMatchInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool BAKIEFCCBOF = 7;</code>
     * @return The bAKIEFCCBOF.
     */
    boolean getBAKIEFCCBOF();

    /**
     * <code>bool GGDAMGGIEAD = 12;</code>
     * @return The gGDAMGGIEAD.
     */
    boolean getGGDAMGGIEAD();
  }
  /**
   * <pre>
   * Obf: BDEDFJCEACE
   * </pre>
   *
   * Protobuf type {@code SceneGallerySorushTrialPhotoMatchInfo}
   */
  public static final class SceneGallerySorushTrialPhotoMatchInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGallerySorushTrialPhotoMatchInfo)
      SceneGallerySorushTrialPhotoMatchInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGallerySorushTrialPhotoMatchInfo.newBuilder() to construct.
    private SceneGallerySorushTrialPhotoMatchInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGallerySorushTrialPhotoMatchInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGallerySorushTrialPhotoMatchInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGallerySorushTrialPhotoMatchInfo(
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

              bAKIEFCCBOF_ = input.readBool();
              break;
            }
            case 96: {

              gGDAMGGIEAD_ = input.readBool();
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
      return emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.internal_static_SceneGallerySorushTrialPhotoMatchInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.internal_static_SceneGallerySorushTrialPhotoMatchInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo.class, emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo.Builder.class);
    }

    public static final int BAKIEFCCBOF_FIELD_NUMBER = 7;
    private boolean bAKIEFCCBOF_;
    /**
     * <code>bool BAKIEFCCBOF = 7;</code>
     * @return The bAKIEFCCBOF.
     */
    @java.lang.Override
    public boolean getBAKIEFCCBOF() {
      return bAKIEFCCBOF_;
    }

    public static final int GGDAMGGIEAD_FIELD_NUMBER = 12;
    private boolean gGDAMGGIEAD_;
    /**
     * <code>bool GGDAMGGIEAD = 12;</code>
     * @return The gGDAMGGIEAD.
     */
    @java.lang.Override
    public boolean getGGDAMGGIEAD() {
      return gGDAMGGIEAD_;
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
      if (bAKIEFCCBOF_ != false) {
        output.writeBool(7, bAKIEFCCBOF_);
      }
      if (gGDAMGGIEAD_ != false) {
        output.writeBool(12, gGDAMGGIEAD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bAKIEFCCBOF_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, bAKIEFCCBOF_);
      }
      if (gGDAMGGIEAD_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, gGDAMGGIEAD_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo other = (emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo) obj;

      if (getBAKIEFCCBOF()
          != other.getBAKIEFCCBOF()) return false;
      if (getGGDAMGGIEAD()
          != other.getGGDAMGGIEAD()) return false;
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
      hash = (37 * hash) + BAKIEFCCBOF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBAKIEFCCBOF());
      hash = (37 * hash) + GGDAMGGIEAD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getGGDAMGGIEAD());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo prototype) {
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
     * Obf: BDEDFJCEACE
     * </pre>
     *
     * Protobuf type {@code SceneGallerySorushTrialPhotoMatchInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGallerySorushTrialPhotoMatchInfo)
        emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.internal_static_SceneGallerySorushTrialPhotoMatchInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.internal_static_SceneGallerySorushTrialPhotoMatchInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo.class, emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo.newBuilder()
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
        bAKIEFCCBOF_ = false;

        gGDAMGGIEAD_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.internal_static_SceneGallerySorushTrialPhotoMatchInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo build() {
        emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo result = new emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo(this);
        result.bAKIEFCCBOF_ = bAKIEFCCBOF_;
        result.gGDAMGGIEAD_ = gGDAMGGIEAD_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo.getDefaultInstance()) return this;
        if (other.getBAKIEFCCBOF() != false) {
          setBAKIEFCCBOF(other.getBAKIEFCCBOF());
        }
        if (other.getGGDAMGGIEAD() != false) {
          setGGDAMGGIEAD(other.getGGDAMGGIEAD());
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
        emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean bAKIEFCCBOF_ ;
      /**
       * <code>bool BAKIEFCCBOF = 7;</code>
       * @return The bAKIEFCCBOF.
       */
      @java.lang.Override
      public boolean getBAKIEFCCBOF() {
        return bAKIEFCCBOF_;
      }
      /**
       * <code>bool BAKIEFCCBOF = 7;</code>
       * @param value The bAKIEFCCBOF to set.
       * @return This builder for chaining.
       */
      public Builder setBAKIEFCCBOF(boolean value) {
        
        bAKIEFCCBOF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool BAKIEFCCBOF = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearBAKIEFCCBOF() {
        
        bAKIEFCCBOF_ = false;
        onChanged();
        return this;
      }

      private boolean gGDAMGGIEAD_ ;
      /**
       * <code>bool GGDAMGGIEAD = 12;</code>
       * @return The gGDAMGGIEAD.
       */
      @java.lang.Override
      public boolean getGGDAMGGIEAD() {
        return gGDAMGGIEAD_;
      }
      /**
       * <code>bool GGDAMGGIEAD = 12;</code>
       * @param value The gGDAMGGIEAD to set.
       * @return This builder for chaining.
       */
      public Builder setGGDAMGGIEAD(boolean value) {
        
        gGDAMGGIEAD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool GGDAMGGIEAD = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGGDAMGGIEAD() {
        
        gGDAMGGIEAD_ = false;
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


      // @@protoc_insertion_point(builder_scope:SceneGallerySorushTrialPhotoMatchInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGallerySorushTrialPhotoMatchInfo)
    private static final emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo();
    }

    public static emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGallerySorushTrialPhotoMatchInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGallerySorushTrialPhotoMatchInfo>() {
      @java.lang.Override
      public SceneGallerySorushTrialPhotoMatchInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGallerySorushTrialPhotoMatchInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGallerySorushTrialPhotoMatchInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGallerySorushTrialPhotoMatchInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGallerySorushTrialPhotoMatchInfoOuterClass.SceneGallerySorushTrialPhotoMatchInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGallerySorushTrialPhotoMatchInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGallerySorushTrialPhotoMatchInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+SceneGallerySorushTrialPhotoMatchInfo." +
      "proto\"Q\n%SceneGallerySorushTrialPhotoMat" +
      "chInfo\022\023\n\013BAKIEFCCBOF\030\007 \001(\010\022\023\n\013GGDAMGGIE" +
      "AD\030\014 \001(\010B\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGallerySorushTrialPhotoMatchInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGallerySorushTrialPhotoMatchInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGallerySorushTrialPhotoMatchInfo_descriptor,
        new java.lang.String[] { "BAKIEFCCBOF", "GGDAMGGIEAD", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
