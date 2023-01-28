package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class GroupFeedCard extends Message {
  public static final String DEFAULT_CARD_TITLE = "";
  
  public static final List<FeedGroupInfo> DEFAULT_GROUP_LIST;
  
  public static final Integer DEFAULT_INDEX = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String card_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FeedGroupInfo> group_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer index;
  
  static {
    DEFAULT_GROUP_LIST = Collections.emptyList();
  }
  
  public GroupFeedCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeedGroupInfo> list;
    if (paramBoolean == true) {
      String str = paramBuilder.card_title;
      if (str == null) {
        this.card_title = "";
      } else {
        this.card_title = str;
      } 
      Integer integer = paramBuilder.index;
      if (integer == null) {
        this.index = DEFAULT_INDEX;
      } else {
        this.index = integer;
      } 
      list = paramBuilder.group_list;
      if (list == null) {
        this.group_list = DEFAULT_GROUP_LIST;
      } else {
        this.group_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.card_title = ((Builder)list).card_title;
      this.index = ((Builder)list).index;
      this.group_list = Message.immutableCopyOf(((Builder)list).group_list);
    } 
  }
  
  public GroupFeedCard(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GroupFeedCard> {
    public String card_title;
    
    public List<FeedGroupInfo> group_list;
    
    public Integer index;
    
    public Builder() {}
    
    public Builder(GroupFeedCard param1GroupFeedCard) {
      super(param1GroupFeedCard);
      if (param1GroupFeedCard == null)
        return; 
      this.card_title = param1GroupFeedCard.card_title;
      this.index = param1GroupFeedCard.index;
      this.group_list = Message.copyOf(param1GroupFeedCard.group_list);
    }
    
    public GroupFeedCard build(boolean param1Boolean) {
      return new GroupFeedCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
