package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MultiForumPerm extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BAWU_TYPE = "";
  
  public static final Integer DEFAULT_IS_BAWU;
  
  public static final Integer DEFAULT_IS_BLOCK_BAWU_DELETE;
  
  public static final Integer DEFAULT_IS_DELETED;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bawu_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_bawu;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_block_bawu_delete;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_deleted;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1914072729, "Ltbclient/MultiForumPerm;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1914072729, "Ltbclient/MultiForumPerm;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_BAWU = integer;
    DEFAULT_IS_DELETED = integer;
    DEFAULT_IS_BLOCK_BAWU_DELETE = integer;
  }
  
  public MultiForumPerm(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.is_bawu;
      if (integer2 == null) {
        this.is_bawu = DEFAULT_IS_BAWU;
      } else {
        this.is_bawu = integer2;
      } 
      String str = paramBuilder.bawu_type;
      if (str == null) {
        this.bawu_type = "";
      } else {
        this.bawu_type = str;
      } 
      Integer integer1 = paramBuilder.is_deleted;
      if (integer1 == null) {
        this.is_deleted = DEFAULT_IS_DELETED;
      } else {
        this.is_deleted = integer1;
      } 
      integer = paramBuilder.is_block_bawu_delete;
      if (integer == null) {
        this.is_block_bawu_delete = DEFAULT_IS_BLOCK_BAWU_DELETE;
      } else {
        this.is_block_bawu_delete = integer;
      } 
    } else {
      this.is_bawu = ((Builder)integer).is_bawu;
      this.bawu_type = ((Builder)integer).bawu_type;
      this.is_deleted = ((Builder)integer).is_deleted;
      this.is_block_bawu_delete = ((Builder)integer).is_block_bawu_delete;
    } 
  }
  
  public MultiForumPerm(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MultiForumPerm> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String bawu_type;
    
    public Integer is_bawu;
    
    public Integer is_block_bawu_delete;
    
    public Integer is_deleted;
    
    public Builder() {}
    
    public Builder(MultiForumPerm param1MultiForumPerm) {
      super(param1MultiForumPerm);
      if (param1MultiForumPerm == null)
        return; 
      this.is_bawu = param1MultiForumPerm.is_bawu;
      this.bawu_type = param1MultiForumPerm.bawu_type;
      this.is_deleted = param1MultiForumPerm.is_deleted;
      this.is_block_bawu_delete = param1MultiForumPerm.is_block_bawu_delete;
    }
    
    public MultiForumPerm build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (MultiForumPerm)interceptResult.objValue; 
      } 
      return new MultiForumPerm(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
