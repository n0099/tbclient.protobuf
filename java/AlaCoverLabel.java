import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AlaCoverLabel;

public final class AlaCoverLabel extends Message {
  public static final Integer DEFAULT_LABEL_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_LABEL_NAME = "";
  
  public static final String DEFAULT_LABEL_RGB = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer label_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String label_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String label_rgb;
  
  public AlaCoverLabel(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.label_id;
      if (integer == null) {
        this.label_id = DEFAULT_LABEL_ID;
      } else {
        this.label_id = integer;
      } 
      String str1 = paramBuilder.label_name;
      if (str1 == null) {
        this.label_name = "";
      } else {
        this.label_name = str1;
      } 
      str = paramBuilder.label_rgb;
      if (str == null) {
        this.label_rgb = "";
      } else {
        this.label_rgb = str;
      } 
    } else {
      this.label_id = ((Builder)str).label_id;
      this.label_name = ((Builder)str).label_name;
      this.label_rgb = ((Builder)str).label_rgb;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-65771950, "Ltbclient/AlaCoverLabel;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-65771950, "Ltbclient/AlaCoverLabel;");
          return;
        } 
      } 
    } 
  }
}
