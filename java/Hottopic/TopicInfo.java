package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.VideoInfo;

public final class TopicInfo extends Message {
  public static final String DEFAULT_BANG_JUMP_DESC = "";
  
  public static final String DEFAULT_BANG_TITLE = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_DISCUSS_FORUM = "";
  
  public static final String DEFAULT_HEAD_BACKGROUND_URL = "";
  
  public static final String DEFAULT_HEAD_PHOTO_JUMP_URL = "";
  
  public static final String DEFAULT_HEAD_PHOTO_URL = "";
  
  public static final Long DEFAULT_IDX_NUM;
  
  public static final Long DEFAULT_IS_DELETED;
  
  public static final Integer DEFAULT_IS_VIDEO_TOPIC;
  
  public static final Integer DEFAULT_PLAY_COUNT;
  
  public static final Integer DEFAULT_PMY_SOURCE;
  
  public static final Long DEFAULT_PMY_TOPIC_ID;
  
  public static final String DEFAULT_SHARE_PIC = "";
  
  public static final String DEFAULT_SHARE_TITLE = "";
  
  public static final String DEFAULT_TAG_LIST_TYPE = "";
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public static final Integer DEFAULT_TOPIC_TAG;
  
  public static final Long DEFAULT_TOTAL_POST_NUM;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String bang_jump_desc;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String bang_title;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String discuss_forum;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String head_background_url;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String head_photo_jump_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String head_photo_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long idx_num;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT64)
  public final Long is_deleted;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer is_video_topic;
  
  @ProtoField(tag = 16)
  public final JoinUser join_info;
  
  @ProtoField(tag = 21, type = Message.Datatype.INT32)
  public final Integer play_count;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer pmy_source;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT64)
  public final Long pmy_topic_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String share_pic;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String share_title;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String tag_list_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long topic_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer topic_tag;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long total_post_num;
  
  @ProtoField(tag = 12)
  public final VideoInfo video_info;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    DEFAULT_TOTAL_POST_NUM = long_;
    DEFAULT_IDX_NUM = long_;
    DEFAULT_PMY_TOPIC_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_PMY_SOURCE = integer;
    DEFAULT_TOPIC_TAG = integer;
    DEFAULT_IS_DELETED = long_;
    DEFAULT_IS_VIDEO_TOPIC = integer;
    DEFAULT_PLAY_COUNT = integer;
  }
  
  public TopicInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_5 = paramBuilder.topic_id;
      if (long_5 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_5;
      } 
      String str4 = paramBuilder.topic_name;
      if (str4 == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str4;
      } 
      str4 = paramBuilder.desc;
      if (str4 == null) {
        this.desc = "";
      } else {
        this.desc = str4;
      } 
      Long long_4 = paramBuilder.total_post_num;
      if (long_4 == null) {
        this.total_post_num = DEFAULT_TOTAL_POST_NUM;
      } else {
        this.total_post_num = long_4;
      } 
      String str3 = paramBuilder.head_photo_url;
      if (str3 == null) {
        this.head_photo_url = "";
      } else {
        this.head_photo_url = str3;
      } 
      str3 = paramBuilder.share_title;
      if (str3 == null) {
        this.share_title = "";
      } else {
        this.share_title = str3;
      } 
      str3 = paramBuilder.share_pic;
      if (str3 == null) {
        this.share_pic = "";
      } else {
        this.share_pic = str3;
      } 
      Long long_3 = paramBuilder.idx_num;
      if (long_3 == null) {
        this.idx_num = DEFAULT_IDX_NUM;
      } else {
        this.idx_num = long_3;
      } 
      String str2 = paramBuilder.discuss_forum;
      if (str2 == null) {
        this.discuss_forum = "";
      } else {
        this.discuss_forum = str2;
      } 
      str2 = paramBuilder.bang_title;
      if (str2 == null) {
        this.bang_title = "";
      } else {
        this.bang_title = str2;
      } 
      str2 = paramBuilder.bang_jump_desc;
      if (str2 == null) {
        this.bang_jump_desc = "";
      } else {
        this.bang_jump_desc = str2;
      } 
      this.video_info = paramBuilder.video_info;
      str2 = paramBuilder.tag_list_type;
      if (str2 == null) {
        this.tag_list_type = "";
      } else {
        this.tag_list_type = str2;
      } 
      Long long_2 = paramBuilder.pmy_topic_id;
      if (long_2 == null) {
        this.pmy_topic_id = DEFAULT_PMY_TOPIC_ID;
      } else {
        this.pmy_topic_id = long_2;
      } 
      Integer integer3 = paramBuilder.pmy_source;
      if (integer3 == null) {
        this.pmy_source = DEFAULT_PMY_SOURCE;
      } else {
        this.pmy_source = integer3;
      } 
      this.join_info = paramBuilder.join_info;
      String str1 = paramBuilder.head_photo_jump_url;
      if (str1 == null) {
        this.head_photo_jump_url = "";
      } else {
        this.head_photo_jump_url = str1;
      } 
      Integer integer2 = paramBuilder.topic_tag;
      if (integer2 == null) {
        this.topic_tag = DEFAULT_TOPIC_TAG;
      } else {
        this.topic_tag = integer2;
      } 
      Long long_1 = paramBuilder.is_deleted;
      if (long_1 == null) {
        this.is_deleted = DEFAULT_IS_DELETED;
      } else {
        this.is_deleted = long_1;
      } 
      Integer integer1 = paramBuilder.is_video_topic;
      if (integer1 == null) {
        this.is_video_topic = DEFAULT_IS_VIDEO_TOPIC;
      } else {
        this.is_video_topic = integer1;
      } 
      integer1 = paramBuilder.play_count;
      if (integer1 == null) {
        this.play_count = DEFAULT_PLAY_COUNT;
      } else {
        this.play_count = integer1;
      } 
      str = paramBuilder.head_background_url;
      if (str == null) {
        this.head_background_url = "";
      } else {
        this.head_background_url = str;
      } 
    } else {
      this.topic_id = ((Builder)str).topic_id;
      this.topic_name = ((Builder)str).topic_name;
      this.desc = ((Builder)str).desc;
      this.total_post_num = ((Builder)str).total_post_num;
      this.head_photo_url = ((Builder)str).head_photo_url;
      this.share_title = ((Builder)str).share_title;
      this.share_pic = ((Builder)str).share_pic;
      this.idx_num = ((Builder)str).idx_num;
      this.discuss_forum = ((Builder)str).discuss_forum;
      this.bang_title = ((Builder)str).bang_title;
      this.bang_jump_desc = ((Builder)str).bang_jump_desc;
      this.video_info = ((Builder)str).video_info;
      this.tag_list_type = ((Builder)str).tag_list_type;
      this.pmy_topic_id = ((Builder)str).pmy_topic_id;
      this.pmy_source = ((Builder)str).pmy_source;
      this.join_info = ((Builder)str).join_info;
      this.head_photo_jump_url = ((Builder)str).head_photo_jump_url;
      this.topic_tag = ((Builder)str).topic_tag;
      this.is_deleted = ((Builder)str).is_deleted;
      this.is_video_topic = ((Builder)str).is_video_topic;
      this.play_count = ((Builder)str).play_count;
      this.head_background_url = ((Builder)str).head_background_url;
    } 
  }
  
  public TopicInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TopicInfo> {
    public String bang_jump_desc;
    
    public String bang_title;
    
    public String desc;
    
    public String discuss_forum;
    
    public String head_background_url;
    
    public String head_photo_jump_url;
    
    public String head_photo_url;
    
    public Long idx_num;
    
    public Long is_deleted;
    
    public Integer is_video_topic;
    
    public JoinUser join_info;
    
    public Integer play_count;
    
    public Integer pmy_source;
    
    public Long pmy_topic_id;
    
    public String share_pic;
    
    public String share_title;
    
    public String tag_list_type;
    
    public Long topic_id;
    
    public String topic_name;
    
    public Integer topic_tag;
    
    public Long total_post_num;
    
    public VideoInfo video_info;
    
    public Builder() {}
    
    public Builder(TopicInfo param1TopicInfo) {
      super(param1TopicInfo);
      if (param1TopicInfo == null)
        return; 
      this.topic_id = param1TopicInfo.topic_id;
      this.topic_name = param1TopicInfo.topic_name;
      this.desc = param1TopicInfo.desc;
      this.total_post_num = param1TopicInfo.total_post_num;
      this.head_photo_url = param1TopicInfo.head_photo_url;
      this.share_title = param1TopicInfo.share_title;
      this.share_pic = param1TopicInfo.share_pic;
      this.idx_num = param1TopicInfo.idx_num;
      this.discuss_forum = param1TopicInfo.discuss_forum;
      this.bang_title = param1TopicInfo.bang_title;
      this.bang_jump_desc = param1TopicInfo.bang_jump_desc;
      this.video_info = param1TopicInfo.video_info;
      this.tag_list_type = param1TopicInfo.tag_list_type;
      this.pmy_topic_id = param1TopicInfo.pmy_topic_id;
      this.pmy_source = param1TopicInfo.pmy_source;
      this.join_info = param1TopicInfo.join_info;
      this.head_photo_jump_url = param1TopicInfo.head_photo_jump_url;
      this.topic_tag = param1TopicInfo.topic_tag;
      this.is_deleted = param1TopicInfo.is_deleted;
      this.is_video_topic = param1TopicInfo.is_video_topic;
      this.play_count = param1TopicInfo.play_count;
      this.head_background_url = param1TopicInfo.head_background_url;
    }
    
    public TopicInfo build(boolean param1Boolean) {
      return new TopicInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
