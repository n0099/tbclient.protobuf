package Userlike;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.App;
import tbclient.BannerUserStory;
import tbclient.DiscoverHotForum;
import tbclient.Userlike.BannerFollowLive;
import tbclient.Userlike.ConcernData;
import tbclient.Userlike.UserList;

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
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      List list2 = paramBuilder.thread_info;
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
      List list1 = paramBuilder.user_list;
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
      list = paramBuilder.app_list;
      if (list == null) {
        this.app_list = DEFAULT_APP_LIST;
      } else {
        this.app_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.thread_info = Message.immutableCopyOf(((Builder)list).thread_info);
      this.page_tag = ((Builder)list).page_tag;
      this.user_list = Message.immutableCopyOf(((Builder)list).user_list);
      this.has_more = ((Builder)list).has_more;
      this.user_tips = ((Builder)list).user_tips;
      this.banner_user_story = ((Builder)list).banner_user_story;
      this.last_tips = ((Builder)list).last_tips;
      this.top_user_info = ((Builder)list).top_user_info;
      this.req_unix = ((Builder)list).req_unix;
      this.user_tips_type = ((Builder)list).user_tips_type;
      this.top_tips = ((Builder)list).top_tips;
      this.banner_follow_live = ((Builder)list).banner_follow_live;
      this.hot_recomforum = ((Builder)list).hot_recomforum;
      this.app_list = Message.immutableCopyOf(((Builder)list).app_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1531639912, "Ltbclient/Userlike/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1531639912, "Ltbclient/Userlike/DataRes;");
          return;
        } 
      } 
    } 
  }
}
