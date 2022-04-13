import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Item;
import tbclient.ManageInfo;
import tbclient.TiebaPlusInfo;

public final class ManageInfo extends Message {
  public static final Integer DEFAULT_ITEM_SOURCE = Integer.valueOf(0);
  
  @ProtoField(tag = 1)
  public final Item item;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer item_source;
  
  @ProtoField(tag = 2)
  public final TiebaPlusInfo tiebaplus_info;
  
  public ManageInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.item = paramBuilder.item;
      this.tiebaplus_info = paramBuilder.tiebaplus_info;
      integer = paramBuilder.item_source;
      if (integer == null) {
        this.item_source = DEFAULT_ITEM_SOURCE;
      } else {
        this.item_source = integer;
      } 
    } else {
      this.item = ((Builder)integer).item;
      this.tiebaplus_info = ((Builder)integer).tiebaplus_info;
      this.item_source = ((Builder)integer).item_source;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1615088574, "Ltbclient/ManageInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1615088574, "Ltbclient/ManageInfo;");
          return;
        } 
      } 
    } 
  }
}
