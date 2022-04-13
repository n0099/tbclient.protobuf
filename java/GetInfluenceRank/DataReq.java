package GetInfluenceRank;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_RN;
  
  public static final String DEFAULT_TIEBA_NAME = "";
  
  @ProtoField(tag = 6)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer rn;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tieba_name;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_RN = integer;
    DEFAULT_PN = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.tieba_name;
      if (str == null) {
        this.tieba_name = "";
      } else {
        this.tieba_name = str;
      } 
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      Integer integer = paramBuilder.rn;
      if (integer == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer;
      } 
      integer = paramBuilder.pn;
      if (integer == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer;
      } 
      this.common = paramBuilder.common;
    } else {
      this.tieba_name = paramBuilder.tieba_name;
      this.forum_id = paramBuilder.forum_id;
      this.rn = paramBuilder.rn;
      this.pn = paramBuilder.pn;
      this.common = paramBuilder.common;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1219781921, "Ltbclient/GetInfluenceRank/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1219781921, "Ltbclient/GetInfluenceRank/DataReq;");
          return;
        } 
      } 
    } 
  }
}
