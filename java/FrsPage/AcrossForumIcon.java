package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AcrossForumIcon extends Message {
  public static final String DEFAULT_ICON_URL = "";
  
  public static final Integer DEFAULT_PIC_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer pic_type;
  
  public AcrossForumIcon(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.icon_url;
      if (str == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str;
      } 
      integer = paramBuilder.pic_type;
      if (integer == null) {
        this.pic_type = DEFAULT_PIC_TYPE;
      } else {
        this.pic_type = integer;
      } 
    } else {
      this.icon_url = ((Builder)integer).icon_url;
      this.pic_type = ((Builder)integer).pic_type;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(778311619, "Ltbclient/FrsPage/AcrossForumIcon;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(778311619, "Ltbclient/FrsPage/AcrossForumIcon;");
          return;
        } 
      } 
    } 
  }
}
