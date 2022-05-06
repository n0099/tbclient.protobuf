import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.TwZhiBoUser;

public final class TwZhiBoUser extends Message {
  public static final Integer DEFAULT_ANCHOR_LEVEL;
  
  public static final String DEFAULT_FIELD_EX = "";
  
  public static final Integer DEFAULT_IN_BLACK_LIST;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer anchor_level;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String field_ex;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer in_black_list;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1974478549, "Ltbclient/TwZhiBoUser;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1974478549, "Ltbclient/TwZhiBoUser;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ANCHOR_LEVEL = integer;
    DEFAULT_IN_BLACK_LIST = integer;
  }
  
  public TwZhiBoUser(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.anchor_level;
      if (integer == null) {
        this.anchor_level = DEFAULT_ANCHOR_LEVEL;
      } else {
        this.anchor_level = integer;
      } 
      integer = paramBuilder.in_black_list;
      if (integer == null) {
        this.in_black_list = DEFAULT_IN_BLACK_LIST;
      } else {
        this.in_black_list = integer;
      } 
      str = paramBuilder.field_ex;
      if (str == null) {
        this.field_ex = "";
      } else {
        this.field_ex = str;
      } 
    } else {
      this.anchor_level = ((Builder)str).anchor_level;
      this.in_black_list = ((Builder)str).in_black_list;
      this.field_ex = ((Builder)str).field_ex;
    } 
  }
}
