package tbclient.NewTopicList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PkModule extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_PK_ID;
  
  public static final Long DEFAULT_USER_PK_ID;
  
  public transient FieldHolder $fh;
  
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
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1855521988, "Ltbclient/NewTopicList/PkModule;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1855521988, "Ltbclient/NewTopicList/PkModule;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_PK_ID = long_;
    DEFAULT_USER_PK_ID = long_;
  }
  
  public PkModule(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
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
  
  public PkModule(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PkModule> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public PkItem agree;
    
    public PkItem disagree;
    
    public Long pk_id;
    
    public Long user_pk_id;
    
    public Builder() {}
    
    public Builder(PkModule param1PkModule) {
      super(param1PkModule);
      if (param1PkModule == null)
        return; 
      this.pk_id = param1PkModule.pk_id;
      this.user_pk_id = param1PkModule.user_pk_id;
      this.agree = param1PkModule.agree;
      this.disagree = param1PkModule.disagree;
    }
    
    public PkModule build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PkModule)interceptResult.objValue; 
      } 
      return new PkModule(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
