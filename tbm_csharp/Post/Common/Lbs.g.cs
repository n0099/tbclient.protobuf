// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Post/Common/Lbs.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TbClient.Post.Common {

  /// <summary>Holder for reflection information generated from Post/Common/Lbs.proto</summary>
  public static partial class LbsReflection {

    #region Descriptor
    /// <summary>File descriptor for Post/Common/Lbs.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static LbsReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "ChVQb3N0L0NvbW1vbi9MYnMucHJvdG8SFHRiQ2xpZW50LnBvc3QuY29tbW9u",
            "IksKA0xicxILCgNsYXQYASABKAkSCwoDbG5nGAIgASgJEgwKBG5hbWUYAyAB",
            "KAkSCgoCc24YBCABKAkSEAoIZGlzdGFuY2UYBSABKAliBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TbClient.Post.Common.Lbs), global::TbClient.Post.Common.Lbs.Parser, new[]{ "Lat", "Lng", "Name", "Sn", "Distance" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  [global::System.Diagnostics.DebuggerDisplayAttribute("{ToString(),nq}")]
  public sealed partial class Lbs : pb::IMessage<Lbs>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<Lbs> _parser = new pb::MessageParser<Lbs>(() => new Lbs());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<Lbs> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TbClient.Post.Common.LbsReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Lbs() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Lbs(Lbs other) : this() {
      lat_ = other.lat_;
      lng_ = other.lng_;
      name_ = other.name_;
      sn_ = other.sn_;
      distance_ = other.distance_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Lbs Clone() {
      return new Lbs(this);
    }

    /// <summary>Field number for the "lat" field.</summary>
    public const int LatFieldNumber = 1;
    private string lat_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Lat {
      get { return lat_; }
      set {
        lat_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "lng" field.</summary>
    public const int LngFieldNumber = 2;
    private string lng_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Lng {
      get { return lng_; }
      set {
        lng_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
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

    /// <summary>Field number for the "sn" field.</summary>
    public const int SnFieldNumber = 4;
    private string sn_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Sn {
      get { return sn_; }
      set {
        sn_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "distance" field.</summary>
    public const int DistanceFieldNumber = 5;
    private string distance_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Distance {
      get { return distance_; }
      set {
        distance_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as Lbs);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(Lbs other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Lat != other.Lat) return false;
      if (Lng != other.Lng) return false;
      if (Name != other.Name) return false;
      if (Sn != other.Sn) return false;
      if (Distance != other.Distance) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (Lat.Length != 0) hash ^= Lat.GetHashCode();
      if (Lng.Length != 0) hash ^= Lng.GetHashCode();
      if (Name.Length != 0) hash ^= Name.GetHashCode();
      if (Sn.Length != 0) hash ^= Sn.GetHashCode();
      if (Distance.Length != 0) hash ^= Distance.GetHashCode();
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
      if (Lat.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Lat);
      }
      if (Lng.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Lng);
      }
      if (Name.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(Name);
      }
      if (Sn.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(Sn);
      }
      if (Distance.Length != 0) {
        output.WriteRawTag(42);
        output.WriteString(Distance);
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
      if (Lat.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Lat);
      }
      if (Lng.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Lng);
      }
      if (Name.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(Name);
      }
      if (Sn.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(Sn);
      }
      if (Distance.Length != 0) {
        output.WriteRawTag(42);
        output.WriteString(Distance);
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
      if (Lat.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Lat);
      }
      if (Lng.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Lng);
      }
      if (Name.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Name);
      }
      if (Sn.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Sn);
      }
      if (Distance.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Distance);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(Lbs other) {
      if (other == null) {
        return;
      }
      if (other.Lat.Length != 0) {
        Lat = other.Lat;
      }
      if (other.Lng.Length != 0) {
        Lng = other.Lng;
      }
      if (other.Name.Length != 0) {
        Name = other.Name;
      }
      if (other.Sn.Length != 0) {
        Sn = other.Sn;
      }
      if (other.Distance.Length != 0) {
        Distance = other.Distance;
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
          case 10: {
            Lat = input.ReadString();
            break;
          }
          case 18: {
            Lng = input.ReadString();
            break;
          }
          case 26: {
            Name = input.ReadString();
            break;
          }
          case 34: {
            Sn = input.ReadString();
            break;
          }
          case 42: {
            Distance = input.ReadString();
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
          case 10: {
            Lat = input.ReadString();
            break;
          }
          case 18: {
            Lng = input.ReadString();
            break;
          }
          case 26: {
            Name = input.ReadString();
            break;
          }
          case 34: {
            Sn = input.ReadString();
            break;
          }
          case 42: {
            Distance = input.ReadString();
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
