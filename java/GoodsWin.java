import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GoodsWin;

public final class GoodsWin extends Message {
  public static final String DEFAULT_GOODS_URL = "";
  
  public static final Integer DEFAULT_SHOW = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String goods_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer show;
  
  public GoodsWin(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.show;
      if (integer == null) {
        this.show = DEFAULT_SHOW;
      } else {
        this.show = integer;
      } 
      str = paramBuilder.goods_url;
      if (str == null) {
        this.goods_url = "";
      } else {
        this.goods_url = str;
      } 
    } else {
      this.show = ((Builder)str).show;
      this.goods_url = ((Builder)str).goods_url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1298034347, "Ltbclient/GoodsWin;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1298034347, "Ltbclient/GoodsWin;");
          return;
        } 
      } 
    } 
  }
}
