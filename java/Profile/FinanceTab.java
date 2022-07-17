package tbclient.Profile;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FinanceTab extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_GENERAL_TAB_TEXT = "";
  
  public static final String DEFAULT_GENERAL_TAB_URL = "";
  
  public static final List<FinanceTabItems> DEFAULT_TABS = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String general_tab_text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String general_tab_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<FinanceTabItems> tabs;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public FinanceTab(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FinanceTabItems> list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.general_tab_text;
      if (str == null) {
        this.general_tab_text = "";
      } else {
        this.general_tab_text = str;
      } 
      str = paramBuilder.general_tab_url;
      if (str == null) {
        this.general_tab_url = "";
      } else {
        this.general_tab_url = str;
      } 
      list = paramBuilder.tabs;
      if (list == null) {
        this.tabs = DEFAULT_TABS;
      } else {
        this.tabs = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.general_tab_text = ((Builder)list).general_tab_text;
      this.general_tab_url = ((Builder)list).general_tab_url;
      this.tabs = Message.immutableCopyOf(((Builder)list).tabs);
    } 
  }
  
  public FinanceTab(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(778284432, "Ltbclient/Profile/FinanceTab;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(778284432, "Ltbclient/Profile/FinanceTab;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<FinanceTab> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String general_tab_text;
    
    public String general_tab_url;
    
    public List<FinanceTabItems> tabs;
    
    public String title;
    
    public Builder() {}
    
    public Builder(FinanceTab param1FinanceTab) {
      super(param1FinanceTab);
      if (param1FinanceTab == null)
        return; 
      this.title = param1FinanceTab.title;
      this.general_tab_text = param1FinanceTab.general_tab_text;
      this.general_tab_url = param1FinanceTab.general_tab_url;
      this.tabs = Message.copyOf(param1FinanceTab.tabs);
    }
    
    public FinanceTab build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (FinanceTab)interceptResult.objValue; 
      } 
      return new FinanceTab(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
