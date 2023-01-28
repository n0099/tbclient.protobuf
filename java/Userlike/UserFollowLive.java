package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;

public final class UserFollowLive extends Message {
  public static final List<AlaLiveInfo> DEFAULT_USER_FOLLOW_LIVE = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<AlaLiveInfo> user_follow_live;
  
  public UserFollowLive(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<AlaLiveInfo> list;
    if (paramBoolean == true) {
      list = paramBuilder.user_follow_live;
      if (list == null) {
        this.user_follow_live = DEFAULT_USER_FOLLOW_LIVE;
      } else {
        this.user_follow_live = Message.immutableCopyOf(list);
      } 
    } else {
      this.user_follow_live = Message.immutableCopyOf(((Builder)list).user_follow_live);
    } 
  }
  
  public UserFollowLive(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserFollowLive> {
    public List<AlaLiveInfo> user_follow_live;
    
    public Builder() {}
    
    public Builder(UserFollowLive param1UserFollowLive) {
      super(param1UserFollowLive);
      if (param1UserFollowLive == null)
        return; 
      this.user_follow_live = Message.copyOf(param1UserFollowLive.user_follow_live);
    }
    
    public UserFollowLive build(boolean param1Boolean) {
      return new UserFollowLive(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
