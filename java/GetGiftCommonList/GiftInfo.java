package GetGiftCommonList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetGiftCommonList.GiftList;
import tbclient.GetGiftCommonList.NumInfo;

public final class GiftInfo extends Message {
  public static final List<GiftList> DEFAULT_LIST = Collections.emptyList();
  
  public static final List<NumInfo> DEFAULT_NUM_INFO = Collections.emptyList();
  
  public static final Integer DEFAULT_VERSION = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<GiftList> list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<NumInfo> num_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer version;
  
  public GiftInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.list;
      if (list == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.num_info;
      if (list == null) {
        this.num_info = DEFAULT_NUM_INFO;
      } else {
        this.num_info = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.version;
      if (integer == null) {
        this.version = DEFAULT_VERSION;
      } else {
        this.version = integer;
      } 
    } else {
      this.list = Message.immutableCopyOf(((Builder)integer).list);
      this.num_info = Message.immutableCopyOf(((Builder)integer).num_info);
      this.version = ((Builder)integer).version;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1735518189, "Ltbclient/GetGiftCommonList/GiftInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1735518189, "Ltbclient/GetGiftCommonList/GiftInfo;");
          return;
        } 
      } 
    } 
  }
}
