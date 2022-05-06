import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.LotteryRegular;

public final class LotteryRegular extends Message {
  public static final List<Integer> DEFAULT_CHANCE = Collections.emptyList();
  
  public static final String DEFAULT_REGULAR = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.INT32)
  public final List<Integer> chance;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String regular;
  
  public LotteryRegular(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.regular;
      if (str == null) {
        this.regular = "";
      } else {
        this.regular = str;
      } 
      list = paramBuilder.chance;
      if (list == null) {
        this.chance = DEFAULT_CHANCE;
      } else {
        this.chance = Message.immutableCopyOf(list);
      } 
    } else {
      this.regular = ((Builder)list).regular;
      this.chance = Message.immutableCopyOf(((Builder)list).chance);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1646226526, "Ltbclient/LotteryRegular;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1646226526, "Ltbclient/LotteryRegular;");
          return;
        } 
      } 
    } 
  }
}
