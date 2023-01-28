package tbclient.ForumTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Tab extends Message {
  public static final String DEFAULT_SEQ = "";
  
  public static final Long DEFAULT_TAB_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_TAB_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String seq;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long tab_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tab_name;
  
  public Tab(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tab_id;
      if (long_ == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = long_;
      } 
      String str1 = paramBuilder.tab_name;
      if (str1 == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str1;
      } 
      str = paramBuilder.seq;
      if (str == null) {
        this.seq = "";
      } else {
        this.seq = str;
      } 
    } else {
      this.tab_id = ((Builder)str).tab_id;
      this.tab_name = ((Builder)str).tab_name;
      this.seq = ((Builder)str).seq;
    } 
  }
  
  public Tab(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Tab> {
    public String seq;
    
    public Long tab_id;
    
    public String tab_name;
    
    public Builder() {}
    
    public Builder(Tab param1Tab) {
      super(param1Tab);
      if (param1Tab == null)
        return; 
      this.tab_id = param1Tab.tab_id;
      this.tab_name = param1Tab.tab_name;
      this.seq = param1Tab.seq;
    }
    
    public Tab build(boolean param1Boolean) {
      return new Tab(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
