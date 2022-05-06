package Personalized;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LiveAnswer extends Message {
  public static final Integer DEFAULT_BANNER_HIGH;
  
  public static final String DEFAULT_BANNER_URL = "";
  
  public static final Integer DEFAULT_BANNER_WIDTH;
  
  public static final String DEFAULT_JUMP_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer banner_high;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String banner_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer banner_width;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jump_url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(929094844, "Ltbclient/Personalized/LiveAnswer;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(929094844, "Ltbclient/Personalized/LiveAnswer;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_BANNER_WIDTH = integer;
    DEFAULT_BANNER_HIGH = integer;
  }
  
  public LiveAnswer(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.banner_url;
      if (str1 == null) {
        this.banner_url = "";
      } else {
        this.banner_url = str1;
      } 
      Integer integer = paramBuilder.banner_width;
      if (integer == null) {
        this.banner_width = DEFAULT_BANNER_WIDTH;
      } else {
        this.banner_width = integer;
      } 
      integer = paramBuilder.banner_high;
      if (integer == null) {
        this.banner_high = DEFAULT_BANNER_HIGH;
      } else {
        this.banner_high = integer;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.banner_url = ((Builder)str).banner_url;
      this.banner_width = ((Builder)str).banner_width;
      this.banner_high = ((Builder)str).banner_high;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
}
