package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VideoInfo extends Message {
  public static final String DEFAULT_FIRST_FRAME_THUMBNAIL = "";
  
  public static final Double DEFAULT_HTH_MID_LOC;
  
  public static final Integer DEFAULT_IS_VERTICAL;
  
  public static final String DEFAULT_MCN_LEAD_PAGE = "";
  
  public static final String DEFAULT_MEDIA_SUBTITLE = "";
  
  public static final Integer DEFAULT_PLAY_COUNT;
  
  public static final String DEFAULT_SMALL_THUMBNAIL_URL = "";
  
  public static final Integer DEFAULT_THUMBNAIL_HEIGHT;
  
  public static final String DEFAULT_THUMBNAIL_URL = "";
  
  public static final Integer DEFAULT_THUMBNAIL_WIDTH;
  
  public static final List<VideoDesc> DEFAULT_VIDEO_DESC;
  
  public static final Integer DEFAULT_VIDEO_DURATION;
  
  public static final Integer DEFAULT_VIDEO_HEIGHT;
  
  public static final Integer DEFAULT_VIDEO_LENGTH;
  
  public static final String DEFAULT_VIDEO_MD5 = "";
  
  public static final Integer DEFAULT_VIDEO_SELECT_FLAG;
  
  public static final Integer DEFAULT_VIDEO_TYPE;
  
  public static final String DEFAULT_VIDEO_URL = "";
  
  public static final Integer DEFAULT_VIDEO_WIDTH;
  
  public static final Double DEFAULT_WTH_MID_LOC;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String first_frame_thumbnail;
  
  @ProtoField(tag = 20, type = Message.Datatype.DOUBLE)
  public final Double hth_mid_loc;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer is_vertical;
  
  @ProtoField(tag = 18)
  public final McnAdInfo mcn_ad_card;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String mcn_lead_page;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String media_subtitle;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer play_count;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String small_thumbnail_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer thumbnail_height;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String thumbnail_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer thumbnail_width;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12)
  public final List<VideoDesc> video_desc;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer video_duration;
  
  @ProtoField(tag = 16)
  public final VideoDesc video_h265;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer video_height;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer video_length;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String video_md5;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer video_select_flag;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer video_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String video_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer video_width;
  
  @ProtoField(tag = 19, type = Message.Datatype.DOUBLE)
  public final Double wth_mid_loc;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_VIDEO_DURATION = integer;
    DEFAULT_VIDEO_WIDTH = integer;
    DEFAULT_VIDEO_HEIGHT = integer;
    DEFAULT_THUMBNAIL_WIDTH = integer;
    DEFAULT_THUMBNAIL_HEIGHT = integer;
    DEFAULT_VIDEO_LENGTH = integer;
    DEFAULT_PLAY_COUNT = integer;
    DEFAULT_VIDEO_DESC = Collections.emptyList();
    DEFAULT_VIDEO_SELECT_FLAG = integer;
    DEFAULT_VIDEO_TYPE = integer;
    DEFAULT_IS_VERTICAL = integer;
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_WTH_MID_LOC = double_;
    DEFAULT_HTH_MID_LOC = double_;
  }
  
  public VideoInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str5 = paramBuilder.video_md5;
      if (str5 == null) {
        this.video_md5 = "";
      } else {
        this.video_md5 = str5;
      } 
      str5 = paramBuilder.video_url;
      if (str5 == null) {
        this.video_url = "";
      } else {
        this.video_url = str5;
      } 
      Integer integer3 = paramBuilder.video_duration;
      if (integer3 == null) {
        this.video_duration = DEFAULT_VIDEO_DURATION;
      } else {
        this.video_duration = integer3;
      } 
      integer3 = paramBuilder.video_width;
      if (integer3 == null) {
        this.video_width = DEFAULT_VIDEO_WIDTH;
      } else {
        this.video_width = integer3;
      } 
      integer3 = paramBuilder.video_height;
      if (integer3 == null) {
        this.video_height = DEFAULT_VIDEO_HEIGHT;
      } else {
        this.video_height = integer3;
      } 
      String str4 = paramBuilder.thumbnail_url;
      if (str4 == null) {
        this.thumbnail_url = "";
      } else {
        this.thumbnail_url = str4;
      } 
      Integer integer2 = paramBuilder.thumbnail_width;
      if (integer2 == null) {
        this.thumbnail_width = DEFAULT_THUMBNAIL_WIDTH;
      } else {
        this.thumbnail_width = integer2;
      } 
      integer2 = paramBuilder.thumbnail_height;
      if (integer2 == null) {
        this.thumbnail_height = DEFAULT_THUMBNAIL_HEIGHT;
      } else {
        this.thumbnail_height = integer2;
      } 
      integer2 = paramBuilder.video_length;
      if (integer2 == null) {
        this.video_length = DEFAULT_VIDEO_LENGTH;
      } else {
        this.video_length = integer2;
      } 
      integer2 = paramBuilder.play_count;
      if (integer2 == null) {
        this.play_count = DEFAULT_PLAY_COUNT;
      } else {
        this.play_count = integer2;
      } 
      String str3 = paramBuilder.media_subtitle;
      if (str3 == null) {
        this.media_subtitle = "";
      } else {
        this.media_subtitle = str3;
      } 
      List<VideoDesc> list = paramBuilder.video_desc;
      if (list == null) {
        this.video_desc = DEFAULT_VIDEO_DESC;
      } else {
        this.video_desc = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.video_select_flag;
      if (integer1 == null) {
        this.video_select_flag = DEFAULT_VIDEO_SELECT_FLAG;
      } else {
        this.video_select_flag = integer1;
      } 
      integer1 = paramBuilder.video_type;
      if (integer1 == null) {
        this.video_type = DEFAULT_VIDEO_TYPE;
      } else {
        this.video_type = integer1;
      } 
      integer1 = paramBuilder.is_vertical;
      if (integer1 == null) {
        this.is_vertical = DEFAULT_IS_VERTICAL;
      } else {
        this.is_vertical = integer1;
      } 
      this.video_h265 = paramBuilder.video_h265;
      String str2 = paramBuilder.mcn_lead_page;
      if (str2 == null) {
        this.mcn_lead_page = "";
      } else {
        this.mcn_lead_page = str2;
      } 
      this.mcn_ad_card = paramBuilder.mcn_ad_card;
      Double double_ = paramBuilder.wth_mid_loc;
      if (double_ == null) {
        this.wth_mid_loc = DEFAULT_WTH_MID_LOC;
      } else {
        this.wth_mid_loc = double_;
      } 
      double_ = paramBuilder.hth_mid_loc;
      if (double_ == null) {
        this.hth_mid_loc = DEFAULT_HTH_MID_LOC;
      } else {
        this.hth_mid_loc = double_;
      } 
      String str1 = paramBuilder.small_thumbnail_url;
      if (str1 == null) {
        this.small_thumbnail_url = "";
      } else {
        this.small_thumbnail_url = str1;
      } 
      str = paramBuilder.first_frame_thumbnail;
      if (str == null) {
        this.first_frame_thumbnail = "";
      } else {
        this.first_frame_thumbnail = str;
      } 
    } else {
      this.video_md5 = ((Builder)str).video_md5;
      this.video_url = ((Builder)str).video_url;
      this.video_duration = ((Builder)str).video_duration;
      this.video_width = ((Builder)str).video_width;
      this.video_height = ((Builder)str).video_height;
      this.thumbnail_url = ((Builder)str).thumbnail_url;
      this.thumbnail_width = ((Builder)str).thumbnail_width;
      this.thumbnail_height = ((Builder)str).thumbnail_height;
      this.video_length = ((Builder)str).video_length;
      this.play_count = ((Builder)str).play_count;
      this.media_subtitle = ((Builder)str).media_subtitle;
      this.video_desc = Message.immutableCopyOf(((Builder)str).video_desc);
      this.video_select_flag = ((Builder)str).video_select_flag;
      this.video_type = ((Builder)str).video_type;
      this.is_vertical = ((Builder)str).is_vertical;
      this.video_h265 = ((Builder)str).video_h265;
      this.mcn_lead_page = ((Builder)str).mcn_lead_page;
      this.mcn_ad_card = ((Builder)str).mcn_ad_card;
      this.wth_mid_loc = ((Builder)str).wth_mid_loc;
      this.hth_mid_loc = ((Builder)str).hth_mid_loc;
      this.small_thumbnail_url = ((Builder)str).small_thumbnail_url;
      this.first_frame_thumbnail = ((Builder)str).first_frame_thumbnail;
    } 
  }
  
  public VideoInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VideoInfo> {
    public String first_frame_thumbnail;
    
    public Double hth_mid_loc;
    
    public Integer is_vertical;
    
    public McnAdInfo mcn_ad_card;
    
    public String mcn_lead_page;
    
    public String media_subtitle;
    
    public Integer play_count;
    
    public String small_thumbnail_url;
    
    public Integer thumbnail_height;
    
    public String thumbnail_url;
    
    public Integer thumbnail_width;
    
    public List<VideoDesc> video_desc;
    
    public Integer video_duration;
    
    public VideoDesc video_h265;
    
    public Integer video_height;
    
    public Integer video_length;
    
    public String video_md5;
    
    public Integer video_select_flag;
    
    public Integer video_type;
    
    public String video_url;
    
    public Integer video_width;
    
    public Double wth_mid_loc;
    
    public Builder() {}
    
    public Builder(VideoInfo param1VideoInfo) {
      super(param1VideoInfo);
      if (param1VideoInfo == null)
        return; 
      this.video_md5 = param1VideoInfo.video_md5;
      this.video_url = param1VideoInfo.video_url;
      this.video_duration = param1VideoInfo.video_duration;
      this.video_width = param1VideoInfo.video_width;
      this.video_height = param1VideoInfo.video_height;
      this.thumbnail_url = param1VideoInfo.thumbnail_url;
      this.thumbnail_width = param1VideoInfo.thumbnail_width;
      this.thumbnail_height = param1VideoInfo.thumbnail_height;
      this.video_length = param1VideoInfo.video_length;
      this.play_count = param1VideoInfo.play_count;
      this.media_subtitle = param1VideoInfo.media_subtitle;
      this.video_desc = Message.copyOf(param1VideoInfo.video_desc);
      this.video_select_flag = param1VideoInfo.video_select_flag;
      this.video_type = param1VideoInfo.video_type;
      this.is_vertical = param1VideoInfo.is_vertical;
      this.video_h265 = param1VideoInfo.video_h265;
      this.mcn_lead_page = param1VideoInfo.mcn_lead_page;
      this.mcn_ad_card = param1VideoInfo.mcn_ad_card;
      this.wth_mid_loc = param1VideoInfo.wth_mid_loc;
      this.hth_mid_loc = param1VideoInfo.hth_mid_loc;
      this.small_thumbnail_url = param1VideoInfo.small_thumbnail_url;
      this.first_frame_thumbnail = param1VideoInfo.first_frame_thumbnail;
    }
    
    public VideoInfo build(boolean param1Boolean) {
      return new VideoInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
