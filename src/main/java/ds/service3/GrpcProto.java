// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logistic.proto

package ds.service3;

public final class GrpcProto {
  private GrpcProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_service3_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_service3_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_service3_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_service3_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016logistic.proto\022\013ds.service3\"\036\n\007Request" +
      "\022\023\n\013ProductName\030\001 \001(\t\"\"\n\010Response\022\026\n\016Pro" +
      "cessMessage\030\001 \001(\t2\341\001\n\tLogistics\022F\n\023serve" +
      "rStreamingLogi\022\024.ds.service3.Request\032\025.d" +
      "s.service3.Response\"\0000\001\022F\n\023clientStreami" +
      "ngLogi\022\024.ds.service3.Request\032\025.ds.servic" +
      "e3.Response\"\000(\001\022D\n\017biStreamingLogi\022\024.ds." +
      "service3.Request\032\025.ds.service3.Response\"" +
      "\000(\0010\001B\rB\tGrpcProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ds_service3_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ds_service3_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_service3_Request_descriptor,
        new java.lang.String[] { "ProductName", });
    internal_static_ds_service3_Response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ds_service3_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_service3_Response_descriptor,
        new java.lang.String[] { "ProcessMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
