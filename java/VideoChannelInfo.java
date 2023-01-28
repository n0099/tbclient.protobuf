package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VideoChannelInfo extends Message {
  public static final String DEFAULT_CHANNEL_AVATAR = "";
  
  public static final Long DEFAULT_CHANNEL_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_CHANNEL_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String channel_avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long channel_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String channel_name;
  
  public VideoChannelInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.channel_id;
      if (long_ == null) {
        this.channel_id = DEFAULT_CHANNEL_ID;
      } else {
        this.channel_id = long_;
      } 
      String str1 = paramBuilder.channel_name;
      if (str1 == null) {
        this.channel_name = "";
      } else {
        this.channel_name = str1;
      } 
      str = paramBuilder.channel_avatar;
      if (str == null) {
        this.channel_avatar = "";
      } else {
        this.channel_avatar = str;
      } 
    } else {
      this.channel_id = ((Builder)str).channel_id;
      this.channel_name = ((Builder)str).channel_name;
      this.channel_avatar = ((Builder)str).channel_avatar;
    } 
  }
  
  public VideoChannelInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VideoChannelInfo> {
    public String channel_avatar;
    
    public Long channel_id;
    
    public String channel_name;
    
    public Builder() {}
    
    public Builder(VideoChannelInfo param1VideoChannelInfo) {
      super(param1VideoChannelInfo);
      if (param1VideoChannelInfo == null)
        return; 
      this.channel_id = param1VideoChannelInfo.channel_id;
      this.channel_name = param1VideoChannelInfo.channel_name;
      this.channel_avatar = param1VideoChannelInfo.channel_avatar;
    }
    
    public VideoChannelInfo build(boolean param1Boolean) {
      return new VideoChannelInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
