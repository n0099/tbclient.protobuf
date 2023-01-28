package tbclient.HotThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class tinfo extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final Long DEFAULT_CREATE_TIME;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_ACTIVITY;
  
  public static final Integer DEFAULT_IS_GOOD;
  
  public static final Integer DEFAULT_IS_LIVEPOST;
  
  public static final Integer DEFAULT_IS_MEMBERTOP;
  
  public static final Integer DEFAULT_IS_TOP;
  
  public static final List<Pic> DEFAULT_PICS;
  
  public static final Integer DEFAULT_REPLY_NUM;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Integer DEFAULT_ZAN_NUM;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long create_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer is_activity;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer is_good;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer is_livepost;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer is_membertop;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer is_top;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10)
  public final List<Pic> pics;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer reply_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer zan_num;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_ID = long_;
    DEFAULT_FORUM_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_REPLY_NUM = integer;
    DEFAULT_CREATE_TIME = long_;
    DEFAULT_ZAN_NUM = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_PICS = Collections.emptyList();
    DEFAULT_IS_GOOD = integer;
    DEFAULT_IS_TOP = integer;
    DEFAULT_IS_MEMBERTOP = integer;
    DEFAULT_IS_ACTIVITY = integer;
    DEFAULT_IS_LIVEPOST = integer;
  }
  
  public tinfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.thread_id;
      if (long_2 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_2;
      } 
      long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      String str2 = paramBuilder.forum_name;
      if (str2 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str2;
      } 
      str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      Integer integer4 = paramBuilder.reply_num;
      if (integer4 == null) {
        this.reply_num = DEFAULT_REPLY_NUM;
      } else {
        this.reply_num = integer4;
      } 
      Long long_1 = paramBuilder.create_time;
      if (long_1 == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = long_1;
      } 
      Integer integer3 = paramBuilder.zan_num;
      if (integer3 == null) {
        this.zan_num = DEFAULT_ZAN_NUM;
      } else {
        this.zan_num = integer3;
      } 
      String str1 = paramBuilder._abstract;
      if (str1 == null) {
        this._abstract = "";
      } else {
        this._abstract = str1;
      } 
      Integer integer2 = paramBuilder.type;
      if (integer2 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer2;
      } 
      List<Pic> list = paramBuilder.pics;
      if (list == null) {
        this.pics = DEFAULT_PICS;
      } else {
        this.pics = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.is_good;
      if (integer1 == null) {
        this.is_good = DEFAULT_IS_GOOD;
      } else {
        this.is_good = integer1;
      } 
      integer1 = paramBuilder.is_top;
      if (integer1 == null) {
        this.is_top = DEFAULT_IS_TOP;
      } else {
        this.is_top = integer1;
      } 
      integer1 = paramBuilder.is_membertop;
      if (integer1 == null) {
        this.is_membertop = DEFAULT_IS_MEMBERTOP;
      } else {
        this.is_membertop = integer1;
      } 
      integer1 = paramBuilder.is_activity;
      if (integer1 == null) {
        this.is_activity = DEFAULT_IS_ACTIVITY;
      } else {
        this.is_activity = integer1;
      } 
      integer = paramBuilder.is_livepost;
      if (integer == null) {
        this.is_livepost = DEFAULT_IS_LIVEPOST;
      } else {
        this.is_livepost = integer;
      } 
    } else {
      this.thread_id = ((Builder)integer).thread_id;
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.title = ((Builder)integer).title;
      this.reply_num = ((Builder)integer).reply_num;
      this.create_time = ((Builder)integer).create_time;
      this.zan_num = ((Builder)integer).zan_num;
      this._abstract = ((Builder)integer)._abstract;
      this.type = ((Builder)integer).type;
      this.pics = Message.immutableCopyOf(((Builder)integer).pics);
      this.is_good = ((Builder)integer).is_good;
      this.is_top = ((Builder)integer).is_top;
      this.is_membertop = ((Builder)integer).is_membertop;
      this.is_activity = ((Builder)integer).is_activity;
      this.is_livepost = ((Builder)integer).is_livepost;
    } 
  }
  
  public tinfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<tinfo> {
    public String _abstract;
    
    public Long create_time;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer is_activity;
    
    public Integer is_good;
    
    public Integer is_livepost;
    
    public Integer is_membertop;
    
    public Integer is_top;
    
    public List<Pic> pics;
    
    public Integer reply_num;
    
    public Long thread_id;
    
    public String title;
    
    public Integer type;
    
    public Integer zan_num;
    
    public Builder() {}
    
    public Builder(tinfo param1tinfo) {
      super(param1tinfo);
      if (param1tinfo == null)
        return; 
      this.thread_id = param1tinfo.thread_id;
      this.forum_id = param1tinfo.forum_id;
      this.forum_name = param1tinfo.forum_name;
      this.title = param1tinfo.title;
      this.reply_num = param1tinfo.reply_num;
      this.create_time = param1tinfo.create_time;
      this.zan_num = param1tinfo.zan_num;
      this._abstract = param1tinfo._abstract;
      this.type = param1tinfo.type;
      this.pics = Message.copyOf(param1tinfo.pics);
      this.is_good = param1tinfo.is_good;
      this.is_top = param1tinfo.is_top;
      this.is_membertop = param1tinfo.is_membertop;
      this.is_activity = param1tinfo.is_activity;
      this.is_livepost = param1tinfo.is_livepost;
    }
    
    public tinfo build(boolean param1Boolean) {
      return new tinfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
