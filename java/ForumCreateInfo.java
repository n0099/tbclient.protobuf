import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ForumCreateInfo;

public final class ForumCreateInfo extends Message {
  public static final String DEFAULT_CAN_CREATE_ERRDATA = "";
  
  public static final Integer DEFAULT_CAN_CREATE_ERRNO;
  
  public static final Integer DEFAULT_IS_CAN_CREATE;
  
  public static final Integer DEFAULT_IS_SHOW_CREATE;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String can_create_errdata;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer can_create_errno;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_can_create;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_show_create;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-255578438, "Ltbclient/ForumCreateInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-255578438, "Ltbclient/ForumCreateInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_SHOW_CREATE = integer;
    DEFAULT_IS_CAN_CREATE = integer;
    DEFAULT_CAN_CREATE_ERRNO = integer;
  }
  
  public ForumCreateInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_show_create;
      if (integer == null) {
        this.is_show_create = DEFAULT_IS_SHOW_CREATE;
      } else {
        this.is_show_create = integer;
      } 
      integer = paramBuilder.is_can_create;
      if (integer == null) {
        this.is_can_create = DEFAULT_IS_CAN_CREATE;
      } else {
        this.is_can_create = integer;
      } 
      integer = paramBuilder.can_create_errno;
      if (integer == null) {
        this.can_create_errno = DEFAULT_CAN_CREATE_ERRNO;
      } else {
        this.can_create_errno = integer;
      } 
      str = paramBuilder.can_create_errdata;
      if (str == null) {
        this.can_create_errdata = "";
      } else {
        this.can_create_errdata = str;
      } 
    } else {
      this.is_show_create = ((Builder)str).is_show_create;
      this.is_can_create = ((Builder)str).is_can_create;
      this.can_create_errno = ((Builder)str).can_create_errno;
      this.can_create_errdata = ((Builder)str).can_create_errdata;
    } 
  }
}
