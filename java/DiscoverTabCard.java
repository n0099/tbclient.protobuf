package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DiscoverTabCard extends Message {
  public static final List<RecommendForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();
  
  public static final Boolean DEFAULT_IS_SHOW_ORDER_NUMBER = Boolean.FALSE;
  
  public static final String DEFAULT_JUMP_NAME = "";
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<RecommendForumInfo> forum_list;
  
  @ProtoField(tag = 4, type = Message.Datatype.BOOL)
  public final Boolean is_show_order_number;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String jump_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  public DiscoverTabCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      String str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      List<RecommendForumInfo> list = paramBuilder.forum_list;
      if (list == null) {
        this.forum_list = DEFAULT_FORUM_LIST;
      } else {
        this.forum_list = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.jump_name;
      if (str1 == null) {
        this.jump_name = "";
      } else {
        this.jump_name = str1;
      } 
      bool = paramBuilder.is_show_order_number;
      if (bool == null) {
        this.is_show_order_number = DEFAULT_IS_SHOW_ORDER_NUMBER;
      } else {
        this.is_show_order_number = bool;
      } 
    } else {
      this.name = ((Builder)bool).name;
      this.forum_list = Message.immutableCopyOf(((Builder)bool).forum_list);
      this.jump_name = ((Builder)bool).jump_name;
      this.is_show_order_number = ((Builder)bool).is_show_order_number;
    } 
  }
  
  public DiscoverTabCard(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DiscoverTabCard> {
    public List<RecommendForumInfo> forum_list;
    
    public Boolean is_show_order_number;
    
    public String jump_name;
    
    public String name;
    
    public Builder() {}
    
    public Builder(DiscoverTabCard param1DiscoverTabCard) {
      super(param1DiscoverTabCard);
      if (param1DiscoverTabCard == null)
        return; 
      this.name = param1DiscoverTabCard.name;
      this.forum_list = Message.copyOf(param1DiscoverTabCard.forum_list);
      this.jump_name = param1DiscoverTabCard.jump_name;
      this.is_show_order_number = param1DiscoverTabCard.is_show_order_number;
    }
    
    public DiscoverTabCard build(boolean param1Boolean) {
      return new DiscoverTabCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
