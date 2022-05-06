package HomePage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.HomePage.HotOfficialThread;

public final class HotOfficialForumItem extends Message {
  public static final String DEFAULT_FORUM_AVATOR = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_LIKED;
  
  public static final Integer DEFAULT_IS_OFFICIAL;
  
  public static final Integer DEFAULT_IS_SHOW_VICON;
  
  public static final Long DEFAULT_LIKED_NUM;
  
  public static final Long DEFAULT_POST_NUM;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String forum_avator;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer is_liked;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_official;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_show_vicon;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long liked_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long post_num;
  
  @ProtoField(tag = 9)
  public final HotOfficialThread recommend_thread;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-395929752, "Ltbclient/HomePage/HotOfficialForumItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-395929752, "Ltbclient/HomePage/HotOfficialForumItem;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_LIKED_NUM = long_;
    DEFAULT_POST_NUM = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LIKED = integer;
    DEFAULT_IS_OFFICIAL = integer;
    DEFAULT_IS_SHOW_VICON = integer;
  }
  
  public HotOfficialForumItem(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      String str = paramBuilder.forum_name;
      if (str == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str;
      } 
      str = paramBuilder.forum_avator;
      if (str == null) {
        this.forum_avator = "";
      } else {
        this.forum_avator = str;
      } 
      Long long_1 = paramBuilder.liked_num;
      if (long_1 == null) {
        this.liked_num = DEFAULT_LIKED_NUM;
      } else {
        this.liked_num = long_1;
      } 
      long_1 = paramBuilder.post_num;
      if (long_1 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = long_1;
      } 
      Integer integer = paramBuilder.is_liked;
      if (integer == null) {
        this.is_liked = DEFAULT_IS_LIKED;
      } else {
        this.is_liked = integer;
      } 
      integer = paramBuilder.is_official;
      if (integer == null) {
        this.is_official = DEFAULT_IS_OFFICIAL;
      } else {
        this.is_official = integer;
      } 
      integer = paramBuilder.is_show_vicon;
      if (integer == null) {
        this.is_show_vicon = DEFAULT_IS_SHOW_VICON;
      } else {
        this.is_show_vicon = integer;
      } 
      this.recommend_thread = paramBuilder.recommend_thread;
    } else {
      this.forum_id = paramBuilder.forum_id;
      this.forum_name = paramBuilder.forum_name;
      this.forum_avator = paramBuilder.forum_avator;
      this.liked_num = paramBuilder.liked_num;
      this.post_num = paramBuilder.post_num;
      this.is_liked = paramBuilder.is_liked;
      this.is_official = paramBuilder.is_official;
      this.is_show_vicon = paramBuilder.is_show_vicon;
      this.recommend_thread = paramBuilder.recommend_thread;
    } 
  }
}
