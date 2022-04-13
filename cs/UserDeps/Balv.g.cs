// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: UserDeps/Balv.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TbClient.UserDeps {

  /// <summary>Holder for reflection information generated from UserDeps/Balv.proto</summary>
  public static partial class BalvReflection {

    #region Descriptor
    /// <summary>File descriptor for UserDeps/Balv.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static BalvReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "ChNVc2VyRGVwcy9CYWx2LnByb3RvEhF0YkNsaWVudC51c2VyRGVwcyI/CgRC",
            "YWx2EhAKCGlzX2JsYWNrGAEgASgFEhAKCGlzX2Jsb2NrGAIgASgFEhMKC2Rh",
            "eXNfdG9mcmVlGAMgASgFYgZwcm90bzM="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TbClient.UserDeps.Balv), global::TbClient.UserDeps.Balv.Parser, new[]{ "IsBlack", "IsBlock", "DaysTofree" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class Balv : pb::IMessage<Balv>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<Balv> _parser = new pb::MessageParser<Balv>(() => new Balv());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<Balv> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TbClient.UserDeps.BalvReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Balv() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Balv(Balv other) : this() {
      isBlack_ = other.isBlack_;
      isBlock_ = other.isBlock_;
      daysTofree_ = other.daysTofree_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Balv Clone() {
      return new Balv(this);
    }

    /// <summary>Field number for the "is_black" field.</summary>
    public const int IsBlackFieldNumber = 1;
    private int isBlack_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int IsBlack {
      get { return isBlack_; }
      set {
        isBlack_ = value;
      }
    }

    /// <summary>Field number for the "is_block" field.</summary>
    public const int IsBlockFieldNumber = 2;
    private int isBlock_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int IsBlock {
      get { return isBlock_; }
      set {
        isBlock_ = value;
      }
    }

    /// <summary>Field number for the "days_tofree" field.</summary>
    public const int DaysTofreeFieldNumber = 3;
    private int daysTofree_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int DaysTofree {
      get { return daysTofree_; }
      set {
        daysTofree_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as Balv);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(Balv other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (IsBlack != other.IsBlack) return false;
      if (IsBlock != other.IsBlock) return false;
      if (DaysTofree != other.DaysTofree) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (IsBlack != 0) hash ^= IsBlack.GetHashCode();
      if (IsBlock != 0) hash ^= IsBlock.GetHashCode();
      if (DaysTofree != 0) hash ^= DaysTofree.GetHashCode();
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
      if (IsBlack != 0) {
        output.WriteRawTag(8);
        output.WriteInt32(IsBlack);
      }
      if (IsBlock != 0) {
        output.WriteRawTag(16);
        output.WriteInt32(IsBlock);
      }
      if (DaysTofree != 0) {
        output.WriteRawTag(24);
        output.WriteInt32(DaysTofree);
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
      if (IsBlack != 0) {
        output.WriteRawTag(8);
        output.WriteInt32(IsBlack);
      }
      if (IsBlock != 0) {
        output.WriteRawTag(16);
        output.WriteInt32(IsBlock);
      }
      if (DaysTofree != 0) {
        output.WriteRawTag(24);
        output.WriteInt32(DaysTofree);
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
      if (IsBlack != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(IsBlack);
      }
      if (IsBlock != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(IsBlock);
      }
      if (DaysTofree != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(DaysTofree);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(Balv other) {
      if (other == null) {
        return;
      }
      if (other.IsBlack != 0) {
        IsBlack = other.IsBlack;
      }
      if (other.IsBlock != 0) {
        IsBlock = other.IsBlock;
      }
      if (other.DaysTofree != 0) {
        DaysTofree = other.DaysTofree;
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
            IsBlack = input.ReadInt32();
            break;
          }
          case 16: {
            IsBlock = input.ReadInt32();
            break;
          }
          case 24: {
            DaysTofree = input.ReadInt32();
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
            IsBlack = input.ReadInt32();
            break;
          }
          case 16: {
            IsBlock = input.ReadInt32();
            break;
          }
          case 24: {
            DaysTofree = input.ReadInt32();
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
