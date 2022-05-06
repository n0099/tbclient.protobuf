import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.NovelFansInfo;

public final class NovelFansInfo extends Message {
  public static final Integer DEFAULT_LEVEL = Integer.valueOf(0);
  
  public static final String DEFAULT_LEVEL_ICON = "";
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer level;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String level_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String level_name;
  
  public NovelFansInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.level;
      if (integer == null) {
        this.level = DEFAULT_LEVEL;
      } else {
        this.level = integer;
      } 
      String str1 = paramBuilder.level_name;
      if (str1 == null) {
        this.level_name = "";
      } else {
        this.level_name = str1;
      } 
      str = paramBuilder.level_icon;
      if (str == null) {
        this.level_icon = "";
      } else {
        this.level_icon = str;
      } 
    } else {
      this.level = ((Builder)str).level;
      this.level_name = ((Builder)str).level_name;
      this.level_icon = ((Builder)str).level_icon;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-867924485, "Ltbclient/NovelFansInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-867924485, "Ltbclient/NovelFansInfo;");
          return;
        } 
      } 
    } 
  }
}
