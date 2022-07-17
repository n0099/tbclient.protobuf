package tbclient.CheckPost;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ResData extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_FNAME = "";
  
  public static final Long DEFAULT_FORUMID;
  
  public static final Long DEFAULT_POSTSTATE;
  
  public static final Long DEFAULT_QUOTEID;
  
  public static final Long DEFAULT_REPOSTID;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String fname;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long forumId;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long postState;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long quoteId;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long repostId;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(867748866, "Ltbclient/CheckPost/ResData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(867748866, "Ltbclient/CheckPost/ResData;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_POSTSTATE = long_;
    DEFAULT_FORUMID = long_;
    DEFAULT_QUOTEID = long_;
    DEFAULT_REPOSTID = long_;
  }
  
  public ResData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.postState;
      if (long_ == null) {
        this.postState = DEFAULT_POSTSTATE;
      } else {
        this.postState = long_;
      } 
      long_ = paramBuilder.forumId;
      if (long_ == null) {
        this.forumId = DEFAULT_FORUMID;
      } else {
        this.forumId = long_;
      } 
      long_ = paramBuilder.quoteId;
      if (long_ == null) {
        this.quoteId = DEFAULT_QUOTEID;
      } else {
        this.quoteId = long_;
      } 
      long_ = paramBuilder.repostId;
      if (long_ == null) {
        this.repostId = DEFAULT_REPOSTID;
      } else {
        this.repostId = long_;
      } 
      str = paramBuilder.fname;
      if (str == null) {
        this.fname = "";
      } else {
        this.fname = str;
      } 
    } else {
      this.postState = ((Builder)str).postState;
      this.forumId = ((Builder)str).forumId;
      this.quoteId = ((Builder)str).quoteId;
      this.repostId = ((Builder)str).repostId;
      this.fname = ((Builder)str).fname;
    } 
  }
  
  public ResData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ResData> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String fname;
    
    public Long forumId;
    
    public Long postState;
    
    public Long quoteId;
    
    public Long repostId;
    
    public Builder() {}
    
    public Builder(ResData param1ResData) {
      super(param1ResData);
      if (param1ResData == null)
        return; 
      this.postState = param1ResData.postState;
      this.forumId = param1ResData.forumId;
      this.quoteId = param1ResData.quoteId;
      this.repostId = param1ResData.repostId;
      this.fname = param1ResData.fname;
    }
    
    public ResData build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ResData)interceptResult.objValue; 
      } 
      return new ResData(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
