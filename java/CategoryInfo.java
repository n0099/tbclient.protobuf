import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CategoryInfo;

public final class CategoryInfo extends Message {
  public static final Integer DEFAULT_CATEGORY_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_CATEGORY_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer category_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String category_name;
  
  public CategoryInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.category_id;
      if (integer == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer;
      } 
      str = paramBuilder.category_name;
      if (str == null) {
        this.category_name = "";
      } else {
        this.category_name = str;
      } 
    } else {
      this.category_id = ((Builder)str).category_id;
      this.category_name = ((Builder)str).category_name;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-157538747, "Ltbclient/CategoryInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-157538747, "Ltbclient/CategoryInfo;");
          return;
        } 
      } 
    } 
  }
}
