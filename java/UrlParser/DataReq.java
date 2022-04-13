package UrlParser;

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
  
  public static final Integer DEFAULT_LINK_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer link_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String url;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      Integer integer = paramBuilder.link_num;
      if (integer == null) {
        this.link_num = DEFAULT_LINK_NUM;
      } else {
        this.link_num = integer;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.forum_id = ((Builder)str).forum_id;
      this.link_num = ((Builder)str).link_num;
      this.url = ((Builder)str).url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(438144818, "Ltbclient/UrlParser/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(438144818, "Ltbclient/UrlParser/DataReq;");
          return;
        } 
      } 
    } 
  }
}
