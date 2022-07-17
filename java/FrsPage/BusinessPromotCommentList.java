package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BusinessPromotCommentList extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_IS_LZ;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Long DEFAULT_UID = Long.valueOf(0L);
  
  public static final String DEFAULT_USERNAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_lz;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long uid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String username;
  
  static {
    DEFAULT_IS_LZ = Integer.valueOf(0);
  }
  
  public BusinessPromotCommentList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.username;
      if (str == null) {
        this.username = "";
      } else {
        this.username = str;
      } 
      Long long_ = paramBuilder.uid;
      if (long_ == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_;
      } 
      integer = paramBuilder.is_lz;
      if (integer == null) {
        this.is_lz = DEFAULT_IS_LZ;
      } else {
        this.is_lz = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.username = ((Builder)integer).username;
      this.uid = ((Builder)integer).uid;
      this.is_lz = ((Builder)integer).is_lz;
    } 
  }
  
  public BusinessPromotCommentList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-778915354, "Ltbclient/FrsPage/BusinessPromotCommentList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-778915354, "Ltbclient/FrsPage/BusinessPromotCommentList;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<BusinessPromotCommentList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer is_lz;
    
    public String title;
    
    public Long uid;
    
    public String username;
    
    public Builder() {}
    
    public Builder(BusinessPromotCommentList param1BusinessPromotCommentList) {
      super(param1BusinessPromotCommentList);
      if (param1BusinessPromotCommentList == null)
        return; 
      this.title = param1BusinessPromotCommentList.title;
      this.username = param1BusinessPromotCommentList.username;
      this.uid = param1BusinessPromotCommentList.uid;
      this.is_lz = param1BusinessPromotCommentList.is_lz;
    }
    
    public BusinessPromotCommentList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BusinessPromotCommentList)interceptResult.objValue; 
      } 
      return new BusinessPromotCommentList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
