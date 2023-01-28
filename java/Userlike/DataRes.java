package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.App;
import tbclient.BannerUserStory;
import tbclient.DiscoverHotForum;

public final class DataRes extends Message {
  public static final List<App> DEFAULT_APP_LIST;
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final String DEFAULT_LAST_TIPS = "";
  
  public static final String DEFAULT_PAGE_TAG = "";
  
  public static final Long DEFAULT_REQ_UNIX;
  
  public static final List<ConcernData> DEFAULT_THREAD_INFO = Collections.emptyList();
  
  public static final String DEFAULT_TOP_TIPS = "";
  
  public static final List<UserList> DEFAULT_USER_LIST = Collections.emptyList();
  
  public static final String DEFAULT_USER_TIPS = "";
  
  public static final Integer DEFAULT_USER_TIPS_TYPE;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 16)
  public final List<App> app_list;
  
  @ProtoField(tag = 13)
  public final BannerFollowLive banner_follow_live;
  
  @ProtoField(tag = 6)
  public final BannerUserStory banner_user_story;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(tag = 14)
  public final DiscoverHotForum hot_recomforum;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String last_tips;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String page_tag;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT64)
  public final Long req_unix;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ConcernData> thread_info;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String top_tips;
  
  @ProtoField(tag = 9)
  public final UserList top_user_info;
  
  @ProtoField(tag = 17)
  public final UserFollowLive user_follow_live;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<UserList> user_list;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String user_tips;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer user_tips_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_MORE = integer;
    DEFAULT_REQ_UNIX = Long.valueOf(0L);
    DEFAULT_USER_TIPS_TYPE = integer;
    DEFAULT_APP_LIST = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<ConcernData> list2 = paramBuilder.thread_info;
      if (list2 == null) {
        this.thread_info = DEFAULT_THREAD_INFO;
      } else {
        this.thread_info = Message.immutableCopyOf(list2);
      } 
      String str3 = paramBuilder.page_tag;
      if (str3 == null) {
        this.page_tag = "";
      } else {
        this.page_tag = str3;
      } 
      List<UserList> list1 = paramBuilder.user_list;
      if (list1 == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list1);
      } 
      Integer integer2 = paramBuilder.has_more;
      if (integer2 == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer2;
      } 
      String str2 = paramBuilder.user_tips;
      if (str2 == null) {
        this.user_tips = "";
      } else {
        this.user_tips = str2;
      } 
      this.banner_user_story = paramBuilder.banner_user_story;
      str2 = paramBuilder.last_tips;
      if (str2 == null) {
        this.last_tips = "";
      } else {
        this.last_tips = str2;
      } 
      this.top_user_info = paramBuilder.top_user_info;
      Long long_ = paramBuilder.req_unix;
      if (long_ == null) {
        this.req_unix = DEFAULT_REQ_UNIX;
      } else {
        this.req_unix = long_;
      } 
      Integer integer1 = paramBuilder.user_tips_type;
      if (integer1 == null) {
        this.user_tips_type = DEFAULT_USER_TIPS_TYPE;
      } else {
        this.user_tips_type = integer1;
      } 
      String str1 = paramBuilder.top_tips;
      if (str1 == null) {
        this.top_tips = "";
      } else {
        this.top_tips = str1;
      } 
      this.banner_follow_live = paramBuilder.banner_follow_live;
      this.hot_recomforum = paramBuilder.hot_recomforum;
      List<App> list = paramBuilder.app_list;
      if (list == null) {
        this.app_list = DEFAULT_APP_LIST;
      } else {
        this.app_list = Message.immutableCopyOf(list);
      } 
      this.user_follow_live = paramBuilder.user_follow_live;
    } else {
      this.thread_info = Message.immutableCopyOf(paramBuilder.thread_info);
      this.page_tag = paramBuilder.page_tag;
      this.user_list = Message.immutableCopyOf(paramBuilder.user_list);
      this.has_more = paramBuilder.has_more;
      this.user_tips = paramBuilder.user_tips;
      this.banner_user_story = paramBuilder.banner_user_story;
      this.last_tips = paramBuilder.last_tips;
      this.top_user_info = paramBuilder.top_user_info;
      this.req_unix = paramBuilder.req_unix;
      this.user_tips_type = paramBuilder.user_tips_type;
      this.top_tips = paramBuilder.top_tips;
      this.banner_follow_live = paramBuilder.banner_follow_live;
      this.hot_recomforum = paramBuilder.hot_recomforum;
      this.app_list = Message.immutableCopyOf(paramBuilder.app_list);
      this.user_follow_live = paramBuilder.user_follow_live;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<App> app_list;
    
    public BannerFollowLive banner_follow_live;
    
    public BannerUserStory banner_user_story;
    
    public Integer has_more;
    
    public DiscoverHotForum hot_recomforum;
    
    public String last_tips;
    
    public String page_tag;
    
    public Long req_unix;
    
    public List<ConcernData> thread_info;
    
    public String top_tips;
    
    public UserList top_user_info;
    
    public UserFollowLive user_follow_live;
    
    public List<UserList> user_list;
    
    public String user_tips;
    
    public Integer user_tips_type;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.thread_info = Message.copyOf(param1DataRes.thread_info);
      this.page_tag = param1DataRes.page_tag;
      this.user_list = Message.copyOf(param1DataRes.user_list);
      this.has_more = param1DataRes.has_more;
      this.user_tips = param1DataRes.user_tips;
      this.banner_user_story = param1DataRes.banner_user_story;
      this.last_tips = param1DataRes.last_tips;
      this.top_user_info = param1DataRes.top_user_info;
      this.req_unix = param1DataRes.req_unix;
      this.user_tips_type = param1DataRes.user_tips_type;
      this.top_tips = param1DataRes.top_tips;
      this.banner_follow_live = param1DataRes.banner_follow_live;
      this.hot_recomforum = param1DataRes.hot_recomforum;
      this.app_list = Message.copyOf(param1DataRes.app_list);
      this.user_follow_live = param1DataRes.user_follow_live;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
