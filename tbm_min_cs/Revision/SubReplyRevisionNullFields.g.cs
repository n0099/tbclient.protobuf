// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Revision/SubReplyRevisionNullFields.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TbClient.Revision {

  /// <summary>Holder for reflection information generated from Revision/SubReplyRevisionNullFields.proto</summary>
  public static partial class SubReplyRevisionNullFieldsReflection {

    #region Descriptor
    /// <summary>File descriptor for Revision/SubReplyRevisionNullFields.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static SubReplyRevisionNullFieldsReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CilSZXZpc2lvbi9TdWJSZXBseVJldmlzaW9uTnVsbEZpZWxkcy5wcm90bxIR",
            "dGJDbGllbnQucmV2aXNpb24iTwoaU3ViUmVwbHlSZXZpc2lvbk51bGxGaWVs",
            "ZHMSGQoRYXV0aG9yTWFuYWdlclR5cGUYASABKAgSFgoOYXV0aG9yRXhwR3Jh",
            "ZGUYAiABKAhiBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TbClient.Revision.SubReplyRevisionNullFields), global::TbClient.Revision.SubReplyRevisionNullFields.Parser, new[]{ "AuthorManagerType", "AuthorExpGrade" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class SubReplyRevisionNullFields : pb::IMessage<SubReplyRevisionNullFields>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<SubReplyRevisionNullFields> _parser = new pb::MessageParser<SubReplyRevisionNullFields>(() => new SubReplyRevisionNullFields());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<SubReplyRevisionNullFields> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TbClient.Revision.SubReplyRevisionNullFieldsReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public SubReplyRevisionNullFields() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public SubReplyRevisionNullFields(SubReplyRevisionNullFields other) : this() {
      authorManagerType_ = other.authorManagerType_;
      authorExpGrade_ = other.authorExpGrade_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public SubReplyRevisionNullFields Clone() {
      return new SubReplyRevisionNullFields(this);
    }

    /// <summary>Field number for the "authorManagerType" field.</summary>
    public const int AuthorManagerTypeFieldNumber = 1;
    private bool authorManagerType_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool AuthorManagerType {
      get { return authorManagerType_; }
      set {
        authorManagerType_ = value;
      }
    }

    /// <summary>Field number for the "authorExpGrade" field.</summary>
    public const int AuthorExpGradeFieldNumber = 2;
    private bool authorExpGrade_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool AuthorExpGrade {
      get { return authorExpGrade_; }
      set {
        authorExpGrade_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as SubReplyRevisionNullFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(SubReplyRevisionNullFields other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (AuthorManagerType != other.AuthorManagerType) return false;
      if (AuthorExpGrade != other.AuthorExpGrade) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (AuthorManagerType != false) hash ^= AuthorManagerType.GetHashCode();
      if (AuthorExpGrade != false) hash ^= AuthorExpGrade.GetHashCode();
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
      if (AuthorManagerType != false) {
        output.WriteRawTag(8);
        output.WriteBool(AuthorManagerType);
      }
      if (AuthorExpGrade != false) {
        output.WriteRawTag(16);
        output.WriteBool(AuthorExpGrade);
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
      if (AuthorManagerType != false) {
        output.WriteRawTag(8);
        output.WriteBool(AuthorManagerType);
      }
      if (AuthorExpGrade != false) {
        output.WriteRawTag(16);
        output.WriteBool(AuthorExpGrade);
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
      if (AuthorManagerType != false) {
        size += 1 + 1;
      }
      if (AuthorExpGrade != false) {
        size += 1 + 1;
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(SubReplyRevisionNullFields other) {
      if (other == null) {
        return;
      }
      if (other.AuthorManagerType != false) {
        AuthorManagerType = other.AuthorManagerType;
      }
      if (other.AuthorExpGrade != false) {
        AuthorExpGrade = other.AuthorExpGrade;
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
            AuthorManagerType = input.ReadBool();
            break;
          }
          case 16: {
            AuthorExpGrade = input.ReadBool();
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
            AuthorManagerType = input.ReadBool();
            break;
          }
          case 16: {
            AuthorExpGrade = input.ReadBool();
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
