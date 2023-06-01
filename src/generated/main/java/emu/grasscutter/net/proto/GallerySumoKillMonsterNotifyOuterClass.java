// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GallerySumoKillMonsterNotify.proto

package emu.grasscutter.net.proto;

public final class GallerySumoKillMonsterNotifyOuterClass {
  private GallerySumoKillMonsterNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GallerySumoKillMonsterNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GallerySumoKillMonsterNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 1;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>uint32 score = 5;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 DNKNMEGHIIJ = 3;</code>
     * @return The dNKNMEGHIIJ.
     */
    int getDNKNMEGHIIJ();

    /**
     * <code>uint32 GNJHGMHMBDK = 15;</code>
     * @return The gNJHGMHMBDK.
     */
    int getGNJHGMHMBDK();
  }
  /**
   * <pre>
   * CmdId: 5528
   * Obf: OKKIHBPCIBI
   * </pre>
   *
   * Protobuf type {@code GallerySumoKillMonsterNotify}
   */
  public static final class GallerySumoKillMonsterNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GallerySumoKillMonsterNotify)
      GallerySumoKillMonsterNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GallerySumoKillMonsterNotify.newBuilder() to construct.
    private GallerySumoKillMonsterNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GallerySumoKillMonsterNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GallerySumoKillMonsterNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GallerySumoKillMonsterNotify(
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
            case 8: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 24: {

              dNKNMEGHIIJ_ = input.readUInt32();
              break;
            }
            case 40: {

              score_ = input.readUInt32();
              break;
            }
            case 120: {

              gNJHGMHMBDK_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.class, emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 1;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 1;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int SCORE_FIELD_NUMBER = 5;
    private int score_;
    /**
     * <code>uint32 score = 5;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int DNKNMEGHIIJ_FIELD_NUMBER = 3;
    private int dNKNMEGHIIJ_;
    /**
     * <code>uint32 DNKNMEGHIIJ = 3;</code>
     * @return The dNKNMEGHIIJ.
     */
    @java.lang.Override
    public int getDNKNMEGHIIJ() {
      return dNKNMEGHIIJ_;
    }

    public static final int GNJHGMHMBDK_FIELD_NUMBER = 15;
    private int gNJHGMHMBDK_;
    /**
     * <code>uint32 GNJHGMHMBDK = 15;</code>
     * @return The gNJHGMHMBDK.
     */
    @java.lang.Override
    public int getGNJHGMHMBDK() {
      return gNJHGMHMBDK_;
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
      if (galleryId_ != 0) {
        output.writeUInt32(1, galleryId_);
      }
      if (dNKNMEGHIIJ_ != 0) {
        output.writeUInt32(3, dNKNMEGHIIJ_);
      }
      if (score_ != 0) {
        output.writeUInt32(5, score_);
      }
      if (gNJHGMHMBDK_ != 0) {
        output.writeUInt32(15, gNJHGMHMBDK_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, galleryId_);
      }
      if (dNKNMEGHIIJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, dNKNMEGHIIJ_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, score_);
      }
      if (gNJHGMHMBDK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, gNJHGMHMBDK_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify other = (emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getDNKNMEGHIIJ()
          != other.getDNKNMEGHIIJ()) return false;
      if (getGNJHGMHMBDK()
          != other.getGNJHGMHMBDK()) return false;
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
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + DNKNMEGHIIJ_FIELD_NUMBER;
      hash = (53 * hash) + getDNKNMEGHIIJ();
      hash = (37 * hash) + GNJHGMHMBDK_FIELD_NUMBER;
      hash = (53 * hash) + getGNJHGMHMBDK();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify prototype) {
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
     * CmdId: 5528
     * Obf: OKKIHBPCIBI
     * </pre>
     *
     * Protobuf type {@code GallerySumoKillMonsterNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GallerySumoKillMonsterNotify)
        emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.class, emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.newBuilder()
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

        score_ = 0;

        dNKNMEGHIIJ_ = 0;

        gNJHGMHMBDK_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify build() {
        emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify buildPartial() {
        emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify result = new emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify(this);
        result.galleryId_ = galleryId_;
        result.score_ = score_;
        result.dNKNMEGHIIJ_ = dNKNMEGHIIJ_;
        result.gNJHGMHMBDK_ = gNJHGMHMBDK_;
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
        if (other instanceof emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify other) {
        if (other == emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getDNKNMEGHIIJ() != 0) {
          setDNKNMEGHIIJ(other.getDNKNMEGHIIJ());
        }
        if (other.getGNJHGMHMBDK() != 0) {
          setGNJHGMHMBDK(other.getGNJHGMHMBDK());
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
        emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify) e.getUnfinishedMessage();
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
       * <code>uint32 gallery_id = 1;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 1;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 5;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 5;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int dNKNMEGHIIJ_ ;
      /**
       * <code>uint32 DNKNMEGHIIJ = 3;</code>
       * @return The dNKNMEGHIIJ.
       */
      @java.lang.Override
      public int getDNKNMEGHIIJ() {
        return dNKNMEGHIIJ_;
      }
      /**
       * <code>uint32 DNKNMEGHIIJ = 3;</code>
       * @param value The dNKNMEGHIIJ to set.
       * @return This builder for chaining.
       */
      public Builder setDNKNMEGHIIJ(int value) {
        
        dNKNMEGHIIJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DNKNMEGHIIJ = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDNKNMEGHIIJ() {
        
        dNKNMEGHIIJ_ = 0;
        onChanged();
        return this;
      }

      private int gNJHGMHMBDK_ ;
      /**
       * <code>uint32 GNJHGMHMBDK = 15;</code>
       * @return The gNJHGMHMBDK.
       */
      @java.lang.Override
      public int getGNJHGMHMBDK() {
        return gNJHGMHMBDK_;
      }
      /**
       * <code>uint32 GNJHGMHMBDK = 15;</code>
       * @param value The gNJHGMHMBDK to set.
       * @return This builder for chaining.
       */
      public Builder setGNJHGMHMBDK(int value) {
        
        gNJHGMHMBDK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GNJHGMHMBDK = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearGNJHGMHMBDK() {
        
        gNJHGMHMBDK_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GallerySumoKillMonsterNotify)
    }

    // @@protoc_insertion_point(class_scope:GallerySumoKillMonsterNotify)
    private static final emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify();
    }

    public static emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GallerySumoKillMonsterNotify>
        PARSER = new com.google.protobuf.AbstractParser<GallerySumoKillMonsterNotify>() {
      @java.lang.Override
      public GallerySumoKillMonsterNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GallerySumoKillMonsterNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GallerySumoKillMonsterNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GallerySumoKillMonsterNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GallerySumoKillMonsterNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GallerySumoKillMonsterNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"GallerySumoKillMonsterNotify.proto\"k\n\034" +
      "GallerySumoKillMonsterNotify\022\022\n\ngallery_" +
      "id\030\001 \001(\r\022\r\n\005score\030\005 \001(\r\022\023\n\013DNKNMEGHIIJ\030\003" +
      " \001(\r\022\023\n\013GNJHGMHMBDK\030\017 \001(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GallerySumoKillMonsterNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GallerySumoKillMonsterNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GallerySumoKillMonsterNotify_descriptor,
        new java.lang.String[] { "GalleryId", "Score", "DNKNMEGHIIJ", "GNJHGMHMBDK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
