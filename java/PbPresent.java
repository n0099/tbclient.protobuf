import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbPresent;
import tbclient.PbPresentList;

public final class PbPresent extends Message {
  public static final List<PbPresentList> DEFAULT_LIST;
  
  public static final Integer DEFAULT_TOTAL = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<PbPresentList> list;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer total;
  
  static {
    DEFAULT_LIST = Collections.emptyList();
  }
  
  public PbPresent(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.total;
      if (integer == null) {
        this.total = DEFAULT_TOTAL;
      } else {
        this.total = integer;
      } 
      list = paramBuilder.list;
      if (list == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list);
      } 
    } else {
      this.total = ((Builder)list).total;
      this.list = Message.immutableCopyOf(((Builder)list).list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1484620964, "Ltbclient/PbPresent;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1484620964, "Ltbclient/PbPresent;");
          return;
        } 
      } 
    } 
  }
}
