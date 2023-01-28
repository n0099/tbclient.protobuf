// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Post/Common/Abstract.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TbClient.Post.Common {

  /// <summary>Holder for reflection information generated from Post/Common/Abstract.proto</summary>
  public static partial class AbstractReflection {

    #region Descriptor
    /// <summary>File descriptor for Post/Common/Abstract.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static AbstractReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "ChpQb3N0L0NvbW1vbi9BYnN0cmFjdC5wcm90bxIUdGJDbGllbnQucG9zdC5j",
            "b21tb24idQoIQWJzdHJhY3QSDAoEdHlwZRgBIAEoBRIMCgR0ZXh0GAIgASgJ",
            "EgwKBGxpbmsYAyABKAkSCwoDc3JjGAQgASgJEgoKAnVuGAUgASgJEhMKC2R1",
            "cmluZ190aW1lGAYgASgJEhEKCXZvaWNlX21kNRgHIAEoCWIGcHJvdG8z"));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TbClient.Post.Common.Abstract), global::TbClient.Post.Common.Abstract.Parser, new[]{ "Type", "Text", "Link", "Src", "Un", "DuringTime", "VoiceMd5" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class Abstract : pb::IMessage<Abstract>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<Abstract> _parser = new pb::MessageParser<Abstract>(() => new Abstract());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<Abstract> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TbClient.Post.Common.AbstractReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Abstract() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Abstract(Abstract other) : this() {
      type_ = other.type_;
      text_ = other.text_;
      link_ = other.link_;
      src_ = other.src_;
      un_ = other.un_;
      duringTime_ = other.duringTime_;
      voiceMd5_ = other.voiceMd5_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Abstract Clone() {
      return new Abstract(this);
    }

    /// <summary>Field number for the "type" field.</summary>
    public const int TypeFieldNumber = 1;
    private int type_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int Type {
      get { return type_; }
      set {
        type_ = value;
      }
    }

    /// <summary>Field number for the "text" field.</summary>
    public const int TextFieldNumber = 2;
    private string text_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Text {
      get { return text_; }
      set {
        text_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "link" field.</summary>
    public const int LinkFieldNumber = 3;
    private string link_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Link {
      get { return link_; }
      set {
        link_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "src" field.</summary>
    public const int SrcFieldNumber = 4;
    private string src_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Src {
      get { return src_; }
      set {
        src_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "un" field.</summary>
    public const int UnFieldNumber = 5;
    private string un_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Un {
      get { return un_; }
      set {
        un_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "during_time" field.</summary>
    public const int DuringTimeFieldNumber = 6;
    private string duringTime_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string DuringTime {
      get { return duringTime_; }
      set {
        duringTime_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "voice_md5" field.</summary>
    public const int VoiceMd5FieldNumber = 7;
    private string voiceMd5_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string VoiceMd5 {
      get { return voiceMd5_; }
      set {
        voiceMd5_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as Abstract);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(Abstract other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Type != other.Type) return false;
      if (Text != other.Text) return false;
      if (Link != other.Link) return false;
      if (Src != other.Src) return false;
      if (Un != other.Un) return false;
      if (DuringTime != other.DuringTime) return false;
      if (VoiceMd5 != other.VoiceMd5) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (Type != 0) hash ^= Type.GetHashCode();
      if (Text.Length != 0) hash ^= Text.GetHashCode();
      if (Link.Length != 0) hash ^= Link.GetHashCode();
      if (Src.Length != 0) hash ^= Src.GetHashCode();
      if (Un.Length != 0) hash ^= Un.GetHashCode();
      if (DuringTime.Length != 0) hash ^= DuringTime.GetHashCode();
      if (VoiceMd5.Length != 0) hash ^= VoiceMd5.GetHashCode();
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
      if (Type != 0) {
        output.WriteRawTag(8);
        output.WriteInt32(Type);
      }
      if (Text.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Text);
      }
      if (Link.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(Link);
      }
      if (Src.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(Src);
      }
      if (Un.Length != 0) {
        output.WriteRawTag(42);
        output.WriteString(Un);
      }
      if (DuringTime.Length != 0) {
        output.WriteRawTag(50);
        output.WriteString(DuringTime);
      }
      if (VoiceMd5.Length != 0) {
        output.WriteRawTag(58);
        output.WriteString(VoiceMd5);
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
      if (Type != 0) {
        output.WriteRawTag(8);
        output.WriteInt32(Type);
      }
      if (Text.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Text);
      }
      if (Link.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(Link);
      }
      if (Src.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(Src);
      }
      if (Un.Length != 0) {
        output.WriteRawTag(42);
        output.WriteString(Un);
      }
      if (DuringTime.Length != 0) {
        output.WriteRawTag(50);
        output.WriteString(DuringTime);
      }
      if (VoiceMd5.Length != 0) {
        output.WriteRawTag(58);
        output.WriteString(VoiceMd5);
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
      if (Type != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(Type);
      }
      if (Text.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Text);
      }
      if (Link.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Link);
      }
      if (Src.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Src);
      }
      if (Un.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Un);
      }
      if (DuringTime.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(DuringTime);
      }
      if (VoiceMd5.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(VoiceMd5);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(Abstract other) {
      if (other == null) {
        return;
      }
      if (other.Type != 0) {
        Type = other.Type;
      }
      if (other.Text.Length != 0) {
        Text = other.Text;
      }
      if (other.Link.Length != 0) {
        Link = other.Link;
      }
      if (other.Src.Length != 0) {
        Src = other.Src;
      }
      if (other.Un.Length != 0) {
        Un = other.Un;
      }
      if (other.DuringTime.Length != 0) {
        DuringTime = other.DuringTime;
      }
      if (other.VoiceMd5.Length != 0) {
        VoiceMd5 = other.VoiceMd5;
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
            Type = input.ReadInt32();
            break;
          }
          case 18: {
            Text = input.ReadString();
            break;
          }
          case 26: {
            Link = input.ReadString();
            break;
          }
          case 34: {
            Src = input.ReadString();
            break;
          }
          case 42: {
            Un = input.ReadString();
            break;
          }
          case 50: {
            DuringTime = input.ReadString();
            break;
          }
          case 58: {
            VoiceMd5 = input.ReadString();
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
            Type = input.ReadInt32();
            break;
          }
          case 18: {
            Text = input.ReadString();
            break;
          }
          case 26: {
            Link = input.ReadString();
            break;
          }
          case 34: {
            Src = input.ReadString();
            break;
          }
          case 42: {
            Un = input.ReadString();
            break;
          }
          case 50: {
            DuringTime = input.ReadString();
            break;
          }
          case 58: {
            VoiceMd5 = input.ReadString();
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