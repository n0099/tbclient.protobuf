package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.RecomTagInfo;

public final class TagInfo extends Message {
  public static final Integer DEFAULT_COLOR;
  
  public static final String DEFAULT_FIRST_CATEGORY = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_HOT_VALUE;
  
  public static final Integer DEFAULT_INFLUENCE;
  
  public static final Integer DEFAULT_OP_TIME;
  
  public static final Integer DEFAULT_RELATION_WEIGHT;
  
  public static final Integer DEFAULT_TAG_ID;
  
  public static final Integer DEFAULT_TAG_LEVEL;
  
  public static final String DEFAULT_TAG_NAME = "";
  
  public static final Integer DEFAULT_TAG_TYPE;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer color;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String first_category;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer hot_value;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer influence;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer op_time;
  
  @ProtoField(tag = 11)
  public final RecomTagInfo recom_tag;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer relation_weight;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer tag_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer tag_level;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tag_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer tag_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAG_ID = integer;
    DEFAULT_COLOR = integer;
    DEFAULT_HOT_VALUE = integer;
    DEFAULT_TAG_TYPE = integer;
    DEFAULT_TAG_LEVEL = integer;
    DEFAULT_INFLUENCE = integer;
    DEFAULT_RELATION_WEIGHT = integer;
    DEFAULT_OP_TIME = integer;
  }
  
  public TagInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      Integer integer2 = paramBuilder.tag_id;
      if (integer2 == null) {
        this.tag_id = DEFAULT_TAG_ID;
      } else {
        this.tag_id = integer2;
      } 
      String str1 = paramBuilder.tag_name;
      if (str1 == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str1;
      } 
      Integer integer1 = paramBuilder.color;
      if (integer1 == null) {
        this.color = DEFAULT_COLOR;
      } else {
        this.color = integer1;
      } 
      integer1 = paramBuilder.hot_value;
      if (integer1 == null) {
        this.hot_value = DEFAULT_HOT_VALUE;
      } else {
        this.hot_value = integer1;
      } 
      integer1 = paramBuilder.tag_type;
      if (integer1 == null) {
        this.tag_type = DEFAULT_TAG_TYPE;
      } else {
        this.tag_type = integer1;
      } 
      integer1 = paramBuilder.tag_level;
      if (integer1 == null) {
        this.tag_level = DEFAULT_TAG_LEVEL;
      } else {
        this.tag_level = integer1;
      } 
      integer1 = paramBuilder.influence;
      if (integer1 == null) {
        this.influence = DEFAULT_INFLUENCE;
      } else {
        this.influence = integer1;
      } 
      integer1 = paramBuilder.relation_weight;
      if (integer1 == null) {
        this.relation_weight = DEFAULT_RELATION_WEIGHT;
      } else {
        this.relation_weight = integer1;
      } 
      integer1 = paramBuilder.op_time;
      if (integer1 == null) {
        this.op_time = DEFAULT_OP_TIME;
      } else {
        this.op_time = integer1;
      } 
      this.recom_tag = paramBuilder.recom_tag;
      str = paramBuilder.first_category;
      if (str == null) {
        this.first_category = "";
      } else {
        this.first_category = str;
      } 
    } else {
      this.forum_id = ((Builder)str).forum_id;
      this.tag_id = ((Builder)str).tag_id;
      this.tag_name = ((Builder)str).tag_name;
      this.color = ((Builder)str).color;
      this.hot_value = ((Builder)str).hot_value;
      this.tag_type = ((Builder)str).tag_type;
      this.tag_level = ((Builder)str).tag_level;
      this.influence = ((Builder)str).influence;
      this.relation_weight = ((Builder)str).relation_weight;
      this.op_time = ((Builder)str).op_time;
      this.recom_tag = ((Builder)str).recom_tag;
      this.first_category = ((Builder)str).first_category;
    } 
  }
  
  public TagInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TagInfo> {
    public Integer color;
    
    public String first_category;
    
    public Long forum_id;
    
    public Integer hot_value;
    
    public Integer influence;
    
    public Integer op_time;
    
    public RecomTagInfo recom_tag;
    
    public Integer relation_weight;
    
    public Integer tag_id;
    
    public Integer tag_level;
    
    public String tag_name;
    
    public Integer tag_type;
    
    public Builder() {}
    
    public Builder(TagInfo param1TagInfo) {
      super(param1TagInfo);
      if (param1TagInfo == null)
        return; 
      this.forum_id = param1TagInfo.forum_id;
      this.tag_id = param1TagInfo.tag_id;
      this.tag_name = param1TagInfo.tag_name;
      this.color = param1TagInfo.color;
      this.hot_value = param1TagInfo.hot_value;
      this.tag_type = param1TagInfo.tag_type;
      this.tag_level = param1TagInfo.tag_level;
      this.influence = param1TagInfo.influence;
      this.relation_weight = param1TagInfo.relation_weight;
      this.op_time = param1TagInfo.op_time;
      this.recom_tag = param1TagInfo.recom_tag;
      this.first_category = param1TagInfo.first_category;
    }
    
    public TagInfo build(boolean param1Boolean) {
      return new TagInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
