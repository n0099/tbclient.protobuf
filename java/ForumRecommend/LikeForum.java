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
import tbclient.FrsTabInfo;
import tbclient.PrivateForumInfo;
import tbclient.ThemeColorInfo;

public final class LikeForum extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Long DEFAULT_HOT_THREAD_ID;
  
  public static final Integer DEFAULT_IS_BRAND_FORUM;
  
  public static final Integer DEFAULT_IS_MANAGER;
  
  public static final Integer DEFAULT_IS_PRIVATE_FORUM;
  
  public static final Integer DEFAULT_IS_SIGN;
  
  public static final Integer DEFAULT_IS_TOP;
  
  public static final Integer DEFAULT_LEVEL_ID;
  
  public static final Boolean DEFAULT_NEED_TRANS;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final List<FrsTabInfo> DEFAULT_TAB_INFO;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT64)
  public final Long hot_thread_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer is_brand_forum;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer is_manager;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer is_private_forum;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_sign;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_top;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer level_id;
  
  @ProtoField(tag = 14, type = Message.Datatype.BOOL)
  public final Boolean need_trans;
  
  @ProtoField(tag = 19)
  public final PrivateForumInfo private_forum_info;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 21)
  public final List<FrsTabInfo> tab_info;
  
  @ProtoField(tag = 12)
  public final ThemeColorInfo theme_color;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1017200155, "Ltbclient/ForumRecommend/LikeForum;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1017200155, "Ltbclient/ForumRecommend/LikeForum;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_SIGN = integer;
    DEFAULT_LEVEL_ID = integer;
    DEFAULT_IS_BRAND_FORUM = integer;
    DEFAULT_IS_TOP = integer;
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_NEED_TRANS = Boolean.FALSE;
    DEFAULT_IS_PRIVATE_FORUM = integer;
    DEFAULT_IS_MANAGER = integer;
    DEFAULT_HOT_THREAD_ID = long_;
    DEFAULT_TAB_INFO = Collections.emptyList();
  }
  
  public LikeForum(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      String str2 = paramBuilder.forum_name;
      if (str2 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str2;
      } 
      str2 = paramBuilder.avatar;
      if (str2 == null) {
        this.avatar = "";
      } else {
        this.avatar = str2;
      } 
      Integer integer3 = paramBuilder.is_sign;
      if (integer3 == null) {
        this.is_sign = DEFAULT_IS_SIGN;
      } else {
        this.is_sign = integer3;
      } 
      integer3 = paramBuilder.level_id;
      if (integer3 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer3;
      } 
      integer3 = paramBuilder.is_brand_forum;
      if (integer3 == null) {
        this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
      } else {
        this.is_brand_forum = integer3;
      } 
      String str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      Integer integer2 = paramBuilder.is_top;
      if (integer2 == null) {
        this.is_top = DEFAULT_IS_TOP;
      } else {
        this.is_top = integer2;
      } 
      integer2 = paramBuilder.sort_type;
      if (integer2 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer2;
      } 
      this.theme_color = paramBuilder.theme_color;
      Boolean bool = paramBuilder.need_trans;
      if (bool == null) {
        this.need_trans = DEFAULT_NEED_TRANS;
      } else {
        this.need_trans = bool;
      } 
      Integer integer1 = paramBuilder.is_private_forum;
      if (integer1 == null) {
        this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
      } else {
        this.is_private_forum = integer1;
      } 
      integer1 = paramBuilder.is_manager;
      if (integer1 == null) {
        this.is_manager = DEFAULT_IS_MANAGER;
      } else {
        this.is_manager = integer1;
      } 
      this.private_forum_info = paramBuilder.private_forum_info;
      Long long_1 = paramBuilder.hot_thread_id;
      if (long_1 == null) {
        this.hot_thread_id = DEFAULT_HOT_THREAD_ID;
      } else {
        this.hot_thread_id = long_1;
      } 
      list = paramBuilder.tab_info;
      if (list == null) {
        this.tab_info = DEFAULT_TAB_INFO;
      } else {
        this.tab_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.forum_id = ((Builder)list).forum_id;
      this.forum_name = ((Builder)list).forum_name;
      this.avatar = ((Builder)list).avatar;
      this.is_sign = ((Builder)list).is_sign;
      this.level_id = ((Builder)list).level_id;
      this.is_brand_forum = ((Builder)list).is_brand_forum;
      this.content = ((Builder)list).content;
      this.is_top = ((Builder)list).is_top;
      this.sort_type = ((Builder)list).sort_type;
      this.theme_color = ((Builder)list).theme_color;
      this.need_trans = ((Builder)list).need_trans;
      this.is_private_forum = ((Builder)list).is_private_forum;
      this.is_manager = ((Builder)list).is_manager;
      this.private_forum_info = ((Builder)list).private_forum_info;
      this.hot_thread_id = ((Builder)list).hot_thread_id;
      this.tab_info = Message.immutableCopyOf(((Builder)list).tab_info);
    } 
  }
}
