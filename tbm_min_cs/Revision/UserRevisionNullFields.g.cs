// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Revision/UserRevisionNullFields.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TbClient.Revision {

  /// <summary>Holder for reflection information generated from Revision/UserRevisionNullFields.proto</summary>
  public static partial class UserRevisionNullFieldsReflection {

    #region Descriptor
    /// <summary>File descriptor for Revision/UserRevisionNullFields.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static UserRevisionNullFieldsReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CiVSZXZpc2lvbi9Vc2VyUmV2aXNpb25OdWxsRmllbGRzLnByb3RvEhF0YkNs",
            "aWVudC5yZXZpc2lvbiKGAQoWVXNlclJldmlzaW9uTnVsbEZpZWxkcxIMCgRu",
            "YW1lGAEgASgIEhMKC2Rpc3BsYXlOYW1lGAIgASgIEhEKCWF2YXRhclVybBgD",
            "IAEoCBIOCgZnZW5kZXIYBCABKAgSFAoMZmFuc05pY2tuYW1lGAUgASgIEhAK",
            "CGljb25JbmZvGAYgASgIYgZwcm90bzM="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TbClient.Revision.UserRevisionNullFields), global::TbClient.Revision.UserRevisionNullFields.Parser, new[]{ "Name", "DisplayName", "AvatarUrl", "Gender", "FansNickname", "IconInfo" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class UserRevisionNullFields : pb::IMessage<UserRevisionNullFields>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<UserRevisionNullFields> _parser = new pb::MessageParser<UserRevisionNullFields>(() => new UserRevisionNullFields());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<UserRevisionNullFields> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TbClient.Revision.UserRevisionNullFieldsReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public UserRevisionNullFields() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public UserRevisionNullFields(UserRevisionNullFields other) : this() {
      name_ = other.name_;
      displayName_ = other.displayName_;
      avatarUrl_ = other.avatarUrl_;
      gender_ = other.gender_;
      fansNickname_ = other.fansNickname_;
      iconInfo_ = other.iconInfo_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public UserRevisionNullFields Clone() {
      return new UserRevisionNullFields(this);
    }

    /// <summary>Field number for the "name" field.</summary>
    public const int NameFieldNumber = 1;
    private bool name_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Name {
      get { return name_; }
      set {
        name_ = value;
      }
    }

    /// <summary>Field number for the "displayName" field.</summary>
    public const int DisplayNameFieldNumber = 2;
    private bool displayName_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool DisplayName {
      get { return displayName_; }
      set {
        displayName_ = value;
      }
    }

    /// <summary>Field number for the "avatarUrl" field.</summary>
    public const int AvatarUrlFieldNumber = 3;
    private bool avatarUrl_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool AvatarUrl {
      get { return avatarUrl_; }
      set {
        avatarUrl_ = value;
      }
    }

    /// <summary>Field number for the "gender" field.</summary>
    public const int GenderFieldNumber = 4;
    private bool gender_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Gender {
      get { return gender_; }
      set {
        gender_ = value;
      }
    }

    /// <summary>Field number for the "fansNickname" field.</summary>
    public const int FansNicknameFieldNumber = 5;
    private bool fansNickname_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool FansNickname {
      get { return fansNickname_; }
      set {
        fansNickname_ = value;
      }
    }

    /// <summary>Field number for the "iconInfo" field.</summary>
    public const int IconInfoFieldNumber = 6;
    private bool iconInfo_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool IconInfo {
      get { return iconInfo_; }
      set {
        iconInfo_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as UserRevisionNullFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(UserRevisionNullFields other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Name != other.Name) return false;
      if (DisplayName != other.DisplayName) return false;
      if (AvatarUrl != other.AvatarUrl) return false;
      if (Gender != other.Gender) return false;
      if (FansNickname != other.FansNickname) return false;
      if (IconInfo != other.IconInfo) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (Name != false) hash ^= Name.GetHashCode();
      if (DisplayName != false) hash ^= DisplayName.GetHashCode();
      if (AvatarUrl != false) hash ^= AvatarUrl.GetHashCode();
      if (Gender != false) hash ^= Gender.GetHashCode();
      if (FansNickname != false) hash ^= FansNickname.GetHashCode();
      if (IconInfo != false) hash ^= IconInfo.GetHashCode();
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
      if (Name != false) {
        output.WriteRawTag(8);
        output.WriteBool(Name);
      }
      if (DisplayName != false) {
        output.WriteRawTag(16);
        output.WriteBool(DisplayName);
      }
      if (AvatarUrl != false) {
        output.WriteRawTag(24);
        output.WriteBool(AvatarUrl);
      }
      if (Gender != false) {
        output.WriteRawTag(32);
        output.WriteBool(Gender);
      }
      if (FansNickname != false) {
        output.WriteRawTag(40);
        output.WriteBool(FansNickname);
      }
      if (IconInfo != false) {
        output.WriteRawTag(48);
        output.WriteBool(IconInfo);
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
      if (Name != false) {
        output.WriteRawTag(8);
        output.WriteBool(Name);
      }
      if (DisplayName != false) {
        output.WriteRawTag(16);
        output.WriteBool(DisplayName);
      }
      if (AvatarUrl != false) {
        output.WriteRawTag(24);
        output.WriteBool(AvatarUrl);
      }
      if (Gender != false) {
        output.WriteRawTag(32);
        output.WriteBool(Gender);
      }
      if (FansNickname != false) {
        output.WriteRawTag(40);
        output.WriteBool(FansNickname);
      }
      if (IconInfo != false) {
        output.WriteRawTag(48);
        output.WriteBool(IconInfo);
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
      if (Name != false) {
        size += 1 + 1;
      }
      if (DisplayName != false) {
        size += 1 + 1;
      }
      if (AvatarUrl != false) {
        size += 1 + 1;
      }
      if (Gender != false) {
        size += 1 + 1;
      }
      if (FansNickname != false) {
        size += 1 + 1;
      }
      if (IconInfo != false) {
        size += 1 + 1;
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(UserRevisionNullFields other) {
      if (other == null) {
        return;
      }
      if (other.Name != false) {
        Name = other.Name;
      }
      if (other.DisplayName != false) {
        DisplayName = other.DisplayName;
      }
      if (other.AvatarUrl != false) {
        AvatarUrl = other.AvatarUrl;
      }
      if (other.Gender != false) {
        Gender = other.Gender;
      }
      if (other.FansNickname != false) {
        FansNickname = other.FansNickname;
      }
      if (other.IconInfo != false) {
        IconInfo = other.IconInfo;
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
            Name = input.ReadBool();
            break;
          }
          case 16: {
            DisplayName = input.ReadBool();
            break;
          }
          case 24: {
            AvatarUrl = input.ReadBool();
            break;
          }
          case 32: {
            Gender = input.ReadBool();
            break;
          }
          case 40: {
            FansNickname = input.ReadBool();
            break;
          }
          case 48: {
            IconInfo = input.ReadBool();
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
            Name = input.ReadBool();
            break;
          }
          case 16: {
            DisplayName = input.ReadBool();
            break;
          }
          case 24: {
            AvatarUrl = input.ReadBool();
            break;
          }
          case 32: {
            Gender = input.ReadBool();
            break;
          }
          case 40: {
            FansNickname = input.ReadBool();
            break;
          }
          case 48: {
            IconInfo = input.ReadBool();
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
