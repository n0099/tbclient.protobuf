package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Music extends Message {
  public static final Integer DEFAULT_ISOPEN;
  
  public static final Integer DEFAULT_NUM;
  
  public static final String DEFAULT_PIC = "";
  
  public static final Integer DEFAULT_SID;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer isopen;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer num;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer sid;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(891581977, "Ltbclient/FrsPage/Music;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(891581977, "Ltbclient/FrsPage/Music;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_NUM = integer;
    DEFAULT_SID = integer;
    DEFAULT_ISOPEN = integer;
  }
  
  public Music(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.pic;
      if (str == null) {
        this.pic = "";
      } else {
        this.pic = str;
      } 
      Integer integer1 = paramBuilder.num;
      if (integer1 == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer1;
      } 
      integer1 = paramBuilder.sid;
      if (integer1 == null) {
        this.sid = DEFAULT_SID;
      } else {
        this.sid = integer1;
      } 
      integer = paramBuilder.isopen;
      if (integer == null) {
        this.isopen = DEFAULT_ISOPEN;
      } else {
        this.isopen = integer;
      } 
    } else {
      this.pic = ((Builder)integer).pic;
      this.num = ((Builder)integer).num;
      this.sid = ((Builder)integer).sid;
      this.isopen = ((Builder)integer).isopen;
    } 
  }
}
