package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class UniversityTabInfo extends Message {
  public static final List<UniversityInfo> DEFAULT_CONTENT = Collections.emptyList();
  
  public static final String DEFAULT_TAB_NAME = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<UniversityInfo> content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tab_name;
  
  public UniversityTabInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<UniversityInfo> list;
    if (paramBoolean == true) {
      String str = paramBuilder.tab_name;
      if (str == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str;
      } 
      list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
    } else {
      this.tab_name = ((Builder)list).tab_name;
      this.content = Message.immutableCopyOf(((Builder)list).content);
    } 
  }
  
  public UniversityTabInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UniversityTabInfo> {
    public List<UniversityInfo> content;
    
    public String tab_name;
    
    public Builder() {}
    
    public Builder(UniversityTabInfo param1UniversityTabInfo) {
      super(param1UniversityTabInfo);
      if (param1UniversityTabInfo == null)
        return; 
      this.tab_name = param1UniversityTabInfo.tab_name;
      this.content = Message.copyOf(param1UniversityTabInfo.content);
    }
    
    public UniversityTabInfo build(boolean param1Boolean) {
      return new UniversityTabInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
