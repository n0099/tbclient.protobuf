package ForumRecommend;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumCreateInfo;
import tbclient.ForumPopupInfo;
import tbclient.ForumRecommend.Banner;
import tbclient.ForumRecommend.HotSearch;
import tbclient.ForumRecommend.LikeForum;
import tbclient.ForumRecommend.NewRecommend;
import tbclient.FrequentlyForumInfo;
import tbclient.FrsTabInfo;
import tbclient.PrivatePopInfo;
import tbclient.RecommendForumInfo;

public final class DataRes extends Message {
  public static final List<Banner> DEFAULT_BANNER;
  
  public static final List<FrequentlyForumInfo> DEFAULT_FREQUENTLY_FORUM_INFO;
  
  public static final Integer DEFAULT_IS_LOGIN;
  
  public static final Integer DEFAULT_IS_MEM;
  
  public static final List<LikeForum> DEFAULT_LIKE_FORUM = Collections.emptyList();
  
  public static final Integer DEFAULT_MSIGN_LEVEL;
  
  public static final String DEFAULT_MSIGN_TEXT = "";
  
  public static final Integer DEFAULT_MSIGN_VALID;
  
  public static final List<FrsTabInfo> DEFAULT_NAV_TAB_INFO;
  
  public static final List<Banner> DEFAULT_NEW_BANNER_INFO;
  
  public static final List<NewRecommend> DEFAULT_NEW_RECOMMEND;
  
  public static final List<RecommendForumInfo> DEFAULT_RECOMMEND_FORUM_INFO;
  
  public static final Integer DEFAULT_REDIRECT;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final List<RecommendForumInfo> DEFAULT_TAG_RECOMMEND_FORUM;
  
  public static final Integer DEFAULT_TIME;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<Banner> banner;
  
  @ProtoField(tag = 19)
  public final ForumCreateInfo forum_create_info;
  
  @ProtoField(tag = 22)
  public final ForumPopupInfo forum_popup_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 14)
  public final List<FrequentlyForumInfo> frequently_forum_info;
  
  @ProtoField(tag = 11)
  public final HotSearch hot_search;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_login;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer is_mem;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<LikeForum> like_forum;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer msign_level;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String msign_text;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer msign_valid;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 21)
  public final List<FrsTabInfo> nav_tab_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 13)
  public final List<Banner> new_banner_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<NewRecommend> new_recommend;
  
  @ProtoField(tag = 20)
  public final PrivatePopInfo private_forum_popinfo;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10)
  public final List<RecommendForumInfo> recommend_forum_info;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer redirect;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 15)
  public final List<RecommendForumInfo> tag_recommend_forum;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer time;
  
  static {
    DEFAULT_BANNER = Collections.emptyList();
    DEFAULT_NEW_RECOMMEND = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LOGIN = integer;
    DEFAULT_MSIGN_VALID = integer;
    DEFAULT_MSIGN_LEVEL = integer;
    DEFAULT_TIME = integer;
    DEFAULT_IS_MEM = integer;
    DEFAULT_RECOMMEND_FORUM_INFO = Collections.emptyList();
    DEFAULT_REDIRECT = integer;
    DEFAULT_NEW_BANNER_INFO = Collections.emptyList();
    DEFAULT_FREQUENTLY_FORUM_INFO = Collections.emptyList();
    DEFAULT_TAG_RECOMMEND_FORUM = Collections.emptyList();
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_NAV_TAB_INFO = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      List list4 = paramBuilder.like_forum;
      if (list4 == null) {
        this.like_forum = DEFAULT_LIKE_FORUM;
      } else {
        this.like_forum = Message.immutableCopyOf(list4);
      } 
      list4 = paramBuilder.banner;
      if (list4 == null) {
        this.banner = DEFAULT_BANNER;
      } else {
        this.banner = Message.immutableCopyOf(list4);
      } 
      list4 = paramBuilder.new_recommend;
      if (list4 == null) {
        this.new_recommend = DEFAULT_NEW_RECOMMEND;
      } else {
        this.new_recommend = Message.immutableCopyOf(list4);
      } 
      Integer integer4 = paramBuilder.is_login;
      if (integer4 == null) {
        this.is_login = DEFAULT_IS_LOGIN;
      } else {
        this.is_login = integer4;
      } 
      integer4 = paramBuilder.msign_valid;
      if (integer4 == null) {
        this.msign_valid = DEFAULT_MSIGN_VALID;
      } else {
        this.msign_valid = integer4;
      } 
      String str = paramBuilder.msign_text;
      if (str == null) {
        this.msign_text = "";
      } else {
        this.msign_text = str;
      } 
      Integer integer3 = paramBuilder.msign_level;
      if (integer3 == null) {
        this.msign_level = DEFAULT_MSIGN_LEVEL;
      } else {
        this.msign_level = integer3;
      } 
      integer3 = paramBuilder.time;
      if (integer3 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer3;
      } 
      integer3 = paramBuilder.is_mem;
      if (integer3 == null) {
        this.is_mem = DEFAULT_IS_MEM;
      } else {
        this.is_mem = integer3;
      } 
      List list3 = paramBuilder.recommend_forum_info;
      if (list3 == null) {
        this.recommend_forum_info = DEFAULT_RECOMMEND_FORUM_INFO;
      } else {
        this.recommend_forum_info = Message.immutableCopyOf(list3);
      } 
      this.hot_search = paramBuilder.hot_search;
      Integer integer2 = paramBuilder.redirect;
      if (integer2 == null) {
        this.redirect = DEFAULT_REDIRECT;
      } else {
        this.redirect = integer2;
      } 
      List list2 = paramBuilder.new_banner_info;
      if (list2 == null) {
        this.new_banner_info = DEFAULT_NEW_BANNER_INFO;
      } else {
        this.new_banner_info = Message.immutableCopyOf(list2);
      } 
      list2 = paramBuilder.frequently_forum_info;
      if (list2 == null) {
        this.frequently_forum_info = DEFAULT_FREQUENTLY_FORUM_INFO;
      } else {
        this.frequently_forum_info = Message.immutableCopyOf(list2);
      } 
      list2 = paramBuilder.tag_recommend_forum;
      if (list2 == null) {
        this.tag_recommend_forum = DEFAULT_TAG_RECOMMEND_FORUM;
      } else {
        this.tag_recommend_forum = Message.immutableCopyOf(list2);
      } 
      Integer integer1 = paramBuilder.sort_type;
      if (integer1 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer1;
      } 
      this.forum_create_info = paramBuilder.forum_create_info;
      this.private_forum_popinfo = paramBuilder.private_forum_popinfo;
      List list1 = paramBuilder.nav_tab_info;
      if (list1 == null) {
        this.nav_tab_info = DEFAULT_NAV_TAB_INFO;
      } else {
        this.nav_tab_info = Message.immutableCopyOf(list1);
      } 
      this.forum_popup_info = paramBuilder.forum_popup_info;
    } else {
      this.like_forum = Message.immutableCopyOf(paramBuilder.like_forum);
      this.banner = Message.immutableCopyOf(paramBuilder.banner);
      this.new_recommend = Message.immutableCopyOf(paramBuilder.new_recommend);
      this.is_login = paramBuilder.is_login;
      this.msign_valid = paramBuilder.msign_valid;
      this.msign_text = paramBuilder.msign_text;
      this.msign_level = paramBuilder.msign_level;
      this.time = paramBuilder.time;
      this.is_mem = paramBuilder.is_mem;
      this.recommend_forum_info = Message.immutableCopyOf(paramBuilder.recommend_forum_info);
      this.hot_search = paramBuilder.hot_search;
      this.redirect = paramBuilder.redirect;
      this.new_banner_info = Message.immutableCopyOf(paramBuilder.new_banner_info);
      this.frequently_forum_info = Message.immutableCopyOf(paramBuilder.frequently_forum_info);
      this.tag_recommend_forum = Message.immutableCopyOf(paramBuilder.tag_recommend_forum);
      this.sort_type = paramBuilder.sort_type;
      this.forum_create_info = paramBuilder.forum_create_info;
      this.private_forum_popinfo = paramBuilder.private_forum_popinfo;
      this.nav_tab_info = Message.immutableCopyOf(paramBuilder.nav_tab_info);
      this.forum_popup_info = paramBuilder.forum_popup_info;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1886599857, "Ltbclient/ForumRecommend/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1886599857, "Ltbclient/ForumRecommend/DataRes;");
          return;
        } 
      } 
    } 
  }
}
