import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.LabelInfo;

public final class LabelInfo extends Message {
  public static final String DEFAULT_LABELCONTENT = "";
  
  public static final Integer DEFAULT_LABELHOT = Integer.valueOf(0);
  
  public static final String DEFAULT_LABELID = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String labelContent;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer labelHot;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String labelId;
  
  public LabelInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.labelHot;
      if (integer == null) {
        this.labelHot = DEFAULT_LABELHOT;
      } else {
        this.labelHot = integer;
      } 
      String str1 = paramBuilder.labelContent;
      if (str1 == null) {
        this.labelContent = "";
      } else {
        this.labelContent = str1;
      } 
      str = paramBuilder.labelId;
      if (str == null) {
        this.labelId = "";
      } else {
        this.labelId = str;
      } 
    } else {
      this.labelHot = ((Builder)str).labelHot;
      this.labelContent = ((Builder)str).labelContent;
      this.labelId = ((Builder)str).labelId;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-371034333, "Ltbclient/LabelInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-371034333, "Ltbclient/LabelInfo;");
          return;
        } 
      } 
    } 
  }
}
