package GetConsentList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ConsentUser extends Message {
  public static final Long DEFAULT_AUTHOR_ID;
  
  public static final String DEFAULT_AUTHOR_NAME = "";
  
  public static final String DEFAULT_AUTHOR_NAME_SHOW = "";
  
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final Long DEFAULT_GID;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final String DEFAULT_USER_NAME_SHOW = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long author_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String author_name;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String author_name_show;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer create_time;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long gid;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long thread_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String user_name_show;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2121257241, "Ltbclient/GetConsentList/ConsentUser;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2121257241, "Ltbclient/GetConsentList/ConsentUser;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_USER_ID = long_;
    DEFAULT_AUTHOR_ID = long_;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_POST_ID = long_;
    DEFAULT_CREATE_TIME = Integer.valueOf(0);
    DEFAULT_GID = long_;
  }
  
  public ConsentUser(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_4 = paramBuilder.user_id;
      if (long_4 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_4;
      } 
      String str3 = paramBuilder.user_name;
      if (str3 == null) {
        this.user_name = "";
      } else {
        this.user_name = str3;
      } 
      Long long_3 = paramBuilder.author_id;
      if (long_3 == null) {
        this.author_id = DEFAULT_AUTHOR_ID;
      } else {
        this.author_id = long_3;
      } 
      String str2 = paramBuilder.author_name;
      if (str2 == null) {
        this.author_name = "";
      } else {
        this.author_name = str2;
      } 
      str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      Long long_2 = paramBuilder.thread_id;
      if (long_2 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_2;
      } 
      long_2 = paramBuilder.post_id;
      if (long_2 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_2;
      } 
      Integer integer = paramBuilder.create_time;
      if (integer == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer;
      } 
      Long long_1 = paramBuilder.gid;
      if (long_1 == null) {
        this.gid = DEFAULT_GID;
      } else {
        this.gid = long_1;
      } 
      String str1 = paramBuilder.author_name_show;
      if (str1 == null) {
        this.author_name_show = "";
      } else {
        this.author_name_show = str1;
      } 
      str = paramBuilder.user_name_show;
      if (str == null) {
        this.user_name_show = "";
      } else {
        this.user_name_show = str;
      } 
    } else {
      this.user_id = ((Builder)str).user_id;
      this.user_name = ((Builder)str).user_name;
      this.author_id = ((Builder)str).author_id;
      this.author_name = ((Builder)str).author_name;
      this.portrait = ((Builder)str).portrait;
      this.thread_id = ((Builder)str).thread_id;
      this.post_id = ((Builder)str).post_id;
      this.create_time = ((Builder)str).create_time;
      this.gid = ((Builder)str).gid;
      this.author_name_show = ((Builder)str).author_name_show;
      this.user_name_show = ((Builder)str).user_name_show;
    } 
  }
}
