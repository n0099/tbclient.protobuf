package GetForumData;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumDataValue extends Message {
  public static final String DEFAULT_DATE = "";
  
  public static final Double DEFAULT_VALUE = Double.valueOf(0.0D);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String date;
  
  @ProtoField(tag = 2, type = Message.Datatype.DOUBLE)
  public final Double value;
  
  public ForumDataValue(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      String str = paramBuilder.date;
      if (str == null) {
        this.date = "";
      } else {
        this.date = str;
      } 
      double_ = paramBuilder.value;
      if (double_ == null) {
        this.value = DEFAULT_VALUE;
      } else {
        this.value = double_;
      } 
    } else {
      this.date = ((Builder)double_).date;
      this.value = ((Builder)double_).value;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2030694747, "Ltbclient/GetForumData/ForumDataValue;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2030694747, "Ltbclient/GetForumData/ForumDataValue;");
          return;
        } 
      } 
    } 
  }
}
