import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PrivatePopInfo;

public final class PrivatePopInfo extends Message {
  public static final String DEFAULT_POP_CONTENT = "";
  
  public static final Integer DEFAULT_POP_FORUM_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_POP_TYPE = "";
  
  public static final String DEFAULT_POP_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pop_content;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer pop_forum_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pop_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pop_url;
  
  public PrivatePopInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.pop_type;
      if (str == null) {
        this.pop_type = "";
      } else {
        this.pop_type = str;
      } 
      str = paramBuilder.pop_content;
      if (str == null) {
        this.pop_content = "";
      } else {
        this.pop_content = str;
      } 
      str = paramBuilder.pop_url;
      if (str == null) {
        this.pop_url = "";
      } else {
        this.pop_url = str;
      } 
      integer = paramBuilder.pop_forum_id;
      if (integer == null) {
        this.pop_forum_id = DEFAULT_POP_FORUM_ID;
      } else {
        this.pop_forum_id = integer;
      } 
    } else {
      this.pop_type = ((Builder)integer).pop_type;
      this.pop_content = ((Builder)integer).pop_content;
      this.pop_url = ((Builder)integer).pop_url;
      this.pop_forum_id = ((Builder)integer).pop_forum_id;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1933810187, "Ltbclient/PrivatePopInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1933810187, "Ltbclient/PrivatePopInfo;");
          return;
        } 
      } 
    } 
  }
}
