package tbclient.GameForumGuideTab;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class GameForumSubLabel extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final List<GameForumSubLabel> DEFAULT_SUB_LABEL_LIST = Collections.emptyList();
  
  public static final String DEFAULT_SUB_TAB_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<GameForumSubLabel> sub_label_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String sub_tab_name;
  
  public GameForumSubLabel(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<GameForumSubLabel> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      String str = paramBuilder.sub_tab_name;
      if (str == null) {
        this.sub_tab_name = "";
      } else {
        this.sub_tab_name = str;
      } 
      list = paramBuilder.sub_label_list;
      if (list == null) {
        this.sub_label_list = DEFAULT_SUB_LABEL_LIST;
      } else {
        this.sub_label_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.id = ((Builder)list).id;
      this.sub_tab_name = ((Builder)list).sub_tab_name;
      this.sub_label_list = Message.immutableCopyOf(((Builder)list).sub_label_list);
    } 
  }
  
  public GameForumSubLabel(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(587244457, "Ltbclient/GameForumGuideTab/GameForumSubLabel;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(587244457, "Ltbclient/GameForumGuideTab/GameForumSubLabel;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<GameForumSubLabel> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer id;
    
    public List<GameForumSubLabel> sub_label_list;
    
    public String sub_tab_name;
    
    public Builder() {}
    
    public Builder(GameForumSubLabel param1GameForumSubLabel) {
      super(param1GameForumSubLabel);
      if (param1GameForumSubLabel == null)
        return; 
      this.id = param1GameForumSubLabel.id;
      this.sub_tab_name = param1GameForumSubLabel.sub_tab_name;
      this.sub_label_list = Message.copyOf(param1GameForumSubLabel.sub_label_list);
    }
    
    public GameForumSubLabel build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GameForumSubLabel)interceptResult.objValue; 
      } 
      return new GameForumSubLabel(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
