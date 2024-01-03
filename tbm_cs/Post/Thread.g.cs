// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Post/Thread.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TbClient.Post {

  /// <summary>Holder for reflection information generated from Post/Thread.proto</summary>
  public static partial class ThreadReflection {

    #region Descriptor
    /// <summary>File descriptor for Post/Thread.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static ThreadReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "ChFQb3N0L1RocmVhZC5wcm90bxINdGJDbGllbnQucG9zdBoKVXNlci5wcm90",
            "bxoVUG9zdC9Db21tb24vWmFuLnByb3RvGhVQb3N0L0NvbW1vbi9MYnMucHJv",
            "dG8aF1Bvc3QvQ29tbW9uL0FncmVlLnByb3RvGhpQb3N0L0NvbW1vbi9BYnN0",
            "cmFjdC5wcm90byKyBAoGVGhyZWFkEgsKA3RpZBgCIAEoAxINCgV0aXRsZRgD",
            "IAEoCRIRCglyZXBseV9udW0YBCABKAUSEAoIdmlld19udW0YBSABKAUSFQoN",
            "bGFzdF90aW1lX2ludBgHIAEoBRIUCgx0aHJlYWRfdHlwZXMYCCABKAUSDgoG",
            "aXNfdG9wGAkgASgFEg8KB2lzX2dvb2QYCiABKAUSHgoGYXV0aG9yGBIgASgL",
            "Mg4udGJDbGllbnQuVXNlchIkCgxsYXN0X3JlcGx5ZXIYEyABKAsyDi50YkNs",
            "aWVudC5Vc2VyEjEKCV9hYnN0cmFjdBgVIAMoCzIeLnRiQ2xpZW50LnBvc3Qu",
            "Y29tbW9uLkFic3RyYWN0EgsKA2ZpZBgbIAEoAxIWCg5saXZlX3Bvc3RfdHlw",
            "ZRgdIAEoCRIVCg1maXJzdF9wb3N0X2lkGCggASgDEiYKA3phbhgpIAEoCzIZ",
            "LnRiQ2xpZW50LnBvc3QuY29tbW9uLlphbhITCgtjcmVhdGVfdGltZRgtIAEo",
            "BRIUCgxpc19tZW1iZXJ0b3AYNiABKAUSEQoJYXV0aG9yX2lkGDggASgDEisK",
            "CGxvY2F0aW9uGD4gASgLMhkudGJDbGllbnQucG9zdC5jb21tb24uTGJzEhEK",
            "CWFncmVlX251bRh8IAEoBRIqCgVhZ3JlZRh+IAEoCzIbLnRiQ2xpZW50LnBv",
            "c3QuY29tbW9uLkFncmVlEhIKCXNoYXJlX251bRiHASABKANiBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::TbClient.UserReflection.Descriptor, global::TbClient.Post.Common.ZanReflection.Descriptor, global::TbClient.Post.Common.LbsReflection.Descriptor, global::TbClient.Post.Common.AgreeReflection.Descriptor, global::TbClient.Post.Common.AbstractReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TbClient.Post.Thread), global::TbClient.Post.Thread.Parser, new[]{ "Tid", "Title", "ReplyNum", "ViewNum", "LastTimeInt", "ThreadTypes", "IsTop", "IsGood", "Author", "LastReplyer", "Abstract", "Fid", "LivePostType", "FirstPostId", "Zan", "CreateTime", "IsMembertop", "AuthorId", "Location", "AgreeNum", "Agree", "ShareNum" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  [global::System.Diagnostics.DebuggerDisplayAttribute("{ToString(),nq}")]
  public sealed partial class Thread : pb::IMessage<Thread>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<Thread> _parser = new pb::MessageParser<Thread>(() => new Thread());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<Thread> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TbClient.Post.ThreadReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Thread() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Thread(Thread other) : this() {
      tid_ = other.tid_;
      title_ = other.title_;
      replyNum_ = other.replyNum_;
      viewNum_ = other.viewNum_;
      lastTimeInt_ = other.lastTimeInt_;
      threadTypes_ = other.threadTypes_;
      isTop_ = other.isTop_;
      isGood_ = other.isGood_;
      author_ = other.author_ != null ? other.author_.Clone() : null;
      lastReplyer_ = other.lastReplyer_ != null ? other.lastReplyer_.Clone() : null;
      Abstract_ = other.Abstract_.Clone();
      fid_ = other.fid_;
      livePostType_ = other.livePostType_;
      firstPostId_ = other.firstPostId_;
      zan_ = other.zan_ != null ? other.zan_.Clone() : null;
      createTime_ = other.createTime_;
      isMembertop_ = other.isMembertop_;
      authorId_ = other.authorId_;
      location_ = other.location_ != null ? other.location_.Clone() : null;
      agreeNum_ = other.agreeNum_;
      agree_ = other.agree_ != null ? other.agree_.Clone() : null;
      shareNum_ = other.shareNum_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Thread Clone() {
      return new Thread(this);
    }

    /// <summary>Field number for the "tid" field.</summary>
    public const int TidFieldNumber = 2;
    private long tid_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public long Tid {
      get { return tid_; }
      set {
        tid_ = value;
      }
    }

    /// <summary>Field number for the "title" field.</summary>
    public const int TitleFieldNumber = 3;
    private string title_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Title {
      get { return title_; }
      set {
        title_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "reply_num" field.</summary>
    public const int ReplyNumFieldNumber = 4;
    private int replyNum_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int ReplyNum {
      get { return replyNum_; }
      set {
        replyNum_ = value;
      }
    }

    /// <summary>Field number for the "view_num" field.</summary>
    public const int ViewNumFieldNumber = 5;
    private int viewNum_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int ViewNum {
      get { return viewNum_; }
      set {
        viewNum_ = value;
      }
    }

    /// <summary>Field number for the "last_time_int" field.</summary>
    public const int LastTimeIntFieldNumber = 7;
    private int lastTimeInt_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int LastTimeInt {
      get { return lastTimeInt_; }
      set {
        lastTimeInt_ = value;
      }
    }

    /// <summary>Field number for the "thread_types" field.</summary>
    public const int ThreadTypesFieldNumber = 8;
    private int threadTypes_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int ThreadTypes {
      get { return threadTypes_; }
      set {
        threadTypes_ = value;
      }
    }

    /// <summary>Field number for the "is_top" field.</summary>
    public const int IsTopFieldNumber = 9;
    private int isTop_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int IsTop {
      get { return isTop_; }
      set {
        isTop_ = value;
      }
    }

    /// <summary>Field number for the "is_good" field.</summary>
    public const int IsGoodFieldNumber = 10;
    private int isGood_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int IsGood {
      get { return isGood_; }
      set {
        isGood_ = value;
      }
    }

    /// <summary>Field number for the "author" field.</summary>
    public const int AuthorFieldNumber = 18;
    private global::TbClient.User author_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::TbClient.User Author {
      get { return author_; }
      set {
        author_ = value;
      }
    }

    /// <summary>Field number for the "last_replyer" field.</summary>
    public const int LastReplyerFieldNumber = 19;
    private global::TbClient.User lastReplyer_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::TbClient.User LastReplyer {
      get { return lastReplyer_; }
      set {
        lastReplyer_ = value;
      }
    }

    /// <summary>Field number for the "_abstract" field.</summary>
    public const int AbstractFieldNumber = 21;
    private static readonly pb::FieldCodec<global::TbClient.Post.Common.Abstract> _repeated_Abstract_codec
        = pb::FieldCodec.ForMessage(170, global::TbClient.Post.Common.Abstract.Parser);
    private readonly pbc::RepeatedField<global::TbClient.Post.Common.Abstract> Abstract_ = new pbc::RepeatedField<global::TbClient.Post.Common.Abstract>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public pbc::RepeatedField<global::TbClient.Post.Common.Abstract> Abstract {
      get { return Abstract_; }
    }

    /// <summary>Field number for the "fid" field.</summary>
    public const int FidFieldNumber = 27;
    private long fid_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public long Fid {
      get { return fid_; }
      set {
        fid_ = value;
      }
    }

    /// <summary>Field number for the "live_post_type" field.</summary>
    public const int LivePostTypeFieldNumber = 29;
    private string livePostType_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string LivePostType {
      get { return livePostType_; }
      set {
        livePostType_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "first_post_id" field.</summary>
    public const int FirstPostIdFieldNumber = 40;
    private long firstPostId_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public long FirstPostId {
      get { return firstPostId_; }
      set {
        firstPostId_ = value;
      }
    }

    /// <summary>Field number for the "zan" field.</summary>
    public const int ZanFieldNumber = 41;
    private global::TbClient.Post.Common.Zan zan_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::TbClient.Post.Common.Zan Zan {
      get { return zan_; }
      set {
        zan_ = value;
      }
    }

    /// <summary>Field number for the "create_time" field.</summary>
    public const int CreateTimeFieldNumber = 45;
    private int createTime_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int CreateTime {
      get { return createTime_; }
      set {
        createTime_ = value;
      }
    }

    /// <summary>Field number for the "is_membertop" field.</summary>
    public const int IsMembertopFieldNumber = 54;
    private int isMembertop_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int IsMembertop {
      get { return isMembertop_; }
      set {
        isMembertop_ = value;
      }
    }

    /// <summary>Field number for the "author_id" field.</summary>
    public const int AuthorIdFieldNumber = 56;
    private long authorId_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public long AuthorId {
      get { return authorId_; }
      set {
        authorId_ = value;
      }
    }

    /// <summary>Field number for the "location" field.</summary>
    public const int LocationFieldNumber = 62;
    private global::TbClient.Post.Common.Lbs location_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::TbClient.Post.Common.Lbs Location {
      get { return location_; }
      set {
        location_ = value;
      }
    }

    /// <summary>Field number for the "agree_num" field.</summary>
    public const int AgreeNumFieldNumber = 124;
    private int agreeNum_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int AgreeNum {
      get { return agreeNum_; }
      set {
        agreeNum_ = value;
      }
    }

    /// <summary>Field number for the "agree" field.</summary>
    public const int AgreeFieldNumber = 126;
    private global::TbClient.Post.Common.Agree agree_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::TbClient.Post.Common.Agree Agree {
      get { return agree_; }
      set {
        agree_ = value;
      }
    }

    /// <summary>Field number for the "share_num" field.</summary>
    public const int ShareNumFieldNumber = 135;
    private long shareNum_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public long ShareNum {
      get { return shareNum_; }
      set {
        shareNum_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as Thread);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(Thread other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Tid != other.Tid) return false;
      if (Title != other.Title) return false;
      if (ReplyNum != other.ReplyNum) return false;
      if (ViewNum != other.ViewNum) return false;
      if (LastTimeInt != other.LastTimeInt) return false;
      if (ThreadTypes != other.ThreadTypes) return false;
      if (IsTop != other.IsTop) return false;
      if (IsGood != other.IsGood) return false;
      if (!object.Equals(Author, other.Author)) return false;
      if (!object.Equals(LastReplyer, other.LastReplyer)) return false;
      if(!Abstract_.Equals(other.Abstract_)) return false;
      if (Fid != other.Fid) return false;
      if (LivePostType != other.LivePostType) return false;
      if (FirstPostId != other.FirstPostId) return false;
      if (!object.Equals(Zan, other.Zan)) return false;
      if (CreateTime != other.CreateTime) return false;
      if (IsMembertop != other.IsMembertop) return false;
      if (AuthorId != other.AuthorId) return false;
      if (!object.Equals(Location, other.Location)) return false;
      if (AgreeNum != other.AgreeNum) return false;
      if (!object.Equals(Agree, other.Agree)) return false;
      if (ShareNum != other.ShareNum) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (Tid != 0L) hash ^= Tid.GetHashCode();
      if (Title.Length != 0) hash ^= Title.GetHashCode();
      if (ReplyNum != 0) hash ^= ReplyNum.GetHashCode();
      if (ViewNum != 0) hash ^= ViewNum.GetHashCode();
      if (LastTimeInt != 0) hash ^= LastTimeInt.GetHashCode();
      if (ThreadTypes != 0) hash ^= ThreadTypes.GetHashCode();
      if (IsTop != 0) hash ^= IsTop.GetHashCode();
      if (IsGood != 0) hash ^= IsGood.GetHashCode();
      if (author_ != null) hash ^= Author.GetHashCode();
      if (lastReplyer_ != null) hash ^= LastReplyer.GetHashCode();
      hash ^= Abstract_.GetHashCode();
      if (Fid != 0L) hash ^= Fid.GetHashCode();
      if (LivePostType.Length != 0) hash ^= LivePostType.GetHashCode();
      if (FirstPostId != 0L) hash ^= FirstPostId.GetHashCode();
      if (zan_ != null) hash ^= Zan.GetHashCode();
      if (CreateTime != 0) hash ^= CreateTime.GetHashCode();
      if (IsMembertop != 0) hash ^= IsMembertop.GetHashCode();
      if (AuthorId != 0L) hash ^= AuthorId.GetHashCode();
      if (location_ != null) hash ^= Location.GetHashCode();
      if (AgreeNum != 0) hash ^= AgreeNum.GetHashCode();
      if (agree_ != null) hash ^= Agree.GetHashCode();
      if (ShareNum != 0L) hash ^= ShareNum.GetHashCode();
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
      if (Tid != 0L) {
        output.WriteRawTag(16);
        output.WriteInt64(Tid);
      }
      if (Title.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(Title);
      }
      if (ReplyNum != 0) {
        output.WriteRawTag(32);
        output.WriteInt32(ReplyNum);
      }
      if (ViewNum != 0) {
        output.WriteRawTag(40);
        output.WriteInt32(ViewNum);
      }
      if (LastTimeInt != 0) {
        output.WriteRawTag(56);
        output.WriteInt32(LastTimeInt);
      }
      if (ThreadTypes != 0) {
        output.WriteRawTag(64);
        output.WriteInt32(ThreadTypes);
      }
      if (IsTop != 0) {
        output.WriteRawTag(72);
        output.WriteInt32(IsTop);
      }
      if (IsGood != 0) {
        output.WriteRawTag(80);
        output.WriteInt32(IsGood);
      }
      if (author_ != null) {
        output.WriteRawTag(146, 1);
        output.WriteMessage(Author);
      }
      if (lastReplyer_ != null) {
        output.WriteRawTag(154, 1);
        output.WriteMessage(LastReplyer);
      }
      Abstract_.WriteTo(output, _repeated_Abstract_codec);
      if (Fid != 0L) {
        output.WriteRawTag(216, 1);
        output.WriteInt64(Fid);
      }
      if (LivePostType.Length != 0) {
        output.WriteRawTag(234, 1);
        output.WriteString(LivePostType);
      }
      if (FirstPostId != 0L) {
        output.WriteRawTag(192, 2);
        output.WriteInt64(FirstPostId);
      }
      if (zan_ != null) {
        output.WriteRawTag(202, 2);
        output.WriteMessage(Zan);
      }
      if (CreateTime != 0) {
        output.WriteRawTag(232, 2);
        output.WriteInt32(CreateTime);
      }
      if (IsMembertop != 0) {
        output.WriteRawTag(176, 3);
        output.WriteInt32(IsMembertop);
      }
      if (AuthorId != 0L) {
        output.WriteRawTag(192, 3);
        output.WriteInt64(AuthorId);
      }
      if (location_ != null) {
        output.WriteRawTag(242, 3);
        output.WriteMessage(Location);
      }
      if (AgreeNum != 0) {
        output.WriteRawTag(224, 7);
        output.WriteInt32(AgreeNum);
      }
      if (agree_ != null) {
        output.WriteRawTag(242, 7);
        output.WriteMessage(Agree);
      }
      if (ShareNum != 0L) {
        output.WriteRawTag(184, 8);
        output.WriteInt64(ShareNum);
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
      if (Tid != 0L) {
        output.WriteRawTag(16);
        output.WriteInt64(Tid);
      }
      if (Title.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(Title);
      }
      if (ReplyNum != 0) {
        output.WriteRawTag(32);
        output.WriteInt32(ReplyNum);
      }
      if (ViewNum != 0) {
        output.WriteRawTag(40);
        output.WriteInt32(ViewNum);
      }
      if (LastTimeInt != 0) {
        output.WriteRawTag(56);
        output.WriteInt32(LastTimeInt);
      }
      if (ThreadTypes != 0) {
        output.WriteRawTag(64);
        output.WriteInt32(ThreadTypes);
      }
      if (IsTop != 0) {
        output.WriteRawTag(72);
        output.WriteInt32(IsTop);
      }
      if (IsGood != 0) {
        output.WriteRawTag(80);
        output.WriteInt32(IsGood);
      }
      if (author_ != null) {
        output.WriteRawTag(146, 1);
        output.WriteMessage(Author);
      }
      if (lastReplyer_ != null) {
        output.WriteRawTag(154, 1);
        output.WriteMessage(LastReplyer);
      }
      Abstract_.WriteTo(ref output, _repeated_Abstract_codec);
      if (Fid != 0L) {
        output.WriteRawTag(216, 1);
        output.WriteInt64(Fid);
      }
      if (LivePostType.Length != 0) {
        output.WriteRawTag(234, 1);
        output.WriteString(LivePostType);
      }
      if (FirstPostId != 0L) {
        output.WriteRawTag(192, 2);
        output.WriteInt64(FirstPostId);
      }
      if (zan_ != null) {
        output.WriteRawTag(202, 2);
        output.WriteMessage(Zan);
      }
      if (CreateTime != 0) {
        output.WriteRawTag(232, 2);
        output.WriteInt32(CreateTime);
      }
      if (IsMembertop != 0) {
        output.WriteRawTag(176, 3);
        output.WriteInt32(IsMembertop);
      }
      if (AuthorId != 0L) {
        output.WriteRawTag(192, 3);
        output.WriteInt64(AuthorId);
      }
      if (location_ != null) {
        output.WriteRawTag(242, 3);
        output.WriteMessage(Location);
      }
      if (AgreeNum != 0) {
        output.WriteRawTag(224, 7);
        output.WriteInt32(AgreeNum);
      }
      if (agree_ != null) {
        output.WriteRawTag(242, 7);
        output.WriteMessage(Agree);
      }
      if (ShareNum != 0L) {
        output.WriteRawTag(184, 8);
        output.WriteInt64(ShareNum);
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
      if (Tid != 0L) {
        size += 1 + pb::CodedOutputStream.ComputeInt64Size(Tid);
      }
      if (Title.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Title);
      }
      if (ReplyNum != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(ReplyNum);
      }
      if (ViewNum != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(ViewNum);
      }
      if (LastTimeInt != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(LastTimeInt);
      }
      if (ThreadTypes != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(ThreadTypes);
      }
      if (IsTop != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(IsTop);
      }
      if (IsGood != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(IsGood);
      }
      if (author_ != null) {
        size += 2 + pb::CodedOutputStream.ComputeMessageSize(Author);
      }
      if (lastReplyer_ != null) {
        size += 2 + pb::CodedOutputStream.ComputeMessageSize(LastReplyer);
      }
      size += Abstract_.CalculateSize(_repeated_Abstract_codec);
      if (Fid != 0L) {
        size += 2 + pb::CodedOutputStream.ComputeInt64Size(Fid);
      }
      if (LivePostType.Length != 0) {
        size += 2 + pb::CodedOutputStream.ComputeStringSize(LivePostType);
      }
      if (FirstPostId != 0L) {
        size += 2 + pb::CodedOutputStream.ComputeInt64Size(FirstPostId);
      }
      if (zan_ != null) {
        size += 2 + pb::CodedOutputStream.ComputeMessageSize(Zan);
      }
      if (CreateTime != 0) {
        size += 2 + pb::CodedOutputStream.ComputeInt32Size(CreateTime);
      }
      if (IsMembertop != 0) {
        size += 2 + pb::CodedOutputStream.ComputeInt32Size(IsMembertop);
      }
      if (AuthorId != 0L) {
        size += 2 + pb::CodedOutputStream.ComputeInt64Size(AuthorId);
      }
      if (location_ != null) {
        size += 2 + pb::CodedOutputStream.ComputeMessageSize(Location);
      }
      if (AgreeNum != 0) {
        size += 2 + pb::CodedOutputStream.ComputeInt32Size(AgreeNum);
      }
      if (agree_ != null) {
        size += 2 + pb::CodedOutputStream.ComputeMessageSize(Agree);
      }
      if (ShareNum != 0L) {
        size += 2 + pb::CodedOutputStream.ComputeInt64Size(ShareNum);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(Thread other) {
      if (other == null) {
        return;
      }
      if (other.Tid != 0L) {
        Tid = other.Tid;
      }
      if (other.Title.Length != 0) {
        Title = other.Title;
      }
      if (other.ReplyNum != 0) {
        ReplyNum = other.ReplyNum;
      }
      if (other.ViewNum != 0) {
        ViewNum = other.ViewNum;
      }
      if (other.LastTimeInt != 0) {
        LastTimeInt = other.LastTimeInt;
      }
      if (other.ThreadTypes != 0) {
        ThreadTypes = other.ThreadTypes;
      }
      if (other.IsTop != 0) {
        IsTop = other.IsTop;
      }
      if (other.IsGood != 0) {
        IsGood = other.IsGood;
      }
      if (other.author_ != null) {
        if (author_ == null) {
          Author = new global::TbClient.User();
        }
        Author.MergeFrom(other.Author);
      }
      if (other.lastReplyer_ != null) {
        if (lastReplyer_ == null) {
          LastReplyer = new global::TbClient.User();
        }
        LastReplyer.MergeFrom(other.LastReplyer);
      }
      Abstract_.Add(other.Abstract_);
      if (other.Fid != 0L) {
        Fid = other.Fid;
      }
      if (other.LivePostType.Length != 0) {
        LivePostType = other.LivePostType;
      }
      if (other.FirstPostId != 0L) {
        FirstPostId = other.FirstPostId;
      }
      if (other.zan_ != null) {
        if (zan_ == null) {
          Zan = new global::TbClient.Post.Common.Zan();
        }
        Zan.MergeFrom(other.Zan);
      }
      if (other.CreateTime != 0) {
        CreateTime = other.CreateTime;
      }
      if (other.IsMembertop != 0) {
        IsMembertop = other.IsMembertop;
      }
      if (other.AuthorId != 0L) {
        AuthorId = other.AuthorId;
      }
      if (other.location_ != null) {
        if (location_ == null) {
          Location = new global::TbClient.Post.Common.Lbs();
        }
        Location.MergeFrom(other.Location);
      }
      if (other.AgreeNum != 0) {
        AgreeNum = other.AgreeNum;
      }
      if (other.agree_ != null) {
        if (agree_ == null) {
          Agree = new global::TbClient.Post.Common.Agree();
        }
        Agree.MergeFrom(other.Agree);
      }
      if (other.ShareNum != 0L) {
        ShareNum = other.ShareNum;
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
          case 16: {
            Tid = input.ReadInt64();
            break;
          }
          case 26: {
            Title = input.ReadString();
            break;
          }
          case 32: {
            ReplyNum = input.ReadInt32();
            break;
          }
          case 40: {
            ViewNum = input.ReadInt32();
            break;
          }
          case 56: {
            LastTimeInt = input.ReadInt32();
            break;
          }
          case 64: {
            ThreadTypes = input.ReadInt32();
            break;
          }
          case 72: {
            IsTop = input.ReadInt32();
            break;
          }
          case 80: {
            IsGood = input.ReadInt32();
            break;
          }
          case 146: {
            if (author_ == null) {
              Author = new global::TbClient.User();
            }
            input.ReadMessage(Author);
            break;
          }
          case 154: {
            if (lastReplyer_ == null) {
              LastReplyer = new global::TbClient.User();
            }
            input.ReadMessage(LastReplyer);
            break;
          }
          case 170: {
            Abstract_.AddEntriesFrom(input, _repeated_Abstract_codec);
            break;
          }
          case 216: {
            Fid = input.ReadInt64();
            break;
          }
          case 234: {
            LivePostType = input.ReadString();
            break;
          }
          case 320: {
            FirstPostId = input.ReadInt64();
            break;
          }
          case 330: {
            if (zan_ == null) {
              Zan = new global::TbClient.Post.Common.Zan();
            }
            input.ReadMessage(Zan);
            break;
          }
          case 360: {
            CreateTime = input.ReadInt32();
            break;
          }
          case 432: {
            IsMembertop = input.ReadInt32();
            break;
          }
          case 448: {
            AuthorId = input.ReadInt64();
            break;
          }
          case 498: {
            if (location_ == null) {
              Location = new global::TbClient.Post.Common.Lbs();
            }
            input.ReadMessage(Location);
            break;
          }
          case 992: {
            AgreeNum = input.ReadInt32();
            break;
          }
          case 1010: {
            if (agree_ == null) {
              Agree = new global::TbClient.Post.Common.Agree();
            }
            input.ReadMessage(Agree);
            break;
          }
          case 1080: {
            ShareNum = input.ReadInt64();
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
          case 16: {
            Tid = input.ReadInt64();
            break;
          }
          case 26: {
            Title = input.ReadString();
            break;
          }
          case 32: {
            ReplyNum = input.ReadInt32();
            break;
          }
          case 40: {
            ViewNum = input.ReadInt32();
            break;
          }
          case 56: {
            LastTimeInt = input.ReadInt32();
            break;
          }
          case 64: {
            ThreadTypes = input.ReadInt32();
            break;
          }
          case 72: {
            IsTop = input.ReadInt32();
            break;
          }
          case 80: {
            IsGood = input.ReadInt32();
            break;
          }
          case 146: {
            if (author_ == null) {
              Author = new global::TbClient.User();
            }
            input.ReadMessage(Author);
            break;
          }
          case 154: {
            if (lastReplyer_ == null) {
              LastReplyer = new global::TbClient.User();
            }
            input.ReadMessage(LastReplyer);
            break;
          }
          case 170: {
            Abstract_.AddEntriesFrom(ref input, _repeated_Abstract_codec);
            break;
          }
          case 216: {
            Fid = input.ReadInt64();
            break;
          }
          case 234: {
            LivePostType = input.ReadString();
            break;
          }
          case 320: {
            FirstPostId = input.ReadInt64();
            break;
          }
          case 330: {
            if (zan_ == null) {
              Zan = new global::TbClient.Post.Common.Zan();
            }
            input.ReadMessage(Zan);
            break;
          }
          case 360: {
            CreateTime = input.ReadInt32();
            break;
          }
          case 432: {
            IsMembertop = input.ReadInt32();
            break;
          }
          case 448: {
            AuthorId = input.ReadInt64();
            break;
          }
          case 498: {
            if (location_ == null) {
              Location = new global::TbClient.Post.Common.Lbs();
            }
            input.ReadMessage(Location);
            break;
          }
          case 992: {
            AgreeNum = input.ReadInt32();
            break;
          }
          case 1010: {
            if (agree_ == null) {
              Agree = new global::TbClient.Post.Common.Agree();
            }
            input.ReadMessage(Agree);
            break;
          }
          case 1080: {
            ShareNum = input.ReadInt64();
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
