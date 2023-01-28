package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class OriginThreadInfo extends Message {
  public static final List<Abstract> DEFAULT_ABSTRACT;
  
  public static final List<PbContent> DEFAULT_CONTENT;
  
  public static final Long DEFAULT_FID;
  
  public static final String DEFAULT_FNAME = "";
  
  public static final Integer DEFAULT_GOOD_TYPES;
  
  public static final Integer DEFAULT_IS_DELETED;
  
  public static final Integer DEFAULT_IS_FRS_MASK;
  
  public static final Integer DEFAULT_IS_NEW_STYLE;
  
  public static final Integer DEFAULT_IS_UGC;
  
  public static final List<HeadItem> DEFAULT_ITEM_STAR;
  
  public static final List<Media> DEFAULT_MEDIA = Collections.emptyList();
  
  public static final List<PbLinkInfo> DEFAULT_PB_LINK_INFO;
  
  public static final Long DEFAULT_PID;
  
  public static final Integer DEFAULT_REPLY_NUM;
  
  public static final Integer DEFAULT_SHARED_NUM;
  
  public static final Integer DEFAULT_THREAD_TYPE;
  
  public static final String DEFAULT_TID = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TOP_TYPES;
  
  public static final List<Voice> DEFAULT_VOICE_INFO;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<Abstract> _abstract;
  
  @ProtoField(tag = 19)
  public final Agree agree;
  
  @ProtoField(tag = 6)
  public final AlaLiveInfo ala_info;
  
  @ProtoField(tag = 18)
  public final User author;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 14)
  public final List<PbContent> content;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long fid;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String fname;
  
  @ProtoField(tag = 26, type = Message.Datatype.INT32)
  public final Integer good_types;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer is_deleted;
  
  @ProtoField(tag = 28, type = Message.Datatype.INT32)
  public final Integer is_frs_mask;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer is_new_style;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_ugc;
  
  @ProtoField(tag = 22)
  public final Item item;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 23)
  public final List<HeadItem> item_star;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<Media> media;
  
  @ProtoField(tag = 11)
  public final Baijiahao ori_ugc_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 24)
  public final List<PbLinkInfo> pb_link_info;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT64)
  public final Long pid;
  
  @ProtoField(tag = 21)
  public final PollInfo poll_info;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer reply_num;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer shared_num;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer thread_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String tid;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 27, type = Message.Datatype.INT32)
  public final Integer top_types;
  
  @ProtoField(tag = 13)
  public final VideoInfo video_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12)
  public final List<Voice> voice_info;
  
  static {
    DEFAULT_ABSTRACT = Collections.emptyList();
    Long long_ = Long.valueOf(0L);
    DEFAULT_FID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_THREAD_TYPE = integer;
    DEFAULT_IS_DELETED = integer;
    DEFAULT_IS_UGC = integer;
    DEFAULT_VOICE_INFO = Collections.emptyList();
    DEFAULT_CONTENT = Collections.emptyList();
    DEFAULT_IS_NEW_STYLE = integer;
    DEFAULT_REPLY_NUM = integer;
    DEFAULT_SHARED_NUM = integer;
    DEFAULT_ITEM_STAR = Collections.emptyList();
    DEFAULT_PB_LINK_INFO = Collections.emptyList();
    DEFAULT_PID = long_;
    DEFAULT_GOOD_TYPES = integer;
    DEFAULT_TOP_TYPES = integer;
    DEFAULT_IS_FRS_MASK = integer;
  }
  
  public OriginThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      List<Media> list5 = paramBuilder.media;
      if (list5 == null) {
        this.media = DEFAULT_MEDIA;
      } else {
        this.media = Message.immutableCopyOf(list5);
      } 
      List<Abstract> list4 = paramBuilder._abstract;
      if (list4 == null) {
        this._abstract = DEFAULT_ABSTRACT;
      } else {
        this._abstract = Message.immutableCopyOf(list4);
      } 
      String str1 = paramBuilder.fname;
      if (str1 == null) {
        this.fname = "";
      } else {
        this.fname = str1;
      } 
      str1 = paramBuilder.tid;
      if (str1 == null) {
        this.tid = "";
      } else {
        this.tid = str1;
      } 
      this.ala_info = paramBuilder.ala_info;
      Long long_2 = paramBuilder.fid;
      if (long_2 == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_2;
      } 
      Integer integer3 = paramBuilder.thread_type;
      if (integer3 == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = integer3;
      } 
      integer3 = paramBuilder.is_deleted;
      if (integer3 == null) {
        this.is_deleted = DEFAULT_IS_DELETED;
      } else {
        this.is_deleted = integer3;
      } 
      integer3 = paramBuilder.is_ugc;
      if (integer3 == null) {
        this.is_ugc = DEFAULT_IS_UGC;
      } else {
        this.is_ugc = integer3;
      } 
      this.ori_ugc_info = paramBuilder.ori_ugc_info;
      List<Voice> list3 = paramBuilder.voice_info;
      if (list3 == null) {
        this.voice_info = DEFAULT_VOICE_INFO;
      } else {
        this.voice_info = Message.immutableCopyOf(list3);
      } 
      this.video_info = paramBuilder.video_info;
      List<PbContent> list2 = paramBuilder.content;
      if (list2 == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list2);
      } 
      Integer integer2 = paramBuilder.is_new_style;
      if (integer2 == null) {
        this.is_new_style = DEFAULT_IS_NEW_STYLE;
      } else {
        this.is_new_style = integer2;
      } 
      integer2 = paramBuilder.reply_num;
      if (integer2 == null) {
        this.reply_num = DEFAULT_REPLY_NUM;
      } else {
        this.reply_num = integer2;
      } 
      this.author = paramBuilder.author;
      this.agree = paramBuilder.agree;
      integer2 = paramBuilder.shared_num;
      if (integer2 == null) {
        this.shared_num = DEFAULT_SHARED_NUM;
      } else {
        this.shared_num = integer2;
      } 
      this.poll_info = paramBuilder.poll_info;
      this.item = paramBuilder.item;
      List<HeadItem> list1 = paramBuilder.item_star;
      if (list1 == null) {
        this.item_star = DEFAULT_ITEM_STAR;
      } else {
        this.item_star = Message.immutableCopyOf(list1);
      } 
      List<PbLinkInfo> list = paramBuilder.pb_link_info;
      if (list == null) {
        this.pb_link_info = DEFAULT_PB_LINK_INFO;
      } else {
        this.pb_link_info = Message.immutableCopyOf(list);
      } 
      Long long_1 = paramBuilder.pid;
      if (long_1 == null) {
        this.pid = DEFAULT_PID;
      } else {
        this.pid = long_1;
      } 
      Integer integer1 = paramBuilder.good_types;
      if (integer1 == null) {
        this.good_types = DEFAULT_GOOD_TYPES;
      } else {
        this.good_types = integer1;
      } 
      integer1 = paramBuilder.top_types;
      if (integer1 == null) {
        this.top_types = DEFAULT_TOP_TYPES;
      } else {
        this.top_types = integer1;
      } 
      integer = paramBuilder.is_frs_mask;
      if (integer == null) {
        this.is_frs_mask = DEFAULT_IS_FRS_MASK;
      } else {
        this.is_frs_mask = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.media = Message.immutableCopyOf(((Builder)integer).media);
      this._abstract = Message.immutableCopyOf(((Builder)integer)._abstract);
      this.fname = ((Builder)integer).fname;
      this.tid = ((Builder)integer).tid;
      this.ala_info = ((Builder)integer).ala_info;
      this.fid = ((Builder)integer).fid;
      this.thread_type = ((Builder)integer).thread_type;
      this.is_deleted = ((Builder)integer).is_deleted;
      this.is_ugc = ((Builder)integer).is_ugc;
      this.ori_ugc_info = ((Builder)integer).ori_ugc_info;
      this.voice_info = Message.immutableCopyOf(((Builder)integer).voice_info);
      this.video_info = ((Builder)integer).video_info;
      this.content = Message.immutableCopyOf(((Builder)integer).content);
      this.is_new_style = ((Builder)integer).is_new_style;
      this.reply_num = ((Builder)integer).reply_num;
      this.author = ((Builder)integer).author;
      this.agree = ((Builder)integer).agree;
      this.shared_num = ((Builder)integer).shared_num;
      this.poll_info = ((Builder)integer).poll_info;
      this.item = ((Builder)integer).item;
      this.item_star = Message.immutableCopyOf(((Builder)integer).item_star);
      this.pb_link_info = Message.immutableCopyOf(((Builder)integer).pb_link_info);
      this.pid = ((Builder)integer).pid;
      this.good_types = ((Builder)integer).good_types;
      this.top_types = ((Builder)integer).top_types;
      this.is_frs_mask = ((Builder)integer).is_frs_mask;
    } 
  }
  
  public OriginThreadInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<OriginThreadInfo> {
    public List<Abstract> _abstract;
    
    public Agree agree;
    
    public AlaLiveInfo ala_info;
    
    public User author;
    
    public List<PbContent> content;
    
    public Long fid;
    
    public String fname;
    
    public Integer good_types;
    
    public Integer is_deleted;
    
    public Integer is_frs_mask;
    
    public Integer is_new_style;
    
    public Integer is_ugc;
    
    public Item item;
    
    public List<HeadItem> item_star;
    
    public List<Media> media;
    
    public Baijiahao ori_ugc_info;
    
    public List<PbLinkInfo> pb_link_info;
    
    public Long pid;
    
    public PollInfo poll_info;
    
    public Integer reply_num;
    
    public Integer shared_num;
    
    public Integer thread_type;
    
    public String tid;
    
    public String title;
    
    public Integer top_types;
    
    public VideoInfo video_info;
    
    public List<Voice> voice_info;
    
    public Builder() {}
    
    public Builder(OriginThreadInfo param1OriginThreadInfo) {
      super(param1OriginThreadInfo);
      if (param1OriginThreadInfo == null)
        return; 
      this.title = param1OriginThreadInfo.title;
      this.media = Message.copyOf(param1OriginThreadInfo.media);
      this._abstract = Message.copyOf(param1OriginThreadInfo._abstract);
      this.fname = param1OriginThreadInfo.fname;
      this.tid = param1OriginThreadInfo.tid;
      this.ala_info = param1OriginThreadInfo.ala_info;
      this.fid = param1OriginThreadInfo.fid;
      this.thread_type = param1OriginThreadInfo.thread_type;
      this.is_deleted = param1OriginThreadInfo.is_deleted;
      this.is_ugc = param1OriginThreadInfo.is_ugc;
      this.ori_ugc_info = param1OriginThreadInfo.ori_ugc_info;
      this.voice_info = Message.copyOf(param1OriginThreadInfo.voice_info);
      this.video_info = param1OriginThreadInfo.video_info;
      this.content = Message.copyOf(param1OriginThreadInfo.content);
      this.is_new_style = param1OriginThreadInfo.is_new_style;
      this.reply_num = param1OriginThreadInfo.reply_num;
      this.author = param1OriginThreadInfo.author;
      this.agree = param1OriginThreadInfo.agree;
      this.shared_num = param1OriginThreadInfo.shared_num;
      this.poll_info = param1OriginThreadInfo.poll_info;
      this.item = param1OriginThreadInfo.item;
      this.item_star = Message.copyOf(param1OriginThreadInfo.item_star);
      this.pb_link_info = Message.copyOf(param1OriginThreadInfo.pb_link_info);
      this.pid = param1OriginThreadInfo.pid;
      this.good_types = param1OriginThreadInfo.good_types;
      this.top_types = param1OriginThreadInfo.top_types;
      this.is_frs_mask = param1OriginThreadInfo.is_frs_mask;
    }
    
    public OriginThreadInfo build(boolean param1Boolean) {
      return new OriginThreadInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
