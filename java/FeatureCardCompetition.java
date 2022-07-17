package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeatureCardCompetition extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_FLOOR;
  
  public static final List<FeatureCardCompetitionSubNode> DEFAULT_SUB_NODES = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer floor;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeatureCardCompetitionSubNode> sub_nodes;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_FLOOR = integer;
    DEFAULT_TYPE = integer;
  }
  
  public FeatureCardCompetition(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<FeatureCardCompetitionSubNode> list = paramBuilder.sub_nodes;
      if (list == null) {
        this.sub_nodes = DEFAULT_SUB_NODES;
      } else {
        this.sub_nodes = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.floor;
      if (integer == null) {
        this.floor = DEFAULT_FLOOR;
      } else {
        this.floor = integer;
      } 
      integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
    } else {
      this.sub_nodes = Message.immutableCopyOf(((Builder)str).sub_nodes);
      this.floor = ((Builder)str).floor;
      this.type = ((Builder)str).type;
      this.title = ((Builder)str).title;
    } 
  }
  
  public FeatureCardCompetition(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2058948488, "Ltbclient/FeatureCardCompetition;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2058948488, "Ltbclient/FeatureCardCompetition;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<FeatureCardCompetition> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer floor;
    
    public List<FeatureCardCompetitionSubNode> sub_nodes;
    
    public String title;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(FeatureCardCompetition param1FeatureCardCompetition) {
      super(param1FeatureCardCompetition);
      if (param1FeatureCardCompetition == null)
        return; 
      this.sub_nodes = Message.copyOf(param1FeatureCardCompetition.sub_nodes);
      this.floor = param1FeatureCardCompetition.floor;
      this.type = param1FeatureCardCompetition.type;
      this.title = param1FeatureCardCompetition.title;
    }
    
    public FeatureCardCompetition build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (FeatureCardCompetition)interceptResult.objValue; 
      } 
      return new FeatureCardCompetition(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
