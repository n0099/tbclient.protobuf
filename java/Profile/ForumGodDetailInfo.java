package Profile;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumGodDetailInfo extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_DETAIL_INTRO = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Long DEFAULT_GOD_ID;
  
  public static final String DEFAULT_INTRO = "";
  
  public static final Long DEFAULT_USER_ID;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String detail_intro;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long god_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long user_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-907209679, "Ltbclient/Profile/ForumGodDetailInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-907209679, "Ltbclient/Profile/ForumGodDetailInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_GOD_ID = long_;
    DEFAULT_USER_ID = long_;
    DEFAULT_FORUM_ID = long_;
  }
  
  public ForumGodDetailInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.god_id;
      if (long_2 == null) {
        this.god_id = DEFAULT_GOD_ID;
      } else {
        this.god_id = long_2;
      } 
      long_2 = paramBuilder.user_id;
      if (long_2 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_2;
      } 
      String str2 = paramBuilder.intro;
      if (str2 == null) {
        this.intro = "";
      } else {
        this.intro = str2;
      } 
      str2 = paramBuilder.detail_intro;
      if (str2 == null) {
        this.detail_intro = "";
      } else {
        this.detail_intro = str2;
      } 
      Long long_1 = paramBuilder.forum_id;
      if (long_1 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_1;
      } 
      String str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      str = paramBuilder.avatar;
      if (str == null) {
        this.avatar = "";
      } else {
        this.avatar = str;
      } 
    } else {
      this.god_id = ((Builder)str).god_id;
      this.user_id = ((Builder)str).user_id;
      this.intro = ((Builder)str).intro;
      this.detail_intro = ((Builder)str).detail_intro;
      this.forum_id = ((Builder)str).forum_id;
      this.forum_name = ((Builder)str).forum_name;
      this.avatar = ((Builder)str).avatar;
    } 
  }
}
