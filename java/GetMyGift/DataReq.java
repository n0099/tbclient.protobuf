package GetMyGift;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_ACCOUNT_TYPE;
  
  public static final Integer DEFAULT_PN;
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public static final Long DEFAULT_UID = Long.valueOf(0L);
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer account_type;
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String st_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long uid;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PN = integer;
    DEFAULT_ACCOUNT_TYPE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.uid;
      if (long_ == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_;
      } 
      this.common = paramBuilder.common;
      Integer integer1 = paramBuilder.pn;
      if (integer1 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer1;
      } 
      String str = paramBuilder.st_type;
      if (str == null) {
        this.st_type = "";
      } else {
        this.st_type = str;
      } 
      integer = paramBuilder.account_type;
      if (integer == null) {
        this.account_type = DEFAULT_ACCOUNT_TYPE;
      } else {
        this.account_type = integer;
      } 
    } else {
      this.uid = ((Builder)integer).uid;
      this.common = ((Builder)integer).common;
      this.pn = ((Builder)integer).pn;
      this.st_type = ((Builder)integer).st_type;
      this.account_type = ((Builder)integer).account_type;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1915778514, "Ltbclient/GetMyGift/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1915778514, "Ltbclient/GetMyGift/DataReq;");
          return;
        } 
      } 
    } 
  }
}
