// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: UserDeps/Ala/YyExt.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TbClient.UserDeps.Ala {

  /// <summary>Holder for reflection information generated from UserDeps/Ala/YyExt.proto</summary>
  public static partial class YyExtReflection {

    #region Descriptor
    /// <summary>File descriptor for UserDeps/Ala/YyExt.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static YyExtReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "ChhVc2VyRGVwcy9BbGEvWXlFeHQucHJvdG8SFXRiQ2xpZW50LnVzZXJEZXBz",
            "LmFsYSKVAQoFWXlFeHQSCwoDc2lkGAEgASgJEgwKBHNzaWQYAiABKAkSEwoL",
            "dGVtcGxhdGVfaWQYAyABKAkSDgoGeXlfdWlkGAQgASgJEhIKCmlzX3l5X2dh",
            "bWUYBSABKAUSEwoLc3RyZWFtX2luZm8YBiABKAkSEQoJcmFua19zaG93GAcg",
            "ASgJEhAKCGljb25fdXJsGAggASgJYgZwcm90bzM="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TbClient.UserDeps.Ala.YyExt), global::TbClient.UserDeps.Ala.YyExt.Parser, new[]{ "Sid", "Ssid", "TemplateId", "YyUid", "IsYyGame", "StreamInfo", "RankShow", "IconUrl" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class YyExt : pb::IMessage<YyExt>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<YyExt> _parser = new pb::MessageParser<YyExt>(() => new YyExt());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<YyExt> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TbClient.UserDeps.Ala.YyExtReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public YyExt() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public YyExt(YyExt other) : this() {
      sid_ = other.sid_;
      ssid_ = other.ssid_;
      templateId_ = other.templateId_;
      yyUid_ = other.yyUid_;
      isYyGame_ = other.isYyGame_;
      streamInfo_ = other.streamInfo_;
      rankShow_ = other.rankShow_;
      iconUrl_ = other.iconUrl_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public YyExt Clone() {
      return new YyExt(this);
    }

    /// <summary>Field number for the "sid" field.</summary>
    public const int SidFieldNumber = 1;
    private string sid_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Sid {
      get { return sid_; }
      set {
        sid_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "ssid" field.</summary>
    public const int SsidFieldNumber = 2;
    private string ssid_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Ssid {
      get { return ssid_; }
      set {
        ssid_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "template_id" field.</summary>
    public const int TemplateIdFieldNumber = 3;
    private string templateId_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string TemplateId {
      get { return templateId_; }
      set {
        templateId_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "yy_uid" field.</summary>
    public const int YyUidFieldNumber = 4;
    private string yyUid_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string YyUid {
      get { return yyUid_; }
      set {
        yyUid_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "is_yy_game" field.</summary>
    public const int IsYyGameFieldNumber = 5;
    private int isYyGame_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int IsYyGame {
      get { return isYyGame_; }
      set {
        isYyGame_ = value;
      }
    }

    /// <summary>Field number for the "stream_info" field.</summary>
    public const int StreamInfoFieldNumber = 6;
    private string streamInfo_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string StreamInfo {
      get { return streamInfo_; }
      set {
        streamInfo_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "rank_show" field.</summary>
    public const int RankShowFieldNumber = 7;
    private string rankShow_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string RankShow {
      get { return rankShow_; }
      set {
        rankShow_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "icon_url" field.</summary>
    public const int IconUrlFieldNumber = 8;
    private string iconUrl_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string IconUrl {
      get { return iconUrl_; }
      set {
        iconUrl_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as YyExt);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(YyExt other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Sid != other.Sid) return false;
      if (Ssid != other.Ssid) return false;
      if (TemplateId != other.TemplateId) return false;
      if (YyUid != other.YyUid) return false;
      if (IsYyGame != other.IsYyGame) return false;
      if (StreamInfo != other.StreamInfo) return false;
      if (RankShow != other.RankShow) return false;
      if (IconUrl != other.IconUrl) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (Sid.Length != 0) hash ^= Sid.GetHashCode();
      if (Ssid.Length != 0) hash ^= Ssid.GetHashCode();
      if (TemplateId.Length != 0) hash ^= TemplateId.GetHashCode();
      if (YyUid.Length != 0) hash ^= YyUid.GetHashCode();
      if (IsYyGame != 0) hash ^= IsYyGame.GetHashCode();
      if (StreamInfo.Length != 0) hash ^= StreamInfo.GetHashCode();
      if (RankShow.Length != 0) hash ^= RankShow.GetHashCode();
      if (IconUrl.Length != 0) hash ^= IconUrl.GetHashCode();
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
      if (Sid.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Sid);
      }
      if (Ssid.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Ssid);
      }
      if (TemplateId.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(TemplateId);
      }
      if (YyUid.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(YyUid);
      }
      if (IsYyGame != 0) {
        output.WriteRawTag(40);
        output.WriteInt32(IsYyGame);
      }
      if (StreamInfo.Length != 0) {
        output.WriteRawTag(50);
        output.WriteString(StreamInfo);
      }
      if (RankShow.Length != 0) {
        output.WriteRawTag(58);
        output.WriteString(RankShow);
      }
      if (IconUrl.Length != 0) {
        output.WriteRawTag(66);
        output.WriteString(IconUrl);
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
      if (Sid.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Sid);
      }
      if (Ssid.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Ssid);
      }
      if (TemplateId.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(TemplateId);
      }
      if (YyUid.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(YyUid);
      }
      if (IsYyGame != 0) {
        output.WriteRawTag(40);
        output.WriteInt32(IsYyGame);
      }
      if (StreamInfo.Length != 0) {
        output.WriteRawTag(50);
        output.WriteString(StreamInfo);
      }
      if (RankShow.Length != 0) {
        output.WriteRawTag(58);
        output.WriteString(RankShow);
      }
      if (IconUrl.Length != 0) {
        output.WriteRawTag(66);
        output.WriteString(IconUrl);
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
      if (Sid.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Sid);
      }
      if (Ssid.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Ssid);
      }
      if (TemplateId.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(TemplateId);
      }
      if (YyUid.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(YyUid);
      }
      if (IsYyGame != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(IsYyGame);
      }
      if (StreamInfo.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(StreamInfo);
      }
      if (RankShow.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(RankShow);
      }
      if (IconUrl.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(IconUrl);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(YyExt other) {
      if (other == null) {
        return;
      }
      if (other.Sid.Length != 0) {
        Sid = other.Sid;
      }
      if (other.Ssid.Length != 0) {
        Ssid = other.Ssid;
      }
      if (other.TemplateId.Length != 0) {
        TemplateId = other.TemplateId;
      }
      if (other.YyUid.Length != 0) {
        YyUid = other.YyUid;
      }
      if (other.IsYyGame != 0) {
        IsYyGame = other.IsYyGame;
      }
      if (other.StreamInfo.Length != 0) {
        StreamInfo = other.StreamInfo;
      }
      if (other.RankShow.Length != 0) {
        RankShow = other.RankShow;
      }
      if (other.IconUrl.Length != 0) {
        IconUrl = other.IconUrl;
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
          case 10: {
            Sid = input.ReadString();
            break;
          }
          case 18: {
            Ssid = input.ReadString();
            break;
          }
          case 26: {
            TemplateId = input.ReadString();
            break;
          }
          case 34: {
            YyUid = input.ReadString();
            break;
          }
          case 40: {
            IsYyGame = input.ReadInt32();
            break;
          }
          case 50: {
            StreamInfo = input.ReadString();
            break;
          }
          case 58: {
            RankShow = input.ReadString();
            break;
          }
          case 66: {
            IconUrl = input.ReadString();
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
          case 10: {
            Sid = input.ReadString();
            break;
          }
          case 18: {
            Ssid = input.ReadString();
            break;
          }
          case 26: {
            TemplateId = input.ReadString();
            break;
          }
          case 34: {
            YyUid = input.ReadString();
            break;
          }
          case 40: {
            IsYyGame = input.ReadInt32();
            break;
          }
          case 50: {
            StreamInfo = input.ReadString();
            break;
          }
          case 58: {
            RankShow = input.ReadString();
            break;
          }
          case 66: {
            IconUrl = input.ReadString();
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
