package Personalized;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PersonalForum extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_LIKE = Integer.valueOf(0);
  
  public static final String DEFAULT_RECOM_REASON = "";
  
  public static final String DEFAULT_WEIGHT = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer is_like;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String recom_reason;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String weight;
  
  public PersonalForum(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
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
      Integer integer = paramBuilder.is_like;
      if (integer == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer;
      } 
      String str1 = paramBuilder.weight;
      if (str1 == null) {
        this.weight = "";
      } else {
        this.weight = str1;
      } 
      str = paramBuilder.recom_reason;
      if (str == null) {
        this.recom_reason = "";
      } else {
        this.recom_reason = str;
      } 
    } else {
      this.forum_id = ((Builder)str).forum_id;
      this.forum_name = ((Builder)str).forum_name;
      this.avatar = ((Builder)str).avatar;
      this.is_like = ((Builder)str).is_like;
      this.weight = ((Builder)str).weight;
      this.recom_reason = ((Builder)str).recom_reason;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1621113519, "Ltbclient/Personalized/PersonalForum;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1621113519, "Ltbclient/Personalized/PersonalForum;");
          return;
        } 
      } 
    } 
  }
}
