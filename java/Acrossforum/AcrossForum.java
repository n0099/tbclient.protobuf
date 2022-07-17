package tbclient.Acrossforum;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AcrossForum extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String forum_name;
  
  public AcrossForum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
    } else {
      this.forum_name = ((Builder)str).forum_name;
      this.desc = ((Builder)str).desc;
    } 
  }
  
  public AcrossForum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AcrossForum> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String desc;
    
    public String forum_name;
    
    public Builder() {}
    
    public Builder(AcrossForum param1AcrossForum) {
      super(param1AcrossForum);
      if (param1AcrossForum == null)
        return; 
      this.forum_name = param1AcrossForum.forum_name;
      this.desc = param1AcrossForum.desc;
    }
    
    public AcrossForum build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AcrossForum)interceptResult.objValue; 
      } 
      return new AcrossForum(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
