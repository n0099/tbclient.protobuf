package Hottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RelateForum extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final Integer DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_LIKED;
  
  public static final Integer DEFAULT_MEMBER_NUM;
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final Integer DEFAULT_THREAD_NUM;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer is_liked;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer member_num;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer post_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer thread_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-346881706, "Ltbclient/Hottopic/RelateForum;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-346881706, "Ltbclient/Hottopic/RelateForum;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_FORUM_ID = integer;
    DEFAULT_MEMBER_NUM = integer;
    DEFAULT_THREAD_NUM = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_IS_LIKED = integer;
  }
  
  public RelateForum(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.forum_id;
      if (integer2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = integer2;
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
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
      Integer integer1 = paramBuilder.member_num;
      if (integer1 == null) {
        this.member_num = DEFAULT_MEMBER_NUM;
      } else {
        this.member_num = integer1;
      } 
      integer1 = paramBuilder.thread_num;
      if (integer1 == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = integer1;
      } 
      integer1 = paramBuilder.post_num;
      if (integer1 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer1;
      } 
      integer = paramBuilder.is_liked;
      if (integer == null) {
        this.is_liked = DEFAULT_IS_LIKED;
      } else {
        this.is_liked = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.avatar = ((Builder)integer).avatar;
      this.desc = ((Builder)integer).desc;
      this.member_num = ((Builder)integer).member_num;
      this.thread_num = ((Builder)integer).thread_num;
      this.post_num = ((Builder)integer).post_num;
      this.is_liked = ((Builder)integer).is_liked;
    } 
  }
}
