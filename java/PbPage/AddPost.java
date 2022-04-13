package PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AddPost extends Message {
  public static final Integer DEFAULT_ALREADY_COUNT;
  
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final String DEFAULT_LAST_ADDITION_CONTENT = "";
  
  public static final Integer DEFAULT_LAST_ADDITION_TIME;
  
  public static final String DEFAULT_POST_ID = "";
  
  public static final Integer DEFAULT_TOTAL_COUNT;
  
  public static final String DEFAULT_WARN_MSG = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer already_count;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer create_time;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String last_addition_content;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer last_addition_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String post_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer total_count;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String warn_msg;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-118246370, "Ltbclient/PbPage/AddPost;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-118246370, "Ltbclient/PbPage/AddPost;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_CREATE_TIME = integer;
    DEFAULT_ALREADY_COUNT = integer;
    DEFAULT_TOTAL_COUNT = integer;
    DEFAULT_LAST_ADDITION_TIME = integer;
  }
  
  public AddPost(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.create_time;
      if (integer3 == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer3;
      } 
      String str2 = paramBuilder.post_id;
      if (str2 == null) {
        this.post_id = "";
      } else {
        this.post_id = str2;
      } 
      Integer integer2 = paramBuilder.already_count;
      if (integer2 == null) {
        this.already_count = DEFAULT_ALREADY_COUNT;
      } else {
        this.already_count = integer2;
      } 
      integer2 = paramBuilder.total_count;
      if (integer2 == null) {
        this.total_count = DEFAULT_TOTAL_COUNT;
      } else {
        this.total_count = integer2;
      } 
      String str1 = paramBuilder.last_addition_content;
      if (str1 == null) {
        this.last_addition_content = "";
      } else {
        this.last_addition_content = str1;
      } 
      Integer integer1 = paramBuilder.last_addition_time;
      if (integer1 == null) {
        this.last_addition_time = DEFAULT_LAST_ADDITION_TIME;
      } else {
        this.last_addition_time = integer1;
      } 
      str = paramBuilder.warn_msg;
      if (str == null) {
        this.warn_msg = "";
      } else {
        this.warn_msg = str;
      } 
    } else {
      this.create_time = ((Builder)str).create_time;
      this.post_id = ((Builder)str).post_id;
      this.already_count = ((Builder)str).already_count;
      this.total_count = ((Builder)str).total_count;
      this.last_addition_content = ((Builder)str).last_addition_content;
      this.last_addition_time = ((Builder)str).last_addition_time;
      this.warn_msg = ((Builder)str).warn_msg;
    } 
  }
}
