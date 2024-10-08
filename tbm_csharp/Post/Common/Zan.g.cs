// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Post/Common/Zan.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TbClient.Post.Common {

  /// <summary>Holder for reflection information generated from Post/Common/Zan.proto</summary>
  public static partial class ZanReflection {

    #region Descriptor
    /// <summary>File descriptor for Post/Common/Zan.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static ZanReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "ChVQb3N0L0NvbW1vbi9aYW4ucHJvdG8SFHRiQ2xpZW50LnBvc3QuY29tbW9u",
            "GgpVc2VyLnByb3RvIoMBCgNaYW4SCwoDbnVtGAEgASgFEiIKCmxpa2VyX2xp",
            "c3QYAiADKAsyDi50YkNsaWVudC5Vc2VyEhAKCGlzX2xpa2VkGAMgASgFEhEK",
            "CWxhc3RfdGltZRgEIAEoBRIQCghsaWtlcl9pZBgFIAMoAxIUCgxjb25zZW50",
            "X3R5cGUYBiABKAViBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::TbClient.UserReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TbClient.Post.Common.Zan), global::TbClient.Post.Common.Zan.Parser, new[]{ "Num", "LikerList", "IsLiked", "LastTime", "LikerId", "ConsentType" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  [global::System.Diagnostics.DebuggerDisplayAttribute("{ToString(),nq}")]
  public sealed partial class Zan : pb::IMessage<Zan>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<Zan> _parser = new pb::MessageParser<Zan>(() => new Zan());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<Zan> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TbClient.Post.Common.ZanReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Zan() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Zan(Zan other) : this() {
      num_ = other.num_;
      likerList_ = other.likerList_.Clone();
      isLiked_ = other.isLiked_;
      lastTime_ = other.lastTime_;
      likerId_ = other.likerId_.Clone();
      consentType_ = other.consentType_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Zan Clone() {
      return new Zan(this);
    }

    /// <summary>Field number for the "num" field.</summary>
    public const int NumFieldNumber = 1;
    private int num_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int Num {
      get { return num_; }
      set {
        num_ = value;
      }
    }

    /// <summary>Field number for the "liker_list" field.</summary>
    public const int LikerListFieldNumber = 2;
    private static readonly pb::FieldCodec<global::TbClient.User> _repeated_likerList_codec
        = pb::FieldCodec.ForMessage(18, global::TbClient.User.Parser);
    private readonly pbc::RepeatedField<global::TbClient.User> likerList_ = new pbc::RepeatedField<global::TbClient.User>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public pbc::RepeatedField<global::TbClient.User> LikerList {
      get { return likerList_; }
    }

    /// <summary>Field number for the "is_liked" field.</summary>
    public const int IsLikedFieldNumber = 3;
    private int isLiked_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int IsLiked {
      get { return isLiked_; }
      set {
        isLiked_ = value;
      }
    }

    /// <summary>Field number for the "last_time" field.</summary>
    public const int LastTimeFieldNumber = 4;
    private int lastTime_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int LastTime {
      get { return lastTime_; }
      set {
        lastTime_ = value;
      }
    }

    /// <summary>Field number for the "liker_id" field.</summary>
    public const int LikerIdFieldNumber = 5;
    private static readonly pb::FieldCodec<long> _repeated_likerId_codec
        = pb::FieldCodec.ForInt64(42);
    private readonly pbc::RepeatedField<long> likerId_ = new pbc::RepeatedField<long>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public pbc::RepeatedField<long> LikerId {
      get { return likerId_; }
    }

    /// <summary>Field number for the "consent_type" field.</summary>
    public const int ConsentTypeFieldNumber = 6;
    private int consentType_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int ConsentType {
      get { return consentType_; }
      set {
        consentType_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as Zan);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(Zan other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Num != other.Num) return false;
      if(!likerList_.Equals(other.likerList_)) return false;
      if (IsLiked != other.IsLiked) return false;
      if (LastTime != other.LastTime) return false;
      if(!likerId_.Equals(other.likerId_)) return false;
      if (ConsentType != other.ConsentType) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (Num != 0) hash ^= Num.GetHashCode();
      hash ^= likerList_.GetHashCode();
      if (IsLiked != 0) hash ^= IsLiked.GetHashCode();
      if (LastTime != 0) hash ^= LastTime.GetHashCode();
      hash ^= likerId_.GetHashCode();
      if (ConsentType != 0) hash ^= ConsentType.GetHashCode();
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
      if (Num != 0) {
        output.WriteRawTag(8);
        output.WriteInt32(Num);
      }
      likerList_.WriteTo(output, _repeated_likerList_codec);
      if (IsLiked != 0) {
        output.WriteRawTag(24);
        output.WriteInt32(IsLiked);
      }
      if (LastTime != 0) {
        output.WriteRawTag(32);
        output.WriteInt32(LastTime);
      }
      likerId_.WriteTo(output, _repeated_likerId_codec);
      if (ConsentType != 0) {
        output.WriteRawTag(48);
        output.WriteInt32(ConsentType);
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
      if (Num != 0) {
        output.WriteRawTag(8);
        output.WriteInt32(Num);
      }
      likerList_.WriteTo(ref output, _repeated_likerList_codec);
      if (IsLiked != 0) {
        output.WriteRawTag(24);
        output.WriteInt32(IsLiked);
      }
      if (LastTime != 0) {
        output.WriteRawTag(32);
        output.WriteInt32(LastTime);
      }
      likerId_.WriteTo(ref output, _repeated_likerId_codec);
      if (ConsentType != 0) {
        output.WriteRawTag(48);
        output.WriteInt32(ConsentType);
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
      if (Num != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(Num);
      }
      size += likerList_.CalculateSize(_repeated_likerList_codec);
      if (IsLiked != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(IsLiked);
      }
      if (LastTime != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(LastTime);
      }
      size += likerId_.CalculateSize(_repeated_likerId_codec);
      if (ConsentType != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(ConsentType);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(Zan other) {
      if (other == null) {
        return;
      }
      if (other.Num != 0) {
        Num = other.Num;
      }
      likerList_.Add(other.likerList_);
      if (other.IsLiked != 0) {
        IsLiked = other.IsLiked;
      }
      if (other.LastTime != 0) {
        LastTime = other.LastTime;
      }
      likerId_.Add(other.likerId_);
      if (other.ConsentType != 0) {
        ConsentType = other.ConsentType;
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
      if ((tag & 7) == 4) {
        // Abort on any end group tag.
        return;
      }
      switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 8: {
            Num = input.ReadInt32();
            break;
          }
          case 18: {
            likerList_.AddEntriesFrom(input, _repeated_likerList_codec);
            break;
          }
          case 24: {
            IsLiked = input.ReadInt32();
            break;
          }
          case 32: {
            LastTime = input.ReadInt32();
            break;
          }
          case 42:
          case 40: {
            likerId_.AddEntriesFrom(input, _repeated_likerId_codec);
            break;
          }
          case 48: {
            ConsentType = input.ReadInt32();
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
      if ((tag & 7) == 4) {
        // Abort on any end group tag.
        return;
      }
      switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 8: {
            Num = input.ReadInt32();
            break;
          }
          case 18: {
            likerList_.AddEntriesFrom(ref input, _repeated_likerList_codec);
            break;
          }
          case 24: {
            IsLiked = input.ReadInt32();
            break;
          }
          case 32: {
            LastTime = input.ReadInt32();
            break;
          }
          case 42:
          case 40: {
            likerId_.AddEntriesFrom(ref input, _repeated_likerId_codec);
            break;
          }
          case 48: {
            ConsentType = input.ReadInt32();
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
