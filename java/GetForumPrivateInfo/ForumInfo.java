package GetForumPrivateInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumInfo extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_IS_HIDE = "";
  
  public static final Integer DEFAULT_LEVEL_ID = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String is_hide;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer level_id;
  
  public ForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      str1 = paramBuilder.avatar;
      if (str1 == null) {
        this.avatar = "";
      } else {
        this.avatar = str1;
      } 
      Integer integer = paramBuilder.level_id;
      if (integer == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer;
      } 
      str = paramBuilder.is_hide;
      if (str == null) {
        this.is_hide = "";
      } else {
        this.is_hide = str;
      } 
    } else {
      this.forum_id = ((Builder)str).forum_id;
      this.forum_name = ((Builder)str).forum_name;
      this.avatar = ((Builder)str).avatar;
      this.level_id = ((Builder)str).level_id;
      this.is_hide = ((Builder)str).is_hide;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1739965057, "Ltbclient/GetForumPrivateInfo/ForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1739965057, "Ltbclient/GetForumPrivateInfo/ForumInfo;");
          return;
        } 
      } 
    } 
  }
}
