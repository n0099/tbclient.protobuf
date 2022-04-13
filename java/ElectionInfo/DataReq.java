package ElectionInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_RN;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long fid;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer rn;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_RN = integer;
    DEFAULT_PN = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.fid;
      if (long_ == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_;
      } 
      Integer integer1 = paramBuilder.rn;
      if (integer1 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer1;
      } 
      integer = paramBuilder.pn;
      if (integer == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.fid = ((Builder)integer).fid;
      this.rn = ((Builder)integer).rn;
      this.pn = ((Builder)integer).pn;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1192171451, "Ltbclient/ElectionInfo/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1192171451, "Ltbclient/ElectionInfo/DataReq;");
          return;
        } 
      } 
    } 
  }
}
