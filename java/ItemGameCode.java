import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameCodeList;
import tbclient.ItemGameCode;

public final class ItemGameCode extends Message {
  public static final List<GameCodeList> DEFAULT_GAME_CODE_LIST;
  
  public static final Integer DEFAULT_UNCLAIMED_NUM = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<GameCodeList> game_code_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer unclaimed_num;
  
  static {
    DEFAULT_GAME_CODE_LIST = Collections.emptyList();
  }
  
  public ItemGameCode(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.unclaimed_num;
      if (integer == null) {
        this.unclaimed_num = DEFAULT_UNCLAIMED_NUM;
      } else {
        this.unclaimed_num = integer;
      } 
      list = paramBuilder.game_code_list;
      if (list == null) {
        this.game_code_list = DEFAULT_GAME_CODE_LIST;
      } else {
        this.game_code_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.unclaimed_num = ((Builder)list).unclaimed_num;
      this.game_code_list = Message.immutableCopyOf(((Builder)list).game_code_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1494214497, "Ltbclient/ItemGameCode;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1494214497, "Ltbclient/ItemGameCode;");
          return;
        } 
      } 
    } 
  }
}
