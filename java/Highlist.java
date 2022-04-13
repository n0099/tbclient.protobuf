import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.High;
import tbclient.Highlist;

public final class Highlist extends Message {
  public static final Boolean DEFAULT_HAS_MORE;
  
  public static final List<High> DEFAULT_LIST = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.BOOL)
  public final Boolean has_more;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<High> list;
  
  static {
    DEFAULT_HAS_MORE = Boolean.FALSE;
  }
  
  public Highlist(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      List list = paramBuilder.list;
      if (list == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list);
      } 
      bool = paramBuilder.has_more;
      if (bool == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = bool;
      } 
    } else {
      this.list = Message.immutableCopyOf(((Builder)bool).list);
      this.has_more = ((Builder)bool).has_more;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-777844399, "Ltbclient/Highlist;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-777844399, "Ltbclient/Highlist;");
          return;
        } 
      } 
    } 
  }
}
