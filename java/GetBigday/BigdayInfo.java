package GetBigday;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BigdayInfo extends Message {
  public static final Long DEFAULT_END_TIME;
  
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_IMG_COLOUR;
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final Integer DEFAULT_POSITION;
  
  public static final Long DEFAULT_START_TIME;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long end_time;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer img_colour;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer position;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long start_time;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1075502154, "Ltbclient/GetBigday/BigdayInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1075502154, "Ltbclient/GetBigday/BigdayInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_START_TIME = long_;
    DEFAULT_END_TIME = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_POSITION = integer;
    DEFAULT_ID = long_;
    DEFAULT_IMG_COLOUR = integer;
  }
  
  public BigdayInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.start_time;
      if (long_2 == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = long_2;
      } 
      long_2 = paramBuilder.end_time;
      if (long_2 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_2;
      } 
      Integer integer1 = paramBuilder.position;
      if (integer1 == null) {
        this.position = DEFAULT_POSITION;
      } else {
        this.position = integer1;
      } 
      String str2 = paramBuilder.img_url;
      if (str2 == null) {
        this.img_url = "";
      } else {
        this.img_url = str2;
      } 
      Long long_1 = paramBuilder.id;
      if (long_1 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_1;
      } 
      String str1 = paramBuilder.jump_url;
      if (str1 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str1;
      } 
      integer = paramBuilder.img_colour;
      if (integer == null) {
        this.img_colour = DEFAULT_IMG_COLOUR;
      } else {
        this.img_colour = integer;
      } 
    } else {
      this.start_time = ((Builder)integer).start_time;
      this.end_time = ((Builder)integer).end_time;
      this.position = ((Builder)integer).position;
      this.img_url = ((Builder)integer).img_url;
      this.id = ((Builder)integer).id;
      this.jump_url = ((Builder)integer).jump_url;
      this.img_colour = ((Builder)integer).img_colour;
    } 
  }
}
