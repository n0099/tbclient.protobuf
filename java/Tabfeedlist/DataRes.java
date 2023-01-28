package tbclient.Tabfeedlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GeneralResource;
import tbclient.HotUserRankEntry;
import tbclient.RecommendForumInfo;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final Integer DEFAULT_IS_NEW_URL;
  
  public static final List<RecommendForumInfo> DEFAULT_RECOMMEND_FORUM_INFO;
  
  public static final List<GeneralResource> DEFAULT_RESOURCE_LIST;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(tag = 3)
  public final HotUserRankEntry hot_userrank_entry;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_new_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<RecommendForumInfo> recommend_forum_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<GeneralResource> resource_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> thread_list;
  
  static {
    DEFAULT_RESOURCE_LIST = Collections.emptyList();
    DEFAULT_RECOMMEND_FORUM_INFO = Collections.emptyList();
    DEFAULT_IS_NEW_URL = Integer.valueOf(0);
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<ThreadInfo> list2 = paramBuilder.thread_list;
      if (list2 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list2);
      } 
      List<GeneralResource> list1 = paramBuilder.resource_list;
      if (list1 == null) {
        this.resource_list = DEFAULT_RESOURCE_LIST;
      } else {
        this.resource_list = Message.immutableCopyOf(list1);
      } 
      this.hot_userrank_entry = paramBuilder.hot_userrank_entry;
      List<RecommendForumInfo> list = paramBuilder.recommend_forum_info;
      if (list == null) {
        this.recommend_forum_info = DEFAULT_RECOMMEND_FORUM_INFO;
      } else {
        this.recommend_forum_info = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.is_new_url;
      if (integer == null) {
        this.is_new_url = DEFAULT_IS_NEW_URL;
      } else {
        this.is_new_url = integer;
      } 
    } else {
      this.thread_list = Message.immutableCopyOf(((Builder)integer).thread_list);
      this.resource_list = Message.immutableCopyOf(((Builder)integer).resource_list);
      this.hot_userrank_entry = ((Builder)integer).hot_userrank_entry;
      this.recommend_forum_info = Message.immutableCopyOf(((Builder)integer).recommend_forum_info);
      this.is_new_url = ((Builder)integer).is_new_url;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public HotUserRankEntry hot_userrank_entry;
    
    public Integer is_new_url;
    
    public List<RecommendForumInfo> recommend_forum_info;
    
    public List<GeneralResource> resource_list;
    
    public List<ThreadInfo> thread_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.thread_list = Message.copyOf(param1DataRes.thread_list);
      this.resource_list = Message.copyOf(param1DataRes.resource_list);
      this.hot_userrank_entry = param1DataRes.hot_userrank_entry;
      this.recommend_forum_info = Message.copyOf(param1DataRes.recommend_forum_info);
      this.is_new_url = param1DataRes.is_new_url;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
