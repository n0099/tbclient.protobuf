package tbclient.SearchSug;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumInfo;
import tbclient.Item;
import tbclient.RecommendForumInfo;
import tbclient.SugLiveInfo;
import tbclient.SugRankingInfo;

public final class DataRes extends Message {
  public static final List<ForumInfo> DEFAULT_FORUM_LIST;
  
  public static final Integer DEFAULT_FORUM_LOC = Integer.valueOf(0);
  
  public static final List<String> DEFAULT_LIST = Collections.emptyList();
  
  public static final List<SugLiveInfo> DEFAULT_LIVE_CARD;
  
  @ProtoField(tag = 4)
  public final RecommendForumInfo forum_card;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ForumInfo> forum_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer forum_loc;
  
  @ProtoField(tag = 5)
  public final Item item_card;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<SugLiveInfo> live_card;
  
  @ProtoField(tag = 7)
  public final SugRankingInfo ranking_card;
  
  static {
    DEFAULT_FORUM_LIST = Collections.emptyList();
    DEFAULT_LIVE_CARD = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.forum_loc;
      if (integer == null) {
        this.forum_loc = DEFAULT_FORUM_LOC;
      } else {
        this.forum_loc = integer;
      } 
      List<String> list2 = paramBuilder.list;
      if (list2 == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list2);
      } 
      List<ForumInfo> list1 = paramBuilder.forum_list;
      if (list1 == null) {
        this.forum_list = DEFAULT_FORUM_LIST;
      } else {
        this.forum_list = Message.immutableCopyOf(list1);
      } 
      this.forum_card = paramBuilder.forum_card;
      this.item_card = paramBuilder.item_card;
      List<SugLiveInfo> list = paramBuilder.live_card;
      if (list == null) {
        this.live_card = DEFAULT_LIVE_CARD;
      } else {
        this.live_card = Message.immutableCopyOf(list);
      } 
      this.ranking_card = paramBuilder.ranking_card;
    } else {
      this.forum_loc = paramBuilder.forum_loc;
      this.list = Message.immutableCopyOf(paramBuilder.list);
      this.forum_list = Message.immutableCopyOf(paramBuilder.forum_list);
      this.forum_card = paramBuilder.forum_card;
      this.item_card = paramBuilder.item_card;
      this.live_card = Message.immutableCopyOf(paramBuilder.live_card);
      this.ranking_card = paramBuilder.ranking_card;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public RecommendForumInfo forum_card;
    
    public List<ForumInfo> forum_list;
    
    public Integer forum_loc;
    
    public Item item_card;
    
    public List<String> list;
    
    public List<SugLiveInfo> live_card;
    
    public SugRankingInfo ranking_card;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.forum_loc = param1DataRes.forum_loc;
      this.list = Message.copyOf(param1DataRes.list);
      this.forum_list = Message.copyOf(param1DataRes.forum_list);
      this.forum_card = param1DataRes.forum_card;
      this.item_card = param1DataRes.item_card;
      this.live_card = Message.copyOf(param1DataRes.live_card);
      this.ranking_card = param1DataRes.ranking_card;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
