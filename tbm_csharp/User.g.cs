// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: User.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TbClient {

  /// <summary>Holder for reflection information generated from User.proto</summary>
  public static partial class UserReflection {

    #region Descriptor
    /// <summary>File descriptor for User.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static UserReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CgpVc2VyLnByb3RvEgh0YkNsaWVudBoTVXNlckRlcHMvSWNvbi5wcm90byKQ",
            "AgoEVXNlchILCgN1aWQYAiABKAMSDAoEbmFtZRgDIAEoCRIRCgluYW1lX3No",
            "b3cYBCABKAkSEAoIcG9ydHJhaXQYBSABKAkSKQoIaWNvbmluZm8YESADKAsy",
            "Fy50YkNsaWVudC51c2VyRGVwcy5JY29uEhAKCGxldmVsX2lkGBcgASgFEg4K",
            "BmdlbmRlchgqIAEoBRIVCg1mYW5zX25pY2tuYW1lGDkgASgJEiwKCGFsYV9p",
            "bmZvGE4gASgLMhoudGJDbGllbnQuVXNlci5BbGFVc2VySW5mbxISCgppcF9h",
            "ZGRyZXNzGH8gASgJGiIKC0FsYVVzZXJJbmZvEhMKC2xpdmVfc3RhdHVzGAgg",
            "ASgNYgZwcm90bzM="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::TbClient.UserDeps.IconReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TbClient.User), global::TbClient.User.Parser, new[]{ "Uid", "Name", "NameShow", "Portrait", "Iconinfo", "LevelId", "Gender", "FansNickname", "AlaInfo", "IpAddress" }, null, null, null, new pbr::GeneratedClrTypeInfo[] { new pbr::GeneratedClrTypeInfo(typeof(global::TbClient.User.Types.AlaUserInfo), global::TbClient.User.Types.AlaUserInfo.Parser, new[]{ "LiveStatus" }, null, null, null, null)})
          }));
    }
    #endregion

  }
  #region Messages
  [global::System.Diagnostics.DebuggerDisplayAttribute("{ToString(),nq}")]
  public sealed partial class User : pb::IMessage<User>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<User> _parser = new pb::MessageParser<User>(() => new User());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<User> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TbClient.UserReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public User() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public User(User other) : this() {
      uid_ = other.uid_;
      name_ = other.name_;
      nameShow_ = other.nameShow_;
      portrait_ = other.portrait_;
      iconinfo_ = other.iconinfo_.Clone();
      levelId_ = other.levelId_;
      gender_ = other.gender_;
      fansNickname_ = other.fansNickname_;
      alaInfo_ = other.alaInfo_ != null ? other.alaInfo_.Clone() : null;
      ipAddress_ = other.ipAddress_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public User Clone() {
      return new User(this);
    }

    /// <summary>Field number for the "uid" field.</summary>
    public const int UidFieldNumber = 2;
    private long uid_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public long Uid {
      get { return uid_; }
      set {
        uid_ = value;
      }
    }

    /// <summary>Field number for the "name" field.</summary>
    public const int NameFieldNumber = 3;
    private string name_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Name {
      get { return name_; }
      set {
        name_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "name_show" field.</summary>
    public const int NameShowFieldNumber = 4;
    private string nameShow_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string NameShow {
      get { return nameShow_; }
      set {
        nameShow_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "portrait" field.</summary>
    public const int PortraitFieldNumber = 5;
    private string portrait_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Portrait {
      get { return portrait_; }
      set {
        portrait_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "iconinfo" field.</summary>
    public const int IconinfoFieldNumber = 17;
    private static readonly pb::FieldCodec<global::TbClient.UserDeps.Icon> _repeated_iconinfo_codec
        = pb::FieldCodec.ForMessage(138, global::TbClient.UserDeps.Icon.Parser);
    private readonly pbc::RepeatedField<global::TbClient.UserDeps.Icon> iconinfo_ = new pbc::RepeatedField<global::TbClient.UserDeps.Icon>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public pbc::RepeatedField<global::TbClient.UserDeps.Icon> Iconinfo {
      get { return iconinfo_; }
    }

    /// <summary>Field number for the "level_id" field.</summary>
    public const int LevelIdFieldNumber = 23;
    private int levelId_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int LevelId {
      get { return levelId_; }
      set {
        levelId_ = value;
      }
    }

    /// <summary>Field number for the "gender" field.</summary>
    public const int GenderFieldNumber = 42;
    private int gender_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int Gender {
      get { return gender_; }
      set {
        gender_ = value;
      }
    }

    /// <summary>Field number for the "fans_nickname" field.</summary>
    public const int FansNicknameFieldNumber = 57;
    private string fansNickname_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string FansNickname {
      get { return fansNickname_; }
      set {
        fansNickname_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "ala_info" field.</summary>
    public const int AlaInfoFieldNumber = 78;
    private global::TbClient.User.Types.AlaUserInfo alaInfo_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::TbClient.User.Types.AlaUserInfo AlaInfo {
      get { return alaInfo_; }
      set {
        alaInfo_ = value;
      }
    }

    /// <summary>Field number for the "ip_address" field.</summary>
    public const int IpAddressFieldNumber = 127;
    private string ipAddress_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string IpAddress {
      get { return ipAddress_; }
      set {
        ipAddress_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as User);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(User other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Uid != other.Uid) return false;
      if (Name != other.Name) return false;
      if (NameShow != other.NameShow) return false;
      if (Portrait != other.Portrait) return false;
      if(!iconinfo_.Equals(other.iconinfo_)) return false;
      if (LevelId != other.LevelId) return false;
      if (Gender != other.Gender) return false;
      if (FansNickname != other.FansNickname) return false;
      if (!object.Equals(AlaInfo, other.AlaInfo)) return false;
      if (IpAddress != other.IpAddress) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (Uid != 0L) hash ^= Uid.GetHashCode();
      if (Name.Length != 0) hash ^= Name.GetHashCode();
      if (NameShow.Length != 0) hash ^= NameShow.GetHashCode();
      if (Portrait.Length != 0) hash ^= Portrait.GetHashCode();
      hash ^= iconinfo_.GetHashCode();
      if (LevelId != 0) hash ^= LevelId.GetHashCode();
      if (Gender != 0) hash ^= Gender.GetHashCode();
      if (FansNickname.Length != 0) hash ^= FansNickname.GetHashCode();
      if (alaInfo_ != null) hash ^= AlaInfo.GetHashCode();
      if (IpAddress.Length != 0) hash ^= IpAddress.GetHashCode();
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
      if (Uid != 0L) {
        output.WriteRawTag(16);
        output.WriteInt64(Uid);
      }
      if (Name.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(Name);
      }
      if (NameShow.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(NameShow);
      }
      if (Portrait.Length != 0) {
        output.WriteRawTag(42);
        output.WriteString(Portrait);
      }
      iconinfo_.WriteTo(output, _repeated_iconinfo_codec);
      if (LevelId != 0) {
        output.WriteRawTag(184, 1);
        output.WriteInt32(LevelId);
      }
      if (Gender != 0) {
        output.WriteRawTag(208, 2);
        output.WriteInt32(Gender);
      }
      if (FansNickname.Length != 0) {
        output.WriteRawTag(202, 3);
        output.WriteString(FansNickname);
      }
      if (alaInfo_ != null) {
        output.WriteRawTag(242, 4);
        output.WriteMessage(AlaInfo);
      }
      if (IpAddress.Length != 0) {
        output.WriteRawTag(250, 7);
        output.WriteString(IpAddress);
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
      if (Uid != 0L) {
        output.WriteRawTag(16);
        output.WriteInt64(Uid);
      }
      if (Name.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(Name);
      }
      if (NameShow.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(NameShow);
      }
      if (Portrait.Length != 0) {
        output.WriteRawTag(42);
        output.WriteString(Portrait);
      }
      iconinfo_.WriteTo(ref output, _repeated_iconinfo_codec);
      if (LevelId != 0) {
        output.WriteRawTag(184, 1);
        output.WriteInt32(LevelId);
      }
      if (Gender != 0) {
        output.WriteRawTag(208, 2);
        output.WriteInt32(Gender);
      }
      if (FansNickname.Length != 0) {
        output.WriteRawTag(202, 3);
        output.WriteString(FansNickname);
      }
      if (alaInfo_ != null) {
        output.WriteRawTag(242, 4);
        output.WriteMessage(AlaInfo);
      }
      if (IpAddress.Length != 0) {
        output.WriteRawTag(250, 7);
        output.WriteString(IpAddress);
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
      if (Uid != 0L) {
        size += 1 + pb::CodedOutputStream.ComputeInt64Size(Uid);
      }
      if (Name.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Name);
      }
      if (NameShow.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(NameShow);
      }
      if (Portrait.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Portrait);
      }
      size += iconinfo_.CalculateSize(_repeated_iconinfo_codec);
      if (LevelId != 0) {
        size += 2 + pb::CodedOutputStream.ComputeInt32Size(LevelId);
      }
      if (Gender != 0) {
        size += 2 + pb::CodedOutputStream.ComputeInt32Size(Gender);
      }
      if (FansNickname.Length != 0) {
        size += 2 + pb::CodedOutputStream.ComputeStringSize(FansNickname);
      }
      if (alaInfo_ != null) {
        size += 2 + pb::CodedOutputStream.ComputeMessageSize(AlaInfo);
      }
      if (IpAddress.Length != 0) {
        size += 2 + pb::CodedOutputStream.ComputeStringSize(IpAddress);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(User other) {
      if (other == null) {
        return;
      }
      if (other.Uid != 0L) {
        Uid = other.Uid;
      }
      if (other.Name.Length != 0) {
        Name = other.Name;
      }
      if (other.NameShow.Length != 0) {
        NameShow = other.NameShow;
      }
      if (other.Portrait.Length != 0) {
        Portrait = other.Portrait;
      }
      iconinfo_.Add(other.iconinfo_);
      if (other.LevelId != 0) {
        LevelId = other.LevelId;
      }
      if (other.Gender != 0) {
        Gender = other.Gender;
      }
      if (other.FansNickname.Length != 0) {
        FansNickname = other.FansNickname;
      }
      if (other.alaInfo_ != null) {
        if (alaInfo_ == null) {
          AlaInfo = new global::TbClient.User.Types.AlaUserInfo();
        }
        AlaInfo.MergeFrom(other.AlaInfo);
      }
      if (other.IpAddress.Length != 0) {
        IpAddress = other.IpAddress;
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
          case 16: {
            Uid = input.ReadInt64();
            break;
          }
          case 26: {
            Name = input.ReadString();
            break;
          }
          case 34: {
            NameShow = input.ReadString();
            break;
          }
          case 42: {
            Portrait = input.ReadString();
            break;
          }
          case 138: {
            iconinfo_.AddEntriesFrom(input, _repeated_iconinfo_codec);
            break;
          }
          case 184: {
            LevelId = input.ReadInt32();
            break;
          }
          case 336: {
            Gender = input.ReadInt32();
            break;
          }
          case 458: {
            FansNickname = input.ReadString();
            break;
          }
          case 626: {
            if (alaInfo_ == null) {
              AlaInfo = new global::TbClient.User.Types.AlaUserInfo();
            }
            input.ReadMessage(AlaInfo);
            break;
          }
          case 1018: {
            IpAddress = input.ReadString();
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
          case 16: {
            Uid = input.ReadInt64();
            break;
          }
          case 26: {
            Name = input.ReadString();
            break;
          }
          case 34: {
            NameShow = input.ReadString();
            break;
          }
          case 42: {
            Portrait = input.ReadString();
            break;
          }
          case 138: {
            iconinfo_.AddEntriesFrom(ref input, _repeated_iconinfo_codec);
            break;
          }
          case 184: {
            LevelId = input.ReadInt32();
            break;
          }
          case 336: {
            Gender = input.ReadInt32();
            break;
          }
          case 458: {
            FansNickname = input.ReadString();
            break;
          }
          case 626: {
            if (alaInfo_ == null) {
              AlaInfo = new global::TbClient.User.Types.AlaUserInfo();
            }
            input.ReadMessage(AlaInfo);
            break;
          }
          case 1018: {
            IpAddress = input.ReadString();
            break;
          }
        }
      }
    }
    #endif

    #region Nested types
    /// <summary>Container for nested types declared in the User message type.</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static partial class Types {
      [global::System.Diagnostics.DebuggerDisplayAttribute("{ToString(),nq}")]
      public sealed partial class AlaUserInfo : pb::IMessage<AlaUserInfo>
      #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
          , pb::IBufferMessage
      #endif
      {
        private static readonly pb::MessageParser<AlaUserInfo> _parser = new pb::MessageParser<AlaUserInfo>(() => new AlaUserInfo());
        private pb::UnknownFieldSet _unknownFields;
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public static pb::MessageParser<AlaUserInfo> Parser { get { return _parser; } }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public static pbr::MessageDescriptor Descriptor {
          get { return global::TbClient.User.Descriptor.NestedTypes[0]; }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        pbr::MessageDescriptor pb::IMessage.Descriptor {
          get { return Descriptor; }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public AlaUserInfo() {
          OnConstruction();
        }

        partial void OnConstruction();

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public AlaUserInfo(AlaUserInfo other) : this() {
          liveStatus_ = other.liveStatus_;
          _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public AlaUserInfo Clone() {
          return new AlaUserInfo(this);
        }

        /// <summary>Field number for the "live_status" field.</summary>
        public const int LiveStatusFieldNumber = 8;
        private uint liveStatus_;
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public uint LiveStatus {
          get { return liveStatus_; }
          set {
            liveStatus_ = value;
          }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public override bool Equals(object other) {
          return Equals(other as AlaUserInfo);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public bool Equals(AlaUserInfo other) {
          if (ReferenceEquals(other, null)) {
            return false;
          }
          if (ReferenceEquals(other, this)) {
            return true;
          }
          if (LiveStatus != other.LiveStatus) return false;
          return Equals(_unknownFields, other._unknownFields);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public override int GetHashCode() {
          int hash = 1;
          if (LiveStatus != 0) hash ^= LiveStatus.GetHashCode();
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
          if (LiveStatus != 0) {
            output.WriteRawTag(64);
            output.WriteUInt32(LiveStatus);
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
          if (LiveStatus != 0) {
            output.WriteRawTag(64);
            output.WriteUInt32(LiveStatus);
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
          if (LiveStatus != 0) {
            size += 1 + pb::CodedOutputStream.ComputeUInt32Size(LiveStatus);
          }
          if (_unknownFields != null) {
            size += _unknownFields.CalculateSize();
          }
          return size;
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public void MergeFrom(AlaUserInfo other) {
          if (other == null) {
            return;
          }
          if (other.LiveStatus != 0) {
            LiveStatus = other.LiveStatus;
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
              case 64: {
                LiveStatus = input.ReadUInt32();
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
              case 64: {
                LiveStatus = input.ReadUInt32();
                break;
              }
            }
          }
        }
        #endif

      }

    }
    #endregion

  }

  #endregion

}

#endregion Designer generated code