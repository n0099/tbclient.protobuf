package GetForumClassList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class WeeklyInfo extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_LIKE = Integer.valueOf(0);
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer is_like;
  
  public WeeklyInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str = paramBuilder.forum_name;
      if (str == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str;
      } 
      str = paramBuilder.avatar;
      if (str == null) {
        this.avatar = "";
      } else {
        this.avatar = str;
      } 
      str = paramBuilder._abstract;
      if (str == null) {
        this._abstract = "";
      } else {
        this._abstract = str;
      } 
      integer = paramBuilder.is_like;
      if (integer == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.avatar = ((Builder)integer).avatar;
      this._abstract = ((Builder)integer)._abstract;
      this.is_like = ((Builder)integer).is_like;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1865638782, "Ltbclient/GetForumClassList/WeeklyInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1865638782, "Ltbclient/GetForumClassList/WeeklyInfo;");
          return;
        } 
      } 
    } 
  }
}
