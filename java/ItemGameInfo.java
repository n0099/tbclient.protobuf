package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ItemGameInfo extends Message {
  public static final List<ThreadInfo> DEFAULT_HOT_VIDEOS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> hot_videos;
  
  @ProtoField(tag = 2)
  public final RecentUpdate recent_update;
  
  public ItemGameInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<ThreadInfo> list = paramBuilder.hot_videos;
      if (list == null) {
        this.hot_videos = DEFAULT_HOT_VIDEOS;
      } else {
        this.hot_videos = Message.immutableCopyOf(list);
      } 
      this.recent_update = paramBuilder.recent_update;
    } else {
      this.hot_videos = Message.immutableCopyOf(paramBuilder.hot_videos);
      this.recent_update = paramBuilder.recent_update;
    } 
  }
  
  public ItemGameInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ItemGameInfo> {
    public List<ThreadInfo> hot_videos;
    
    public RecentUpdate recent_update;
    
    public Builder() {}
    
    public Builder(ItemGameInfo param1ItemGameInfo) {
      super(param1ItemGameInfo);
      if (param1ItemGameInfo == null)
        return; 
      this.hot_videos = Message.copyOf(param1ItemGameInfo.hot_videos);
      this.recent_update = param1ItemGameInfo.recent_update;
    }
    
    public ItemGameInfo build(boolean param1Boolean) {
      return new ItemGameInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
