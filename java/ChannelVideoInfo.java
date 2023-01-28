package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChannelVideoInfo extends Message {
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final Integer DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_TOP;
  
  public static final Integer DEFAULT_PLAY_COUNT;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final Integer DEFAULT_THUMBNAIL_HEIGHT;
  
  public static final String DEFAULT_THUMBNAIL_URL = "";
  
  public static final Integer DEFAULT_THUMBNAIL_WIDTH;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_VIDEO_DURATION;
  
  public static final Integer DEFAULT_VIDEO_HEIGHT;
  
  public static final Integer DEFAULT_VIDEO_LENGTH;
  
  public static final Long DEFAULT_VIDEO_TYPE;
  
  public static final String DEFAULT_VIDEO_URL = "";
  
  public static final Integer DEFAULT_VIDEO_WIDTH;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT32)
  public final Integer create_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer forum_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer is_top;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer play_count;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer thumbnail_height;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String thumbnail_url;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer thumbnail_width;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer video_duration;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer video_height;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer video_length;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT64)
  public final Long video_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String video_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer video_width;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_FORUM_ID = integer;
    DEFAULT_PLAY_COUNT = integer;
    DEFAULT_VIDEO_DURATION = integer;
    DEFAULT_VIDEO_WIDTH = integer;
    DEFAULT_VIDEO_HEIGHT = integer;
    DEFAULT_VIDEO_LENGTH = integer;
    DEFAULT_VIDEO_TYPE = long_;
    DEFAULT_THUMBNAIL_WIDTH = integer;
    DEFAULT_THUMBNAIL_HEIGHT = integer;
    DEFAULT_IS_TOP = integer;
    DEFAULT_CREATE_TIME = integer;
  }
  
  public ChannelVideoInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.thread_id;
      if (long_2 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_2;
      } 
      Integer integer4 = paramBuilder.forum_id;
      if (integer4 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = integer4;
      } 
      String str3 = paramBuilder.forum_name;
      if (str3 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str3;
      } 
      str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      Integer integer3 = paramBuilder.play_count;
      if (integer3 == null) {
        this.play_count = DEFAULT_PLAY_COUNT;
      } else {
        this.play_count = integer3;
      } 
      String str2 = paramBuilder.video_url;
      if (str2 == null) {
        this.video_url = "";
      } else {
        this.video_url = str2;
      } 
      Integer integer2 = paramBuilder.video_duration;
      if (integer2 == null) {
        this.video_duration = DEFAULT_VIDEO_DURATION;
      } else {
        this.video_duration = integer2;
      } 
      integer2 = paramBuilder.video_width;
      if (integer2 == null) {
        this.video_width = DEFAULT_VIDEO_WIDTH;
      } else {
        this.video_width = integer2;
      } 
      integer2 = paramBuilder.video_height;
      if (integer2 == null) {
        this.video_height = DEFAULT_VIDEO_HEIGHT;
      } else {
        this.video_height = integer2;
      } 
      integer2 = paramBuilder.video_length;
      if (integer2 == null) {
        this.video_length = DEFAULT_VIDEO_LENGTH;
      } else {
        this.video_length = integer2;
      } 
      Long long_1 = paramBuilder.video_type;
      if (long_1 == null) {
        this.video_type = DEFAULT_VIDEO_TYPE;
      } else {
        this.video_type = long_1;
      } 
      String str1 = paramBuilder.thumbnail_url;
      if (str1 == null) {
        this.thumbnail_url = "";
      } else {
        this.thumbnail_url = str1;
      } 
      Integer integer1 = paramBuilder.thumbnail_width;
      if (integer1 == null) {
        this.thumbnail_width = DEFAULT_THUMBNAIL_WIDTH;
      } else {
        this.thumbnail_width = integer1;
      } 
      integer1 = paramBuilder.thumbnail_height;
      if (integer1 == null) {
        this.thumbnail_height = DEFAULT_THUMBNAIL_HEIGHT;
      } else {
        this.thumbnail_height = integer1;
      } 
      integer1 = paramBuilder.is_top;
      if (integer1 == null) {
        this.is_top = DEFAULT_IS_TOP;
      } else {
        this.is_top = integer1;
      } 
      integer = paramBuilder.create_time;
      if (integer == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer;
      } 
    } else {
      this.thread_id = ((Builder)integer).thread_id;
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.title = ((Builder)integer).title;
      this.play_count = ((Builder)integer).play_count;
      this.video_url = ((Builder)integer).video_url;
      this.video_duration = ((Builder)integer).video_duration;
      this.video_width = ((Builder)integer).video_width;
      this.video_height = ((Builder)integer).video_height;
      this.video_length = ((Builder)integer).video_length;
      this.video_type = ((Builder)integer).video_type;
      this.thumbnail_url = ((Builder)integer).thumbnail_url;
      this.thumbnail_width = ((Builder)integer).thumbnail_width;
      this.thumbnail_height = ((Builder)integer).thumbnail_height;
      this.is_top = ((Builder)integer).is_top;
      this.create_time = ((Builder)integer).create_time;
    } 
  }
  
  public ChannelVideoInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ChannelVideoInfo> {
    public Integer create_time;
    
    public Integer forum_id;
    
    public String forum_name;
    
    public Integer is_top;
    
    public Integer play_count;
    
    public Long thread_id;
    
    public Integer thumbnail_height;
    
    public String thumbnail_url;
    
    public Integer thumbnail_width;
    
    public String title;
    
    public Integer video_duration;
    
    public Integer video_height;
    
    public Integer video_length;
    
    public Long video_type;
    
    public String video_url;
    
    public Integer video_width;
    
    public Builder() {}
    
    public Builder(ChannelVideoInfo param1ChannelVideoInfo) {
      super(param1ChannelVideoInfo);
      if (param1ChannelVideoInfo == null)
        return; 
      this.thread_id = param1ChannelVideoInfo.thread_id;
      this.forum_id = param1ChannelVideoInfo.forum_id;
      this.forum_name = param1ChannelVideoInfo.forum_name;
      this.title = param1ChannelVideoInfo.title;
      this.play_count = param1ChannelVideoInfo.play_count;
      this.video_url = param1ChannelVideoInfo.video_url;
      this.video_duration = param1ChannelVideoInfo.video_duration;
      this.video_width = param1ChannelVideoInfo.video_width;
      this.video_height = param1ChannelVideoInfo.video_height;
      this.video_length = param1ChannelVideoInfo.video_length;
      this.video_type = param1ChannelVideoInfo.video_type;
      this.thumbnail_url = param1ChannelVideoInfo.thumbnail_url;
      this.thumbnail_width = param1ChannelVideoInfo.thumbnail_width;
      this.thumbnail_height = param1ChannelVideoInfo.thumbnail_height;
      this.is_top = param1ChannelVideoInfo.is_top;
      this.create_time = param1ChannelVideoInfo.create_time;
    }
    
    public ChannelVideoInfo build(boolean param1Boolean) {
      return new ChannelVideoInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
