// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusExcapeMonsterNotify.proto

package emu.grasscutter.net.proto;

public final class InBattleMechanicusExcapeMonsterNotifyOuterClass {
  private InBattleMechanicusExcapeMonsterNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InBattleMechanicusExcapeMonsterNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InBattleMechanicusExcapeMonsterNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 excaped_monster_num = 5;</code>
     * @return The excapedMonsterNum.
     */
    int getExcapedMonsterNum();
  }
  /**
   * <pre>
   * CmdId: 5355
   * Obf: FDJHDFJOIHK
   * </pre>
   *
   * Protobuf type {@code InBattleMechanicusExcapeMonsterNotify}
   */
  public static final class InBattleMechanicusExcapeMonsterNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InBattleMechanicusExcapeMonsterNotify)
      InBattleMechanicusExcapeMonsterNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleMechanicusExcapeMonsterNotify.newBuilder() to construct.
    private InBattleMechanicusExcapeMonsterNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleMechanicusExcapeMonsterNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleMechanicusExcapeMonsterNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InBattleMechanicusExcapeMonsterNotify(
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
            case 40: {

              excapedMonsterNum_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.internal_static_InBattleMechanicusExcapeMonsterNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.internal_static_InBattleMechanicusExcapeMonsterNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify.class, emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify.Builder.class);
    }

    public static final int EXCAPED_MONSTER_NUM_FIELD_NUMBER = 5;
    private int excapedMonsterNum_;
    /**
     * <code>uint32 excaped_monster_num = 5;</code>
     * @return The excapedMonsterNum.
     */
    @java.lang.Override
    public int getExcapedMonsterNum() {
      return excapedMonsterNum_;
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
      if (excapedMonsterNum_ != 0) {
        output.writeUInt32(5, excapedMonsterNum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (excapedMonsterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, excapedMonsterNum_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify other = (emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify) obj;

      if (getExcapedMonsterNum()
          != other.getExcapedMonsterNum()) return false;
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
      hash = (37 * hash) + EXCAPED_MONSTER_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getExcapedMonsterNum();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify prototype) {
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
     * CmdId: 5355
     * Obf: FDJHDFJOIHK
     * </pre>
     *
     * Protobuf type {@code InBattleMechanicusExcapeMonsterNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleMechanicusExcapeMonsterNotify)
        emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.internal_static_InBattleMechanicusExcapeMonsterNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.internal_static_InBattleMechanicusExcapeMonsterNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify.class, emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify.newBuilder()
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
        excapedMonsterNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.internal_static_InBattleMechanicusExcapeMonsterNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify build() {
        emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify buildPartial() {
        emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify result = new emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify(this);
        result.excapedMonsterNum_ = excapedMonsterNum_;
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
        if (other instanceof emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify) {
          return mergeFrom((emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify other) {
        if (other == emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify.getDefaultInstance()) return this;
        if (other.getExcapedMonsterNum() != 0) {
          setExcapedMonsterNum(other.getExcapedMonsterNum());
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
        emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int excapedMonsterNum_ ;
      /**
       * <code>uint32 excaped_monster_num = 5;</code>
       * @return The excapedMonsterNum.
       */
      @java.lang.Override
      public int getExcapedMonsterNum() {
        return excapedMonsterNum_;
      }
      /**
       * <code>uint32 excaped_monster_num = 5;</code>
       * @param value The excapedMonsterNum to set.
       * @return This builder for chaining.
       */
      public Builder setExcapedMonsterNum(int value) {
        
        excapedMonsterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 excaped_monster_num = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearExcapedMonsterNum() {
        
        excapedMonsterNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InBattleMechanicusExcapeMonsterNotify)
    }

    // @@protoc_insertion_point(class_scope:InBattleMechanicusExcapeMonsterNotify)
    private static final emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify();
    }

    public static emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InBattleMechanicusExcapeMonsterNotify>
        PARSER = new com.google.protobuf.AbstractParser<InBattleMechanicusExcapeMonsterNotify>() {
      @java.lang.Override
      public InBattleMechanicusExcapeMonsterNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InBattleMechanicusExcapeMonsterNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InBattleMechanicusExcapeMonsterNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleMechanicusExcapeMonsterNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InBattleMechanicusExcapeMonsterNotifyOuterClass.InBattleMechanicusExcapeMonsterNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleMechanicusExcapeMonsterNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleMechanicusExcapeMonsterNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+InBattleMechanicusExcapeMonsterNotify." +
      "proto\"D\n%InBattleMechanicusExcapeMonster" +
      "Notify\022\033\n\023excaped_monster_num\030\005 \001(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InBattleMechanicusExcapeMonsterNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InBattleMechanicusExcapeMonsterNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleMechanicusExcapeMonsterNotify_descriptor,
        new java.lang.String[] { "ExcapedMonsterNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
