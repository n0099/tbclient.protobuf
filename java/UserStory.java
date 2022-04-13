import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.UserStory;

public final class UserStory extends Message {
  public static final Integer DEFAULT_HAS_READ;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer has_read;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    DEFAULT_HAS_READ = Integer.valueOf(0);
  }
  
  public UserStory(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
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
      integer = paramBuilder.has_read;
      if (integer == null) {
        this.has_read = DEFAULT_HAS_READ;
      } else {
        this.has_read = integer;
      } 
    } else {
      this.user_id = ((Builder)integer).user_id;
      this.user_name = ((Builder)integer).user_name;
      this.portrait = ((Builder)integer).portrait;
      this.has_read = ((Builder)integer).has_read;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1403963909, "Ltbclient/UserStory;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1403963909, "Ltbclient/UserStory;");
          return;
        } 
      } 
    } 
  }
}
