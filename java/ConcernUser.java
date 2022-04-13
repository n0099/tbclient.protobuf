import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ConcernUser;

public final class ConcernUser extends Message {
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long user_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String user_name;
  
  public ConcernUser(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.user_name;
      if (str == null) {
        this.user_name = "";
      } else {
        this.user_name = str;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
    } else {
      this.user_name = ((Builder)long_).user_name;
      this.portrait = ((Builder)long_).portrait;
      this.user_id = ((Builder)long_).user_id;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-971583238, "Ltbclient/ConcernUser;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-971583238, "Ltbclient/ConcernUser;");
          return;
        } 
      } 
    } 
  }
}
