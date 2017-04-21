// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hellloworld.proto

/**
 * Protobuf type {@code HelloResponse}
 */
public  final class HelloResponse extends
    com.google.protobuf.GeneratedMessageLite<
        HelloResponse, HelloResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:HelloResponse)
    HelloResponseOrBuilder {
  private HelloResponse() {
    reply_ = "";
  }
  public static final int REPLY_FIELD_NUMBER = 1;
  private java.lang.String reply_;
  /**
   * <code>string reply = 1;</code>
   */
  public java.lang.String getReply() {
    return reply_;
  }
  /**
   * <code>string reply = 1;</code>
   */
  public com.google.protobuf.ByteString
      getReplyBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(reply_);
  }
  /**
   * <code>string reply = 1;</code>
   */
  private void setReply(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    reply_ = value;
  }
  /**
   * <code>string reply = 1;</code>
   */
  private void clearReply() {
    
    reply_ = getDefaultInstance().getReply();
  }
  /**
   * <code>string reply = 1;</code>
   */
  private void setReplyBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    reply_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!reply_.isEmpty()) {
      output.writeString(1, getReply());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!reply_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getReply());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static HelloResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static HelloResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static HelloResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static HelloResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static HelloResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static HelloResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static HelloResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static HelloResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static HelloResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static HelloResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(HelloResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code HelloResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        HelloResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:HelloResponse)
      HelloResponseOrBuilder {
    // Construct using HelloResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string reply = 1;</code>
     */
    public java.lang.String getReply() {
      return instance.getReply();
    }
    /**
     * <code>string reply = 1;</code>
     */
    public com.google.protobuf.ByteString
        getReplyBytes() {
      return instance.getReplyBytes();
    }
    /**
     * <code>string reply = 1;</code>
     */
    public Builder setReply(
        java.lang.String value) {
      copyOnWrite();
      instance.setReply(value);
      return this;
    }
    /**
     * <code>string reply = 1;</code>
     */
    public Builder clearReply() {
      copyOnWrite();
      instance.clearReply();
      return this;
    }
    /**
     * <code>string reply = 1;</code>
     */
    public Builder setReplyBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setReplyBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:HelloResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new HelloResponse();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        HelloResponse other = (HelloResponse) arg1;
        reply_ = visitor.visitString(!reply_.isEmpty(), reply_,
            !other.reply_.isEmpty(), other.reply_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                reply_ = s;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (HelloResponse.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:HelloResponse)
  private static final HelloResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new HelloResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static HelloResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<HelloResponse> PARSER;

  public static com.google.protobuf.Parser<HelloResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
