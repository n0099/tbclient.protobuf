package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FinanceTab extends Message {
  public static final String DEFAULT_GENERAL_TAB_TEXT = "";
  
  public static final String DEFAULT_GENERAL_TAB_URL = "";
  
  public static final List<FinanceTabItems> DEFAULT_TABS = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
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
  
  public static final class Builder extends Message.Builder<FinanceTab> {
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
      return new FinanceTab(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
