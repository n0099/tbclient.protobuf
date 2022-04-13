package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumHeadIcon extends Message {
  public static final Integer DEFAULT_GRADE = Integer.valueOf(0);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer grade;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public ForumHeadIcon(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.grade;
      if (integer == null) {
        this.grade = DEFAULT_GRADE;
      } else {
        this.grade = integer;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.grade = ((Builder)str).grade;
      this.url = ((Builder)str).url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-836463324, "Ltbclient/FrsPage/ForumHeadIcon;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-836463324, "Ltbclient/FrsPage/ForumHeadIcon;");
          return;
        } 
      } 
    } 
  }
}
