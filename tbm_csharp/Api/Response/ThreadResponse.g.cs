// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Api/Response/ThreadResponse.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TbClient.Api.Response {

  /// <summary>Holder for reflection information generated from Api/Response/ThreadResponse.proto</summary>
  public static partial class ThreadResponseReflection {

    #region Descriptor
    /// <summary>File descriptor for Api/Response/ThreadResponse.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static ThreadResponseReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CiFBcGkvUmVzcG9uc2UvVGhyZWFkUmVzcG9uc2UucHJvdG8SFXRiQ2xpZW50",
            "LmFwaS5yZXNwb25zZRoRUG9zdC9UaHJlYWQucHJvdG8aC0Vycm9yLnByb3Rv",
            "GgpQYWdlLnByb3RvGgpVc2VyLnByb3RvIt8BCg5UaHJlYWRSZXNwb25zZRIe",
            "CgVlcnJvchgBIAEoCzIPLnRiQ2xpZW50LkVycm9yEjgKBGRhdGEYAiABKAsy",
            "Ki50YkNsaWVudC5hcGkucmVzcG9uc2UuVGhyZWFkUmVzcG9uc2UuRGF0YRpz",
            "CgREYXRhEhwKBHBhZ2UYBCABKAsyDi50YkNsaWVudC5QYWdlEioKC3RocmVh",
            "ZF9saXN0GAcgAygLMhUudGJDbGllbnQucG9zdC5UaHJlYWQSIQoJdXNlcl9s",
            "aXN0GBEgAygLMg4udGJDbGllbnQuVXNlcmIGcHJvdG8z"));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::TbClient.Post.ThreadReflection.Descriptor, global::TbClient.ErrorReflection.Descriptor, global::TbClient.PageReflection.Descriptor, global::TbClient.UserReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TbClient.Api.Response.ThreadResponse), global::TbClient.Api.Response.ThreadResponse.Parser, new[]{ "Error", "Data" }, null, null, null, new pbr::GeneratedClrTypeInfo[] { new pbr::GeneratedClrTypeInfo(typeof(global::TbClient.Api.Response.ThreadResponse.Types.Data), global::TbClient.Api.Response.ThreadResponse.Types.Data.Parser, new[]{ "Page", "ThreadList", "UserList" }, null, null, null, null)})
          }));
    }
    #endregion

  }
  #region Messages
  [global::System.Diagnostics.DebuggerDisplayAttribute("{ToString(),nq}")]
  public sealed partial class ThreadResponse : pb::IMessage<ThreadResponse>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<ThreadResponse> _parser = new pb::MessageParser<ThreadResponse>(() => new ThreadResponse());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<ThreadResponse> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TbClient.Api.Response.ThreadResponseReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public ThreadResponse() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public ThreadResponse(ThreadResponse other) : this() {
      error_ = other.error_ != null ? other.error_.Clone() : null;
      data_ = other.data_ != null ? other.data_.Clone() : null;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public ThreadResponse Clone() {
      return new ThreadResponse(this);
    }

    /// <summary>Field number for the "error" field.</summary>
    public const int ErrorFieldNumber = 1;
    private global::TbClient.Error error_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::TbClient.Error Error {
      get { return error_; }
      set {
        error_ = value;
      }
    }

    /// <summary>Field number for the "data" field.</summary>
    public const int DataFieldNumber = 2;
    private global::TbClient.Api.Response.ThreadResponse.Types.Data data_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::TbClient.Api.Response.ThreadResponse.Types.Data Data {
      get { return data_; }
      set {
        data_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as ThreadResponse);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(ThreadResponse other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (!object.Equals(Error, other.Error)) return false;
      if (!object.Equals(Data, other.Data)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (error_ != null) hash ^= Error.GetHashCode();
      if (data_ != null) hash ^= Data.GetHashCode();
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
      if (error_ != null) {
        output.WriteRawTag(10);
        output.WriteMessage(Error);
      }
      if (data_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(Data);
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
      if (error_ != null) {
        output.WriteRawTag(10);
        output.WriteMessage(Error);
      }
      if (data_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(Data);
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
      if (error_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Error);
      }
      if (data_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Data);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(ThreadResponse other) {
      if (other == null) {
        return;
      }
      if (other.error_ != null) {
        if (error_ == null) {
          Error = new global::TbClient.Error();
        }
        Error.MergeFrom(other.Error);
      }
      if (other.data_ != null) {
        if (data_ == null) {
          Data = new global::TbClient.Api.Response.ThreadResponse.Types.Data();
        }
        Data.MergeFrom(other.Data);
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
            if (error_ == null) {
              Error = new global::TbClient.Error();
            }
            input.ReadMessage(Error);
            break;
          }
          case 18: {
            if (data_ == null) {
              Data = new global::TbClient.Api.Response.ThreadResponse.Types.Data();
            }
            input.ReadMessage(Data);
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
            if (error_ == null) {
              Error = new global::TbClient.Error();
            }
            input.ReadMessage(Error);
            break;
          }
          case 18: {
            if (data_ == null) {
              Data = new global::TbClient.Api.Response.ThreadResponse.Types.Data();
            }
            input.ReadMessage(Data);
            break;
          }
        }
      }
    }
    #endif

    #region Nested types
    /// <summary>Container for nested types declared in the ThreadResponse message type.</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static partial class Types {
      [global::System.Diagnostics.DebuggerDisplayAttribute("{ToString(),nq}")]
      public sealed partial class Data : pb::IMessage<Data>
      #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
          , pb::IBufferMessage
      #endif
      {
        private static readonly pb::MessageParser<Data> _parser = new pb::MessageParser<Data>(() => new Data());
        private pb::UnknownFieldSet _unknownFields;
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public static pb::MessageParser<Data> Parser { get { return _parser; } }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public static pbr::MessageDescriptor Descriptor {
          get { return global::TbClient.Api.Response.ThreadResponse.Descriptor.NestedTypes[0]; }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        pbr::MessageDescriptor pb::IMessage.Descriptor {
          get { return Descriptor; }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public Data() {
          OnConstruction();
        }

        partial void OnConstruction();

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public Data(Data other) : this() {
          page_ = other.page_ != null ? other.page_.Clone() : null;
          threadList_ = other.threadList_.Clone();
          userList_ = other.userList_.Clone();
          _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public Data Clone() {
          return new Data(this);
        }

        /// <summary>Field number for the "page" field.</summary>
        public const int PageFieldNumber = 4;
        private global::TbClient.Page page_;
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public global::TbClient.Page Page {
          get { return page_; }
          set {
            page_ = value;
          }
        }

        /// <summary>Field number for the "thread_list" field.</summary>
        public const int ThreadListFieldNumber = 7;
        private static readonly pb::FieldCodec<global::TbClient.Post.Thread> _repeated_threadList_codec
            = pb::FieldCodec.ForMessage(58, global::TbClient.Post.Thread.Parser);
        private readonly pbc::RepeatedField<global::TbClient.Post.Thread> threadList_ = new pbc::RepeatedField<global::TbClient.Post.Thread>();
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public pbc::RepeatedField<global::TbClient.Post.Thread> ThreadList {
          get { return threadList_; }
        }

        /// <summary>Field number for the "user_list" field.</summary>
        public const int UserListFieldNumber = 17;
        private static readonly pb::FieldCodec<global::TbClient.User> _repeated_userList_codec
            = pb::FieldCodec.ForMessage(138, global::TbClient.User.Parser);
        private readonly pbc::RepeatedField<global::TbClient.User> userList_ = new pbc::RepeatedField<global::TbClient.User>();
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public pbc::RepeatedField<global::TbClient.User> UserList {
          get { return userList_; }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public override bool Equals(object other) {
          return Equals(other as Data);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public bool Equals(Data other) {
          if (ReferenceEquals(other, null)) {
            return false;
          }
          if (ReferenceEquals(other, this)) {
            return true;
          }
          if (!object.Equals(Page, other.Page)) return false;
          if(!threadList_.Equals(other.threadList_)) return false;
          if(!userList_.Equals(other.userList_)) return false;
          return Equals(_unknownFields, other._unknownFields);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public override int GetHashCode() {
          int hash = 1;
          if (page_ != null) hash ^= Page.GetHashCode();
          hash ^= threadList_.GetHashCode();
          hash ^= userList_.GetHashCode();
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
          if (page_ != null) {
            output.WriteRawTag(34);
            output.WriteMessage(Page);
          }
          threadList_.WriteTo(output, _repeated_threadList_codec);
          userList_.WriteTo(output, _repeated_userList_codec);
          if (_unknownFields != null) {
            _unknownFields.WriteTo(output);
          }
        #endif
        }

        #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
          if (page_ != null) {
            output.WriteRawTag(34);
            output.WriteMessage(Page);
          }
          threadList_.WriteTo(ref output, _repeated_threadList_codec);
          userList_.WriteTo(ref output, _repeated_userList_codec);
          if (_unknownFields != null) {
            _unknownFields.WriteTo(ref output);
          }
        }
        #endif

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public int CalculateSize() {
          int size = 0;
          if (page_ != null) {
            size += 1 + pb::CodedOutputStream.ComputeMessageSize(Page);
          }
          size += threadList_.CalculateSize(_repeated_threadList_codec);
          size += userList_.CalculateSize(_repeated_userList_codec);
          if (_unknownFields != null) {
            size += _unknownFields.CalculateSize();
          }
          return size;
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public void MergeFrom(Data other) {
          if (other == null) {
            return;
          }
          if (other.page_ != null) {
            if (page_ == null) {
              Page = new global::TbClient.Page();
            }
            Page.MergeFrom(other.Page);
          }
          threadList_.Add(other.threadList_);
          userList_.Add(other.userList_);
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
              case 34: {
                if (page_ == null) {
                  Page = new global::TbClient.Page();
                }
                input.ReadMessage(Page);
                break;
              }
              case 58: {
                threadList_.AddEntriesFrom(input, _repeated_threadList_codec);
                break;
              }
              case 138: {
                userList_.AddEntriesFrom(input, _repeated_userList_codec);
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
              case 34: {
                if (page_ == null) {
                  Page = new global::TbClient.Page();
                }
                input.ReadMessage(Page);
                break;
              }
              case 58: {
                threadList_.AddEntriesFrom(ref input, _repeated_threadList_codec);
                break;
              }
              case 138: {
                userList_.AddEntriesFrom(ref input, _repeated_userList_codec);
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
