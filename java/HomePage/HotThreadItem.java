package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HotThreadItem extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final Long DEFAULT_COMMENT_NUM;
  
  public static final Long DEFAULT_EXCID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_PB_TYPE;
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final Long DEFAULT_TAG_CODE;
  
  public static final Long DEFAULT_TID;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Long DEFAULT_ZAN_NUM;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long comment_num;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long excid;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer pb_type;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long tag_code;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long zan_num;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TID = long_;
    DEFAULT_EXCID = long_;
    DEFAULT_TAG_CODE = long_;
    DEFAULT_PB_TYPE = Integer.valueOf(0);
    DEFAULT_ZAN_NUM = long_;
    DEFAULT_COMMENT_NUM = long_;
  }
  
  public HotThreadItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.tid;
      if (long_2 == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_2;
      } 
      long_2 = paramBuilder.excid;
      if (long_2 == null) {
        this.excid = DEFAULT_EXCID;
      } else {
        this.excid = long_2;
      } 
      long_2 = paramBuilder.tag_code;
      if (long_2 == null) {
        this.tag_code = DEFAULT_TAG_CODE;
      } else {
        this.tag_code = long_2;
      } 
      Integer integer = paramBuilder.pb_type;
      if (integer == null) {
        this.pb_type = DEFAULT_PB_TYPE;
      } else {
        this.pb_type = integer;
      } 
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder._abstract;
      if (str == null) {
        this._abstract = "";
      } else {
        this._abstract = str;
      } 
      str = paramBuilder.forum_name;
      if (str == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str;
      } 
      str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
      Long long_1 = paramBuilder.zan_num;
      if (long_1 == null) {
        this.zan_num = DEFAULT_ZAN_NUM;
      } else {
        this.zan_num = long_1;
      } 
      long_ = paramBuilder.comment_num;
      if (long_ == null) {
        this.comment_num = DEFAULT_COMMENT_NUM;
      } else {
        this.comment_num = long_;
      } 
    } else {
      this.tid = ((Builder)long_).tid;
      this.excid = ((Builder)long_).excid;
      this.tag_code = ((Builder)long_).tag_code;
      this.pb_type = ((Builder)long_).pb_type;
      this.title = ((Builder)long_).title;
      this._abstract = ((Builder)long_)._abstract;
      this.forum_name = ((Builder)long_).forum_name;
      this.pic_url = ((Builder)long_).pic_url;
      this.zan_num = ((Builder)long_).zan_num;
      this.comment_num = ((Builder)long_).comment_num;
    } 
  }
  
  public HotThreadItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotThreadItem> {
    public String _abstract;
    
    public Long comment_num;
    
    public Long excid;
    
    public String forum_name;
    
    public Integer pb_type;
    
    public String pic_url;
    
    public Long tag_code;
    
    public Long tid;
    
    public String title;
    
    public Long zan_num;
    
    public Builder() {}
    
    public Builder(HotThreadItem param1HotThreadItem) {
      super(param1HotThreadItem);
      if (param1HotThreadItem == null)
        return; 
      this.tid = param1HotThreadItem.tid;
      this.excid = param1HotThreadItem.excid;
      this.tag_code = param1HotThreadItem.tag_code;
      this.pb_type = param1HotThreadItem.pb_type;
      this.title = param1HotThreadItem.title;
      this._abstract = param1HotThreadItem._abstract;
      this.forum_name = param1HotThreadItem.forum_name;
      this.pic_url = param1HotThreadItem.pic_url;
      this.zan_num = param1HotThreadItem.zan_num;
      this.comment_num = param1HotThreadItem.comment_num;
    }
    
    public HotThreadItem build(boolean param1Boolean) {
      return new HotThreadItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
