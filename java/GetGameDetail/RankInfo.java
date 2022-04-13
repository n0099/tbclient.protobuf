package GetGameDetail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetGameDetail.RankItem;

public final class RankInfo extends Message {
  public static final List<RankItem> DEFAULT_RANK_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<RankItem> rank_list;
  
  public RankInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      list = paramBuilder.rank_list;
      if (list == null) {
        this.rank_list = DEFAULT_RANK_LIST;
      } else {
        this.rank_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.rank_list = Message.immutableCopyOf(((Builder)list).rank_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1617880193, "Ltbclient/GetGameDetail/RankInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1617880193, "Ltbclient/GetGameDetail/RankInfo;");
          return;
        } 
      } 
    } 
  }
}
