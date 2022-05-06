import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BlockPopInfo;
import tbclient.FrsTabInfo;
import tbclient.HistoryForumInfo;
import tbclient.PostPrefix;
import tbclient.ThemeColorInfo;

public final class HistoryForumInfo extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Integer DEFAULT_FOLLOW_NUM;
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Boolean DEFAULT_HAS_POSTPRE;
  
  public static final Integer DEFAULT_HOT_NUM;
  
  public static final Integer DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
  
  public static final Integer DEFAULT_IS_LIVEFORUM;
  
  public static final Integer DEFAULT_LEVEL_ID;
  
  public static final Boolean DEFAULT_NEED_TRANS;
  
  public static final List<FrsTabInfo> DEFAULT_TAB_INFO;
  
  public static final Integer DEFAULT_UNREAD_NUM;
  
  public static final String DEFAULT_VISIT_TIME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 14)
  public final BlockPopInfo block_pop_info;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer follow_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 18, type = Message.Datatype.BOOL)
  public final Boolean has_postpre;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer hot_num;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT32)
  public final Integer is_forum_business_account;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_liveforum;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer level_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.BOOL)
  public final Boolean need_trans;
  
  @ProtoField(tag = 19)
  public final PostPrefix post_prefix;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 17)
  public final List<FrsTabInfo> tab_info;
  
  @ProtoField(tag = 8)
  public final ThemeColorInfo theme_color;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer unread_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String visit_time;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LIVEFORUM = integer;
    DEFAULT_UNREAD_NUM = integer;
    DEFAULT_FOLLOW_NUM = integer;
    DEFAULT_NEED_TRANS = Boolean.FALSE;
    DEFAULT_HOT_NUM = integer;
    DEFAULT_LEVEL_ID = integer;
    DEFAULT_TAB_INFO = Collections.emptyList();
    DEFAULT_HAS_POSTPRE = Boolean.FALSE;
    DEFAULT_IS_FORUM_BUSINESS_ACCOUNT = integer;
  }
  
  public HistoryForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
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
      Integer integer3 = paramBuilder.is_liveforum;
      if (integer3 == null) {
        this.is_liveforum = DEFAULT_IS_LIVEFORUM;
      } else {
        this.is_liveforum = integer3;
      } 
      integer3 = paramBuilder.unread_num;
      if (integer3 == null) {
        this.unread_num = DEFAULT_UNREAD_NUM;
      } else {
        this.unread_num = integer3;
      } 
      String str1 = paramBuilder.visit_time;
      if (str1 == null) {
        this.visit_time = "";
      } else {
        this.visit_time = str1;
      } 
      Integer integer2 = paramBuilder.follow_num;
      if (integer2 == null) {
        this.follow_num = DEFAULT_FOLLOW_NUM;
      } else {
        this.follow_num = integer2;
      } 
      this.theme_color = paramBuilder.theme_color;
      Boolean bool2 = paramBuilder.need_trans;
      if (bool2 == null) {
        this.need_trans = DEFAULT_NEED_TRANS;
      } else {
        this.need_trans = bool2;
      } 
      this.block_pop_info = paramBuilder.block_pop_info;
      Integer integer1 = paramBuilder.hot_num;
      if (integer1 == null) {
        this.hot_num = DEFAULT_HOT_NUM;
      } else {
        this.hot_num = integer1;
      } 
      integer1 = paramBuilder.level_id;
      if (integer1 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer1;
      } 
      List list = paramBuilder.tab_info;
      if (list == null) {
        this.tab_info = DEFAULT_TAB_INFO;
      } else {
        this.tab_info = Message.immutableCopyOf(list);
      } 
      Boolean bool1 = paramBuilder.has_postpre;
      if (bool1 == null) {
        this.has_postpre = DEFAULT_HAS_POSTPRE;
      } else {
        this.has_postpre = bool1;
      } 
      this.post_prefix = paramBuilder.post_prefix;
      integer = paramBuilder.is_forum_business_account;
      if (integer == null) {
        this.is_forum_business_account = DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
      } else {
        this.is_forum_business_account = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.avatar = ((Builder)integer).avatar;
      this.is_liveforum = ((Builder)integer).is_liveforum;
      this.unread_num = ((Builder)integer).unread_num;
      this.visit_time = ((Builder)integer).visit_time;
      this.follow_num = ((Builder)integer).follow_num;
      this.theme_color = ((Builder)integer).theme_color;
      this.need_trans = ((Builder)integer).need_trans;
      this.block_pop_info = ((Builder)integer).block_pop_info;
      this.hot_num = ((Builder)integer).hot_num;
      this.level_id = ((Builder)integer).level_id;
      this.tab_info = Message.immutableCopyOf(((Builder)integer).tab_info);
      this.has_postpre = ((Builder)integer).has_postpre;
      this.post_prefix = ((Builder)integer).post_prefix;
      this.is_forum_business_account = ((Builder)integer).is_forum_business_account;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1854967626, "Ltbclient/HistoryForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1854967626, "Ltbclient/HistoryForumInfo;");
          return;
        } 
      } 
    } 
  }
}
