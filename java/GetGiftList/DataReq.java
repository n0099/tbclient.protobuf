package GetGiftList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_BENEFIT_USERID = Long.valueOf(0L);
  
  public static final String DEFAULT_SCENE_FROM = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long benefit_userid;
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String scene_from;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.scene_from;
      if (str == null) {
        this.scene_from = "";
      } else {
        this.scene_from = str;
      } 
      this.common = paramBuilder.common;
      long_ = paramBuilder.benefit_userid;
      if (long_ == null) {
        this.benefit_userid = DEFAULT_BENEFIT_USERID;
      } else {
        this.benefit_userid = long_;
      } 
    } else {
      this.scene_from = ((Builder)long_).scene_from;
      this.common = ((Builder)long_).common;
      this.benefit_userid = ((Builder)long_).benefit_userid;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2016215940, "Ltbclient/GetGiftList/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2016215940, "Ltbclient/GetGiftList/DataReq;");
          return;
        } 
      } 
    } 
  }
}
