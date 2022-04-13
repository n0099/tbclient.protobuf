package GetGiftMyList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Sender extends Message {
  public static final Long DEFAULT_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  public Sender(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      String str1 = paramBuilder.name_show;
      if (str1 == null) {
        this.name_show = "";
      } else {
        this.name_show = str1;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.name_show = ((Builder)str).name_show;
      this.portrait = ((Builder)str).portrait;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1203942525, "Ltbclient/GetGiftMyList/Sender;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1203942525, "Ltbclient/GetGiftMyList/Sender;");
          return;
        } 
      } 
    } 
  }
}
