package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SearchValue extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_IS_VIDEO_TOPIC;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Long DEFAULT_TYPE;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_video_topic;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long type;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TYPE = long_;
    DEFAULT_ID = long_;
    DEFAULT_IS_VIDEO_TOPIC = Integer.valueOf(0);
  }
  
  public SearchValue(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.type;
      if (long_ == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = long_;
      } 
      long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
      integer = paramBuilder.is_video_topic;
      if (integer == null) {
        this.is_video_topic = DEFAULT_IS_VIDEO_TOPIC;
      } else {
        this.is_video_topic = integer;
      } 
    } else {
      this.type = ((Builder)integer).type;
      this.id = ((Builder)integer).id;
      this.name = ((Builder)integer).name;
      this.desc = ((Builder)integer).desc;
      this.is_video_topic = ((Builder)integer).is_video_topic;
    } 
  }
  
  public SearchValue(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SearchValue> {
    public String desc;
    
    public Long id;
    
    public Integer is_video_topic;
    
    public String name;
    
    public Long type;
    
    public Builder() {}
    
    public Builder(SearchValue param1SearchValue) {
      super(param1SearchValue);
      if (param1SearchValue == null)
        return; 
      this.type = param1SearchValue.type;
      this.id = param1SearchValue.id;
      this.name = param1SearchValue.name;
      this.desc = param1SearchValue.desc;
      this.is_video_topic = param1SearchValue.is_video_topic;
    }
    
    public SearchValue build(boolean param1Boolean) {
      return new SearchValue(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
