// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientReconnectReason.proto

package emu.grasscutter.net.proto;

public final class ClientReconnectReasonOuterClass {
  private ClientReconnectReasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Obf: DAFLDPNBLMC
   * </pre>
   *
   * Protobuf enum {@code ClientReconnectReason}
   */
  public enum ClientReconnectReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CLIENT_RECONNNECT_NONE = 0;</code>
     */
    CLIENT_RECONNNECT_NONE(0),
    /**
     * <code>CLIENT_RECONNNECT_QUIT_MP = 1;</code>
     */
    CLIENT_RECONNNECT_QUIT_MP(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CLIENT_RECONNNECT_NONE = 0;</code>
     */
    public static final int CLIENT_RECONNNECT_NONE_VALUE = 0;
    /**
     * <code>CLIENT_RECONNNECT_QUIT_MP = 1;</code>
     */
    public static final int CLIENT_RECONNNECT_QUIT_MP_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ClientReconnectReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ClientReconnectReason forNumber(int value) {
      switch (value) {
        case 0: return CLIENT_RECONNNECT_NONE;
        case 1: return CLIENT_RECONNNECT_QUIT_MP;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ClientReconnectReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ClientReconnectReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ClientReconnectReason>() {
            public ClientReconnectReason findValueByNumber(int number) {
              return ClientReconnectReason.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ClientReconnectReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ClientReconnectReason[] VALUES = values();

    public static ClientReconnectReason valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ClientReconnectReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ClientReconnectReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ClientReconnectReason.proto*R\n\025ClientR" +
      "econnectReason\022\032\n\026CLIENT_RECONNNECT_NONE" +
      "\020\000\022\035\n\031CLIENT_RECONNNECT_QUIT_MP\020\001B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
