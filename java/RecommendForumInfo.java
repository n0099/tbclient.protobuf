import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbContent;
import tbclient.RecommendForumInfo;

public final class RecommendForumInfo extends Message {
  public static final String DEFAULT_ABTEST_TAG = "";
  
  public static final String DEFAULT_AUTHEN = "";
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_AVATAR_ORIGIN = "";
  
  public static final List<PbContent> DEFAULT_CONTENT;
  
  public static final String DEFAULT_EXTRA = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_FORUM_TYPE;
  
  public static final String DEFAULT_HOT_TEXT = "";
  
  public static final Long DEFAULT_HOT_THREAD_ID;
  
  public static final Integer DEFAULT_IS_BRAND_FORUM;
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Integer DEFAULT_IS_PRIVATE_FORUM;
  
  public static final Integer DEFAULT_IS_RECOMMEND_FORUM;
  
  public static final String DEFAULT_LV1_NAME = "";
  
  public static final String DEFAULT_LV2_NAME = "";
  
  public static final Integer DEFAULT_MEMBER_COUNT;
  
  public static final String DEFAULT_RECOM_REASON = "";
  
  public static final String DEFAULT_SLOGAN = "";
  
  public static final String DEFAULT_SOURCE = "";
  
  public static final Integer DEFAULT_THREAD_COUNT;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String abtest_tag;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String authen;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String avatar_origin;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<PbContent> content;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String extra;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer forum_type;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String hot_text;
  
  @ProtoField(tag = 22, type = Message.Datatype.UINT64)
  public final Long hot_thread_id;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer is_brand_forum;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer is_like;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT32)
  public final Integer is_private_forum;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer is_recommend_forum;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String lv1_name;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String lv2_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer member_count;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String recom_reason;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String slogan;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String source;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer thread_count;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(727043422, "Ltbclient/RecommendForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(727043422, "Ltbclient/RecommendForumInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LIKE = integer;
    DEFAULT_MEMBER_COUNT = integer;
    DEFAULT_THREAD_COUNT = integer;
    DEFAULT_CONTENT = Collections.emptyList();
    DEFAULT_FORUM_TYPE = integer;
    DEFAULT_IS_BRAND_FORUM = integer;
    DEFAULT_IS_PRIVATE_FORUM = integer;
    DEFAULT_HOT_THREAD_ID = long_;
    DEFAULT_IS_RECOMMEND_FORUM = integer;
  }
  
  public RecommendForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str6 = paramBuilder.avatar;
      if (str6 == null) {
        this.avatar = "";
      } else {
        this.avatar = str6;
      } 
      Long long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      String str5 = paramBuilder.forum_name;
      if (str5 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str5;
      } 
      Integer integer4 = paramBuilder.is_like;
      if (integer4 == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer4;
      } 
      integer4 = paramBuilder.member_count;
      if (integer4 == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = integer4;
      } 
      integer4 = paramBuilder.thread_count;
      if (integer4 == null) {
        this.thread_count = DEFAULT_THREAD_COUNT;
      } else {
        this.thread_count = integer4;
      } 
      String str4 = paramBuilder.slogan;
      if (str4 == null) {
        this.slogan = "";
      } else {
        this.slogan = str4;
      } 
      List list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
      Integer integer3 = paramBuilder.forum_type;
      if (integer3 == null) {
        this.forum_type = DEFAULT_FORUM_TYPE;
      } else {
        this.forum_type = integer3;
      } 
      String str3 = paramBuilder.authen;
      if (str3 == null) {
        this.authen = "";
      } else {
        this.authen = str3;
      } 
      str3 = paramBuilder.recom_reason;
      if (str3 == null) {
        this.recom_reason = "";
      } else {
        this.recom_reason = str3;
      } 
      Integer integer2 = paramBuilder.is_brand_forum;
      if (integer2 == null) {
        this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
      } else {
        this.is_brand_forum = integer2;
      } 
      String str2 = paramBuilder.hot_text;
      if (str2 == null) {
        this.hot_text = "";
      } else {
        this.hot_text = str2;
      } 
      str2 = paramBuilder.abtest_tag;
      if (str2 == null) {
        this.abtest_tag = "";
      } else {
        this.abtest_tag = str2;
      } 
      str2 = paramBuilder.source;
      if (str2 == null) {
        this.source = "";
      } else {
        this.source = str2;
      } 
      str2 = paramBuilder.extra;
      if (str2 == null) {
        this.extra = "";
      } else {
        this.extra = str2;
      } 
      Integer integer1 = paramBuilder.is_private_forum;
      if (integer1 == null) {
        this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
      } else {
        this.is_private_forum = integer1;
      } 
      String str1 = paramBuilder.lv1_name;
      if (str1 == null) {
        this.lv1_name = "";
      } else {
        this.lv1_name = str1;
      } 
      str1 = paramBuilder.lv2_name;
      if (str1 == null) {
        this.lv2_name = "";
      } else {
        this.lv2_name = str1;
      } 
      str1 = paramBuilder.avatar_origin;
      if (str1 == null) {
        this.avatar_origin = "";
      } else {
        this.avatar_origin = str1;
      } 
      Long long_1 = paramBuilder.hot_thread_id;
      if (long_1 == null) {
        this.hot_thread_id = DEFAULT_HOT_THREAD_ID;
      } else {
        this.hot_thread_id = long_1;
      } 
      integer = paramBuilder.is_recommend_forum;
      if (integer == null) {
        this.is_recommend_forum = DEFAULT_IS_RECOMMEND_FORUM;
      } else {
        this.is_recommend_forum = integer;
      } 
    } else {
      this.avatar = ((Builder)integer).avatar;
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.is_like = ((Builder)integer).is_like;
      this.member_count = ((Builder)integer).member_count;
      this.thread_count = ((Builder)integer).thread_count;
      this.slogan = ((Builder)integer).slogan;
      this.content = Message.immutableCopyOf(((Builder)integer).content);
      this.forum_type = ((Builder)integer).forum_type;
      this.authen = ((Builder)integer).authen;
      this.recom_reason = ((Builder)integer).recom_reason;
      this.is_brand_forum = ((Builder)integer).is_brand_forum;
      this.hot_text = ((Builder)integer).hot_text;
      this.abtest_tag = ((Builder)integer).abtest_tag;
      this.source = ((Builder)integer).source;
      this.extra = ((Builder)integer).extra;
      this.is_private_forum = ((Builder)integer).is_private_forum;
      this.lv1_name = ((Builder)integer).lv1_name;
      this.lv2_name = ((Builder)integer).lv2_name;
      this.avatar_origin = ((Builder)integer).avatar_origin;
      this.hot_thread_id = ((Builder)integer).hot_thread_id;
      this.is_recommend_forum = ((Builder)integer).is_recommend_forum;
    } 
  }
}
