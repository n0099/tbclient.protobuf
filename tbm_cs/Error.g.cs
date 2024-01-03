// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Error.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TbClient {

  /// <summary>Holder for reflection information generated from Error.proto</summary>
  public static partial class ErrorReflection {

    #region Descriptor
    /// <summary>File descriptor for Error.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static ErrorReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CgtFcnJvci5wcm90bxIIdGJDbGllbnQiOQoFRXJyb3ISDwoHZXJyb3JubxgB",
            "IAEoBRIOCgZlcnJtc2cYAiABKAkSDwoHdXNlcm1zZxgDIAEoCWIGcHJvdG8z"));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TbClient.Error), global::TbClient.Error.Parser, new[]{ "Errorno", "Errmsg", "Usermsg" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  [global::System.Diagnostics.DebuggerDisplayAttribute("{ToString(),nq}")]
  public sealed partial class Error : pb::IMessage<Error>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<Error> _parser = new pb::MessageParser<Error>(() => new Error());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<Error> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TbClient.ErrorReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Error() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Error(Error other) : this() {
      errorno_ = other.errorno_;
      errmsg_ = other.errmsg_;
      usermsg_ = other.usermsg_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Error Clone() {
      return new Error(this);
    }

    /// <summary>Field number for the "errorno" field.</summary>
    public const int ErrornoFieldNumber = 1;
    private int errorno_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int Errorno {
      get { return errorno_; }
      set {
        errorno_ = value;
      }
    }

    /// <summary>Field number for the "errmsg" field.</summary>
    public const int ErrmsgFieldNumber = 2;
    private string errmsg_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Errmsg {
      get { return errmsg_; }
      set {
        errmsg_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "usermsg" field.</summary>
    public const int UsermsgFieldNumber = 3;
    private string usermsg_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Usermsg {
      get { return usermsg_; }
      set {
        usermsg_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as Error);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(Error other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Errorno != other.Errorno) return false;
      if (Errmsg != other.Errmsg) return false;
      if (Usermsg != other.Usermsg) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (Errorno != 0) hash ^= Errorno.GetHashCode();
      if (Errmsg.Length != 0) hash ^= Errmsg.GetHashCode();
      if (Usermsg.Length != 0) hash ^= Usermsg.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void WriteTo(pb::CodedOutputStream output) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      output.WriteRawMessage(this);
    #else
      if (Errorno != 0) {
        output.WriteRawTag(8);
        output.WriteInt32(Errorno);
      }
      if (Errmsg.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Errmsg);
      }
      if (Usermsg.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(Usermsg);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (Errorno != 0) {
        output.WriteRawTag(8);
        output.WriteInt32(Errorno);
      }
      if (Errmsg.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Errmsg);
      }
      if (Usermsg.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(Usermsg);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int CalculateSize() {
      int size = 0;
      if (Errorno != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(Errorno);
      }
      if (Errmsg.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Errmsg);
      }
      if (Usermsg.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Usermsg);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(Error other) {
      if (other == null) {
        return;
      }
      if (other.Errorno != 0) {
        Errorno = other.Errorno;
      }
      if (other.Errmsg.Length != 0) {
        Errmsg = other.Errmsg;
      }
      if (other.Usermsg.Length != 0) {
        Usermsg = other.Usermsg;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 8: {
            Errorno = input.ReadInt32();
            break;
          }
          case 18: {
            Errmsg = input.ReadString();
            break;
          }
          case 26: {
            Usermsg = input.ReadString();
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 8: {
            Errorno = input.ReadInt32();
            break;
          }
          case 18: {
            Errmsg = input.ReadString();
            break;
          }
          case 26: {
            Usermsg = input.ReadString();
            break;
          }
        }
      }
    }
    #endif

  }

  #endregion

}

#endregion Designer generated code
