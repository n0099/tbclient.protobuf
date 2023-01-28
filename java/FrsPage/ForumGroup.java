package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumGroup extends Message {
  @ProtoField(tag = 2)
  public final GroupFeedCard feed_card;
  
  @ProtoField(tag = 1)
  public final TopbarEntrance topbar_entrance;
  
  public ForumGroup(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.topbar_entrance = paramBuilder.topbar_entrance;
      this.feed_card = paramBuilder.feed_card;
    } else {
      this.topbar_entrance = paramBuilder.topbar_entrance;
      this.feed_card = paramBuilder.feed_card;
    } 
  }
  
  public ForumGroup(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumGroup> {
    public GroupFeedCard feed_card;
    
    public TopbarEntrance topbar_entrance;
    
    public Builder() {}
    
    public Builder(ForumGroup param1ForumGroup) {
      super(param1ForumGroup);
      if (param1ForumGroup == null)
        return; 
      this.topbar_entrance = param1ForumGroup.topbar_entrance;
      this.feed_card = param1ForumGroup.feed_card;
    }
    
    public ForumGroup build(boolean param1Boolean) {
      return new ForumGroup(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
