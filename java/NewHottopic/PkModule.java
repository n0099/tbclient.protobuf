package NewHottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.NewHottopic.PkItem;

public final class PkModule extends Message {
  public static final Long DEFAULT_PK_ID;
  
  public static final Long DEFAULT_USER_PK_ID;
  
  @ProtoField(tag = 3)
  public final PkItem agree;
  
  @ProtoField(tag = 4)
  public final PkItem disagree;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long pk_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long user_pk_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1960818429, "Ltbclient/NewHottopic/PkModule;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1960818429, "Ltbclient/NewHottopic/PkModule;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_PK_ID = long_;
    DEFAULT_USER_PK_ID = long_;
  }
  
  public PkModule(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.pk_id;
      if (long_ == null) {
        this.pk_id = DEFAULT_PK_ID;
      } else {
        this.pk_id = long_;
      } 
      long_ = paramBuilder.user_pk_id;
      if (long_ == null) {
        this.user_pk_id = DEFAULT_USER_PK_ID;
      } else {
        this.user_pk_id = long_;
      } 
      this.agree = paramBuilder.agree;
      this.disagree = paramBuilder.disagree;
    } else {
      this.pk_id = paramBuilder.pk_id;
      this.user_pk_id = paramBuilder.user_pk_id;
      this.agree = paramBuilder.agree;
      this.disagree = paramBuilder.disagree;
    } 
  }
}
