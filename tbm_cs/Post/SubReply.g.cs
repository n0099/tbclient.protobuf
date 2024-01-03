// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Post/SubReply.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TbClient.Post {

  /// <summary>Holder for reflection information generated from Post/SubReply.proto</summary>
  public static partial class SubReplyReflection {

    #region Descriptor
    /// <summary>File descriptor for Post/SubReply.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static SubReplyReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "ChNQb3N0L1N1YlJlcGx5LnByb3RvEg10YkNsaWVudC5wb3N0GhlQb3N0L0Nv",
            "bW1vbi9Db250ZW50LnByb3RvGhdQb3N0L0NvbW1vbi9BZ3JlZS5wcm90bxoK",
            "VXNlci5wcm90byKiAQoIU3ViUmVwbHkSDAoEc3BpZBgBIAEoBBIuCgdjb250",
            "ZW50GAIgAygLMh0udGJDbGllbnQucG9zdC5jb21tb24uQ29udGVudBIMCgR0",
            "aW1lGAMgASgNEh4KBmF1dGhvchgHIAEoCzIOLnRiQ2xpZW50LlVzZXISKgoF",
            "YWdyZWUYCSABKAsyGy50YkNsaWVudC5wb3N0LmNvbW1vbi5BZ3JlZWIGcHJv",
            "dG8z"));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::TbClient.Post.Common.ContentReflection.Descriptor, global::TbClient.Post.Common.AgreeReflection.Descriptor, global::TbClient.UserReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TbClient.Post.SubReply), global::TbClient.Post.SubReply.Parser, new[]{ "Spid", "Content", "Time", "Author", "Agree" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  [global::System.Diagnostics.DebuggerDisplayAttribute("{ToString(),nq}")]
  public sealed partial class SubReply : pb::IMessage<SubReply>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<SubReply> _parser = new pb::MessageParser<SubReply>(() => new SubReply());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<SubReply> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TbClient.Post.SubReplyReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public SubReply() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public SubReply(SubReply other) : this() {
      spid_ = other.spid_;
      content_ = other.content_.Clone();
      time_ = other.time_;
      author_ = other.author_ != null ? other.author_.Clone() : null;
      agree_ = other.agree_ != null ? other.agree_.Clone() : null;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public SubReply Clone() {
      return new SubReply(this);
    }

    /// <summary>Field number for the "spid" field.</summary>
    public const int SpidFieldNumber = 1;
    private ulong spid_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public ulong Spid {
      get { return spid_; }
      set {
        spid_ = value;
      }
    }

    /// <summary>Field number for the "content" field.</summary>
    public const int ContentFieldNumber = 2;
    private static readonly pb::FieldCodec<global::TbClient.Post.Common.Content> _repeated_content_codec
        = pb::FieldCodec.ForMessage(18, global::TbClient.Post.Common.Content.Parser);
    private readonly pbc::RepeatedField<global::TbClient.Post.Common.Content> content_ = new pbc::RepeatedField<global::TbClient.Post.Common.Content>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public pbc::RepeatedField<global::TbClient.Post.Common.Content> Content {
      get { return content_; }
    }

    /// <summary>Field number for the "time" field.</summary>
    public const int TimeFieldNumber = 3;
    private uint time_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public uint Time {
      get { return time_; }
      set {
        time_ = value;
      }
    }

    /// <summary>Field number for the "author" field.</summary>
    public const int AuthorFieldNumber = 7;
    private global::TbClient.User author_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::TbClient.User Author {
      get { return author_; }
      set {
        author_ = value;
      }
    }

    /// <summary>Field number for the "agree" field.</summary>
    public const int AgreeFieldNumber = 9;
    private global::TbClient.Post.Common.Agree agree_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::TbClient.Post.Common.Agree Agree {
      get { return agree_; }
      set {
        agree_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as SubReply);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(SubReply other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Spid != other.Spid) return false;
      if(!content_.Equals(other.content_)) return false;
      if (Time != other.Time) return false;
      if (!object.Equals(Author, other.Author)) return false;
      if (!object.Equals(Agree, other.Agree)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (Spid != 0UL) hash ^= Spid.GetHashCode();
      hash ^= content_.GetHashCode();
      if (Time != 0) hash ^= Time.GetHashCode();
      if (author_ != null) hash ^= Author.GetHashCode();
      if (agree_ != null) hash ^= Agree.GetHashCode();
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
      if (Spid != 0UL) {
        output.WriteRawTag(8);
        output.WriteUInt64(Spid);
      }
      content_.WriteTo(output, _repeated_content_codec);
      if (Time != 0) {
        output.WriteRawTag(24);
        output.WriteUInt32(Time);
      }
      if (author_ != null) {
        output.WriteRawTag(58);
        output.WriteMessage(Author);
      }
      if (agree_ != null) {
        output.WriteRawTag(74);
        output.WriteMessage(Agree);
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
      if (Spid != 0UL) {
        output.WriteRawTag(8);
        output.WriteUInt64(Spid);
      }
      content_.WriteTo(ref output, _repeated_content_codec);
      if (Time != 0) {
        output.WriteRawTag(24);
        output.WriteUInt32(Time);
      }
      if (author_ != null) {
        output.WriteRawTag(58);
        output.WriteMessage(Author);
      }
      if (agree_ != null) {
        output.WriteRawTag(74);
        output.WriteMessage(Agree);
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
      if (Spid != 0UL) {
        size += 1 + pb::CodedOutputStream.ComputeUInt64Size(Spid);
      }
      size += content_.CalculateSize(_repeated_content_codec);
      if (Time != 0) {
        size += 1 + pb::CodedOutputStream.ComputeUInt32Size(Time);
      }
      if (author_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Author);
      }
      if (agree_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Agree);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(SubReply other) {
      if (other == null) {
        return;
      }
      if (other.Spid != 0UL) {
        Spid = other.Spid;
      }
      content_.Add(other.content_);
      if (other.Time != 0) {
        Time = other.Time;
      }
      if (other.author_ != null) {
        if (author_ == null) {
          Author = new global::TbClient.User();
        }
        Author.MergeFrom(other.Author);
      }
      if (other.agree_ != null) {
        if (agree_ == null) {
          Agree = new global::TbClient.Post.Common.Agree();
        }
        Agree.MergeFrom(other.Agree);
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
            Spid = input.ReadUInt64();
            break;
          }
          case 18: {
            content_.AddEntriesFrom(input, _repeated_content_codec);
            break;
          }
          case 24: {
            Time = input.ReadUInt32();
            break;
          }
          case 58: {
            if (author_ == null) {
              Author = new global::TbClient.User();
            }
            input.ReadMessage(Author);
            break;
          }
          case 74: {
            if (agree_ == null) {
              Agree = new global::TbClient.Post.Common.Agree();
            }
            input.ReadMessage(Agree);
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
            Spid = input.ReadUInt64();
            break;
          }
          case 18: {
            content_.AddEntriesFrom(ref input, _repeated_content_codec);
            break;
          }
          case 24: {
            Time = input.ReadUInt32();
            break;
          }
          case 58: {
            if (author_ == null) {
              Author = new global::TbClient.User();
            }
            input.ReadMessage(Author);
            break;
          }
          case 74: {
            if (agree_ == null) {
              Agree = new global::TbClient.Post.Common.Agree();
            }
            input.ReadMessage(Agree);
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
