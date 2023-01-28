package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GoodThread extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final Long DEFAULT_FID;
  
  public static final String DEFAULT_FNAME = "";
  
  public static final String DEFAULT_HEAD_PIC = "";
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Long DEFAULT_REPLY_NUM;
  
  public static final Long DEFAULT_TID;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Long DEFAULT_ZAN_NUM;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long fid;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String fname;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String head_pic;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long reply_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT64)
  public final Long zan_num;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TID = long_;
    DEFAULT_REPLY_NUM = long_;
    DEFAULT_ZAN_NUM = long_;
    DEFAULT_FID = long_;
    DEFAULT_POST_ID = long_;
  }
  
  public GoodThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_4 = paramBuilder.tid;
      if (long_4 == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_4;
      } 
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      Long long_3 = paramBuilder.reply_num;
      if (long_3 == null) {
        this.reply_num = DEFAULT_REPLY_NUM;
      } else {
        this.reply_num = long_3;
      } 
      String str2 = paramBuilder._abstract;
      if (str2 == null) {
        this._abstract = "";
      } else {
        this._abstract = str2;
      } 
      Long long_2 = paramBuilder.zan_num;
      if (long_2 == null) {
        this.zan_num = DEFAULT_ZAN_NUM;
      } else {
        this.zan_num = long_2;
      } 
      String str1 = paramBuilder.fname;
      if (str1 == null) {
        this.fname = "";
      } else {
        this.fname = str1;
      } 
      Long long_1 = paramBuilder.fid;
      if (long_1 == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_1;
      } 
      long_1 = paramBuilder.post_id;
      if (long_1 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_1;
      } 
      str = paramBuilder.head_pic;
      if (str == null) {
        this.head_pic = "";
      } else {
        this.head_pic = str;
      } 
    } else {
      this.tid = ((Builder)str).tid;
      this.title = ((Builder)str).title;
      this.reply_num = ((Builder)str).reply_num;
      this._abstract = ((Builder)str)._abstract;
      this.zan_num = ((Builder)str).zan_num;
      this.fname = ((Builder)str).fname;
      this.fid = ((Builder)str).fid;
      this.post_id = ((Builder)str).post_id;
      this.head_pic = ((Builder)str).head_pic;
    } 
  }
  
  public GoodThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GoodThread> {
    public String _abstract;
    
    public Long fid;
    
    public String fname;
    
    public String head_pic;
    
    public Long post_id;
    
    public Long reply_num;
    
    public Long tid;
    
    public String title;
    
    public Long zan_num;
    
    public Builder() {}
    
    public Builder(GoodThread param1GoodThread) {
      super(param1GoodThread);
      if (param1GoodThread == null)
        return; 
      this.tid = param1GoodThread.tid;
      this.title = param1GoodThread.title;
      this.reply_num = param1GoodThread.reply_num;
      this._abstract = param1GoodThread._abstract;
      this.zan_num = param1GoodThread.zan_num;
      this.fname = param1GoodThread.fname;
      this.fid = param1GoodThread.fid;
      this.post_id = param1GoodThread.post_id;
      this.head_pic = param1GoodThread.head_pic;
    }
    
    public GoodThread build(boolean param1Boolean) {
      return new GoodThread(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
