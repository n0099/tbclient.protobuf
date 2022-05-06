package QueryBlockAndAppealInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final String DEFAULT_AHEAD_INFO = "";
  
  public static final String DEFAULT_AHEAD_URL = "";
  
  public static final String DEFAULT_BLOCK_ID_CODE = "";
  
  public static final String DEFAULT_BLOCK_INFO = "";
  
  public static final String DEFAULT_OK_INFO = "";
  
  public static final Integer DEFAULT_WIN_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String ahead_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String ahead_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String block_id_code;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String block_info;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String ok_info;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer win_type;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.block_info;
      if (str == null) {
        this.block_info = "";
      } else {
        this.block_info = str;
      } 
      str = paramBuilder.ahead_info;
      if (str == null) {
        this.ahead_info = "";
      } else {
        this.ahead_info = str;
      } 
      str = paramBuilder.ahead_url;
      if (str == null) {
        this.ahead_url = "";
      } else {
        this.ahead_url = str;
      } 
      str = paramBuilder.ok_info;
      if (str == null) {
        this.ok_info = "";
      } else {
        this.ok_info = str;
      } 
      str = paramBuilder.block_id_code;
      if (str == null) {
        this.block_id_code = "";
      } else {
        this.block_id_code = str;
      } 
      integer = paramBuilder.win_type;
      if (integer == null) {
        this.win_type = DEFAULT_WIN_TYPE;
      } else {
        this.win_type = integer;
      } 
    } else {
      this.block_info = ((Builder)integer).block_info;
      this.ahead_info = ((Builder)integer).ahead_info;
      this.ahead_url = ((Builder)integer).ahead_url;
      this.ok_info = ((Builder)integer).ok_info;
      this.block_id_code = ((Builder)integer).block_id_code;
      this.win_type = ((Builder)integer).win_type;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1921001969, "Ltbclient/QueryBlockAndAppealInfo/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1921001969, "Ltbclient/QueryBlockAndAppealInfo/DataRes;");
          return;
        } 
      } 
    } 
  }
}
